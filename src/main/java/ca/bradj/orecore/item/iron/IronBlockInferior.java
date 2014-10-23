package ca.bradj.orecore.item.iron;

import ca.bradj.orecore.item.OreBlock;

public class IronBlockInferior extends OreBlock {

	public IronBlockInferior(int id) {
		super(id, "ironInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 0);
	}
	

}
