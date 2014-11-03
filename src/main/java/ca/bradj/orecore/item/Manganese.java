package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardForgeable;
import ca.bradj.orecore.item.manganese.ManganeseDust;
import ca.bradj.orecore.item.manganese.ManganeseIngot;
import ca.bradj.orecore.item.manganese.ManganeseNugget;
import ca.bradj.orecore.item.manganese.ManganesePureBlock;

public class Manganese implements StandardForgeable {

    private static final String IM_DICT = "oreIronManganese";

    public static final String DUST_DICT = "dustManganese";
    public static final String INGOT_DICT = "ingotManganese";
    public static final String NUGGET_DICT = "nuggetManganese";
    public static final String BLOCK_DICT = "blockManganese";

    private static final String MANGANESE_DUST_NAME = "Manganese.Dust";
    private static final String MANGANESE_NUGGET_NAME = "Manganese.Nugget";
    private static final String MANGANESE_INGOT_NAME = "Manganese.Ingot";
    private static final String MANGANESE_BLOCK_NAME = "Manganese.Block";

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
        OreDictionary.registerOre(DUST_DICT, OreCoreItemsReg.manganeseDust);
        OreDictionary.registerOre(INGOT_DICT, OreCoreItemsReg.manganeseIngot);
        OreDictionary.registerOre(NUGGET_DICT, OreCoreItemsReg.manganeseNugget);
        OreDictionary.registerOre(BLOCK_DICT, OreCoreItemsReg.manganeseBlock);
    }

    public static void init() {
        OreCoreRegistration.nuggetToIngotStandard(NUGGET_DICT, OreCoreItemsReg.manganeseIngot);
        OreCoreRegistration.ingotToNuggetStandard(INGOT_DICT, OreCoreItemsReg.manganeseNugget);
        OreCoreRegistration.ingotToBlockStandard(INGOT_DICT, OreCoreItemsReg.manganeseBlock);
        OreCoreRegistration.blockToIngotStandard(BLOCK_DICT, OreCoreItemsReg.manganeseIngot);

        OreCoreRegistration.addSmelting(OreCoreItemsReg.manganeseDust, OreCoreItemsReg.manganeseIngot, 1);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreItemsReg.manganeseDust; }
    @Override public Item asIngot() { return OreCoreItemsReg.manganeseIngot; }
    @Override public Item asNugget() { return OreCoreItemsReg.manganeseNugget; }
    @Override public Block asPureBlock() { return OreCoreItemsReg.manganeseBlock; }

}
