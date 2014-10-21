package ca.bradj.orecore.item.iron;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;

public class Iron {

	public static final String IRON_DUST_DICT = "dustIron";
	public static final String IRON_NUGGET_DICT = "nuggetIron";
	public static final String IRON_INGOT_DICT = "ingotIron";

	private static final String IRON_DUST_NAME = "Iron.Dust";

	private static final String IRON_NUGGET_NAME = "Iron.Nugget";

	public static void init() {
		OreCoreItems.ironDust = OreCoreItems.registerItem(new IronDust(IDs.IRON_DUST_ID), IRON_DUST_NAME);
		OreCoreItems.ironNugget = OreCoreItems.registerItem(new IronNugget(IDs.IRON_NUGGET_ID), IRON_NUGGET_NAME);

		OreDictionary.registerOre(IRON_DUST_DICT, OreCoreItems.ironDust);
		OreDictionary.registerOre(IRON_NUGGET_DICT, OreCoreItems.ironNugget);

		OreCoreItems.addSmelting(OreCoreItems.ironDust, Items.iron_ingot, 1);

		OreCoreItems.nuggetToIngotStandard(IRON_NUGGET_DICT, Items.iron_ingot);
		OreCoreItems.ingotToNuggetStandard(IRON_INGOT_DICT, OreCoreItems.ironNugget);
	}

}
