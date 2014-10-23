package ca.bradj.orecore.item.lead;

import net.minecraft.item.Item;
import ca.bradj.orecore.item.DictionaryNames;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreBlock;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.StandardElement;
import ca.bradj.orecore.item.StandardElementRegistrations;

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
		
		OreCoreItems.lead = OreCoreRegistration.registerBlock(new LeadBlock(IDs.LEAD_ORE_ID), LEAD_NAME);
		OreCoreItems.leadInferior = OreCoreRegistration.registerBlock(new LeadBlockInferior(IDs.LEAD_INFERIOR_ORE_ID), LEAD_INFERIOR_NAME);
		OreCoreItems.leadIngot = OreCoreRegistration.registerItem(new LeadIngot(IDs.LEAD_INGOT_ID), LEAD_INGOT_NAME);
		OreCoreItems.leadNugget = OreCoreRegistration.registerItem(new LeadNugget(IDs.LEAD_NUGGET_ID), LEAD_NUGGET_NAME);
		OreCoreItems.leadDust = OreCoreRegistration.registerItem(new LeadDust(IDs.LEAD_DUST_ID), LEAD_DUST_NAME);
		OreCoreItems.leadGravel = OreCoreRegistration.registerBlock(new LeadGravel(IDs.LEAD_GRAVEL_ID), LEAD_GRAVEL_NAME);
		OreCoreItems.leadBlock = OreCoreRegistration.registerBlock(new LeadPureBlock(IDs.LEAD_BLOCK_ID), LEAD_BLOCK_NAME);

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
	@Override public OreBlock asPureBlock() { return OreCoreItems.leadBlock; }
	
}
