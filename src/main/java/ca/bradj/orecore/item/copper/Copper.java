package ca.bradj.orecore.item.copper;

import net.minecraft.item.Item;
import ca.bradj.orecore.item.DictionaryNames;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreBlock;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.StandardElement;
import ca.bradj.orecore.item.StandardElementRegistrations;

public class Copper implements StandardElement {

	public static final int COPPER_TOP_LEVEL = 50;
	public static final int COPPER_GRAVEL_TOP_LEVEL = 50;
	public static final int COPPER_INFERIOR_TOP_LEVEL = 70;
	
	public static final int COPPER_VEIN_SIZE = 6;
	public static final int COPPER_GRAVEL_VEIN_SIZE = 4;
	public static final int COPPER_INFERIOR_VEIN_SIZE = 10;
	
	public static final DictionaryNames DICT = new DictionaryNames() {{
		super.ORE = "oreCopper";
		super.INFERIOR = "oreCopperInferior";
		super.DUST = "dustCopper";
		super.INGOT = "ingotCopper";
		super.NUGGET = "nuggetCopper";
		super.GRAVEL = "gravelCopper";
		super.PURE_BLOCK = "blockCopper";
	}};
	
	private static final String COPPER_NAME = "Copper";
	private static final String COPPER_INFERIOR_NAME = "Inferior.Copper";
	private static final String COPPER_INGOT_NAME = "Copper.Ingot";
	private static final String COPPER_NUGGET_NAME = "Copper.Nugget";
	private static final String COPPER_DUST_NAME = "Copper.Dust";
	private static final String COPPER_GRAVEL_NAME = "Copper.Gravel";
	private static final String COPPER_BLOCK_NAME = "Copper.Block";

	public static void init() {
		new Copper().doInit();
	}
	
	public void doInit() {
		OreCoreItems.copper = OreCoreRegistration.registerBlock(new CopperBlock(IDs.COPPER_ORE_ID), COPPER_NAME);
		OreCoreItems.copperInferior = OreCoreRegistration.registerBlock(new CopperBlockInferior(IDs.COPPER_INFERIOR_ORE_ID), COPPER_INFERIOR_NAME);
		OreCoreItems.copperIngot = OreCoreRegistration.registerItem(new CopperIngot(IDs.COPPER_INGOT_ID), COPPER_INGOT_NAME);
		OreCoreItems.copperNugget = OreCoreRegistration.registerItem(new CopperNugget(IDs.COPPER_NUGGET_ID), COPPER_NUGGET_NAME);
		OreCoreItems.copperDust = OreCoreRegistration.registerItem(new CopperDust(IDs.COPPER_DUST_ID), COPPER_DUST_NAME);
		OreCoreItems.copperGravel = OreCoreRegistration.registerBlock(new CopperGravel(IDs.COPPER_GRAVEL_ID), COPPER_GRAVEL_NAME);
		OreCoreItems.copperBlock = OreCoreRegistration.registerBlock(new CopperPureBlock(IDs.COPPER_BLOCK_ID), COPPER_BLOCK_NAME);

		StandardElementRegistrations.initDictionary(this, DICT);
		StandardElementRegistrations.initRecipes(this, DICT);
	}
	
	//@formatter:off
	@Override public Item asDust() { return OreCoreItems.copperDust; }
	@Override public GravelBlock asGravel() { return OreCoreItems.copperGravel; }
	@Override public OreBlock asInferior() { return OreCoreItems.copperInferior; }
	@Override public Item asIngot() { return OreCoreItems.copperIngot; }
	@Override public Item asNugget() { return OreCoreItems.copperNugget; }
	@Override public OreBlock asOre() { return OreCoreItems.copper; }
	@Override public OreBlock asPureBlock() { return OreCoreItems.copperBlock; }

}
