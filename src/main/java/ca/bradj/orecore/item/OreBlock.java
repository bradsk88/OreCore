package ca.bradj.orecore.item;

import ca.bradj.orecore.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreBlock extends Block {

	public OreBlock(int id, String name) {
		super(Material.rock);
		setBlockTextureName("orecore:"+name);
		setCreativeTab(OreCore.tabOreCore);
	}

}
