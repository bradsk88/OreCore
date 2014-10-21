package ca.bradj.orecore.item.aluminum;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;

public class Aluminum {

	private static final String BAUXITE_DICT = "oreBauxite";
	private static final String ALUMINUM_DUST_DICT = "dustAluminum";
	private static final String ALUMINUM_NUGGET_DICT = "nuggetAluminum";
	private static final String ALUMINUM_INGOT_DICT = "ingotAluminum";

	private static final String BAUXITE_NAME = "Bauxite.Ore";
	private static final String ALUMINUM_DUST_NAME = "Aluminum.Dust";
	private static final String ALUMINUM_NUGGET_NAME = "Aluminum.Nugget";
	private static final String ALUMINUM_INGOT_NAME = "Aluminum.Ingot";
	
	public static final int BAUXITE_TOP_LEVEL = 50;
	
	public static final int BAUXITE_VEIN_SIZE = 4;
	
	public static void init() {

		OreCoreItems.bauxite = OreCoreItems.registerBlock(new BauxiteOreBlock(IDs.BAUXITE_ID), BAUXITE_NAME);
		OreCoreItems.aluminumIngot = OreCoreItems.registerItem(new AluminumIngot(IDs.ALUMINUM_INGOT_ID), ALUMINUM_INGOT_NAME);
		OreCoreItems.aluminumDust = OreCoreItems.registerItem(new AluminumDust(IDs.ALUMINUM_DUST_ID), ALUMINUM_DUST_NAME);
		OreCoreItems.aluminumNugget = OreCoreItems.registerItem(new AluminumNugget(IDs.ALUMINUM_NUGGET_ID), ALUMINUM_NUGGET_NAME);

		OreDictionary.registerOre(BAUXITE_DICT, new ItemStack(OreCoreItems.bauxite, 1, 1));
		OreDictionary.registerOre(ALUMINUM_DUST_DICT, OreCoreItems.aluminumDust);
		OreDictionary.registerOre(ALUMINUM_NUGGET_DICT, OreCoreItems.aluminumNugget);
		OreDictionary.registerOre(ALUMINUM_INGOT_DICT, OreCoreItems.aluminumIngot);

		OreCoreItems.nuggetToIngotStandard(ALUMINUM_NUGGET_DICT, OreCoreItems.aluminumIngot);
		OreCoreItems.ingotToNuggetStandard(ALUMINUM_INGOT_DICT, OreCoreItems.aluminumNugget);

		OreCoreItems.addSmelting(OreCoreItems.aluminumDust, OreCoreItems.aluminumNugget, 3);
	}

}
