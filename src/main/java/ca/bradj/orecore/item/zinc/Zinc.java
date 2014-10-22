package ca.bradj.orecore.item.zinc;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.zinc.ZincBlock;
import ca.bradj.orecore.item.zinc.ZincBlockInferior;
import ca.bradj.orecore.item.zinc.ZincDust;
import ca.bradj.orecore.item.zinc.ZincGravel;
import ca.bradj.orecore.item.zinc.ZincIngot;
import ca.bradj.orecore.item.zinc.ZincNugget;
import ca.bradj.orecore.item.zinc.ZincPureBlock;

public class Zinc {
	public static final String ZINC_DICT = "oreZinc";
	public static final String ZINC_INFERIOR_DICT = "oreZincInferior";
	public static final String ZINC_DUST_DICT = "dustZinc";
	public static final String ZINC_INGOT_DICT = "ingotZinc";
	public static final String ZINC_NUGGET_DICT = "nuggetZinc";
	public static final String ZINC_GRAVEL_DICT = "gravelZinc";
	private static final String ZINC_BLOCK_DICT = "blockZinc";

	private static final String ZINC_NAME = "Zinc";
	private static final String ZINC_INFERIOR_NAME = "Inferior.Zinc";
	private static final String ZINC_INGOT_NAME = "Zinc.Ingot";
	private static final String ZINC_NUGGET_NAME = "Zinc.Nugget";
	private static final String ZINC_DUST_NAME = "Zinc.Dust";
	private static final String ZINC_GRAVEL_NAME = "Zinc.Gravel";
	private static final String ZINC_BLOCK_NAME = "Zinc.Block";

	public static final int ZINC_TOP_LEVEL = 50;
	public static final int ZINC_GRAVEL_TOP_LEVEL = 50;
	public static final int ZINC_INFERIOR_TOP_LEVEL = 70;

	public static final int ZINC_VEIN_SIZE = 6;
	public static final int ZINC_GRAVEL_VEIN_SIZE = 4;
	public static final int ZINC_INFERIOR_VEIN_SIZE = 10;

	public static void init() {
		// Zinc
		OreCoreItems.zinc = OreCoreRegistration.registerBlock(new ZincBlock(IDs.ZINC_ORE_ID), ZINC_NAME);
		OreCoreItems.zincInferior = OreCoreRegistration.registerBlock(new ZincBlockInferior(IDs.ZINC_INFERIOR_ORE_ID), ZINC_INFERIOR_NAME);
		OreCoreItems.zincIngot = OreCoreRegistration.registerItem(new ZincIngot(IDs.ZINC_INGOT_ID), ZINC_INGOT_NAME);
		OreCoreItems.zincNugget = OreCoreRegistration.registerItem(new ZincNugget(IDs.ZINC_NUGGET_ID), ZINC_NUGGET_NAME);
		OreCoreItems.zincDust = OreCoreRegistration.registerItem(new ZincDust(IDs.ZINC_DUST_ID), ZINC_DUST_NAME);
		OreCoreItems.zincGravel = OreCoreRegistration.registerBlock(new ZincGravel(IDs.ZINC_GRAVEL_ID), ZINC_GRAVEL_NAME);
		OreCoreItems.zincBlock = OreCoreRegistration.registerBlock(new ZincPureBlock(IDs.ZINC_BLOCK_ID), ZINC_BLOCK_NAME);

		OreDictionary.registerOre(ZINC_DICT, OreCoreItems.zinc);
		OreDictionary.registerOre(ZINC_INFERIOR_DICT, OreCoreItems.zincInferior);
		OreDictionary.registerOre(ZINC_INGOT_DICT, OreCoreItems.zincIngot);
		OreDictionary.registerOre(ZINC_NUGGET_DICT, OreCoreItems.zincNugget);
		OreDictionary.registerOre(ZINC_DUST_DICT, OreCoreItems.zincDust);
		OreDictionary.registerOre(ZINC_BLOCK_DICT, OreCoreItems.zincBlock);

		OreCoreRegistration.nuggetToIngotStandard(ZINC_NUGGET_DICT, OreCoreItems.zincIngot);
		OreCoreRegistration.ingotToNuggetStandard(ZINC_INGOT_DICT, OreCoreItems.zincNugget);
		OreCoreRegistration.ingotToBlockStandard(ZINC_INGOT_DICT, OreCoreItems.zincBlock);
		OreCoreRegistration.blockToIngotStandard(ZINC_BLOCK_DICT, OreCoreItems.zincIngot);

		OreCoreRegistration.addSmelting(OreCoreItems.zinc, OreCoreItems.zincIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.zincDust, OreCoreItems.zincIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.zincGravel, OreCoreItems.zincIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.zincInferior, OreCoreItems.zincNugget, 3);
	}
}
