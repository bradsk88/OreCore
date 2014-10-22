package ca.bradj.orecore.item.copper.carb;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;

public class Copper2Carbonate {

	private static final String COPPER_2_CARBONATE_DUST_NAME = "Copper.II.Carbonate.Dust";
	private static final String COPPER_2_CARBONATE_NUGGET_NAME = "Copper.II.Carbonate.Nugget";
	private static final String COPPER_2_CARBONATE_INGOT_NAME = "Copper.II.Carbonate.Ingot";
	private static final String COPPER_2_CARBONATE_BLOCK_NAME = "Copper.II.Carbonate.Block";
	
	private static final String DUST_DICT = "dustCopper2Carbonate";
	private static final String NUGGET_DICT = "nuggetCopper2Carbonate";
	private static final String INGOT_DICT = "ingotCopper2Carbonate";
	private static final String BLOCK_DICT = "blockCopper2Carbonate";

	public static void init() {
		OreCoreItems.copper2CarbonateDust = OreCoreItems.registerItem(new Copper2CarbonateDust(IDs.copper2CarbonateDustId), COPPER_2_CARBONATE_DUST_NAME);
		OreCoreItems.copper2CarbonateNugget = OreCoreItems.registerItem(new Copper2CarbonateNugget(IDs.COPPER_2_CARBONATE_NUGGET_ID), COPPER_2_CARBONATE_NUGGET_NAME);
		OreCoreItems.copper2CarbonateIngot = OreCoreItems.registerItem(new Copper2CarbonateIngot(IDs.COPPER_2_CARBONATE_INGOT_ID), COPPER_2_CARBONATE_INGOT_NAME);
		OreCoreItems.copper2CarbonateBlock = OreCoreItems.registerBlock(new Copper2CarbonatePureBlock(IDs.COPPER_2_CARBONATE_BLOCK_ID), COPPER_2_CARBONATE_BLOCK_NAME);
		
		OreDictionary.registerOre(DUST_DICT, OreCoreItems.copper2CarbonateDust);
		OreDictionary.registerOre(NUGGET_DICT, OreCoreItems.copper2CarbonateNugget);
		OreDictionary.registerOre(INGOT_DICT, OreCoreItems.copper2CarbonateIngot);
		OreDictionary.registerOre(BLOCK_DICT, OreCoreItems.copper2CarbonateBlock);

		OreCoreItems.nuggetToIngotStandard(NUGGET_DICT, OreCoreItems.copper2CarbonateIngot);
		OreCoreItems.ingotToNuggetStandard(INGOT_DICT, OreCoreItems.copper2CarbonateNugget);
		OreCoreItems.ingotToBlockStandard(INGOT_DICT, OreCoreItems.copper2CarbonateBlock);
		OreCoreItems.blockToIngotStandard(BLOCK_DICT, OreCoreItems.copper2CarbonateIngot);

		OreCoreItems.addSmelting(OreCoreItems.copper2CarbonateDust, OreCoreItems.copper2CarbonateIngot, 1);
	}

}
