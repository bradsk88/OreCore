package ca.bradj.orecore.item;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecore.item.brass.BrassDust;
import ca.bradj.orecore.item.brass.BrassIngot;
import ca.bradj.orecore.item.brass.BrassNugget;
import ca.bradj.orecore.item.brass.BrassPureBlock;
import ca.bradj.orecoremin.item.Copper;

public class Brass {

    private static final String BRASS_DUST_DICT = "dustBrass";
    private static final String BRASS_NUGGET_DICT = "nuggetBrass";
    private static final String BRASS_INGOT_DICT = "ingotBrass";
    private static final String BRASS_BLOCK_DICT = "blockBrass";

    private static final String BRASS_DUST_NAME = "Brass.Dust";
    private static final String BRASS_INGOT_NAME = "Brass.Ingot";
    private static final String BRASS_NUGGET_NAME = "Brass.Nugget";
    private static final String BRASS_BLOCK_NAME = "Brass.Block";

    public static void preInit() {
        OreCoreItemsReg.brassDust = OreCoreRegistration.registerItem(new BrassDust(), BRASS_DUST_NAME);
        OreCoreItemsReg.brassIngot = OreCoreRegistration.registerItem(new BrassIngot(), BRASS_INGOT_NAME);
        OreCoreItemsReg.brassNugget = OreCoreRegistration.registerItem(new BrassNugget(), BRASS_NUGGET_NAME);
        OreCoreItemsReg.brassBlock = OreCoreRegistration.registerBlock(new BrassPureBlock(), BRASS_BLOCK_NAME);

        OreDictionary.registerOre(BRASS_DUST_DICT, OreCoreItemsReg.brassDust);
        OreDictionary.registerOre(BRASS_NUGGET_DICT, OreCoreItemsReg.brassNugget);
        OreDictionary.registerOre(BRASS_INGOT_DICT, OreCoreItemsReg.brassIngot);
        OreDictionary.registerOre(BRASS_BLOCK_DICT, OreCoreItemsReg.brassBlock);
    }

    public static void init() {
        OreCoreRegistration.addShapelessRecipe(OreCoreItemsReg.brassDust, 2, Copper.DICT.DUST, Zinc.DICT.DUST);

        OreCoreRegistration.nuggetToIngotStandard(BRASS_NUGGET_DICT, OreCoreItemsReg.brassIngot);
        OreCoreRegistration.ingotToNuggetStandard(BRASS_INGOT_DICT, OreCoreItemsReg.brassNugget);
        OreCoreRegistration.ingotToBlockStandard(BRASS_INGOT_DICT, OreCoreItemsReg.brassBlock);
        OreCoreRegistration.blockToIngotStandard(BRASS_BLOCK_DICT, OreCoreItemsReg.brassIngot);

        OreCoreRegistration.addSmelting(OreCoreItemsReg.brassDust, OreCoreItemsReg.brassIngot, 1);
    }

}
