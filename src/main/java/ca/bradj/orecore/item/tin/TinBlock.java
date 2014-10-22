package ca.bradj.orecore.item.tin;

import ca.bradj.orecore.item.OreBlock;

public class TinBlock extends OreBlock {

	public TinBlock(int id) {
		super(id, "tin");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
