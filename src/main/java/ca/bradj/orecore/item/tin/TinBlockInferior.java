package ca.bradj.orecore.item.tin;

import ca.bradj.orecore.item.OreBlock;

public class TinBlockInferior extends OreBlock {

	public TinBlockInferior(int id) {
		super(id, "tinInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
