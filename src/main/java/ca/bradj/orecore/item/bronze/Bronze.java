package ca.bradj.orecore.item.bronze;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.copper.Copper;
import ca.bradj.orecore.item.tin.Tin;

public class Bronze {

	private static final String BRONZE_DUST_NAME = "Bronze.Dust";
	private static final String BRONZE_INGOT_NAME = "Bronze.Ingot";
	private static final String BRONZE_NUGGET_NAME = "Bronze.Nugget";

	public static final String BRONZE_DUST_DICT = "dustBronze";
	public static final String BRONZE_INGOT_DICT = "ingotBronze";
	public static final String BRONZE_NUGGET_DICT = "nuggetBronze";

	public static void init() {

		OreCoreItems.bronzeDust = OreCoreItems.registerItem(new BronzeDust(IDs.BRONZE_DUST_ID), BRONZE_DUST_NAME);
		OreCoreItems.bronzeIngot = OreCoreItems.registerItem(new BronzeIngot(IDs.BRONZE_INGOT_ID), BRONZE_INGOT_NAME);
		OreCoreItems.bronzeNugget = OreCoreItems.registerItem(new BronzeNugget(IDs.BRONZE_NUGGET_ID), BRONZE_NUGGET_NAME);

		OreDictionary.registerOre(BRONZE_DUST_DICT, OreCoreItems.bronzeDust);
		OreDictionary.registerOre(BRONZE_NUGGET_DICT, OreCoreItems.bronzeNugget);
		OreDictionary.registerOre(BRONZE_INGOT_DICT, OreCoreItems.bronzeIngot);

		OreCoreItems.nuggetToIngotStandard(BRONZE_NUGGET_DICT, OreCoreItems.bronzeIngot);
		OreCoreItems.ingotToNuggetStandard(BRONZE_INGOT_DICT, OreCoreItems.bronzeNugget);

		OreCoreItems.addSmelting(OreCoreItems.bronzeDust, OreCoreItems.bronzeIngot, 1);
		OreCoreItems.addShapelessRecipe(OreCoreItems.bronzeDust, 2, Copper.COPPER_DUST_DICT, Tin.TIN_DUST_DICT);
	}

}
