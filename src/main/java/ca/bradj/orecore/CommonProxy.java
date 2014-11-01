package ca.bradj.orecore;

import net.minecraftforge.common.config.Configuration;
import ca.bradj.orecore.item.OreCoreItems;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	private static IWorldGenerator WORLD_GEN;

	public void preInit(FMLPreInitializationEvent e) {

		Configuration config = new Configuration(e.getSuggestedConfigurationFile());
		config.load();
		OreCoreItems.init();
		WORLD_GEN = new OreCoreWorldGen(config, e.getModLog());

		config.save();
	}

	public void init() {
		GameRegistry.registerWorldGenerator(WORLD_GEN, 1);
	}

	public void postInit() {

	}

}
