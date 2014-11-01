package ca.bradj.orecore.item.lead;

import net.minecraft.item.Item;
import ca.bradj.orecore.item.OreBlock;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoremin.StandardElementRegistrations;
import ca.bradj.orecoremin.item.DictionaryNames;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecoremin.item.PureBlock;
import ca.bradj.orecoremin.item.StandardElement;

public class Lead implements StandardElement {

	public static final int LEAD_TOP_LEVEL = 40;
	public static final int LEAD_GRAVEL_TOP_LEVEL = 60;
	public static final int LEAD_INFERIOR_TOP_LEVEL = 80;

	public static final int LEAD_VEIN_SIZE = 4;
	public static final int LEAD_GRAVEL_VEIN_SIZE = 4;
	public static final int LEAD_INFERIOR_VEIN_SIZE = 4;

	public static final DictionaryNames DICT = new DictionaryNames() {{
		super.ORE = "oreLead";
		super.INFERIOR = "oreLeadInferior";
		super.DUST = "dustLead";
		super.INGOT = "ingotLead";
		super.NUGGET = "nuggetLead";
		super.GRAVEL = "gravelLead";
		super.PURE_BLOCK = "blockLead";
	}};

	private static final String LEAD_NAME = "Lead";
	private static final String LEAD_INFERIOR_NAME = "Inferior.Lead";
	private static final String LEAD_INGOT_NAME = "Lead.Ingot";
	private static final String LEAD_NUGGET_NAME = "Lead.Nugget";
	private static final String LEAD_DUST_NAME = "Lead.Dust";
	private static final String LEAD_GRAVEL_NAME = "Lead.Gravel";
	private static final String LEAD_BLOCK_NAME = "Lead.Block";

	public static void init() {
		new Lead().doInit();
	}

	private void doInit() {

		OreCoreItems.lead = OreCoreRegistration.registerBlock(new LeadBlock(), LEAD_NAME);
		OreCoreItems.leadInferior = OreCoreRegistration.registerBlock(new LeadBlockInferior(), LEAD_INFERIOR_NAME);
		OreCoreItems.leadIngot = OreCoreRegistration.registerItem(new LeadIngot(), LEAD_INGOT_NAME);
		OreCoreItems.leadNugget = OreCoreRegistration.registerItem(new LeadNugget(), LEAD_NUGGET_NAME);
		OreCoreItems.leadDust = OreCoreRegistration.registerItem(new LeadDust(), LEAD_DUST_NAME);
		OreCoreItems.leadGravel = OreCoreRegistration.registerBlock(new LeadGravel(), LEAD_GRAVEL_NAME);
		OreCoreItems.leadBlock = OreCoreRegistration.registerBlock(new LeadPureBlock(), LEAD_BLOCK_NAME);

		StandardElementRegistrations.initDictionary(this, DICT);
		StandardElementRegistrations.initRecipes(this, DICT);
	}

	//@formatter:off
	@Override public Item asDust() { return OreCoreItems.leadDust; }
	@Override public GravelBlock asGravel() { return OreCoreItems.leadGravel; }
	@Override public OreBlock asInferior() { return OreCoreItems.leadInferior; }
	@Override public Item asIngot() { return OreCoreItems.leadIngot; }
	@Override public Item asNugget() { return OreCoreItems.leadNugget; }
	@Override public OreBlock asOre() { return OreCoreItems.lead; }
	@Override public PureBlock asPureBlock() { return OreCoreItems.leadBlock; }

}
