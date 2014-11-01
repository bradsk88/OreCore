package ca.bradj.orecore.item.nickel;

import net.minecraft.item.Item;
import ca.bradj.orecore.item.OreBlock;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoremin.StandardElementRegistrations;
import ca.bradj.orecoremin.item.DictionaryNames;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecoremin.item.PureBlock;
import ca.bradj.orecoremin.item.StandardElement;

public class Nickel implements StandardElement {

	public static final int NICKEL_TOP_LEVEL = 40;
	public static final int NICKEL_GRAVEL_TOP_LEVEL = 60;
	public static final int NICKEL_INFERIOR_TOP_LEVEL = 80;

	public static final int NICKEL_VEIN_SIZE = 4;
	public static final int NICKEL_GRAVEL_VEIN_SIZE = 4;
	public static final int NICKEL_INFERIOR_VEIN_SIZE = 4;

	public static final DictionaryNames DICT = new DictionaryNames(){{
		super.ORE = "oreNickel";
		super.INFERIOR = "oreNickelInferior";
		super.DUST = "dustNickel";
		super.INGOT = "ingotNickel";
		super.NUGGET = "nuggetNickel";
		super.GRAVEL = "gravelNickel";
		super.PURE_BLOCK = "blockNickel";
	}};

	private static final String NICKEL_NAME = "Nickel";
	private static final String NICKEL_INFERIOR_NAME = "Inferior.Nickel";
	private static final String NICKEL_INGOT_NAME = "Nickel.Ingot";
	private static final String NICKEL_NUGGET_NAME = "Nickel.Nugget";
	private static final String NICKEL_DUST_NAME = "Nickel.Dust";
	private static final String NICKEL_GRAVEL_NAME = "Nickel.Gravel";
	private static final String NICKEL_BLOCK_NAME = "Nickel.Block";

	public static void init() { new Nickel().doInit(); }

	private void doInit() {
		OreCoreItems.nickel = OreCoreRegistration.registerBlock(new NickelBlock(), NICKEL_NAME);
		OreCoreItems.nickelInferior = OreCoreRegistration.registerBlock(new NickelBlockInferior(), NICKEL_INFERIOR_NAME);
		OreCoreItems.nickelIngot = OreCoreRegistration.registerItem(new NickelIngot(), NICKEL_INGOT_NAME);
		OreCoreItems.nickelNugget = OreCoreRegistration.registerItem(new NickelNugget(), NICKEL_NUGGET_NAME);
		OreCoreItems.nickelDust = OreCoreRegistration.registerItem(new NickelDust(), NICKEL_DUST_NAME);
		OreCoreItems.nickelGravel = OreCoreRegistration.registerBlock(new NickelGravel(), NICKEL_GRAVEL_NAME);
		OreCoreItems.nickelBlock = OreCoreRegistration.registerBlock(new NickelPureBlock(), NICKEL_BLOCK_NAME);

		StandardElementRegistrations.initDictionary(this, DICT);
		StandardElementRegistrations.initRecipes(this, DICT);
	}

	//@formatter:off
	@Override public Item asDust() { return OreCoreItems.nickelDust; }
	@Override public GravelBlock asGravel() { return OreCoreItems.nickelGravel; }
	@Override public OreBlock asInferior() { return OreCoreItems.nickelInferior; }
	@Override public Item asIngot() { return OreCoreItems.nickelIngot; }
	@Override public Item asNugget() { return OreCoreItems.nickelNugget; }
	@Override public OreBlock asOre() { return OreCoreItems.nickel; }
	@Override public PureBlock asPureBlock() { return OreCoreItems.nickelBlock; }
}
