package ca.bradj.orecore.item.osmium;

import ca.bradj.orecore.item.OreBlock;

public class OsmiumBlockInferior extends OreBlock {

	public OsmiumBlockInferior(int id) {
		super(id, "osmiumInferior");
		setHardness(1f);
		this.setHarvestLevel("pickaxe", 1);
	}

}
