package ca.bradj.orecore.item.copper.carb;

import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;

public class Copper2Carbonate {

	private static final String COPPER_2_CARBONATE_DUST_NAME = "Copper II Carbonate Dust";

	public static void init() {
		OreCoreItems.copper2CarbonateDust = OreCoreItems.registerItem(new Copper2CarbonateDust(IDs.copper2CarbonateDustId), COPPER_2_CARBONATE_DUST_NAME);
	}

}
