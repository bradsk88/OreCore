package ca.bradj.orecore.item.copper;

import ca.bradj.orecore.item.OreBlock;

public class CopperBlockInferior extends OreBlock {

	public CopperBlockInferior(int id) {
		super(id, "copperInferior");
		setHardness(1f);
		this.setHarvestLevel("pickaxe", 1);
	}
	
}
