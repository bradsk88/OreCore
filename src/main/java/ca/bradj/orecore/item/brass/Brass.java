package ca.bradj.orecore.item.brass;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.zinc.Zinc;
import ca.bradj.orecoremin.item.copper.Copper;

public class Brass {

	private static final String BRASS_DUST_DICT = "dustBrass";
	private static final String BRASS_NUGGET_DICT = "nuggetBrass";
	private static final String BRASS_INGOT_DICT = "ingotBrass";
	private static final String BRASS_BLOCK_DICT = "blockBrass";

	private static final String BRASS_DUST_NAME = "Brass.Dust";
	private static final String BRASS_INGOT_NAME = "Brass.Ingot";
	private static final String BRASS_NUGGET_NAME = "Brass.Nugget";
	private static final String BRASS_BLOCK_NAME = "Brass.Block";

	public static void init() {
		OreCoreItems.brassDust = OreCoreRegistration.registerItem(new BrassDust(), BRASS_DUST_NAME);
		OreCoreItems.brassIngot = OreCoreRegistration.registerItem(new BrassIngot(), BRASS_INGOT_NAME);
		OreCoreItems.brassNugget = OreCoreRegistration.registerItem(new BrassNugget(), BRASS_NUGGET_NAME);
		OreCoreItems.brassBlock = OreCoreRegistration.registerBlock(new BrassPureBlock(), BRASS_BLOCK_NAME);

		OreDictionary.registerOre(BRASS_DUST_DICT, OreCoreItems.brassDust);
		OreDictionary.registerOre(BRASS_NUGGET_DICT, OreCoreItems.brassNugget);
		OreDictionary.registerOre(BRASS_INGOT_DICT, OreCoreItems.brassIngot);
		OreDictionary.registerOre(BRASS_BLOCK_DICT, OreCoreItems.brassBlock);

		OreCoreRegistration.addShapelessRecipe(OreCoreItems.brassDust, 2, Copper.DICT.DUST, Zinc.DICT.DUST);

		OreCoreRegistration.nuggetToIngotStandard(BRASS_NUGGET_DICT, OreCoreItems.brassIngot);
		OreCoreRegistration.ingotToNuggetStandard(BRASS_INGOT_DICT, OreCoreItems.brassNugget);
		OreCoreRegistration.ingotToBlockStandard(BRASS_INGOT_DICT, OreCoreItems.brassBlock);
		OreCoreRegistration.blockToIngotStandard(BRASS_BLOCK_DICT, OreCoreItems.brassIngot);

		OreCoreRegistration.addSmelting(OreCoreItems.brassDust, OreCoreItems.brassIngot, 1);
	}

}
