package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.aluminum.AluminumDust;
import ca.bradj.orecore.item.aluminum.AluminumIngot;
import ca.bradj.orecore.item.aluminum.AluminumNugget;
import ca.bradj.orecore.item.copper.CopperBlock;
import ca.bradj.orecore.item.copper.CopperBlockInferior;
import ca.bradj.orecore.item.copper.CopperDust;
import ca.bradj.orecore.item.copper.CopperIngot;
import ca.bradj.orecore.item.copper.CopperNugget;
import ca.bradj.orecore.item.copper.carb.Copper2CarbonateDust;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {

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
	private static final int copper2CarbonateDustId = 4003;
	
	//Aluminium
	
	private static final int ALUMINUM_DUST_ID = 4005;
	private static final String ALUMINUM_DUST_NAME = "Aluminum Dust";
	
	private static final String ALUMINUM_NUGGET_NAME = "Aluminum Nugget";
	private static final int ALUMINUM_NUGGET_ID = 4006;
	
	private static final String ALUMINUM_INGOT_NAME = "Aluminum Ingot";
	private static final int ALUMINUM_INGOT_ID = 4007;
	
	public static BauxiteOreBlock bauxite;
	private static AluminumDust aluminumDust;
	private static AluminumNugget aluminumNugget;
	private static AluminumIngot aluminumIngot;

	public static final void init() {
		initCopper();
		initAluminum();
	}

	private static void initAluminum() {
		
		bauxite = registerBlock(new BauxiteOreBlock(), "Bauxite Ore");
		aluminumIngot = registerItem(new AluminumIngot(ALUMINUM_INGOT_ID), ALUMINUM_INGOT_NAME);
		aluminumDust = registerItem(new AluminumDust(ALUMINUM_DUST_ID), ALUMINUM_DUST_NAME);
		aluminumNugget = registerItem(new AluminumNugget(ALUMINUM_NUGGET_ID), ALUMINUM_NUGGET_NAME);
		
		GameRegistry.addSmelting(aluminumDust, new ItemStack(aluminumNugget, 3), 0);
		GameRegistry.addRecipe(new ItemStack(aluminumIngot), new Object[]{"CCC", "CCC", "CCC", 'C', aluminumNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(aluminumNugget, 9), aluminumIngot);
		
		OreDictionary.registerOre("oreBauxite", new ItemStack(bauxite, 1, 1));
		OreDictionary.registerOre("dustAluminum", new ItemStack(aluminumDust, 1, 1));
		OreDictionary.registerOre("nuggetAluminum", new ItemStack(aluminumNugget, 1, 1));
		OreDictionary.registerOre("ingotAluminum", new ItemStack(aluminumIngot, 1, 1));
	}

	private static void initCopper() {
		// Copper
		copper = registerBlock(new CopperBlock(copperOreId), COPPER_NAME);
		copperInferior = registerBlock(new CopperBlockInferior(copperInferiorOreId), COPPER_INFERIOR_NAME);
		copperIngot = registerItem(new CopperIngot(copperIngotId), COPPER_INGOT_NAME);
		copperNugget = registerItem(new CopperNugget(copperNuggetId), COPPER_NUGGET_NAME);
		copperDust = registerItem(new CopperDust(copperDustId), COPPER_DUST_NAME);
		copper2CarbonateDust = registerItem(new Copper2CarbonateDust(copper2CarbonateDustId), COPPER_2_CARBONATE_DUST_NAME);

		GameRegistry.addSmelting(copper, new ItemStack(copperIngot), 0);
		GameRegistry.addSmelting(copperInferior, new ItemStack(copperNugget, 3), 0);
		GameRegistry.addSmelting(copperDust, new ItemStack(copperIngot), 0);
		GameRegistry.addRecipe(new ItemStack(copperIngot), new Object[]{"CCC", "CCC", "CCC", 'C', copperNugget});
		GameRegistry.addShapelessRecipe(new ItemStack(copperNugget, 9), copperIngot);
		
		OreDictionary.registerOre("oreCopper", new ItemStack(copper, 1, 1));
		OreDictionary.registerOre("ingotCopper", new ItemStack(copperIngot, 1, 1));
		OreDictionary.registerOre("nuggetCopper", new ItemStack(copperIngot, 1, 1));
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
