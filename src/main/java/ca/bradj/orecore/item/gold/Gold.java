package ca.bradj.orecore.item.gold;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;

public class Gold {

	public static final String GOLD_DUST_DICT = "dustGold";
	public static final String GOLD_INGOT_DICT = "ingotGold";
	public static final String GOLD_GRAVEL_DICT = "gravelgold";
	public static final String GOLD_INFERIOR_DICT = "oregoldInferior";

	private static final String GOLD_DUST_NAME = "Gold.Dust";
	private static final String GOLD_INFERIOR_NAME = "Inferior.gold";
	private static final String GOLD_GRAVEL_NAME = "gold.Gravel";

	public static final int GOLD_GRAVEL_TOP_LEVEL = 50;
	public static final int GOLD_INFERIOR_TOP_LEVEL = 70;

	public static final int GOLD_GRAVEL_VEIN_SIZE = 4;
	public static final int GOLD_INFERIOR_VEIN_SIZE = 4;

	public static void init() {
		OreCoreItems.goldInferior = OreCoreRegistration.registerBlock(new GoldBlockInferior(IDs.GOLD_INFERIOR_ID), GOLD_INFERIOR_NAME);
		OreCoreItems.goldDust = OreCoreRegistration.registerItem(new GoldDust(IDs.GOLD_DUST_ID), GOLD_DUST_NAME);
		OreCoreItems.goldGravel = OreCoreRegistration.registerBlock(new GoldGravel(IDs.GOLD_GRAVEL_ID), GOLD_GRAVEL_NAME);

		OreDictionary.registerOre(GOLD_DUST_DICT, OreCoreItems.goldDust);
		OreDictionary.registerOre(GOLD_INFERIOR_DICT, OreCoreItems.goldInferior);
		OreDictionary.registerOre(GOLD_GRAVEL_DICT, OreCoreItems.goldGravel);

		OreCoreRegistration.addSmelting(OreCoreItems.goldDust, Items.gold_ingot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.goldGravel, Items.gold_ingot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.goldInferior, Items.gold_nugget, 3);
	}
}
