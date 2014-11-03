package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ca.bradj.forge.DictionaryNames;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardElement;
import ca.bradj.forge.StandardElementRegistrations;
import ca.bradj.orecore.item.osmium.OsmiumBlock;
import ca.bradj.orecore.item.osmium.OsmiumBlockInferior;
import ca.bradj.orecore.item.osmium.OsmiumDust;
import ca.bradj.orecore.item.osmium.OsmiumGravel;
import ca.bradj.orecore.item.osmium.OsmiumIngot;
import ca.bradj.orecore.item.osmium.OsmiumNugget;
import ca.bradj.orecore.item.osmium.OsmiumPureBlock;

public class Osmium implements StandardElement {

    private static final String OSMIUM_NAME = "Osmium";
    private static final String OSMIUM_INFERIOR_NAME = "Inferior.Osmium";
    private static final String OSMIUM_INGOT_NAME = "Osmium.Ingot";
    private static final String OSMIUM_NUGGET_NAME = "Osmium.Nugget";
    private static final String OSMIUM_DUST_NAME = "Osmium.Dust";
    private static final String OSMIUM_GRAVEL_NAME = "Osmium.Gravel";
    private static final String OSMIUM_BLOCK_NAME = "Osmium.Block";

    public static final int OSMIUM_TOP_LEVEL = 45;
    public static final int OSMIUM_GRAVEL_TOP_LEVEL = 100;
    public static final int OSMIUM_INFERIOR_TOP_LEVEL = 55;

    public static final int OSMIUM_VEIN_SIZE = 8;
    public static final int OSMIUM_GRAVEL_VEIN_SIZE = 2;
    public static final int OSMIUM_INFERIOR_VEIN_SIZE = 10;

    private static Osmium INSTANCE;

    private static final DictionaryNames DICT = new DictionaryNames() {
        {
            this.DUST = "dustOsmium";
            this.GRAVEL = "gravelOsmium";
            this.INFERIOR = "oreOsmiumInferior";
            this.INGOT = "ingotOsmium";
            this.NUGGET = "nuggetOsmium";
            this.ORE = "oreOsmium";
            this.PURE_BLOCK = "blockOsmium";
        }
    };

    public static Osmium getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Osmium();
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
        OreCoreItemsReg.osmium = OreCoreRegistration.registerBlock(new OsmiumBlock(), OSMIUM_NAME);
        OreCoreItemsReg.osmiumInferior = OreCoreRegistration.registerBlock(new OsmiumBlockInferior(), OSMIUM_INFERIOR_NAME);
        OreCoreItemsReg.osmiumIngot = OreCoreRegistration.registerItem(new OsmiumIngot(), OSMIUM_INGOT_NAME);
        OreCoreItemsReg.osmiumNugget = OreCoreRegistration.registerItem(new OsmiumNugget(), OSMIUM_NUGGET_NAME);
        OreCoreItemsReg.osmiumGravel = OreCoreRegistration.registerBlock(new OsmiumGravel(), OSMIUM_GRAVEL_NAME);
        OreCoreItemsReg.osmiumDust = OreCoreRegistration.registerItem(new OsmiumDust(), OSMIUM_DUST_NAME);
        OreCoreItemsReg.osmiumBlock = OreCoreRegistration.registerBlock(new OsmiumPureBlock(), OSMIUM_BLOCK_NAME);
        StandardElementRegistrations.initDictionary(this, DICT);
    }

    private void doInit() {
        StandardElementRegistrations.initRecipes(this, DICT);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreItemsReg.osmiumDust; }
    @Override public Block asGravel() { return OreCoreItemsReg.osmiumGravel; }
    @Override public Block asInferior() { return OreCoreItemsReg.osmiumInferior; }
    @Override public Item asIngot() { return OreCoreItemsReg.osmiumIngot; }
    @Override public Item asNugget() { return OreCoreItemsReg.osmiumNugget; }
    @Override public Block asOre() { return OreCoreItemsReg.osmium; }
    @Override public Block asPureBlock() { return OreCoreItemsReg.osmiumBlock; }

}
