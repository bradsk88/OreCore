package ca.bradj.orecore.item.iron_manganese;

import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;

public class IronManganese {

	private static final String I_M_NAME = "Iron.Manganese";

	public static final int IRON_MANGANESE_TOP_LEVEL = 40;

	public static final int IRON_MANGANESE_VEIN_SIZE = 4;

	public static void init() {
		OreCoreItems.ironManganese = OreCoreRegistration.registerBlock(new IronManganeseBlock(), I_M_NAME);
	}
}
