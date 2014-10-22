package ca.bradj.orecore.item.copper;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;

public class Copper {

	public static final String COPPER_DICT = "oreCopper";
	public static final String COPPER_INFERIOR_DICT = "oreCopperInferior";
	public static final String COPPER_DUST_DICT = "dustCopper";
	public static final String COPPER_INGOT_DICT = "ingotCopper";
	public static final String COPPER_NUGGET_DICT = "nuggetCopper";
	public static final String COPPER_GRAVEL_DICT = "gravelCopper";
	private static final String COPPER_BLOCK_DICT = "blockCopper";

	private static final String COPPER_NAME = "Copper";
	private static final String COPPER_INFERIOR_NAME = "Inferior.Copper";
	private static final String COPPER_INGOT_NAME = "Copper.Ingot";
	private static final String COPPER_NUGGET_NAME = "Copper.Nugget";
	private static final String COPPER_DUST_NAME = "Copper.Dust";
	private static final String COPPER_GRAVEL_NAME = "Copper.Gravel";
	private static final String COPPER_BLOCK_NAME = "Copper.Block";
	
	public static final int COPPER_TOP_LEVEL = 50;
	public static final int COPPER_GRAVEL_TOP_LEVEL = 50;
	public static final int COPPER_INFERIOR_TOP_LEVEL = 70;
	
	public static final int COPPER_VEIN_SIZE = 6;
	public static final int COPPER_GRAVEL_VEIN_SIZE = 4;
	public static final int COPPER_INFERIOR_VEIN_SIZE = 10;

	public static void init() {
		// Copper
		OreCoreItems.copper = OreCoreRegistration.registerBlock(new CopperBlock(IDs.copperOreId), COPPER_NAME);
		OreCoreItems.copperInferior = OreCoreRegistration.registerBlock(new CopperBlockInferior(IDs.copperInferiorOreId), COPPER_INFERIOR_NAME);
		OreCoreItems.copperIngot = OreCoreRegistration.registerItem(new CopperIngot(IDs.copperIngotId), COPPER_INGOT_NAME);
		OreCoreItems.copperNugget = OreCoreRegistration.registerItem(new CopperNugget(IDs.copperNuggetId), COPPER_NUGGET_NAME);
		OreCoreItems.copperDust = OreCoreRegistration.registerItem(new CopperDust(IDs.copperDustId), COPPER_DUST_NAME);
		OreCoreItems.copperGravel = OreCoreRegistration.registerBlock(new CopperGravel(IDs.COPPER_GRAVEL_ID), COPPER_GRAVEL_NAME);
		OreCoreItems.copperBlock = OreCoreRegistration.registerBlock(new CopperPureBlock(IDs.COPPER_BLOCK_ID), COPPER_BLOCK_NAME);

		OreDictionary.registerOre(COPPER_DICT, OreCoreItems.copper);
		OreDictionary.registerOre(COPPER_INFERIOR_DICT, OreCoreItems.copperInferior);
		OreDictionary.registerOre(COPPER_INGOT_DICT, OreCoreItems.copperIngot);
		OreDictionary.registerOre(COPPER_NUGGET_DICT, OreCoreItems.copperNugget);
		OreDictionary.registerOre(COPPER_DUST_DICT, OreCoreItems.copperDust);
		OreDictionary.registerOre(COPPER_BLOCK_DICT, OreCoreItems.copperBlock);

		OreCoreRegistration.nuggetToIngotStandard(COPPER_NUGGET_DICT, OreCoreItems.copperIngot);
		OreCoreRegistration.ingotToNuggetStandard(COPPER_INGOT_DICT, OreCoreItems.copperNugget);
		OreCoreRegistration.ingotToBlockStandard(COPPER_INGOT_DICT, OreCoreItems.copperBlock);
		OreCoreRegistration.blockToIngotStandard(COPPER_BLOCK_DICT, OreCoreItems.copperIngot);

		OreCoreRegistration.addSmelting(OreCoreItems.copper, OreCoreItems.copperIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.copperDust, OreCoreItems.copperIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.copperGravel, OreCoreItems.copperIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.copperInferior, OreCoreItems.copperNugget, 3);
	}

}
