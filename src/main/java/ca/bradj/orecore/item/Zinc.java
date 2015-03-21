package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ca.bradj.forge.DictionaryNames;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardElement;
import ca.bradj.forge.StandardElementRegistrations;
import ca.bradj.orecore.item.base.GravelBlock;
import ca.bradj.orecore.item.base.OreBlock;
import ca.bradj.orecore.item.zinc.ZincBlock;
import ca.bradj.orecore.item.zinc.ZincBlockInferior;
import ca.bradj.orecore.item.zinc.ZincDust;
import ca.bradj.orecore.item.zinc.ZincGravel;
import ca.bradj.orecore.item.zinc.ZincIngot;
import ca.bradj.orecore.item.zinc.ZincNugget;
import ca.bradj.orecore.item.zinc.ZincPureBlock;

public class Zinc implements StandardElement {

    public static final int ZINC_TOP_LEVEL = 50;
    public static final int ZINC_GRAVEL_TOP_LEVEL = 60;
    public static final int ZINC_INFERIOR_TOP_LEVEL = 80;

    public static final int ZINC_VEIN_SIZE = 4;
    public static final int ZINC_GRAVEL_VEIN_SIZE = 4;
    public static final int ZINC_INFERIOR_VEIN_SIZE = 4;

    private static Zinc INSTANCE;

    static Zinc getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Zinc();
        }
        return INSTANCE;
    }

    public static final DictionaryNames DICT = new DictionaryNames() {
        {
            super.ORE.set("oreZinc");
            super.INFERIOR.set("oreZincInferior");
            super.DUST.set("dustZinc");
            super.INGOT.set("ingotZinc");
            super.NUGGET.set("nuggetZinc");
            super.GRAVEL.set("gravelZinc");
            super.PURE_BLOCK.set("blockZinc");
        }
    };

    private static final String ZINC_NAME = "Zinc";
    private static final String ZINC_INFERIOR_NAME = "Inferior.Zinc";
    private static final String ZINC_INGOT_NAME = "Zinc.Ingot";
    private static final String ZINC_NUGGET_NAME = "Zinc.Nugget";
    private static final String ZINC_DUST_NAME = "Zinc.Dust";
    private static final String ZINC_GRAVEL_NAME = "Zinc.Gravel";
    private static final String ZINC_BLOCK_NAME = "Zinc.Block";

    public static void init() {
        getInstance().doInit();
    }

    public static void preInit() {
        getInstance().doPreInit();
    }

    private void doPreInit() {
        OreCoreItemsReg.zinc = OreCoreRegistration.registerBlock(new ZincBlock(), ZINC_NAME);
        OreCoreItemsReg.zincInferior = OreCoreRegistration.registerBlock(new ZincBlockInferior(), ZINC_INFERIOR_NAME);
        OreCoreItemsReg.zincIngot = OreCoreRegistration.registerItem(new ZincIngot(), ZINC_INGOT_NAME);
        OreCoreItemsReg.zincNugget = OreCoreRegistration.registerItem(new ZincNugget(), ZINC_NUGGET_NAME);
        OreCoreItemsReg.zincDust = OreCoreRegistration.registerItem(new ZincDust(), ZINC_DUST_NAME);
        OreCoreItemsReg.zincGravel = OreCoreRegistration.registerBlock(new ZincGravel(), ZINC_GRAVEL_NAME);
        OreCoreItemsReg.zincBlock = OreCoreRegistration.registerBlock(new ZincPureBlock(), ZINC_BLOCK_NAME);

        StandardElementRegistrations.initDictionary(this, DICT);
    }

    private void doInit() {
        StandardElementRegistrations.initRecipes(this, DICT);
    }

    //@formatter:off
	@Override public Item asDust() { return OreCoreItemsReg.zincDust; }
	@Override public GravelBlock asGravel() { return OreCoreItemsReg.zincGravel; }
	@Override public OreBlock asInferior() { return OreCoreItemsReg.zincInferior; }
	@Override public Item asIngot() { return OreCoreItemsReg.zincIngot; }
	@Override public Item asNugget() { return OreCoreItemsReg.zincNugget; }
	@Override public OreBlock asOre() { return OreCoreItemsReg.zinc; }
	@Override public Block asPureBlock() { return OreCoreItemsReg.zincBlock; }

}
