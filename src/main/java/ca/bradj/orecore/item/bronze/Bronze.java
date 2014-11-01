package ca.bradj.orecore.item.bronze;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecoremin.item.copper.Copper;
import ca.bradj.orecoremin.item.tin.Tin;

public class Bronze {

	private static final String BRONZE_DUST_NAME = "Bronze.Dust";
	private static final String BRONZE_INGOT_NAME = "Bronze.Ingot";
	private static final String BRONZE_NUGGET_NAME = "Bronze.Nugget";
	private static final String BRONZE_BLOCK_NAME = "Bronze.Block";

	public static final String BRONZE_DUST_DICT = "dustBronze";
	public static final String BRONZE_INGOT_DICT = "ingotBronze";
	public static final String BRONZE_NUGGET_DICT = "nuggetBronze";
	private static final String BRONZE_BLOCK_DICT = "blockBronze";

	public static void init() {

		OreCoreItems.bronzeDust = OreCoreRegistration.registerItem(new BronzeDust(), BRONZE_DUST_NAME);
		OreCoreItems.bronzeIngot = OreCoreRegistration.registerItem(new BronzeIngot(), BRONZE_INGOT_NAME);
		OreCoreItems.bronzeNugget = OreCoreRegistration.registerItem(new BronzeNugget(), BRONZE_NUGGET_NAME);
		OreCoreItems.bronzeBlock = OreCoreRegistration.registerBlock(new BronzePureBlock(), BRONZE_BLOCK_NAME);

		OreDictionary.registerOre(BRONZE_DUST_DICT, OreCoreItems.bronzeDust);
		OreDictionary.registerOre(BRONZE_NUGGET_DICT, OreCoreItems.bronzeNugget);
		OreDictionary.registerOre(BRONZE_INGOT_DICT, OreCoreItems.bronzeIngot);
		OreDictionary.registerOre(BRONZE_BLOCK_DICT, OreCoreItems.bronzeBlock);

		OreCoreRegistration.nuggetToIngotStandard(BRONZE_NUGGET_DICT, OreCoreItems.bronzeIngot);
		OreCoreRegistration.ingotToNuggetStandard(BRONZE_INGOT_DICT, OreCoreItems.bronzeNugget);
		OreCoreRegistration.blockToIngotStandard(BRONZE_BLOCK_DICT, OreCoreItems.bronzeIngot);
		OreCoreRegistration.ingotToBlockStandard(BRONZE_INGOT_DICT, OreCoreItems.bronzeBlock);

		OreCoreRegistration.addSmelting(OreCoreItems.bronzeDust, OreCoreItems.bronzeIngot, 1);
		OreCoreRegistration.addShapelessRecipe(OreCoreItems.bronzeDust, 2, Copper.DICT.DUST, Tin.DICT.DUST);
	}

}
