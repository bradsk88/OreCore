package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ca.bradj.forge.DictionaryNames;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardElement;
import ca.bradj.forge.StandardElementRegistrations;
import ca.bradj.orecore.item.base.GravelBlock;
import ca.bradj.orecore.item.base.OreBlock;
import ca.bradj.orecore.item.nickel.NickelBlock;
import ca.bradj.orecore.item.nickel.NickelBlockInferior;
import ca.bradj.orecore.item.nickel.NickelDust;
import ca.bradj.orecore.item.nickel.NickelGravel;
import ca.bradj.orecore.item.nickel.NickelIngot;
import ca.bradj.orecore.item.nickel.NickelNugget;
import ca.bradj.orecore.item.nickel.NickelPureBlock;

public class Nickel implements StandardElement {

    public static final int NICKEL_TOP_LEVEL = 40;
    public static final int NICKEL_GRAVEL_TOP_LEVEL = 60;
    public static final int NICKEL_INFERIOR_TOP_LEVEL = 80;

    public static final int NICKEL_VEIN_SIZE = 4;
    public static final int NICKEL_GRAVEL_VEIN_SIZE = 4;
    public static final int NICKEL_INFERIOR_VEIN_SIZE = 4;

    public static final DictionaryNames DICT = new DictionaryNames() {
        {
            super.ORE.set("oreNickel");
            super.INFERIOR.set("oreNickelInferior");
            super.DUST.set("dustNickel");
            super.INGOT.set("ingotNickel");
            super.NUGGET.set("nuggetNickel");
            super.GRAVEL.set("gravelNickel");
            super.PURE_BLOCK.set("blockNickel");
        }
    };

    private static final String NICKEL_NAME = "Nickel";
    private static final String NICKEL_INFERIOR_NAME = "Inferior.Nickel";
    private static final String NICKEL_INGOT_NAME = "Nickel.Ingot";
    private static final String NICKEL_NUGGET_NAME = "Nickel.Nugget";
    private static final String NICKEL_DUST_NAME = "Nickel.Dust";
    private static final String NICKEL_GRAVEL_NAME = "Nickel.Gravel";
    private static final String NICKEL_BLOCK_NAME = "Nickel.Block";

    private static Nickel INSTANCE;

    public static Nickel getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Nickel();
        }
        return INSTANCE;
    }

    public static void preInit() {
        getInstance().doPreInit();
    }

    public static void init() {
        getInstance().doInit();
    }

    private void doPreInit() {
        OreCoreItemsReg.nickel = OreCoreRegistration.registerBlock(new NickelBlock(), NICKEL_NAME);
        OreCoreItemsReg.nickelInferior = OreCoreRegistration.registerBlock(new NickelBlockInferior(), NICKEL_INFERIOR_NAME);
        OreCoreItemsReg.nickelIngot = OreCoreRegistration.registerItem(new NickelIngot(), NICKEL_INGOT_NAME);
        OreCoreItemsReg.nickelNugget = OreCoreRegistration.registerItem(new NickelNugget(), NICKEL_NUGGET_NAME);
        OreCoreItemsReg.nickelDust = OreCoreRegistration.registerItem(new NickelDust(), NICKEL_DUST_NAME);
        OreCoreItemsReg.nickelGravel = OreCoreRegistration.registerBlock(new NickelGravel(), NICKEL_GRAVEL_NAME);
        OreCoreItemsReg.nickelBlock = OreCoreRegistration.registerBlock(new NickelPureBlock(), NICKEL_BLOCK_NAME);
        StandardElementRegistrations.initDictionary(this, DICT);
    }

    private void doInit() {
        StandardElementRegistrations.initRecipes(this, DICT);
    }

    //@formatter:off
	@Override public Item asDust() { return OreCoreItemsReg.nickelDust; }
	@Override public GravelBlock asGravel() { return OreCoreItemsReg.nickelGravel; }
	@Override public OreBlock asInferior() { return OreCoreItemsReg.nickelInferior; }
	@Override public Item asIngot() { return OreCoreItemsReg.nickelIngot; }
	@Override public Item asNugget() { return OreCoreItemsReg.nickelNugget; }
	@Override public OreBlock asOre() { return OreCoreItemsReg.nickel; }
	@Override public Block asPureBlock() { return OreCoreItemsReg.nickelBlock; }

}
