package ca.bradj.orecore.item;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CopperBlock extends Block {

	protected CopperBlock() {
		super(Material.ground);
		setBlockName("Copper");
		setBlockTextureName("orecore:copper");
		setHarvestLevel("pickaxe", 0);
	}
	
}
