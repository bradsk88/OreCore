package ca.bradj.orecore;

import ca.bradj.orecore.item.OreCoreItems;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

	private static final IWorldGenerator WORLD_GEN = new OreCoreWorldGen();
	
	public void preInit(FMLPreInitializationEvent e) {
		OreCoreItems.init();
	}
	
	public void init(FMLInitializationEvent e) {
		GameRegistry.registerWorldGenerator(WORLD_GEN, 1);
	}
	
	public void postInit(FMLPostInitializationEvent e) {
		
	}
	
}
