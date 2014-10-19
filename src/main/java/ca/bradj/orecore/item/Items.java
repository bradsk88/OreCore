package ca.bradj.orecore.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class Items {

	
	public static CopperBlock copper;
	private static final String COPPER_NAME = "Copper";
	private static final int copperOreId = 4000; //TODO: Pick something that actually means something
	
	public static CopperIngot copperIngot;
	private static final String COPPER_INGOT_NAME = "Copper Ingot";
	private static final int copperIngotId = 4001;
	
	public static BauxiteOreBlock bauxite;
	
	
	public static final void init() {
		
		bauxite = new BauxiteOreBlock();

		
		//Copper
		copper = new CopperBlock(copperOreId);
		copper.setBlockName(COPPER_NAME);
		GameRegistry.registerBlock(copper, COPPER_NAME);
		
		copperIngot = new CopperIngot(copperIngotId);
		copperIngot.setUnlocalizedName(COPPER_INGOT_NAME);
		GameRegistry.registerItem(copperIngot, COPPER_INGOT_NAME);
		
		//Aluminum/Bauxite
		GameRegistry.registerBlock(bauxite, "Bauxite Ore");
		
		OreDictionary.registerOre("oreCopper", copper);
		OreDictionary.registerOre("oreBauxite", bauxite);
		
	}
	
}
