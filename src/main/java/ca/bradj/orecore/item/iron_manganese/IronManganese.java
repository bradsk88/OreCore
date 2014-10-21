package ca.bradj.orecore.item.iron_manganese;

import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;

public class IronManganese {

	private static final String I_M_NAME = "Iron.Manganese";
	
	public static final int IRON_MANGANESE_TOP_LEVEL = 40;
	
	public static final int IRON_MANGANESE_VEIN_SIZE = 4;

	public static void init() {
		OreCoreItems.ironManganese = OreCoreItems.registerBlock(new IronManganeseBlock(IDs.IRON_MANGANESE_ID), I_M_NAME);
	}
}
