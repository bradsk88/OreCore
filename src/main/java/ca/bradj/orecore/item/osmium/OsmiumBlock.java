package ca.bradj.orecore.item.osmium;

import ca.bradj.orecore.item.OreBlock;

public class OsmiumBlock extends OreBlock {

	public OsmiumBlock(int id) {
		super(id, "osmium");
		setHardness(1.5f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
