package ca.bradj.orecore.item.nickel;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.nickel.NickelBlock;
import ca.bradj.orecore.item.nickel.NickelBlockInferior;
import ca.bradj.orecore.item.nickel.NickelDust;
import ca.bradj.orecore.item.nickel.NickelGravel;
import ca.bradj.orecore.item.nickel.NickelIngot;
import ca.bradj.orecore.item.nickel.NickelNugget;
import ca.bradj.orecore.item.nickel.NickelPureBlock;

public class Nickel {
	public static final String NICKEL_DICT = "oreNickel";
	public static final String NICKEL_INFERIOR_DICT = "oreNickelInferior";
	public static final String NICKEL_DUST_DICT = "dustNickel";
	public static final String NICKEL_INGOT_DICT = "ingotNickel";
	public static final String NICKEL_NUGGET_DICT = "nuggetNickel";
	public static final String NICKEL_GRAVEL_DICT = "gravelNickel";
	private static final String NICKEL_BLOCK_DICT = "blockNickel";

	private static final String NICKEL_NAME = "Nickel";
	private static final String NICKEL_INFERIOR_NAME = "Inferior.Nickel";
	private static final String NICKEL_INGOT_NAME = "Nickel.Ingot";
	private static final String NICKEL_NUGGET_NAME = "Nickel.Nugget";
	private static final String NICKEL_DUST_NAME = "Nickel.Dust";
	private static final String NICKEL_GRAVEL_NAME = "Nickel.Gravel";
	private static final String NICKEL_BLOCK_NAME = "Nickel.Block";

	public static final int NICKEL_TOP_LEVEL = 50;
	public static final int NICKEL_GRAVEL_TOP_LEVEL = 50;
	public static final int NICKEL_INFERIOR_TOP_LEVEL = 70;

	public static final int NICKEL_VEIN_SIZE = 6;
	public static final int NICKEL_GRAVEL_VEIN_SIZE = 4;
	public static final int NICKEL_INFERIOR_VEIN_SIZE = 10;

	public static void init() {
		// Nickel
		OreCoreItems.nickel = OreCoreRegistration.registerBlock(new NickelBlock(IDs.NICKEL_ORE_ID), NICKEL_NAME);
		OreCoreItems.nickelInferior = OreCoreRegistration.registerBlock(new NickelBlockInferior(IDs.NICKEL_INFERIOR_ORE_ID), NICKEL_INFERIOR_NAME);
		OreCoreItems.nickelIngot = OreCoreRegistration.registerItem(new NickelIngot(IDs.NICKEL_INGOT_ID), NICKEL_INGOT_NAME);
		OreCoreItems.nickelNugget = OreCoreRegistration.registerItem(new NickelNugget(IDs.NICKEL_NUGGET_ID), NICKEL_NUGGET_NAME);
		OreCoreItems.nickelDust = OreCoreRegistration.registerItem(new NickelDust(IDs.NICKEL_DUST_ID), NICKEL_DUST_NAME);
		OreCoreItems.nickelGravel = OreCoreRegistration.registerBlock(new NickelGravel(IDs.NICKEL_GRAVEL_ID), NICKEL_GRAVEL_NAME);
		OreCoreItems.nickelBlock = OreCoreRegistration.registerBlock(new NickelPureBlock(IDs.NICKEL_BLOCK_ID), NICKEL_BLOCK_NAME);

		OreDictionary.registerOre(NICKEL_DICT, OreCoreItems.nickel);
		OreDictionary.registerOre(NICKEL_INFERIOR_DICT, OreCoreItems.nickelInferior);
		OreDictionary.registerOre(NICKEL_INGOT_DICT, OreCoreItems.nickelIngot);
		OreDictionary.registerOre(NICKEL_NUGGET_DICT, OreCoreItems.nickelNugget);
		OreDictionary.registerOre(NICKEL_DUST_DICT, OreCoreItems.nickelDust);
		OreDictionary.registerOre(NICKEL_BLOCK_DICT, OreCoreItems.nickelBlock);

		OreCoreRegistration.nuggetToIngotStandard(NICKEL_NUGGET_DICT, OreCoreItems.nickelIngot);
		OreCoreRegistration.ingotToNuggetStandard(NICKEL_INGOT_DICT, OreCoreItems.nickelNugget);
		OreCoreRegistration.ingotToBlockStandard(NICKEL_INGOT_DICT, OreCoreItems.nickelBlock);
		OreCoreRegistration.blockToIngotStandard(NICKEL_BLOCK_DICT, OreCoreItems.nickelIngot);

		OreCoreRegistration.addSmelting(OreCoreItems.nickel, OreCoreItems.nickelIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.nickelDust, OreCoreItems.nickelIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.nickelGravel, OreCoreItems.nickelIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.nickelInferior, OreCoreItems.nickelNugget, 3);
	}
}
