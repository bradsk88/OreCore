package ca.bradj.orecore.item.copper;

import ca.bradj.orecore.item.OreBlock;

public class CopperBlock extends OreBlock {

	public CopperBlock(int id) {
		super(id, "copper");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}
	
	
}
