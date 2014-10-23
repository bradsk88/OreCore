package ca.bradj.orecore.item.titanium;

import ca.bradj.orecore.item.OreBlock;

public class IlmeniteBlockInferior extends OreBlock {

	public IlmeniteBlockInferior(int id) {
		super(id, "ilmeniteInferior");
		setHardness(3.0f);
		setHarvestLevel("pickaxe", 1);
	}

}
