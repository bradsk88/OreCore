package ca.bradj.orecore.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;

public class Items {

	public static Block copper;
	public static Block bauxite;
	
	public static final void init() {
		copper = new CopperBlock();
		bauxite = new BauxiteOreBlock();
		
		GameRegistry.registerBlock(copper, "Copper");
		GameRegistry.registerBlock(bauxite, "Bauxite Ore");
		
		OreDictionary.registerOre("oreCopper", copper);
		OreDictionary.registerOre("oreBauxite", bauxite);
	}
	
}
