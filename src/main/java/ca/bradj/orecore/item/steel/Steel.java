package ca.bradj.orecore.item.steel;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.ItemStacks;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.SteelNugget;
import ca.bradj.orecore.item.manganese.Manganese;
import cpw.mods.fml.common.registry.GameRegistry;

public class Steel {

	private static final String STEEL_DUST_DICT = "dustSteel";
	private static final String STEEL_NUGGET_DICT = "nuggetSteel";
	private static final String STEEL_INGOT_DICT = "ingotSteel";
	
	private static final String STEEL_DUST_NAME = "Steel Dust";
	private static final int STEEL_DUST_ID = 4023;

	private static final String STEEL_INGOT_NAME = "Steel Ingot";
	private static final int STEEL_INGOT_ID = 4024;

	private static final String STEEL_NUGGET_NAME = "Steel Nugget";
	private static final int STEEL_NUGGET_ID = 4025;

	public static void init() {
		OreCoreItems.steelDust = OreCoreItems.registerItem(new SteelDust(STEEL_DUST_ID), STEEL_DUST_NAME);
		OreCoreItems.steelIngot = OreCoreItems.registerItem(new SteelIngot(STEEL_INGOT_ID), STEEL_INGOT_NAME);
		OreCoreItems.steelNugget = OreCoreItems.registerItem(new SteelNugget(STEEL_NUGGET_ID), STEEL_NUGGET_NAME);

		OreDictionary.registerOre(STEEL_DUST_DICT, OreCoreItems.steelDust);
		OreDictionary.registerOre(STEEL_NUGGET_DICT, OreCoreItems.steelNugget);
		OreDictionary.registerOre(STEEL_INGOT_DICT, OreCoreItems.steelIngot);
		
		for (ItemStack i : OreDictionary.getOres(STEEL_DUST_DICT)) {
			for (ItemStack j : OreDictionary.getOres(Manganese.DUST_DICT)) {
				GameRegistry.addShapelessRecipe(new ItemStack(OreCoreItems.steelDust, 2), ItemStacks.one(i), ItemStacks.one(j));
			}
		}
		
		OreCoreItems.nuggetToIngotStandard(STEEL_NUGGET_DICT, OreCoreItems.steelIngot);
		OreCoreItems.ingotToNuggetStandard(STEEL_INGOT_DICT, OreCoreItems.steelNugget);
		
		OreCoreItems.addSmelting(STEEL_DUST_DICT, OreCoreItems.steelIngot, 1);
		OreCoreItems.addSmelting(Manganese.DUST_DICT, OreCoreItems.manganeseIngot, 1);
	}

}
