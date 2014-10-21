package ca.bradj.orecore.item.iron_manganese;

import ca.bradj.orecore.item.IronManganeseBlock;
import ca.bradj.orecore.item.OreCoreItems;

public class IronManganese {

	private static final String I_M_NAME = "Iron Manganese";
	private static final int I_M_ORE_ID = 4020;

	public static void init() {
		OreCoreItems.ironManganese = OreCoreItems.registerBlock(new IronManganeseBlock(I_M_ORE_ID), I_M_NAME);
	}
}
