package ca.bradj.orecore.item;

import com.google.common.base.Preconditions;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ca.bradj.orecore.item.aluminum.Aluminum;
import ca.bradj.orecore.item.aluminum.AluminumDust;
import ca.bradj.orecore.item.aluminum.AluminumIngot;
import ca.bradj.orecore.item.aluminum.AluminumNugget;
import ca.bradj.orecore.item.aluminum.BauxiteOreBlock;
import ca.bradj.orecore.item.bronze.Bronze;
import ca.bradj.orecore.item.bronze.BronzeDust;
import ca.bradj.orecore.item.bronze.BronzeIngot;
import ca.bradj.orecore.item.bronze.BronzeNugget;
import ca.bradj.orecore.item.copper.Copper;
import ca.bradj.orecore.item.copper.CopperBlock;
import ca.bradj.orecore.item.copper.CopperBlockInferior;
import ca.bradj.orecore.item.copper.CopperDust;
import ca.bradj.orecore.item.copper.CopperGravel;
import ca.bradj.orecore.item.copper.CopperIngot;
import ca.bradj.orecore.item.copper.CopperNugget;
import ca.bradj.orecore.item.copper.carb.Copper2Carbonate;
import ca.bradj.orecore.item.copper.carb.Copper2CarbonateDust;
import ca.bradj.orecore.item.copper.carb.Copper2CarbonateIngot;
import ca.bradj.orecore.item.copper.carb.Copper2CarbonateNugget;
import ca.bradj.orecore.item.iron.Iron;
import ca.bradj.orecore.item.iron.IronDust;
import ca.bradj.orecore.item.iron.IronNugget;
import ca.bradj.orecore.item.iron_manganese.IronManganese;
import ca.bradj.orecore.item.iron_manganese.IronManganeseBlock;
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
import ca.bradj.orecore.item.silver.Silver;
import ca.bradj.orecore.item.silver.SilverBlock;
import ca.bradj.orecore.item.silver.SilverBlockInferior;
import ca.bradj.orecore.item.silver.SilverDust;
import ca.bradj.orecore.item.silver.SilverGravel;
import ca.bradj.orecore.item.silver.SilverIngot;
import ca.bradj.orecore.item.silver.SilverNugget;
import ca.bradj.orecore.item.steel.Steel;
import ca.bradj.orecore.item.steel.SteelDust;
import ca.bradj.orecore.item.steel.SteelIngot;
import ca.bradj.orecore.item.steel.SteelNugget;
import ca.bradj.orecore.item.tin.Tin;
import ca.bradj.orecore.item.tin.TinBlock;
import ca.bradj.orecore.item.tin.TinBlockInferior;
import ca.bradj.orecore.item.tin.TinDust;
import ca.bradj.orecore.item.tin.TinGravel;
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
	public static CopperGravel copperGravel;

	public static Copper2CarbonateDust copper2CarbonateDust;
	public static Copper2CarbonateNugget copper2CarbonateNugget;
	public static Copper2CarbonateIngot copper2CarbonateIngot;

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
	public static TinGravel tinGravel;

	public static IronManganeseBlock ironManganese;

	public static ManganeseDust manganeseDust;
	public static ManganeseNugget manganeseNugget;
	public static ManganeseIngot manganeseIngot;

	public static IronDust ironDust;
	public static IronNugget ironNugget;

	public static SteelDust steelDust;
	public static SteelIngot steelIngot;
	public static SteelNugget steelNugget;

	public static BronzeDust bronzeDust;
	public static BronzeIngot bronzeIngot;
	public static BronzeNugget bronzeNugget;
	
	public static SilverBlock silver;
	public static SilverBlockInferior silverInferior;
	public static SilverIngot silverIngot;
	public static SilverNugget silverNugget;
	public static SilverDust silverDust;
	public static SilverGravel silverGravel;

	// 4029 is next

	public static final void init() {
		Aluminum.init();
		Bronze.init();
		Copper.init();
		Copper2Carbonate.init();
		Iron.init();
		IronManganese.init();
		Manganese.init();
		Osmium.init();
		Silver.init();
		Steel.init();
		Tin.init();
	}

	public static void addSmelting(Item oreIn, Item out, int numOut) {
		GameRegistry.addSmelting(oreIn, new ItemStack(out, numOut), 0);
	}

	public static void addSmelting(Block oreIn, Item out, int numOut) {
		GameRegistry.addSmelting(oreIn, new ItemStack(out, numOut), 0);
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
		Preconditions.checkNotNull(nuggetDictString, ingotOut);
		Preconditions.checkArgument(nuggetDictString.length() > 0);
		GameRegistry.addRecipe(new ShapedOreRecipe(ingotOut, true, new Object[] { "CCC", "CCC", "CCC", Character.valueOf('C'), nuggetDictString }));
	}

	public static void ingotToNuggetStandard(String ingotDictString, Item nuggetOut) {
		addShapelessRecipe(nuggetOut, 9, ingotDictString);
	}

	@SuppressWarnings("all")
	// I know, I know -BJ
	public static void addShapelessRecipe(Item out, int numOut, String... inDictStrings) {
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(out, numOut), inDictStrings));
	}

}
