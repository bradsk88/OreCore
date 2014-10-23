package ca.bradj.orecore.item.lead;

import ca.bradj.orecore.item.OreBlock;

public class LeadBlockInferior extends OreBlock {

	public LeadBlockInferior(int id) {
		super(id, "leadInferior");
		setHardness(2.0f);
		setHarvestLevel("pickaxe", 1);
	}

}
