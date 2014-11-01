package ca.bradj.orecore.item.lead;

import ca.bradj.orecore.item.OreBlock;

public class LeadBlock extends OreBlock {

	public LeadBlock() {
		super("lead");
		setHardness(3.0f);
		setHarvestLevel("pickaxe", 2);
	}

}
