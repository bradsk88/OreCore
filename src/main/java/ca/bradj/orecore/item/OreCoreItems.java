package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.aluminum.Aluminum;
import ca.bradj.orecore.item.aluminum.AluminumDust;
import ca.bradj.orecore.item.aluminum.AluminumIngot;
import ca.bradj.orecore.item.aluminum.AluminumNugget;
import ca.bradj.orecore.item.aluminum.BauxiteOreBlock;
import ca.bradj.orecore.item.copper.Copper;
import ca.bradj.orecore.item.copper.CopperBlock;
import ca.bradj.orecore.item.copper.CopperBlockInferior;
import ca.bradj.orecore.item.copper.CopperDust;
import ca.bradj.orecore.item.copper.CopperIngot;
import ca.bradj.orecore.item.copper.CopperNugget;
import ca.bradj.orecore.item.copper.carb.Copper2CarbonateDust;
import ca.bradj.orecore.item.iron.Iron;
import ca.bradj.orecore.item.iron.IronDust;
import ca.bradj.orecore.item.iron.IronNugget;
import ca.bradj.orecore.item.iron_manganese.IronManganese;
import ca.bradj.orecore.item.manganese.Manganese;
import ca.bradj.orecore.item.manganese.ManganeseDust;
import ca.bradj.orecore.item.manganese.ManganeseIngot;
import ca.bradj.orecore.item.manganese.ManganeseNugget;
import ca.bradj.orecore.item.osmium.Osmium;
import ca.bradj.orecore.item.osmium.OsmiumBlock;
import ca.bradj.orecore.item.osmium.OsmiumBlockInferior;
import ca.bradj.orecore.item.osmium.OsmiumDust;
import ca.bradj.orecore.item.osmium.OsmiumIngot;
import ca.bradj.orecore.item.osmium.OsmiumNugget;
import ca.bradj.orecore.item.steel.Steel;
import ca.bradj.orecore.item.steel.SteelDust;
import ca.bradj.orecore.item.steel.SteelIngot;
import ca.bradj.orecore.item.tin.Tin;
import ca.bradj.orecore.item.tin.TinBlock;
import ca.bradj.orecore.item.tin.TinBlockInferior;
import ca.bradj.orecore.item.tin.TinDust;
import ca.bradj.orecore.item.tin.TinIngot;
import ca.bradj.orecore.item.tin.TinNugget;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Centralized location for all OreCore items.
 */
public class OreCoreItems {

	public static CopperBlock copper;
	public static CopperIngot copperIngot;
	public static CopperNugget copperNugget;
	public static CopperDust copperDust;
	public static CopperBlockInferior copperInferior;

	public static Copper2CarbonateDust copper2CarbonateDust;

	public static BauxiteOreBlock bauxite;
	public static AluminumDust aluminumDust;
	public static AluminumNugget aluminumNugget;
	public static AluminumIngot aluminumIngot;

	public static OsmiumBlock osmium;
	public static OsmiumBlockInferior osmiumInferior;
	public static OsmiumIngot osmiumIngot;
	public static OsmiumNugget osmiumNugget;
	public static OsmiumDust osmiumDust;

	public static TinBlock tin;
	public static TinBlockInferior tinInferior;
	public static TinIngot tinIngot;
	public static TinNugget tinNugget;
	public static TinDust tinDust;

	public static IronManganeseBlock ironManganese;

	public static ManganeseDust manganeseDust;
	public static ManganeseNugget manganeseNugget;
	public static ManganeseIngot manganeseIngot;

	public static IronDust ironDust;
	public static IronNugget ironNugget;

	public static SteelDust steelDust;
	public static SteelIngot steelIngot;
	public static SteelNugget steelNugget;

	// 4029 is next

	public static final void init() {
		Aluminum.init();
		Copper.init();
		Iron.init();
		IronManganese.init();
		Manganese.init();
		Osmium.init();
		Steel.init();
		Tin.init();
	}

	public static void addSmelting(String oreDictnameIn, Item out, int numOut) {
		for (ItemStack in : OreDictionary.getOres(oreDictnameIn)) {
			GameRegistry.addSmelting(in, new ItemStack(out, numOut), 0);
			FurnaceRecipes.smelting().func_151394_a(in, new ItemStack(out, numOut), 1.0F);
			// TODO: ^ Do these both need to be here? -BJ
		}
	}

	public static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, String name) {
		GameRegistry.registerBlock(block, name);
		block.setBlockName(name);
		return block;
	}

	public static <ITEM extends Item> ITEM registerItem(ITEM item, String name) {
		GameRegistry.registerItem(item, name);
		item.setUnlocalizedName(name);
		return item;
	}

	public static void nuggetToIngotStandard(String nuggetDictString, Item ingotOut) {
		for (ItemStack i : OreDictionary.getOres(nuggetDictString)) {
			GameRegistry.addRecipe(new ItemStack(ingotOut), new Object[] { "CCC", "CCC", "CCC", 'C', i });
		}
	}

	public static void ingotToNuggetStandard(String ingotDictString, Item nuggetOut) {
		for (ItemStack i : OreDictionary.getOres(ingotDictString)) {
			GameRegistry.addShapelessRecipe(new ItemStack(nuggetOut, 9), i);
		}
	}

}
