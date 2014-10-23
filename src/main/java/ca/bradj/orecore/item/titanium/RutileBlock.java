package ca.bradj.orecore.item.titanium;

import ca.bradj.orecore.item.GravelBlock;

public class RutileBlock extends GravelBlock {

	protected RutileBlock(int id) {
		super(id, "rutile");
		setHardness(3.0f);
		setHarvestLevel("shovel", 1);
	}

}
