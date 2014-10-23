package ca.bradj.orecore.item.tin;

import net.minecraft.item.Item;
import ca.bradj.orecore.item.DictionaryNames;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreBlock;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.StandardElement;
import ca.bradj.orecore.item.StandardElementRegistrations;

public class Tin implements StandardElement {

	public static final int TIN_TOP_LEVEL = 55;
	public static final int TIN_GRAVEL_TOP_LEVEL = 55;
	public static final int TIN_INFERIOR_TOP_LEVEL = 70;
	
	public static final int TIN_VEIN_SIZE = 4;
	public static final int TIN_GRAVEL_VEIN_SIZE = 4;
	public static final int TIN_INFERIOR_VEIN_SIZE = 8; 
	
	public static final DictionaryNames DICT = new DictionaryNames() {{
		super.ORE = "oreTin";
		super.INFERIOR = "oreTinInferior";
		super.DUST = "dustTin";
		super.INGOT = "ingotTin";
		super.NUGGET = "nuggetTin";
		super.GRAVEL = "gravelTin";
		super.PURE_BLOCK = "blockTin";
	}};
	
	private static final String TIN_NAME = "Tin";
	private static final String TIN_INFERIOR_NAME = "Inferior.Tin";
	private static final String TIN_INGOT_NAME = "Tin.Ingot";
	private static final String TIN_NUGGET_NAME = "Tin.Nugget";
	private static final String TIN_DUST_NAME = "Tin.Dust";
	private static final String TIN_GRAVEL_NAME = "Tin.Gravel";
	private static final String TIN_BLOCK_NAME = "Tin.Block";

	public static void init() {
		new Tin().doInit();
	}
	
	public void doInit() {
		OreCoreItems.tin = OreCoreRegistration.registerBlock(new TinBlock(IDs.TIN_ORE_ID), TIN_NAME);
		OreCoreItems.tinInferior = OreCoreRegistration.registerBlock(new TinBlockInferior(IDs.TIN_INFERIOR_ORE_ID), TIN_INFERIOR_NAME);
		OreCoreItems.tinIngot = OreCoreRegistration.registerItem(new TinIngot(IDs.TIN_INGOT_ID), TIN_INGOT_NAME);
		OreCoreItems.tinNugget = OreCoreRegistration.registerItem(new TinNugget(IDs.TIN_NUGGET_ID), TIN_NUGGET_NAME);
		OreCoreItems.tinDust = OreCoreRegistration.registerItem(new TinDust(IDs.TIN_DUST_ID), TIN_DUST_NAME);
		OreCoreItems.tinGravel = OreCoreRegistration.registerBlock(new TinGravel(IDs.TIN_GRAVEL_ID), TIN_GRAVEL_NAME);
		OreCoreItems.tinBlock = OreCoreRegistration.registerBlock(new TinPureBlock(IDs.TIN_BLOCK_ID), TIN_BLOCK_NAME);

		StandardElementRegistrations.initDictionary(this, DICT);
		StandardElementRegistrations.initRecipes(this, DICT);
	}
	
	//@formatter:off
	@Override public Item asDust() { return OreCoreItems.tinDust; }
	@Override public GravelBlock asGravel() { return OreCoreItems.tinGravel; }
	@Override public OreBlock asInferior() { return OreCoreItems.tinInferior; }
	@Override public Item asIngot() { return OreCoreItems.tinIngot; }
	@Override public Item asNugget() { return OreCoreItems.tinNugget; }
	@Override public OreBlock asOre() { return OreCoreItems.tin; }
	@Override public OreBlock asPureBlock() { return OreCoreItems.tinBlock; }

}
