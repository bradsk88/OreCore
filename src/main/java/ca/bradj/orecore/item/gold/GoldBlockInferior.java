package ca.bradj.orecore.item.gold;

import ca.bradj.orecore.item.OreBlock;

public class GoldBlockInferior extends OreBlock {

	public GoldBlockInferior(int id) {
		super(id, "goldInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
