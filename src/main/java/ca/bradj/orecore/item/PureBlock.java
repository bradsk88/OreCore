package ca.bradj.orecore.item;

public class PureBlock extends OreBlock {

	public PureBlock(int id, String name) {
		super(id, name);
		setHardness(3.0f);
		setHarvestLevel("pickaxe", 1);
	}

}
