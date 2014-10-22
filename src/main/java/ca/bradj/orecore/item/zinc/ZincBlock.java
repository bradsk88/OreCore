package ca.bradj.orecore.item.zinc;

import ca.bradj.orecore.item.OreBlock;

public class ZincBlock extends OreBlock {

	public ZincBlock(int zincOreId) {
		super(zincOreId, "zinc");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
