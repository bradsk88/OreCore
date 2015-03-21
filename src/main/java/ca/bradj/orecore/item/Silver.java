package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ca.bradj.forge.DictionaryNames;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardElement;
import ca.bradj.forge.StandardElementRegistrations;
import ca.bradj.orecore.item.base.GravelBlock;
import ca.bradj.orecore.item.base.OreBlock;
import ca.bradj.orecore.item.silver.SilverBlock;
import ca.bradj.orecore.item.silver.SilverBlockInferior;
import ca.bradj.orecore.item.silver.SilverDust;
import ca.bradj.orecore.item.silver.SilverGravel;
import ca.bradj.orecore.item.silver.SilverIngot;
import ca.bradj.orecore.item.silver.SilverNugget;
import ca.bradj.orecore.item.silver.SilverPureBlock;

public class Silver implements StandardElement {

    public static final int SILVER_TOP_LEVEL = 40;
    public static final int SILVER_GRAVEL_TOP_LEVEL = 45;
    public static final int SILVER_INFERIOR_TOP_LEVEL = 50;

    public static final int SILVER_VEIN_SIZE = 4;
    public static final int SILVER_GRAVEL_VEIN_SIZE = 4;
    public static final int SILVER_INFERIOR_VEIN_SIZE = 6;

    private static Silver INSTANCE;

    public static Silver getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Silver();
        }
        return INSTANCE;
    }

    public static final DictionaryNames DICT = new DictionaryNames() {
        {
            super.ORE.set("oreSilver");
            super.INFERIOR.set("oreSilverInferior");
            super.DUST.set("dustSilver");
            super.INGOT.set("ingotSilver");
            super.NUGGET.set("nuggetSilver");
            super.GRAVEL.set("gravelSilver");
            super.PURE_BLOCK.set("blockSilver");
        }
    };

    private static final String SILVER_NAME = "Silver";
    private static final String SILVER_INFERIOR_NAME = "Inferior.Silver";
    private static final String SILVER_INGOT_NAME = "Silver.Ingot";
    private static final String SILVER_NUGGET_NAME = "Silver.Nugget";
    private static final String SILVER_DUST_NAME = "Silver.Dust";
    private static final String SILVER_GRAVEL_NAME = "Silver.Gravel";
    private static final String SILVER_BLOCK_NAME = "Silver.Block";

    public static void preInit() {
        getInstance().doPreInit();
    }

    public static void init() {
        new Silver().doInit();
    }

    private void doPreInit() {
        OreCoreItemsReg.silver = OreCoreRegistration.registerBlock(new SilverBlock(), SILVER_NAME);
        OreCoreItemsReg.silverInferior = OreCoreRegistration.registerBlock(new SilverBlockInferior(), SILVER_INFERIOR_NAME);
        OreCoreItemsReg.silverIngot = OreCoreRegistration.registerItem(new SilverIngot(), SILVER_INGOT_NAME);
        OreCoreItemsReg.silverNugget = OreCoreRegistration.registerItem(new SilverNugget(), SILVER_NUGGET_NAME);
        OreCoreItemsReg.silverDust = OreCoreRegistration.registerItem(new SilverDust(), SILVER_DUST_NAME);
        OreCoreItemsReg.silverGravel = OreCoreRegistration.registerBlock(new SilverGravel(), SILVER_GRAVEL_NAME);
        OreCoreItemsReg.silverBlock = OreCoreRegistration.registerBlock(new SilverPureBlock(), SILVER_BLOCK_NAME);
        StandardElementRegistrations.initDictionary(this, DICT);
    }

    public void doInit() {
        StandardElementRegistrations.initRecipes(this, DICT);
    }

    //@formatter:off
	@Override public Item asDust() { return OreCoreItemsReg.silverDust; }
	@Override public GravelBlock asGravel() { return OreCoreItemsReg.silverGravel; }
	@Override public OreBlock asInferior() { return OreCoreItemsReg.silverInferior; }
	@Override public Item asIngot() { return OreCoreItemsReg.silverIngot; }
	@Override public Item asNugget() { return OreCoreItemsReg.silverNugget; }
	@Override public OreBlock asOre() { return OreCoreItemsReg.silver; }
	@Override public Block asPureBlock() { return OreCoreItemsReg.silverBlock; }

}
