package ca.bradj.orecore.item.aluminum;

import ca.bradj.orecore.item.OreCoreItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class Aluminum {

	private static final String BAUXITE_DICT = "oreBauxite";
	private static final String ALUMINUM_DUST_DICT = "dustAluminum";
	private static final String ALUMINUM_NUGGET_DICT = "nuggetAluminum";
	private static final String ALUMINUM_INGOT_DICT = "ingotAluminum";

	private static final String BAUXITE_NAME = "Bauxite Ore";
	private static final int BAUXITE_ID = 4008;

	private static final String ALUMINUM_DUST_NAME = "Aluminum Dust";
	private static final int ALUMINUM_DUST_ID = 4005;

	private static final String ALUMINUM_NUGGET_NAME = "Aluminum Nugget";
	private static final int ALUMINUM_NUGGET_ID = 4006;

	private static final String ALUMINUM_INGOT_NAME = "Aluminum Ingot";
	private static final int ALUMINUM_INGOT_ID = 4007;

	public static void init() {

		OreCoreItems.bauxite = OreCoreItems.registerBlock(new BauxiteOreBlock(BAUXITE_ID), BAUXITE_NAME);
		OreCoreItems.aluminumIngot = OreCoreItems.registerItem(new AluminumIngot(ALUMINUM_INGOT_ID), ALUMINUM_INGOT_NAME);
		OreCoreItems.aluminumDust = OreCoreItems.registerItem(new AluminumDust(ALUMINUM_DUST_ID), ALUMINUM_DUST_NAME);
		OreCoreItems.aluminumNugget = OreCoreItems.registerItem(new AluminumNugget(ALUMINUM_NUGGET_ID), ALUMINUM_NUGGET_NAME);

		OreDictionary.registerOre(BAUXITE_DICT, new ItemStack(OreCoreItems.bauxite, 1, 1));
		OreDictionary.registerOre(ALUMINUM_DUST_DICT, OreCoreItems.aluminumDust);
		OreDictionary.registerOre(ALUMINUM_NUGGET_DICT, OreCoreItems.aluminumNugget);
		OreDictionary.registerOre(ALUMINUM_INGOT_DICT, OreCoreItems.aluminumIngot);
		
		for (ItemStack i : OreDictionary.getOres(ALUMINUM_NUGGET_DICT)) {
			GameRegistry.addRecipe(new ItemStack(OreCoreItems.aluminumIngot), new Object[] { "CCC", "CCC", "CCC", 'C', i });
		}
		for (ItemStack i : OreDictionary.getOres(ALUMINUM_INGOT_DICT)) {
			GameRegistry.addShapelessRecipe(new ItemStack(OreCoreItems.aluminumNugget, 9), i);
		}

		OreCoreItems.addSmelting(ALUMINUM_DUST_DICT, OreCoreItems.aluminumNugget, 3);
	}

}
