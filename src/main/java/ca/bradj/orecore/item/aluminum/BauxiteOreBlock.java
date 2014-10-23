package ca.bradj.orecore.item.aluminum;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import ca.bradj.orecore.item.OreBlock;

public class BauxiteOreBlock extends OreBlock {

	public BauxiteOreBlock(int bauxiteId) {
		super(bauxiteId, "bauxite");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public boolean isReplaceableOreGen(World world, int x, int y, int z, Block target) {
		return true;
	}
	
}
