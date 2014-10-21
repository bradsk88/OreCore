package ca.bradj.orecore.item.silver;

import ca.bradj.orecore.item.OreBlock;

public class SilverBlock extends OreBlock {

	public SilverBlock(int id) {
		super(id, "silver");
		setHardness(3.0f);
		setHarvestLevel("pickaxe", 2);
	}

}
