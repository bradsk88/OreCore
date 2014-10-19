package ca.bradj.orecore.item.copper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class CopperBlock extends Block {

	public CopperBlock(int id) {
		super(Material.rock);
		setHardness(1.5f);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHarvestLevel("pickaxe", 1);
	}
	
	@Override
	public void registerBlockIcons(IIconRegister reg) {
		this.blockIcon = reg.registerIcon("orecore:copper");
	}
	
}
