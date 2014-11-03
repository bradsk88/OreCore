package ca.bradj.orecore;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import ca.bradj.orecore.item.OreCoreItems;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	private static IWorldGenerator WORLD_GEN;

	public void preInit(FMLPreInitializationEvent e) {
		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		config.load();
		WORLD_GEN = new OreCoreWorldGen(config, e.getModLog());
		config.save();
		OreCoreItems.preInit();
	}

	public void init() {
	    if (!Loader.isModLoaded("OreCoreMin")) {
	        new ThreadRequirementMissing(FMLCommonHandler.instance().getEffectiveSide()).run();
	        return;
        }
	    OreCoreItems.init();
		GameRegistry.registerWorldGenerator(WORLD_GEN, 1);
	}

	public void postInit() {

	}

    public void registerHandlers() {
        TickHandlerClient tickHandlerClient = new TickHandlerClient();
        FMLCommonHandler.instance().bus().register(tickHandlerClient);
        MinecraftForge.EVENT_BUS.register(tickHandlerClient);
    }

}
