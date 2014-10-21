package ca.bradj.orecore.item.osmium;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems;

public class Osmium {

	private static final String OSMIUM_DICT = "oreOsmium";
	private static final String OSMIUM_INFERIOR_DICT = "oreOsmiumInferior";
	private static final String OSMIUM_INGOT_DICT = "ingotOsmium";
	private static final String OSMIUM_NUGGET_DICT = "nuggetOsmium";
	private static final String OSMIUM_DUST_DICT = "dustOsmium";

	private static final String OSMIUM_NAME = "Osmium";
	private static int OSMIUM_ORE_ID = 4010;

	private static final int OSMIUM_INFERIOR_ORE_ID = 4011;
	private static final String OSMIUM_INFERIOR_NAME = "Inferior Osmium";

	private static final int OSMIUM_INGOT_ID = 4012;
	private static final String OSMIUM_INGOT_NAME = "Osmium Ingot";

	private static final String OSMIUM_NUGGET_NAME = "Osmium Nugget";
	private static final int OSMIUM_NUGGET_ID = 4013;

	private static final String OSMIUM_DUST_NAME = "Osmium Dust";
	private static final int OSMIUM_DUST_ID = 4014;

	public static void init() {
		OreCoreItems.osmium = OreCoreItems.registerBlock(new OsmiumBlock(OSMIUM_ORE_ID), OSMIUM_NAME);
		OreCoreItems.osmiumInferior = OreCoreItems.registerBlock(new OsmiumBlockInferior(OSMIUM_INFERIOR_ORE_ID), OSMIUM_INFERIOR_NAME);
		OreCoreItems.osmiumIngot = OreCoreItems.registerItem(new OsmiumIngot(OSMIUM_INGOT_ID), OSMIUM_INGOT_NAME);
		OreCoreItems.osmiumNugget = OreCoreItems.registerItem(new OsmiumNugget(OSMIUM_NUGGET_ID), OSMIUM_NUGGET_NAME);
		OreCoreItems.osmiumDust = OreCoreItems.registerItem(new OsmiumDust(OSMIUM_DUST_ID), OSMIUM_DUST_NAME);

		OreDictionary.registerOre(OSMIUM_DICT, OreCoreItems.osmium);
		OreDictionary.registerOre(OSMIUM_INFERIOR_DICT, OreCoreItems.osmiumInferior);
		OreDictionary.registerOre(OSMIUM_INGOT_DICT, OreCoreItems.osmiumIngot);
		OreDictionary.registerOre(OSMIUM_NUGGET_DICT, OreCoreItems.osmiumNugget);
		OreDictionary.registerOre(OSMIUM_DUST_DICT, OreCoreItems.osmiumDust);
		
		OreCoreItems.nuggetToIngotStandard(OSMIUM_NUGGET_DICT, OreCoreItems.osmiumIngot);
		OreCoreItems.ingotToNuggetStandard(OSMIUM_INGOT_DICT, OreCoreItems.osmiumNugget);

		OreCoreItems.addSmelting(OSMIUM_DICT, OreCoreItems.osmiumIngot, 1);
		OreCoreItems.addSmelting(OSMIUM_INFERIOR_DICT, OreCoreItems.osmiumNugget, 3);
		OreCoreItems.addSmelting(OSMIUM_DUST_DICT, OreCoreItems.osmiumIngot, 1);
	}

}
