package ca.bradj.orecore;

import java.util.Collection;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.oredict.OreDictionary;

import org.apache.logging.log4j.Logger;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;

import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecore.item.OreCoreItems;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.GameRegistry.UniqueIdentifier;

public class CommonProxy {

    private static final String AGGRESSIVE = "Set this to true if you want orecore to attempt to make recipe outputs from other mods output OreCore items instead.";
    private static IWorldGenerator WORLD_GEN;
    private Configuration config;
    private Logger logger;
    private boolean aggressive = false;

    public void preInit(FMLPreInitializationEvent e) {
        config = new Configuration(e.getSuggestedConfigurationFile());
        logger = e.getModLog();
        config.load();
        WORLD_GEN = new OreCoreWorldGen(config, e.getModLog());
        OreCoreItems.preInit();
    }

    public void init() {
        MinecraftForge.EVENT_BUS.register(this);
        if (!Loader.isModLoaded("OreCoreMin")) {
            new ThreadRequirementMissing(FMLCommonHandler.instance().getEffectiveSide()).run();
            return;
        }
        if (config.getBoolean("aggressive", "recipes", false, AGGRESSIVE)) {
            aggressive = true;
        }
        OreCoreItems.init();

        GameRegistry.registerWorldGenerator(WORLD_GEN, 1);
    }

    public void postInit() {
        if (config.getBoolean("aggressive", "recipes", false, AGGRESSIVE)) {
            OreCoreItems.init();
        }
        config.save();
    }

    @SubscribeEvent
    public void overrideOreDrop(HarvestDropsEvent event) {
        if (!aggressive) {
            return;
        }
        final String modName = "OreCore";
        if (event.block != null) {
            ItemStack oreStack = new ItemStack(event.block, 1, event.blockMetadata);

            if (oreStack.getItem() == null) {
                logger.warn("A HarvestDropsEvent was fired with no subject block");
                return;
            }

            int[] oreIDs = OreDictionary.getOreIDs(oreStack);
            int oreID;

            if (oreIDs.length == 0) {
                return;
            }

            for (int i = 0; i < oreIDs.length; i++) {
                oreID = oreIDs[i];
                if (oreID < 0) {
                    continue;
                }

                final String oreName = OreDictionary.getOreName(oreID);
                if (oreName == null) {
                    return;
                }
                if (!OreCoreRegistration.hasDictString(oreName)) {
                    return;
                }
                Collection<ItemStack> possibleOres = OreDictionary.getOres(oreName);
                Collection<ItemStack> fromOreCore = Collections2.filter(possibleOres, new Predicate<ItemStack>() {

                    @Override
                    public boolean apply(ItemStack input) {
                        Item item = input.getItem();
                        UniqueIdentifier findUniqueIdentifierFor = GameRegistry.findUniqueIdentifierFor(item);
                        if (modName.equals(findUniqueIdentifierFor.modId)) {
                            logger.debug("found orecore block for " + oreName);
                            return true;
                        }
                        logger.debug("no orecore matches for " + oreName);
                        return false;
                    }
                });
                for (int z = 0; z < event.drops.size(); z++) {
                    if (oreStack.isItemEqual(event.drops.get(z))) {
                        event.drops.set(z, new ItemStack(Iterables.getFirst(fromOreCore, oreStack).getItem()));
                    }
                }
            }
        }
    }

}
