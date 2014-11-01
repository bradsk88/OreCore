package ca.bradj.orecore.item.silver;

import net.minecraft.item.Item;
import ca.bradj.orecore.item.OreBlock;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoremin.StandardElementRegistrations;
import ca.bradj.orecoremin.item.DictionaryNames;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecoremin.item.PureBlock;
import ca.bradj.orecoremin.item.StandardElement;

public class Silver implements StandardElement {

	public static final int SILVER_TOP_LEVEL = 40;
	public static final int SILVER_GRAVEL_TOP_LEVEL = 45;
	public static final int SILVER_INFERIOR_TOP_LEVEL = 50;

	public static final int SILVER_VEIN_SIZE = 4;
	public static final int SILVER_GRAVEL_VEIN_SIZE = 4;
	public static final int SILVER_INFERIOR_VEIN_SIZE = 6;

	public static final DictionaryNames DICT = new DictionaryNames() {{
		super.ORE = "oreSilver";
		super.INFERIOR = "oreSilverInferior";
		super.DUST = "dustSilver";
		super.INGOT = "ingotSilver";
		super.NUGGET = "nuggetSilver";
		super.GRAVEL = "gravelSilver";
		super.PURE_BLOCK = "blockSilver";
	}};

	private static final String SILVER_NAME = "Silver";
	private static final String SILVER_INFERIOR_NAME = "Inferior.Silver";
	private static final String SILVER_INGOT_NAME = "Silver.Ingot";
	private static final String SILVER_NUGGET_NAME = "Silver.Nugget";
	private static final String SILVER_DUST_NAME = "Silver.Dust";
	private static final String SILVER_GRAVEL_NAME = "Silver.Gravel";
	private static final String SILVER_BLOCK_NAME = "Silver.Block";

	public static void init() {
		new Silver().doInit();
	}

	public void doInit() {
		OreCoreItems.silver = OreCoreRegistration.registerBlock(new SilverBlock(), SILVER_NAME);
		OreCoreItems.silverInferior = OreCoreRegistration.registerBlock(new SilverBlockInferior(), SILVER_INFERIOR_NAME);
		OreCoreItems.silverIngot = OreCoreRegistration.registerItem(new SilverIngot(), SILVER_INGOT_NAME);
		OreCoreItems.silverNugget = OreCoreRegistration.registerItem(new SilverNugget(), SILVER_NUGGET_NAME);
		OreCoreItems.silverDust = OreCoreRegistration.registerItem(new SilverDust(), SILVER_DUST_NAME);
		OreCoreItems.silverGravel = OreCoreRegistration.registerBlock(new SilverGravel(), SILVER_GRAVEL_NAME);
		OreCoreItems.silverBlock = OreCoreRegistration.registerBlock(new   SilverPureBlock(), SILVER_BLOCK_NAME);

		StandardElementRegistrations.initDictionary(this, DICT);
		StandardElementRegistrations.initRecipes(this, DICT);
	}

	//@formatter:off
	@Override public Item asDust() { return OreCoreItems.silverDust; }
	@Override public GravelBlock asGravel() { return OreCoreItems.silverGravel; }
	@Override public OreBlock asInferior() { return OreCoreItems.silverInferior; }
	@Override public Item asIngot() { return OreCoreItems.silverIngot; }
	@Override public Item asNugget() { return OreCoreItems.silverNugget; }
	@Override public OreBlock asOre() { return OreCoreItems.silver; }
	@Override public PureBlock asPureBlock() { return OreCoreItems.silverBlock; }

}
