package ca.bradj.orecore.item.osmium;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;

public class Osmium {

	private static final String OSMIUM_DICT = "oreOsmium";
	private static final String OSMIUM_INFERIOR_DICT = "oreOsmiumInferior";
	private static final String OSMIUM_INGOT_DICT = "ingotOsmium";
	private static final String OSMIUM_NUGGET_DICT = "nuggetOsmium";
	private static final String OSMIUM_DUST_DICT = "dustOsmium";
	private static final String OSMIUM_BLOCK_DICT = "blockOsmium";

	private static final String OSMIUM_NAME = "Osmium";
	private static final String OSMIUM_INFERIOR_NAME = "Inferior.Osmium";
	private static final String OSMIUM_INGOT_NAME = "Osmium.Ingot";
	private static final String OSMIUM_NUGGET_NAME = "Osmium.Nugget";
	private static final String OSMIUM_DUST_NAME = "Osmium.Dust";
	private static final String OSMIUM_BLOCK_NAME = "Osmium.Block";

	public static final int OSMIUM_TOP_LEVEL = 45;
	public static final int OSMIUM_INFERIOR_TOP_LEVEL = 55;

	public static final int OSMIUM_VEIN_SIZE = 8;
	public static final int OSMIUM_INFERIOR_VEIN_SIZE = 10;

	public static void init() {
		OreCoreItems.osmium = OreCoreRegistration.registerBlock(new OsmiumBlock(IDs.OSMIUM_ORE_ID), OSMIUM_NAME);
		OreCoreItems.osmiumInferior = OreCoreRegistration.registerBlock(new OsmiumBlockInferior(IDs.OSMIUM_INFERIOR_ORE_ID), OSMIUM_INFERIOR_NAME);
		OreCoreItems.osmiumIngot = OreCoreRegistration.registerItem(new OsmiumIngot(IDs.OSMIUM_INGOT_ID), OSMIUM_INGOT_NAME);
		OreCoreItems.osmiumNugget = OreCoreRegistration.registerItem(new OsmiumNugget(IDs.OSMIUM_NUGGET_ID), OSMIUM_NUGGET_NAME);
		OreCoreItems.osmiumDust = OreCoreRegistration.registerItem(new OsmiumDust(IDs.OSMIUM_DUST_ID), OSMIUM_DUST_NAME);
		OreCoreItems.osmiumBlock = OreCoreRegistration.registerBlock(new OsmiumPureBlock(IDs.OSMIUM_BLOCK_ID), OSMIUM_BLOCK_NAME);

		OreDictionary.registerOre(OSMIUM_DICT, OreCoreItems.osmium);
		OreDictionary.registerOre(OSMIUM_INFERIOR_DICT, OreCoreItems.osmiumInferior);
		OreDictionary.registerOre(OSMIUM_INGOT_DICT, OreCoreItems.osmiumIngot);
		OreDictionary.registerOre(OSMIUM_NUGGET_DICT, OreCoreItems.osmiumNugget);
		OreDictionary.registerOre(OSMIUM_DUST_DICT, OreCoreItems.osmiumDust);
		OreDictionary.registerOre(OSMIUM_BLOCK_DICT, OreCoreItems.osmiumBlock);

		OreCoreRegistration.nuggetToIngotStandard(OSMIUM_NUGGET_DICT, OreCoreItems.osmiumIngot);
		OreCoreRegistration.ingotToNuggetStandard(OSMIUM_INGOT_DICT, OreCoreItems.osmiumNugget);
		OreCoreRegistration.ingotToBlockStandard(OSMIUM_INGOT_DICT, OreCoreItems.osmiumBlock);
		OreCoreRegistration.blockToIngotStandard(OSMIUM_BLOCK_DICT, OreCoreItems.osmiumIngot);

		OreCoreRegistration.addSmelting(OreCoreItems.osmium, OreCoreItems.osmiumIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.osmiumInferior, OreCoreItems.osmiumNugget, 3);
		OreCoreRegistration.addSmelting(OreCoreItems.osmiumDust, OreCoreItems.osmiumIngot, 1);
	}

}
