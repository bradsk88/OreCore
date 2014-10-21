package ca.bradj.orecore.item.manganese;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems;

public class Manganese {

	private static final String IM_DICT = "oreIronManganese";

	public static final String DUST_DICT = "dustManganese";
	public static final String INGOT_DICT = "ingotManganese";
	public static final String NUGGET_DICT = "nuggetManganese";

	private static final String MANGANESE_DUST_NAME = "Manganese Dust";
	private static final int MANGANESE_DUST_ID = 4021;

	private static final String MANGANESE_NUGGET_NAME = "Manganese Nugget";
	private static final int MANGANESE_NUGGET_ID = 4026;

	private static final String MANGANESE_INGOT_NAME = "Manganese Ingot";
	private static final int MANGANESE_INGOT_ID = 4027;

	public static void init() {
		OreCoreItems.manganeseDust = OreCoreItems.registerItem(new ManganeseDust(MANGANESE_DUST_ID), MANGANESE_DUST_NAME);
		OreCoreItems.manganeseNugget = OreCoreItems.registerItem(new ManganeseNugget(MANGANESE_NUGGET_ID), MANGANESE_NUGGET_NAME);
		OreCoreItems.manganeseIngot = OreCoreItems.registerItem(new ManganeseIngot(MANGANESE_INGOT_ID), MANGANESE_INGOT_NAME);
		
		OreDictionary.registerOre(IM_DICT, OreCoreItems.ironManganese);
		OreDictionary.registerOre(DUST_DICT, OreCoreItems.manganeseDust);
		OreDictionary.registerOre(INGOT_DICT, OreCoreItems.manganeseIngot);
		OreDictionary.registerOre(NUGGET_DICT, OreCoreItems.manganeseNugget);

		OreCoreItems.nuggetToIngotStandard(NUGGET_DICT, OreCoreItems.manganeseIngot);
		OreCoreItems.ingotToNuggetStandard(INGOT_DICT, OreCoreItems.manganeseNugget);
	}
}
