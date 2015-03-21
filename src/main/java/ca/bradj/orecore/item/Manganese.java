package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.DictionaryNames;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardForgeable;
import ca.bradj.forge.StandardForgeableRegistrations;
import ca.bradj.orecore.item.manganese.ManganeseDust;
import ca.bradj.orecore.item.manganese.ManganeseIngot;
import ca.bradj.orecore.item.manganese.ManganeseNugget;
import ca.bradj.orecore.item.manganese.ManganesePureBlock;

public class Manganese implements StandardForgeable {

    private static final String IM_DICT = "oreIronManganese";

    private static final String MANGANESE_DUST_NAME = "Manganese.Dust";
    private static final String MANGANESE_NUGGET_NAME = "Manganese.Nugget";
    private static final String MANGANESE_INGOT_NAME = "Manganese.Ingot";
    private static final String MANGANESE_BLOCK_NAME = "Manganese.Block";

    public static final DictionaryNames DICT = new DictionaryNames() {
        {
            this.DUST.set("dustManganese");
            this.INGOT.set("ingotManganese");
            this.NUGGET.set("nuggetManganese");
            this.PURE_BLOCK.set("blockManganese");
        }
    };

    private static Manganese INSTANCE;

    public static Manganese getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Manganese();
        }
        return INSTANCE;
    }

    public static void preInit() {
        OreCoreItemsReg.manganeseDust = OreCoreRegistration.registerItem(new ManganeseDust(), MANGANESE_DUST_NAME);
        OreCoreItemsReg.manganeseNugget = OreCoreRegistration.registerItem(new ManganeseNugget(), MANGANESE_NUGGET_NAME);
        OreCoreItemsReg.manganeseIngot = OreCoreRegistration.registerItem(new ManganeseIngot(), MANGANESE_INGOT_NAME);
        OreCoreItemsReg.manganeseBlock = OreCoreRegistration.registerBlock(new ManganesePureBlock(), MANGANESE_BLOCK_NAME);

        OreDictionary.registerOre(IM_DICT, OreCoreItemsReg.ironManganese);
        StandardForgeableRegistrations.initDictionary(getInstance(), DICT);
    }

    public static void init() {
        StandardForgeableRegistrations.initRecipes(getInstance(), DICT);
        OreCoreRegistration.addSmelting(OreCoreItemsReg.manganeseDust, OreCoreItemsReg.manganeseIngot, 1);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreItemsReg.manganeseDust; }
    @Override public Item asIngot() { return OreCoreItemsReg.manganeseIngot; }
    @Override public Item asNugget() { return OreCoreItemsReg.manganeseNugget; }
    @Override public Block asPureBlock() { return OreCoreItemsReg.manganeseBlock; }

}
