package ca.bradj.orecore.item.titanium;

import ca.bradj.orecore.item.OreBlock;

public class IlmeniteBlock extends OreBlock {

	public IlmeniteBlock(int id) {
		super(id, "ilmenite");
		setHardness(4.0f);
		setHarvestLevel("pickaxe", 2);
	}

}
