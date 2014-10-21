package ca.bradj.orecore.item.copper.carb;

import ca.bradj.orecore.item.OreCoreItems;

public class Copper2Carbonate {

	private static final String COPPER_2_CARBONATE_DUST_NAME = "Copper II Carbonate Dust";
	private static final int copper2CarbonateDustId = 4009;

	public static void init() {
		OreCoreItems.copper2CarbonateDust = OreCoreItems.registerItem(new Copper2CarbonateDust(copper2CarbonateDustId), COPPER_2_CARBONATE_DUST_NAME);
	}

}
