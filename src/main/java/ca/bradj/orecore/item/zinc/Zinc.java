package ca.bradj.orecore.item.zinc;

import net.minecraft.item.Item;
import ca.bradj.orecore.item.DictionaryNames;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreBlock;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.StandardElement;
import ca.bradj.orecore.item.StandardElementRegistrations;

public class Zinc implements StandardElement {
 
	public static final int ZINC_TOP_LEVEL = 50;
	public static final int ZINC_GRAVEL_TOP_LEVEL = 60;
	public static final int ZINC_INFERIOR_TOP_LEVEL = 80;

	public static final int ZINC_VEIN_SIZE = 4;
	public static final int ZINC_GRAVEL_VEIN_SIZE = 4;
	public static final int ZINC_INFERIOR_VEIN_SIZE = 4;

	public static final DictionaryNames DICT = new DictionaryNames(){{
		super.ORE = "oreZinc";
		super.INFERIOR = "oreZincInferior";
		super.DUST = "dustZinc";
		super.INGOT = "ingotZinc";
		super.NUGGET = "nuggetZinc";
		super.GRAVEL = "gravelZinc";
		super.PURE_BLOCK = "blockZinc";
	}};
	
	private static final String ZINC_NAME = "Zinc";
	private static final String ZINC_INFERIOR_NAME = "Inferior.Zinc";
	private static final String ZINC_INGOT_NAME = "Zinc.Ingot";
	private static final String ZINC_NUGGET_NAME = "Zinc.Nugget";
	private static final String ZINC_DUST_NAME = "Zinc.Dust";
	private static final String ZINC_GRAVEL_NAME = "Zinc.Gravel";
	private static final String ZINC_BLOCK_NAME = "Zinc.Block";

	public static void init() { new Zinc().doInit(); }
	
	private void doInit() {
		OreCoreItems.zinc = OreCoreRegistration.registerBlock(new ZincBlock(IDs.ZINC_ORE_ID), ZINC_NAME);
		OreCoreItems.zincInferior = OreCoreRegistration.registerBlock(new ZincBlockInferior(IDs.ZINC_INFERIOR_ORE_ID), ZINC_INFERIOR_NAME);
		OreCoreItems.zincIngot = OreCoreRegistration.registerItem(new ZincIngot(IDs.ZINC_INGOT_ID), ZINC_INGOT_NAME);
		OreCoreItems.zincNugget = OreCoreRegistration.registerItem(new ZincNugget(IDs.ZINC_NUGGET_ID), ZINC_NUGGET_NAME);
		OreCoreItems.zincDust = OreCoreRegistration.registerItem(new ZincDust(IDs.ZINC_DUST_ID), ZINC_DUST_NAME);
		OreCoreItems.zincGravel = OreCoreRegistration.registerBlock(new ZincGravel(IDs.ZINC_GRAVEL_ID), ZINC_GRAVEL_NAME);
		OreCoreItems.zincBlock = OreCoreRegistration.registerBlock(new ZincPureBlock(IDs.ZINC_BLOCK_ID), ZINC_BLOCK_NAME);

		StandardElementRegistrations.initDictionary(this, DICT);
		StandardElementRegistrations.initRecipes(this, DICT);
	}
	
	//@formatter:off
	@Override public Item asDust() { return OreCoreItems.zincDust; }
	@Override public GravelBlock asGravel() { return OreCoreItems.zincGravel; }
	@Override public OreBlock asInferior() { return OreCoreItems.zincInferior; }
	@Override public Item asIngot() { return OreCoreItems.zincIngot; }
	@Override public Item asNugget() { return OreCoreItems.zincNugget; }
	@Override public OreBlock asOre() { return OreCoreItems.zinc; }
	@Override public OreBlock asPureBlock() { return OreCoreItems.zincBlock; }
}
