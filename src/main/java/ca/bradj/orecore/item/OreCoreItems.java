package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.aluminum.AluminumDust;
import ca.bradj.orecore.item.aluminum.AluminumIngot;
import ca.bradj.orecore.item.aluminum.AluminumNugget;
import ca.bradj.orecore.item.aluminum.BauxiteOreBlock;
import ca.bradj.orecore.item.copper.CopperBlock;
import ca.bradj.orecore.item.copper.CopperBlockInferior;
import ca.bradj.orecore.item.copper.CopperDust;
import ca.bradj.orecore.item.copper.CopperIngot;
import ca.bradj.orecore.item.copper.CopperNugget;
import ca.bradj.orecore.item.copper.carb.Copper2CarbonateDust;
import ca.bradj.orecore.item.iron.IronDust;
import ca.bradj.orecore.item.iron.IronNugget;
import ca.bradj.orecore.item.manganese.ManganeseIngot;
import ca.bradj.orecore.item.manganese.ManganeseNugget;
import ca.bradj.orecore.item.osmium.OsmiumBlock;
import ca.bradj.orecore.item.osmium.OsmiumBlockInferior;
import ca.bradj.orecore.item.osmium.OsmiumDust;
import ca.bradj.orecore.item.osmium.OsmiumIngot;
import ca.bradj.orecore.item.osmium.OsmiumNugget;
import ca.bradj.orecore.item.steel.ManganeseDust;
import ca.bradj.orecore.item.steel.SteelDust;
import ca.bradj.orecore.item.steel.SteelIngot;
import ca.bradj.orecore.item.tin.TinBlock;
import ca.bradj.orecore.item.tin.TinBlockInferior;
import ca.bradj.orecore.item.tin.TinDust;
import ca.bradj.orecore.item.tin.TinIngot;
import ca.bradj.orecore.item.tin.TinNugget;
import cpw.mods.fml.common.registry.GameRegistry;

public class OreCoreItems {

	//TODO: Consider breaking each ore category (eg: copper) into its own file for readability. -BJ
	
	private static final String COPPER_DICT = "oreCopper";
	private static final String COPPER_INFERIOR_DICT = "oreCopperInferior";
	private static final String COPPER_DUST_DICT = "dustCopper";
	private static final String COPPER_INGOT_DICT = "ingotCopper";
	private static final String COPPER_NUGGET_DICT = "nuggetCopper";
	
	public static CopperBlock copper;
	private static final String COPPER_NAME = "Copper";
	private static final int copperOreId = 4000; // TODO: Pick ID that actually
													// means something
	public static CopperBlockInferior copperInferior;
	private static final String COPPER_INFERIOR_NAME = "Inferior Copper";
	private static final int copperInferiorOreId = 4004;
	
	public static CopperIngot copperIngot;
	private static final String COPPER_INGOT_NAME = "Copper Ingot";
	private static final int copperIngotId = 4001;
	
	public static CopperNugget copperNugget;
	private static final String COPPER_NUGGET_NAME = "Copper Nugget";
	private static final int copperNuggetId = 4002;
	
	public static CopperDust copperDust;
	private static final String COPPER_DUST_NAME = "Copper Dust";
	private static final int copperDustId = 4003;
	
	public static Copper2CarbonateDust copper2CarbonateDust;
	private static final String COPPER_2_CARBONATE_DUST_NAME = "Copper II Carbonate Dust";
	private static final int copper2CarbonateDustId = 4009;
	
	//Aluminium
	
	private static final String BAUXITE_DICT = "oreBauxite";
	private static final String ALUMINUM_DUST_DICT = "dustAluminum";
	private static final String ALUMINUM_NUGGET_DICT = "nuggetAluminum";
	private static final String ALUMINUM_INGOT_DICT = "ingotAluminum";
	
	public static BauxiteOreBlock bauxite;
	private static final String BAUXITE_NAME = "Bauxite Ore";
	private static final int BAUXITE_ID = 4008;
	
	public static AluminumDust aluminumDust;
	private static final String ALUMINUM_DUST_NAME = "Aluminum Dust";
	private static final int ALUMINUM_DUST_ID = 4005;
	
	public static AluminumNugget aluminumNugget;
	private static final String ALUMINUM_NUGGET_NAME = "Aluminum Nugget";
	private static final int ALUMINUM_NUGGET_ID = 4006;
	
	public static AluminumIngot aluminumIngot;
	private static final String ALUMINUM_INGOT_NAME = "Aluminum Ingot";
	private static final int ALUMINUM_INGOT_ID = 4007;
	
	//Osmium
	
	private static final String OSMIUM_DICT = "oreOsmium";
	private static final String OSMIUM_INFERIOR_DICT = "oreOsmiumInferior";
	private static final String OSMIUM_INGOT_DICT = "ingotOsmium";
	private static final String OSMIUM_NUGGET_DICT = "nuggetOsmium";
	private static final String OSMIUM_DUST_DICT = "dustOsmium";
	
	public static OsmiumBlock osmium;
	private static final String OSMIUM_NAME = "Osmium";
	private static int OSMIUM_ORE_ID = 4010;

	public static OsmiumBlockInferior osmiumInferior;
	private static final int OSMIUM_INFERIOR_ORE_ID = 4011;
	private static final String OSMIUM_INFERIOR_NAME = "Inferior Osmium";
		
	public static OsmiumIngot osmiumIngot;
	private static final int OSMIUM_INGOT_ID = 4012;
	private static final String OSMIUM_INGOT_NAME = "Osmium Ingot";
	
	public static OsmiumNugget osmiumNugget;
	private static final String OSMIUM_NUGGET_NAME = "Osmium Nugget";
	private static final int OSMIUM_NUGGET_ID = 4013;
	
	public static OsmiumDust osmiumDust;
	private static final String OSMIUM_DUST_NAME = "Osmium Dust";
	private static final int OSMIUM_DUST_ID = 4014;
	
	// Tin

	public static TinBlock tin;
	private static final String TIN_NAME = "Tin";
	private static final int TIN_ORE_ID = 4015;
	

	public static TinBlockInferior tinInferior;
	private static final String TIN_INFERIOR_NAME = "Inferior Tin";
	private static final int TIN_INFERIOR_ORE_ID = 4016;
	

	public static TinIngot tinIngot;
	private static final String TIN_INGOT_NAME = "Tin Ingot";
	private static final int TIN_INGOT_ID = 4017;
	

	public static TinNugget tinNugget;
	private static final String TIN_NUGGET_NAME = "Tin Nugget";
	private static final int TIN_NUGGET_ID = 4018;
	
	public static TinDust tinDust;
	private static final String TIN_DUST_NAME = "Tin Dust";
	private static final int TIN_DUST_ID = 4019;
	
	private static final String TIN_DICT = "oreTin";
	private static final String TIN_INFERIOR_DICT = "oreTinInferior";
	private static final String TIN_INGOT_DICT = "ingotTin";
	private static final String TIN_NUGGET_DICT = "nuggetTin";
	private static final String TIN_DUST_DICT = "dustTin";
	
	//Steel, Etc.

	public static IronManganeseBlock ironManganese;
	private static final String I_M_NAME = "Iron Manganese";
	private static final int I_M_ORE_ID = 4020;
	
	public static ManganeseDust manganeseDust;
	private static final String MANGANESE_DUST_NAME = "Manganese Dust";
	private static final int MANGANESE_DUST_ID = 4021;
	
	public static ManganeseNugget manganeseNugget;	
	private static final String MANGANESE_NUGGET_NAME = "Manganese Nugget";
	private static final int MANGANESE_NUGGET_ID = 4026;
	
	public static ManganeseIngot manganeseIngot;
	private static final String MANGANESE_INGOT_NAME = "Manganese Ingot";
	private static final int MANGANESE_INGOT_ID = 4027;

	public static IronDust ironDust;
	private static final String IRON_DUST_NAME = "Iron Dust";
	private static final int IRON_DUST_ID = 4022;
	
	public static IronNugget ironNugget;
	private static final String IRON_NUGGET_NAME = "Iron Nugget";
	private static final int IRON_NUGGET_ID = 4028;

	public static SteelDust steelDust;
	private static final String STEEL_DUST_NAME = "Steel Dust";
	private static final int STEEL_DUST_ID = 4023;

	public static SteelIngot steelIngot;
	private static final String STEEL_INGOT_NAME = "Steel Ingot";
	private static final int STEEL_INGOT_ID = 4024;
	
	public static SteelNugget steelNugget;
	private static final String STEEL_NUGGET_NAME = "Steel Nugget";
	private static final int STEEL_NUGGET_ID = 4025;
	
	private static final String IM_DICT = "oreIronManganese";
	
	private static final String IRON_DUST_DICT = "dustIron";
	private static final String IRON_NUGGET_DICT = "nuggetIron";
	
	private static final String MANGANESE_DUST_DICT = "dustManganese";
	private static final String MANGANESE_INGOT_DICT = "ingotManganese";
	private static final String MANGANESE_NUGGET_DICT = "nuggetManganese";
	
	private static final String STEEL_DUST_DICT = "dustSteel";
	private static final String STEEL_NUGGET_DICT = "nuggetSteel";
	private static final String STEEL_INGOT_DICT = "ingotSteel";

	//4029 is next
	
	public static final void init() {
		initAluminum();
		initCopper();
		initSteelEtc();
		initOsmium();
		initTin();
	}

	private static void initAluminum() {
		
		bauxite = registerBlock(new BauxiteOreBlock(BAUXITE_ID), BAUXITE_NAME);
		aluminumIngot = registerItem(new AluminumIngot(ALUMINUM_INGOT_ID), ALUMINUM_INGOT_NAME);
		aluminumDust = registerItem(new AluminumDust(ALUMINUM_DUST_ID), ALUMINUM_DUST_NAME);
		aluminumNugget = registerItem(new AluminumNugget(ALUMINUM_NUGGET_ID), ALUMINUM_NUGGET_NAME);
		
		GameRegistry.addRecipe(new ItemStack(aluminumIngot), new Object[]{"CCC", "CCC", "CCC", 'C', aluminumNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(aluminumNugget, 9), aluminumIngot);
		
		OreDictionary.registerOre(BAUXITE_DICT, new ItemStack(bauxite, 1, 1));
		OreDictionary.registerOre(ALUMINUM_DUST_DICT, aluminumDust);
		OreDictionary.registerOre(ALUMINUM_NUGGET_DICT, aluminumNugget);
		OreDictionary.registerOre(ALUMINUM_INGOT_DICT, aluminumIngot);
		
		addSmelting(ALUMINUM_DUST_DICT, aluminumNugget, 3);
	}

	private static void initCopper() {
		// Copper
		copper = registerBlock(new CopperBlock(copperOreId), COPPER_NAME);
		copperInferior = registerBlock(new CopperBlockInferior(copperInferiorOreId), COPPER_INFERIOR_NAME);
		copperIngot = registerItem(new CopperIngot(copperIngotId), COPPER_INGOT_NAME);
		copperNugget = registerItem(new CopperNugget(copperNuggetId), COPPER_NUGGET_NAME);
		copperDust = registerItem(new CopperDust(copperDustId), COPPER_DUST_NAME);
		copper2CarbonateDust = registerItem(new Copper2CarbonateDust(copper2CarbonateDustId), COPPER_2_CARBONATE_DUST_NAME);

		GameRegistry.addRecipe(new ItemStack(copperIngot), new Object[]{"CCC", "CCC", "CCC", 'C', copperNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(copperNugget, 9), copperIngot);
		
		OreDictionary.registerOre(COPPER_DICT, copper);
		OreDictionary.registerOre(COPPER_INFERIOR_DICT, copperInferior);
		OreDictionary.registerOre(COPPER_INGOT_DICT, copperIngot);
		OreDictionary.registerOre(COPPER_NUGGET_DICT, copperNugget);
		OreDictionary.registerOre(COPPER_DUST_DICT, copperDust);
		
		addSmelting(COPPER_DICT, copperIngot, 0);
		addSmelting(COPPER_INFERIOR_DICT, copperNugget, 3);
		addSmelting(COPPER_DUST_DICT, copperIngot, 1);
	}
	
	private static void initSteelEtc() {
		ironManganese = registerBlock(new IronManganeseBlock(I_M_ORE_ID), I_M_NAME);
		manganeseDust = registerItem(new ManganeseDust(MANGANESE_DUST_ID), MANGANESE_DUST_NAME);
		manganeseNugget = registerItem(new ManganeseNugget(MANGANESE_NUGGET_ID), MANGANESE_NUGGET_NAME);
		manganeseIngot = registerItem(new ManganeseIngot(MANGANESE_INGOT_ID), MANGANESE_INGOT_NAME);
		
		GameRegistry.addRecipe(new ItemStack(manganeseIngot), new Object[]{"CCC", "CCC", "CCC", 'C', manganeseNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(manganeseNugget, 9), manganeseIngot);
		
		ironDust = registerItem(new IronDust(IRON_DUST_ID), IRON_DUST_NAME);
		ironNugget= registerItem(new IronNugget(IRON_NUGGET_ID), IRON_NUGGET_NAME);
		
		steelDust = registerItem(new SteelDust(STEEL_DUST_ID), STEEL_DUST_NAME);
		steelIngot = registerItem(new SteelIngot(STEEL_INGOT_ID), STEEL_INGOT_NAME);
		steelNugget = registerItem(new SteelNugget(STEEL_NUGGET_ID), STEEL_NUGGET_NAME);

		OreDictionary.registerOre(IM_DICT, ironManganese);
		OreDictionary.registerOre(MANGANESE_DUST_DICT, manganeseDust);
		OreDictionary.registerOre(MANGANESE_INGOT_DICT, manganeseIngot);
		OreDictionary.registerOre(MANGANESE_NUGGET_DICT, manganeseNugget);
		
		OreDictionary.registerOre(IRON_DUST_DICT, ironDust);
		OreDictionary.registerOre(IRON_NUGGET_DICT, ironNugget);
		
		OreDictionary.registerOre(STEEL_DUST_DICT, steelDust);
		OreDictionary.registerOre(STEEL_NUGGET_DICT, steelNugget);
		OreDictionary.registerOre(STEEL_INGOT_DICT, steelIngot);

		GameRegistry.addShapelessRecipe(new ItemStack(steelDust, 2), ironDust, manganeseDust);
		
		GameRegistry.addRecipe(new ItemStack(steelIngot, 1), new Object[]{"CCC", "CCC", "CCC", 'C', steelNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(steelNugget, 9), steelIngot);
		
		GameRegistry.addRecipe(new ItemStack(Items.iron_ingot, 1), new Object[]{"CCC", "CCC", "CCC", 'C', ironNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(ironNugget, 9), Items.iron_ingot);
		
		addSmelting(STEEL_DUST_DICT, steelIngot, 1);
		addSmelting(MANGANESE_DUST_DICT, manganeseIngot, 1);
		addSmelting(IRON_DUST_DICT, Items.iron_ingot, 1);
		
		//TODO: Break up this function -BJ
	}

	private static void initOsmium() {
		osmium = registerBlock(new OsmiumBlock(OSMIUM_ORE_ID), OSMIUM_NAME);
		osmiumInferior = registerBlock(new OsmiumBlockInferior(OSMIUM_INFERIOR_ORE_ID), OSMIUM_INFERIOR_NAME);
		osmiumIngot = registerItem(new OsmiumIngot(OSMIUM_INGOT_ID), OSMIUM_INGOT_NAME);
		osmiumNugget = registerItem(new OsmiumNugget(OSMIUM_NUGGET_ID), OSMIUM_NUGGET_NAME);
		osmiumDust = registerItem(new OsmiumDust(OSMIUM_DUST_ID), OSMIUM_DUST_NAME);

		GameRegistry.addRecipe(new ItemStack(osmiumIngot), new Object[]{"CCC", "CCC", "CCC", 'C', osmiumNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(osmiumNugget, 9), osmiumIngot);
		
		OreDictionary.registerOre(OSMIUM_DICT, osmium);
		OreDictionary.registerOre(OSMIUM_INFERIOR_DICT, osmiumInferior);
		OreDictionary.registerOre(OSMIUM_INGOT_DICT, osmiumIngot);
		OreDictionary.registerOre(OSMIUM_NUGGET_DICT, osmiumNugget);
		OreDictionary.registerOre(OSMIUM_DUST_DICT, osmiumDust);
		
		addSmelting(OSMIUM_DICT, osmiumIngot, 1);
		addSmelting(OSMIUM_INFERIOR_DICT, osmiumNugget, 3);
		addSmelting(OSMIUM_DUST_DICT, osmiumIngot, 1);
	}
	
	private static void initTin() {
		tin = registerBlock(new TinBlock(TIN_ORE_ID), TIN_NAME);
		tinInferior = registerBlock(new TinBlockInferior(TIN_INFERIOR_ORE_ID), TIN_INFERIOR_NAME);
		tinIngot = registerItem(new TinIngot(TIN_INGOT_ID), TIN_INGOT_NAME);
		tinNugget = registerItem(new TinNugget(TIN_NUGGET_ID), TIN_NUGGET_NAME);
		tinDust = registerItem(new TinDust(TIN_DUST_ID), TIN_DUST_NAME);

		GameRegistry.addRecipe(new ItemStack(tinIngot), new Object[]{"CCC", "CCC", "CCC", 'C', tinNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(tinNugget, 9), tinIngot);
		
		OreDictionary.registerOre(TIN_DICT, tin);
		OreDictionary.registerOre(TIN_INFERIOR_DICT, tinInferior);
		OreDictionary.registerOre(TIN_INGOT_DICT, tinIngot);
		OreDictionary.registerOre(TIN_NUGGET_DICT, tinNugget);
		OreDictionary.registerOre(TIN_DUST_DICT, tinDust);
		
		addSmelting(TIN_DICT, tinIngot, 1);
		addSmelting(TIN_INFERIOR_DICT, tinNugget, 3);
		addSmelting(TIN_DUST_DICT, tinIngot, 1);
	}

	private static void addSmelting(String oreDictname, Item out, int numOut) {
		for (ItemStack in : OreDictionary.getOres(oreDictname)) {
			GameRegistry.addSmelting(in, new ItemStack(out, numOut), 0);
			FurnaceRecipes.smelting().func_151394_a(in, new ItemStack(out, numOut), 1.0F);
			//TODO: ^ Do these both need to be here? -BJ
		}
	}

	private static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, String name) {
		GameRegistry.registerBlock(block, name);
		block.setBlockName(name);
		return block;
	}

	private static <ITEM extends Item> ITEM registerItem(ITEM item, String name) {
		GameRegistry.registerItem(item, name);
		item.setUnlocalizedName(name);
		return item;
	}

}
