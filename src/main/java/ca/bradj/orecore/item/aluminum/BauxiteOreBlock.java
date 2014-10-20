package ca.bradj.orecore.item.aluminum;

import ca.bradj.orecore.item.OreBlock;

public class BauxiteOreBlock extends OreBlock {

	public BauxiteOreBlock(int bauxiteId) {
		super(bauxiteId, "bauxite");
		setHardness(2f);
		this.setHarvestLevel("pickaxe", 2);
	}
	
}
