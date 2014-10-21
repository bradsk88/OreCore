package ca.bradj.orecore.item;

import net.minecraft.block.BlockFalling;
import ca.bradj.orecore.OreCore;

public class GravelBlock extends BlockFalling {

	protected GravelBlock(int id, String name) {
		super();
		setBlockTextureName("orecore:"+name);
		setCreativeTab(OreCore.tabOreCore);
		setStepSound(soundTypeGravel);
	}

}
