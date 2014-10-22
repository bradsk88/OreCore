package ca.bradj.orecore.item.brass;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.iron.Iron;
import ca.bradj.orecore.item.manganese.Manganese;
import ca.bradj.orecore.item.brass.BrassDust;
import ca.bradj.orecore.item.brass.BrassIngot;
import ca.bradj.orecore.item.brass.BrassNugget;
import ca.bradj.orecore.item.brass.BrassPureBlock;

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
		OreCoreItems.brassDust = OreCoreItems.registerItem(new BrassDust(IDs.BRASS_DUST_ID), BRASS_DUST_NAME);
		OreCoreItems.brassIngot = OreCoreItems.registerItem(new BrassIngot(IDs.BRASS_INGOT_ID), BRASS_INGOT_NAME);
		OreCoreItems.brassNugget = OreCoreItems.registerItem(new BrassNugget(IDs.BRASS_NUGGET_ID), BRASS_NUGGET_NAME);
		OreCoreItems.brassBlock = OreCoreItems.registerBlock(new BrassPureBlock(IDs.BRASS_BLOCK_ID), BRASS_BLOCK_NAME);

		OreDictionary.registerOre(BRASS_DUST_DICT, OreCoreItems.brassDust);
		OreDictionary.registerOre(BRASS_NUGGET_DICT, OreCoreItems.brassNugget);
		OreDictionary.registerOre(BRASS_INGOT_DICT, OreCoreItems.brassIngot);
		OreDictionary.registerOre(BRASS_BLOCK_DICT, OreCoreItems.brassBlock);
		
		OreCoreItems.addShapelessRecipe(OreCoreItems.brassDust, 2, Iron.IRON_DUST_DICT, Manganese.DUST_DICT);
		
		OreCoreItems.nuggetToIngotStandard(BRASS_NUGGET_DICT, OreCoreItems.brassIngot);
		OreCoreItems.ingotToNuggetStandard(BRASS_INGOT_DICT, OreCoreItems.brassNugget);
		OreCoreItems.ingotToBlockStandard(BRASS_INGOT_DICT, OreCoreItems.brassBlock);
		OreCoreItems.blockToIngotStandard(BRASS_BLOCK_DICT, OreCoreItems.brassIngot);
		
		OreCoreItems.addSmelting(OreCoreItems.brassDust, OreCoreItems.brassIngot, 1);
	}
	
}
