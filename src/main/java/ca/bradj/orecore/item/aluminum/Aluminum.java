package ca.bradj.orecore.item.aluminum;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;

public class Aluminum {

	private static final String BAUXITE_DICT = "oreBauxite";
	private static final String ALUMINUM_DUST_DICT = "dustAluminum";
	private static final String ALUMINUM_NUGGET_DICT = "nuggetAluminum";
	private static final String ALUMINUM_INGOT_DICT = "ingotAluminum";

	private static final String BAUXITE_NAME = "Bauxite.Ore";
	private static final String ALUMINUM_DUST_NAME = "Aluminum.Dust";
	private static final String ALUMINUM_NUGGET_NAME = "Aluminum.Nugget";
	private static final String ALUMINUM_INGOT_NAME = "Aluminum.Ingot";
	private static final String ALUMINUM_BLOCK_NAME = "Aluminum.Block";

	public static final int BAUXITE_TOP_LEVEL = 50;

	public static final int BAUXITE_VEIN_SIZE = 4;

	public static void init() {

		OreCoreItems.bauxite = OreCoreRegistration.registerBlock(new BauxiteOreBlock(IDs.BAUXITE_ID), BAUXITE_NAME);
		OreCoreItems.aluminumIngot = OreCoreRegistration.registerItem(new AluminumIngot(IDs.ALUMINUM_INGOT_ID), ALUMINUM_INGOT_NAME);
		OreCoreItems.aluminumDust = OreCoreRegistration.registerItem(new AluminumDust(IDs.ALUMINUM_DUST_ID), ALUMINUM_DUST_NAME);
		OreCoreItems.aluminumNugget = OreCoreRegistration.registerItem(new AluminumNugget(IDs.ALUMINUM_NUGGET_ID), ALUMINUM_NUGGET_NAME);
		OreCoreItems.aluminumBlock = OreCoreRegistration.registerBlock(new AluminumPureBlock(IDs.ALUMINUM_BLOCK_ID), ALUMINUM_BLOCK_NAME);

		OreDictionary.registerOre(BAUXITE_DICT, new ItemStack(OreCoreItems.bauxite, 1, 1));
		OreDictionary.registerOre(ALUMINUM_DUST_DICT, OreCoreItems.aluminumDust);
		OreDictionary.registerOre(ALUMINUM_NUGGET_DICT, OreCoreItems.aluminumNugget);
		OreDictionary.registerOre(ALUMINUM_INGOT_DICT, OreCoreItems.aluminumIngot);
		OreDictionary.registerOre(ALUMINUM_BLOCK_NAME, OreCoreItems.aluminumBlock);

		OreCoreRegistration.nuggetToIngotStandard(ALUMINUM_NUGGET_DICT, OreCoreItems.aluminumIngot);
		OreCoreRegistration.ingotToNuggetStandard(ALUMINUM_INGOT_DICT, OreCoreItems.aluminumNugget);
		OreCoreRegistration.ingotToBlockStandard(ALUMINUM_INGOT_DICT, OreCoreItems.aluminumBlock);
		OreCoreRegistration.blockToIngotStandard(ALUMINUM_BLOCK_NAME, OreCoreItems.aluminumIngot);

		OreCoreRegistration.addSmelting(OreCoreItems.aluminumDust, OreCoreItems.aluminumNugget, 3);
	}

}
