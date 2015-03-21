package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ca.bradj.forge.DictionaryNames;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardElement;
import ca.bradj.forge.StandardElementRegistrations;
import ca.bradj.orecore.item.base.GravelBlock;
import ca.bradj.orecore.item.base.OreBlock;
import ca.bradj.orecore.item.lead.LeadBlock;
import ca.bradj.orecore.item.lead.LeadBlockInferior;
import ca.bradj.orecore.item.lead.LeadDust;
import ca.bradj.orecore.item.lead.LeadGravel;
import ca.bradj.orecore.item.lead.LeadIngot;
import ca.bradj.orecore.item.lead.LeadNugget;
import ca.bradj.orecore.item.lead.LeadPureBlock;

public class Lead implements StandardElement {

    public static final int LEAD_TOP_LEVEL = 40;
    public static final int LEAD_GRAVEL_TOP_LEVEL = 60;
    public static final int LEAD_INFERIOR_TOP_LEVEL = 80;

    public static final int LEAD_VEIN_SIZE = 4;
    public static final int LEAD_GRAVEL_VEIN_SIZE = 4;
    public static final int LEAD_INFERIOR_VEIN_SIZE = 4;

    public static final DictionaryNames DICT = new DictionaryNames() {
        {
            super.ORE.set("oreLead");
            super.INFERIOR.set("oreLeadInferior");
            super.DUST.set("dustLead");
            super.INGOT.set("ingotLead");
            super.NUGGET.set("nuggetLead");
            super.GRAVEL.set("gravelLead");
            super.PURE_BLOCK.set("blockLead");
        }
    };

    private static final String LEAD_NAME = "Lead";
    private static final String LEAD_INFERIOR_NAME = "Inferior.Lead";
    private static final String LEAD_INGOT_NAME = "Lead.Ingot";
    private static final String LEAD_NUGGET_NAME = "Lead.Nugget";
    private static final String LEAD_DUST_NAME = "Lead.Dust";
    private static final String LEAD_GRAVEL_NAME = "Lead.Gravel";
    private static final String LEAD_BLOCK_NAME = "Lead.Block";

    private static Lead INSTANCE;

    static Lead getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Lead();
        }
        return INSTANCE;
    }

    public static void preInit() {
        getInstance().doPreInit();
    }

    public static void init() {
        getInstance().doInit();
    }

    public void doPreInit() {
        OreCoreItemsReg.lead = OreCoreRegistration.registerBlock(new LeadBlock(), LEAD_NAME);
        OreCoreItemsReg.leadInferior = OreCoreRegistration.registerBlock(new LeadBlockInferior(), LEAD_INFERIOR_NAME);
        OreCoreItemsReg.leadIngot = OreCoreRegistration.registerItem(new LeadIngot(), LEAD_INGOT_NAME);
        OreCoreItemsReg.leadNugget = OreCoreRegistration.registerItem(new LeadNugget(), LEAD_NUGGET_NAME);
        OreCoreItemsReg.leadDust = OreCoreRegistration.registerItem(new LeadDust(), LEAD_DUST_NAME);
        OreCoreItemsReg.leadGravel = OreCoreRegistration.registerBlock(new LeadGravel(), LEAD_GRAVEL_NAME);
        OreCoreItemsReg.leadBlock = OreCoreRegistration.registerBlock(new LeadPureBlock(), LEAD_BLOCK_NAME);
        StandardElementRegistrations.initDictionary(this, DICT);
    }

    private void doInit() {
        StandardElementRegistrations.initRecipes(this, DICT);
    }

    //@formatter:off
	@Override public Item asDust() { return OreCoreItemsReg.leadDust; }
	@Override public GravelBlock asGravel() { return OreCoreItemsReg.leadGravel; }
	@Override public OreBlock asInferior() { return OreCoreItemsReg.leadInferior; }
	@Override public Item asIngot() { return OreCoreItemsReg.leadIngot; }
	@Override public Item asNugget() { return OreCoreItemsReg.leadNugget; }
	@Override public OreBlock asOre() { return OreCoreItemsReg.lead; }
	@Override public Block asPureBlock() { return OreCoreItemsReg.leadBlock; }

}
