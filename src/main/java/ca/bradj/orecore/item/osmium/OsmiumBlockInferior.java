package ca.bradj.orecore.item.osmium;

import ca.bradj.orecore.item.base.OreBlock;

public class OsmiumBlockInferior extends OreBlock {

	public OsmiumBlockInferior() {
		super("osmiumInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
