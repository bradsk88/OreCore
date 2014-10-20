package ca.bradj.orecore.item;

import net.minecraft.block.Block;
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
import ca.bradj.orecore.item.osmium.OsmiumBlock;
import ca.bradj.orecore.item.osmium.OsmiumBlockInferior;
import ca.bradj.orecore.item.osmium.OsmiumDust;
import ca.bradj.orecore.item.osmium.OsmiumIngot;
import ca.bradj.orecore.item.osmium.OsmiumNugget;
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
	
	public static final void init() {
		initCopper();
		initAluminum();
		initOsmium();
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
