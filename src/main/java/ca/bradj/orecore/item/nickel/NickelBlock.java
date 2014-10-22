package ca.bradj.orecore.item.nickel;

import ca.bradj.orecore.item.OreBlock;

public class NickelBlock extends OreBlock {

	public NickelBlock(int id) {
		super(id, "nickel");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
