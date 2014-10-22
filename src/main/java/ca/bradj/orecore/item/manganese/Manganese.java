package ca.bradj.orecore.item.manganese;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;

public class Manganese {

	private static final String IM_DICT = "oreIronManganese";

	public static final String DUST_DICT = "dustManganese";
	public static final String INGOT_DICT = "ingotManganese";
	public static final String NUGGET_DICT = "nuggetManganese";
	public static final String BLOCK_DICT = "blockManganese";

	private static final String MANGANESE_DUST_NAME = "Manganese.Dust";
	private static final String MANGANESE_NUGGET_NAME = "Manganese.Nugget";
	private static final String MANGANESE_INGOT_NAME = "Manganese.Ingot";
	private static final String MANGANESE_BLOCK_NAME = "Manganese.Block";

	public static void init() {
		OreCoreItems.manganeseDust = OreCoreRegistration.registerItem(new ManganeseDust(IDs.MANGANESE_DUST_ID), MANGANESE_DUST_NAME);
		OreCoreItems.manganeseNugget = OreCoreRegistration.registerItem(new ManganeseNugget(IDs.MANGANESE_NUGGET_ID), MANGANESE_NUGGET_NAME);
		OreCoreItems.manganeseIngot = OreCoreRegistration.registerItem(new ManganeseIngot(IDs.MANGANESE_INGOT_ID), MANGANESE_INGOT_NAME);
		OreCoreItems.manganeseBlock = OreCoreRegistration.registerBlock(new ManganesePureBlock(IDs.MANGANESE_BLOCK_ID), MANGANESE_BLOCK_NAME);
		
		OreDictionary.registerOre(IM_DICT, OreCoreItems.ironManganese);
		OreDictionary.registerOre(DUST_DICT, OreCoreItems.manganeseDust);
		OreDictionary.registerOre(INGOT_DICT, OreCoreItems.manganeseIngot);
		OreDictionary.registerOre(NUGGET_DICT, OreCoreItems.manganeseNugget);
		OreDictionary.registerOre(BLOCK_DICT, OreCoreItems.manganeseBlock);

		OreCoreRegistration.nuggetToIngotStandard(NUGGET_DICT, OreCoreItems.manganeseIngot);
		OreCoreRegistration.ingotToNuggetStandard(INGOT_DICT, OreCoreItems.manganeseNugget);
		OreCoreRegistration.ingotToBlockStandard(INGOT_DICT, OreCoreItems.manganeseBlock);
		OreCoreRegistration.blockToIngotStandard(BLOCK_DICT, OreCoreItems.manganeseIngot);
		
		OreCoreRegistration.addSmelting(OreCoreItems.manganeseDust, OreCoreItems.manganeseIngot, 1);
	}
}
