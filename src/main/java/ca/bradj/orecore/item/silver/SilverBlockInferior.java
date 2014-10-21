package ca.bradj.orecore.item.silver;

import ca.bradj.orecore.item.OreBlock;

public class SilverBlockInferior extends OreBlock {

	public SilverBlockInferior(int id) {
		super(id, "silverInferior");
		setHardness(2.0f);
		setHarvestLevel("pickaxe", 1);
	}

}
