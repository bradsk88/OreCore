package ca.bradj.orecore.item.base;

import net.minecraft.block.BlockFalling;
import ca.bradj.orecore.OreCore;

public abstract class GravelBlock extends BlockFalling {

	protected GravelBlock(String name) {
		super();
		setBlockTextureName("orecore:"+name);
		setCreativeTab(OreCore.tabOreCore);
		setStepSound(soundTypeGravel);
	}

}
