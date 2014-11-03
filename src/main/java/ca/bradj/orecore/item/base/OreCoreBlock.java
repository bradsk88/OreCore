package ca.bradj.orecore.item.base;

import ca.bradj.orecore.OreCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OreCoreBlock extends Block {

	protected OreCoreBlock(Material material, String name) {
		super(material);
		setBlockTextureName("orecore:"+name);
		setCreativeTab(OreCore.tabOreCore);
	}

}
