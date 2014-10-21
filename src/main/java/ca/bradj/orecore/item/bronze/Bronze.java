package ca.bradj.orecore.item.bronze;

import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;

public class Bronze {

	private static final String BRONZE_DUST_NAME = "Bronze Dust";
	public static final String BRONZE_DUST_DICT = "dustBronze";
	public static final String BRONZE_INGOT_DICT = "ingotBronze";
	public static final String BRONZE_NUGGET_DICT = "nuggetBronze";

	public static void init() {

		OreCoreItems.bronzeDust = OreCoreItems.registerItem(new BronzeDust(IDs.BRONZE_DUST_ID), BRONZE_DUST_NAME);

	}

}
