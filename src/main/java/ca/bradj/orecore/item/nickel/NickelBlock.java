package ca.bradj.orecore.item.nickel;

import ca.bradj.orecore.item.base.OreBlock;

public class NickelBlock extends OreBlock {

	public NickelBlock() {
		super("nickel");
		setHardness(2.5f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
