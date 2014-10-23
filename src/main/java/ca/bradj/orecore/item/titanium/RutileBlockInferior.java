package ca.bradj.orecore.item.titanium;

import ca.bradj.orecore.item.GravelBlock;

public class RutileBlockInferior extends GravelBlock {

	protected RutileBlockInferior(int id) {
		super(id, "rutileInferior");
		setHardness(2.0f);
		setHarvestLevel("shovel", 1);
	}

}
