package ca.bradj.orecore.item.zinc;

import ca.bradj.orecore.item.OreBlock;

public class ZincBlock extends OreBlock {

	public ZincBlock() {
		super("zinc");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
