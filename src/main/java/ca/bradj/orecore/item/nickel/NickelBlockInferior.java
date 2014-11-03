package ca.bradj.orecore.item.nickel;

import ca.bradj.orecore.item.base.OreBlock;

public class NickelBlockInferior extends OreBlock {

	public NickelBlockInferior() {
		super("nickelInferior");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 2);
	}

}
