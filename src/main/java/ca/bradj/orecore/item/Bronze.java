package ca.bradj.orecore.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecore.item.bronze.BronzeDust;
import ca.bradj.orecore.item.bronze.BronzeIngot;
import ca.bradj.orecore.item.bronze.BronzeNugget;
import ca.bradj.orecore.item.bronze.BronzePureBlock;
import ca.bradj.orecoremin.item.Copper;
import ca.bradj.orecoremin.item.Tin;

public class Bronze {

    private static final String BRONZE_DUST_NAME = "Bronze.Dust";
    private static final String BRONZE_INGOT_NAME = "Bronze.Ingot";
    private static final String BRONZE_NUGGET_NAME = "Bronze.Nugget";
    private static final String BRONZE_BLOCK_NAME = "Bronze.Block";

    public static final String BRONZE_DUST_DICT = "dustBronze";
    public static final String BRONZE_INGOT_DICT = "ingotBronze";
    public static final String BRONZE_NUGGET_DICT = "nuggetBronze";
    private static final String BRONZE_BLOCK_DICT = "blockBronze";

    public static void preInit() {
        OreCoreItemsReg.bronzeDust = OreCoreRegistration.registerItem(new BronzeDust(), BRONZE_DUST_NAME);
        OreCoreItemsReg.bronzeIngot = OreCoreRegistration.registerItem(new BronzeIngot(), BRONZE_INGOT_NAME);
        OreCoreItemsReg.bronzeNugget = OreCoreRegistration.registerItem(new BronzeNugget(), BRONZE_NUGGET_NAME);
        OreCoreItemsReg.bronzeBlock = OreCoreRegistration.registerBlock(new BronzePureBlock(), BRONZE_BLOCK_NAME);

        OreDictionary.registerOre(BRONZE_DUST_DICT, OreCoreItemsReg.bronzeDust);
        OreDictionary.registerOre(BRONZE_NUGGET_DICT, OreCoreItemsReg.bronzeNugget);
        OreDictionary.registerOre(BRONZE_INGOT_DICT, OreCoreItemsReg.bronzeIngot);
        OreDictionary.registerOre(BRONZE_BLOCK_DICT, OreCoreItemsReg.bronzeBlock);
    }

    public static void init() {

        OreCoreRegistration.nuggetToIngotStandard(OreCoreItemsReg.bronzeNugget, BRONZE_NUGGET_DICT, OreCoreItemsReg.bronzeIngot);
        OreCoreRegistration.ingotToNuggetStandard(OreCoreItemsReg.bronzeIngot, BRONZE_INGOT_DICT, OreCoreItemsReg.bronzeNugget);
        OreCoreRegistration.blockToIngotStandard(OreCoreItemsReg.bronzeBlock, BRONZE_BLOCK_DICT, OreCoreItemsReg.bronzeIngot);
        OreCoreRegistration.ingotToBlockStandard(OreCoreItemsReg.bronzeIngot, BRONZE_INGOT_DICT, OreCoreItemsReg.bronzeBlock);

        OreCoreRegistration.addSmelting(OreCoreItemsReg.bronzeDust, OreCoreItemsReg.bronzeIngot, 1);

        ShapelessOreRecipe recipe = new ShapelessOreRecipe(new ItemStack(OreCoreItemsReg.bronzeDust, 2), Copper.DICT.DUST.get(), Tin.DICT.DUST.get());
        GameRegistry.addRecipe(recipe);
    }

}
