package ca.bradj.orecore.item.tin;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems;

public class Tin {

	private static final String TIN_NAME = "Tin";
	private static final int TIN_ORE_ID = 4015;

	private static final String TIN_INFERIOR_NAME = "Inferior Tin";
	private static final int TIN_INFERIOR_ORE_ID = 4016;

	private static final String TIN_INGOT_NAME = "Tin Ingot";
	private static final int TIN_INGOT_ID = 4017;
	
	private static final String TIN_NUGGET_NAME = "Tin Nugget";
	private static final int TIN_NUGGET_ID = 4018;
	
	private static final String TIN_DUST_NAME = "Tin Dust";
	private static final int TIN_DUST_ID = 4019;
	
	private static final String TIN_DICT = "oreTin";
	private static final String TIN_INFERIOR_DICT = "oreTinInferior";
	private static final String TIN_INGOT_DICT = "ingotTin";
	private static final String TIN_NUGGET_DICT = "nuggetTin";
	private static final String TIN_DUST_DICT = "dustTin";
	
	public static void init() {
		OreCoreItems.tin = OreCoreItems.registerBlock(new TinBlock(TIN_ORE_ID), TIN_NAME);
		OreCoreItems.tinInferior = OreCoreItems.registerBlock(new TinBlockInferior(TIN_INFERIOR_ORE_ID), TIN_INFERIOR_NAME);
		OreCoreItems.tinIngot = OreCoreItems.registerItem(new TinIngot(TIN_INGOT_ID), TIN_INGOT_NAME);
		OreCoreItems.tinNugget = OreCoreItems.registerItem(new TinNugget(TIN_NUGGET_ID), TIN_NUGGET_NAME);
		OreCoreItems.tinDust = OreCoreItems.registerItem(new TinDust(TIN_DUST_ID), TIN_DUST_NAME);

		OreDictionary.registerOre(TIN_DICT, OreCoreItems.tin);
		OreDictionary.registerOre(TIN_INFERIOR_DICT, OreCoreItems.tinInferior);
		OreDictionary.registerOre(TIN_INGOT_DICT, OreCoreItems.tinIngot);
		OreDictionary.registerOre(TIN_NUGGET_DICT, OreCoreItems.tinNugget);
		OreDictionary.registerOre(TIN_DUST_DICT, OreCoreItems.tinDust);
		
		OreCoreItems.nuggetToIngotStandard(TIN_NUGGET_DICT, OreCoreItems.tinIngot);
		OreCoreItems.ingotToNuggetStandard(TIN_INGOT_DICT, OreCoreItems.tinNugget);
		
		OreCoreItems.addSmelting(TIN_DICT, OreCoreItems.tinIngot, 1);
		OreCoreItems.addSmelting(TIN_INFERIOR_DICT, OreCoreItems.tinNugget, 3);
		OreCoreItems.addSmelting(TIN_DUST_DICT, OreCoreItems.tinIngot, 1);
	}
	
}
