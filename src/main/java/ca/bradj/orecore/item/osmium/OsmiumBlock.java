package ca.bradj.orecore.item.osmium;

import ca.bradj.orecore.item.base.OreBlock;

public class OsmiumBlock extends OreBlock {

	public OsmiumBlock() {
		super("osmium");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
