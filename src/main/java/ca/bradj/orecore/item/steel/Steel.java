package ca.bradj.orecore.item.steel;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.iron.Iron;
import ca.bradj.orecore.item.manganese.Manganese;

public class Steel {

	private static final String STEEL_DUST_DICT = "dustSteel";
	private static final String STEEL_NUGGET_DICT = "nuggetSteel";
	private static final String STEEL_INGOT_DICT = "ingotSteel";
	private static final String STEEL_BLOCK_DICT = "blockSteel";
	
	private static final String STEEL_DUST_NAME = "Steel.Dust";
	private static final String STEEL_INGOT_NAME = "Steel.Ingot";
	private static final String STEEL_NUGGET_NAME = "Steel.Nugget";
	private static final String STEEL_BLOCK_NAME = "Steel.Block";

	public static void init() {
		OreCoreItems.steelDust = OreCoreItems.registerItem(new SteelDust(IDs.STEEL_DUST_ID), STEEL_DUST_NAME);
		OreCoreItems.steelIngot = OreCoreItems.registerItem(new SteelIngot(IDs.STEEL_INGOT_ID), STEEL_INGOT_NAME);
		OreCoreItems.steelNugget = OreCoreItems.registerItem(new SteelNugget(IDs.STEEL_NUGGET_ID), STEEL_NUGGET_NAME);
		OreCoreItems.steelBlock = OreCoreItems.registerBlock(new SteelPureBlock(IDs.STEEL_BLOCK_ID), STEEL_BLOCK_NAME);

		OreDictionary.registerOre(STEEL_DUST_DICT, OreCoreItems.steelDust);
		OreDictionary.registerOre(STEEL_NUGGET_DICT, OreCoreItems.steelNugget);
		OreDictionary.registerOre(STEEL_INGOT_DICT, OreCoreItems.steelIngot);
		OreDictionary.registerOre(STEEL_BLOCK_DICT, OreCoreItems.steelBlock);
		
		OreCoreItems.addShapelessRecipe(OreCoreItems.steelDust, 2, Iron.IRON_DUST_DICT, Manganese.DUST_DICT);
		
		OreCoreItems.nuggetToIngotStandard(STEEL_NUGGET_DICT, OreCoreItems.steelIngot);
		OreCoreItems.ingotToNuggetStandard(STEEL_INGOT_DICT, OreCoreItems.steelNugget);
		OreCoreItems.ingotToBlockStandard(STEEL_INGOT_DICT, OreCoreItems.steelBlock);
		OreCoreItems.blockToIngotStandard(STEEL_BLOCK_DICT, OreCoreItems.steelIngot);
		
		OreCoreItems.addSmelting(OreCoreItems.steelDust, OreCoreItems.steelIngot, 1);
	}

}
