package ca.bradj.orecore.item.manganese;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;

public class Manganese {

	private static final String IM_DICT = "oreIronManganese";

	public static final String DUST_DICT = "dustManganese";
	public static final String INGOT_DICT = "ingotManganese";
	public static final String NUGGET_DICT = "nuggetManganese";

	private static final String MANGANESE_DUST_NAME = "Manganese Dust";
	private static final String MANGANESE_NUGGET_NAME = "Manganese Nugget";
	private static final String MANGANESE_INGOT_NAME = "Manganese Ingot";

	public static void init() {
		OreCoreItems.manganeseDust = OreCoreItems.registerItem(new ManganeseDust(IDs.MANGANESE_DUST_ID), MANGANESE_DUST_NAME);
		OreCoreItems.manganeseNugget = OreCoreItems.registerItem(new ManganeseNugget(IDs.MANGANESE_NUGGET_ID), MANGANESE_NUGGET_NAME);
		OreCoreItems.manganeseIngot = OreCoreItems.registerItem(new ManganeseIngot(IDs.MANGANESE_INGOT_ID), MANGANESE_INGOT_NAME);
		
		OreDictionary.registerOre(IM_DICT, OreCoreItems.ironManganese);
		OreDictionary.registerOre(DUST_DICT, OreCoreItems.manganeseDust);
		OreDictionary.registerOre(INGOT_DICT, OreCoreItems.manganeseIngot);
		OreDictionary.registerOre(NUGGET_DICT, OreCoreItems.manganeseNugget);

		OreCoreItems.nuggetToIngotStandard(NUGGET_DICT, OreCoreItems.manganeseIngot);
		OreCoreItems.ingotToNuggetStandard(INGOT_DICT, OreCoreItems.manganeseNugget);
		
		OreCoreItems.addSmelting(OreCoreItems.manganeseDust, OreCoreItems.manganeseIngot, 1);
	}
}
