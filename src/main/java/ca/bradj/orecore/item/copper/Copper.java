package ca.bradj.orecore.item.copper;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;

public class Copper {

	private static final String COPPER_DICT = "oreCopper";
	private static final String COPPER_INFERIOR_DICT = "oreCopperInferior";
	private static final String COPPER_DUST_DICT = "dustCopper";
	private static final String COPPER_INGOT_DICT = "ingotCopper";
	private static final String COPPER_NUGGET_DICT = "nuggetCopper";

	private static final String COPPER_NAME = "Copper";
	private static final String COPPER_INFERIOR_NAME = "Inferior Copper";
	private static final String COPPER_INGOT_NAME = "Copper Ingot";
	private static final String COPPER_NUGGET_NAME = "Copper Nugget";
	private static final String COPPER_DUST_NAME = "Copper Dust";

	public static void init() {
		// Copper
		OreCoreItems.copper = OreCoreItems.registerBlock(new CopperBlock(IDs.copperOreId), COPPER_NAME);
		OreCoreItems.copperInferior = OreCoreItems.registerBlock(new CopperBlockInferior(IDs.copperInferiorOreId), COPPER_INFERIOR_NAME);
		OreCoreItems.copperIngot = OreCoreItems.registerItem(new CopperIngot(IDs.copperIngotId), COPPER_INGOT_NAME);
		OreCoreItems.copperNugget = OreCoreItems.registerItem(new CopperNugget(IDs.copperNuggetId), COPPER_NUGGET_NAME);
		OreCoreItems.copperDust = OreCoreItems.registerItem(new CopperDust(IDs.copperDustId), COPPER_DUST_NAME);
		
		OreDictionary.registerOre(COPPER_DICT, OreCoreItems.copper);
		OreDictionary.registerOre(COPPER_INFERIOR_DICT, OreCoreItems.copperInferior);
		OreDictionary.registerOre(COPPER_INGOT_DICT, OreCoreItems.copperIngot);
		OreDictionary.registerOre(COPPER_NUGGET_DICT, OreCoreItems.copperNugget);
		OreDictionary.registerOre(COPPER_DUST_DICT, OreCoreItems.copperDust);
		
		OreCoreItems.nuggetToIngotStandard(COPPER_NUGGET_DICT, OreCoreItems.copperIngot);
		OreCoreItems.ingotToNuggetStandard(COPPER_INGOT_DICT, OreCoreItems.copperNugget);

		OreCoreItems.addSmelting(COPPER_DICT, OreCoreItems.copperIngot, 0);
		OreCoreItems.addSmelting(COPPER_INFERIOR_DICT, OreCoreItems.copperNugget, 3);
		OreCoreItems.addSmelting(COPPER_DUST_DICT, OreCoreItems.copperIngot, 1);
	}

}
