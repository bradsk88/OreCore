package ca.bradj.orecore.item.silver;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.silver.SilverBlock;
import ca.bradj.orecore.item.silver.SilverBlockInferior;
import ca.bradj.orecore.item.silver.SilverDust;
import ca.bradj.orecore.item.silver.SilverGravel;
import ca.bradj.orecore.item.silver.SilverIngot;
import ca.bradj.orecore.item.silver.SilverNugget;

public class Silver {
	
	public static final String SILVER_DICT = "oreSilver";
	public static final String SILVER_INFERIOR_DICT = "oreSilverInferior";
	public static final String SILVER_DUST_DICT = "dustSilver";
	public static final String SILVER_INGOT_DICT = "ingotSilver";
	public static final String SILVER_NUGGET_DICT = "nuggetSilver";
	public static final String SILVER_GRAVEL_DICT = "gravelSilver";

	private static final String SILVER_NAME = "Silver";
	private static final String SILVER_INFERIOR_NAME = "Inferior Silver";
	private static final String SILVER_INGOT_NAME = "Silver Ingot";
	private static final String SILVER_NUGGET_NAME = "Silver Nugget";
	private static final String SILVER_DUST_NAME = "Silver Dust";
	private static final String SILVER_GRAVEL_NAME = "Silver Gravel";
	
	public static final int SILVER_TOP_LEVEL = 50;
	public static final int SILVER_GRAVEL_TOP_LEVEL = 50;
	public static final int SILVER_INFERIOR_TOP_LEVEL = 70;
	
	public static final int SILVER_VEIN_SIZE = 6;
	public static final int SILVER_GRAVEL_VEIN_SIZE = 4;
	public static final int SILVER_INFERIOR_VEIN_SIZE = 10;

	public static void init() {
		// Silver
		OreCoreItems.silver = OreCoreItems.registerBlock(new SilverBlock(IDs.SILVER_ORE_ID), SILVER_NAME);
		OreCoreItems.silverInferior = OreCoreItems.registerBlock(new SilverBlockInferior(IDs.SILVER_INFERIOR_ORE_ID), SILVER_INFERIOR_NAME);
		OreCoreItems.silverIngot = OreCoreItems.registerItem(new SilverIngot(IDs.SILVER_INGOT_ID), SILVER_INGOT_NAME);
		OreCoreItems.silverNugget = OreCoreItems.registerItem(new SilverNugget(IDs.SILVER_NUGGET_ID), SILVER_NUGGET_NAME);
		OreCoreItems.silverDust = OreCoreItems.registerItem(new SilverDust(IDs.SILVER_DUST_ID), SILVER_DUST_NAME);
		OreCoreItems.silverGravel = OreCoreItems.registerBlock(new SilverGravel(IDs.SILVER_GRAVEL_ID), SILVER_GRAVEL_NAME);

		OreDictionary.registerOre(SILVER_DICT, OreCoreItems.silver);
		OreDictionary.registerOre(SILVER_INFERIOR_DICT, OreCoreItems.silverInferior);
		OreDictionary.registerOre(SILVER_INGOT_DICT, OreCoreItems.silverIngot);
		OreDictionary.registerOre(SILVER_NUGGET_DICT, OreCoreItems.silverNugget);
		OreDictionary.registerOre(SILVER_DUST_DICT, OreCoreItems.silverDust);

		OreCoreItems.nuggetToIngotStandard(SILVER_NUGGET_DICT, OreCoreItems.silverIngot);
		OreCoreItems.ingotToNuggetStandard(SILVER_INGOT_DICT, OreCoreItems.silverNugget);

		OreCoreItems.addSmelting(OreCoreItems.silver, OreCoreItems.silverIngot, 1);
		OreCoreItems.addSmelting(OreCoreItems.silverGravel, OreCoreItems.silverIngot, 1);
		OreCoreItems.addSmelting(OreCoreItems.silverInferior, OreCoreItems.silverNugget, 3);
		OreCoreItems.addSmelting(OreCoreItems.silverNugget, OreCoreItems.silverIngot, 1);
	}
	
}
