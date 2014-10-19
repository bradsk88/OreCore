package ca.bradj.orecore.item.copper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CopperBlockInferior extends Block {

	public CopperBlockInferior(int id) {
		super(Material.rock);
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName("orecore:copperInferior");
	}
	
}
