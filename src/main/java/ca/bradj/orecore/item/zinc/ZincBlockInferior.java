package ca.bradj.orecore.item.zinc;

import ca.bradj.orecore.item.OreBlock;

public class ZincBlockInferior extends OreBlock {

	public ZincBlockInferior(int zincInferiorOreId) {
		super(zincInferiorOreId, "zincInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
