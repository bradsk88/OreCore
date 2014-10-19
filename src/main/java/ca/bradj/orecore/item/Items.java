package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
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

	public static BauxiteOreBlock bauxite;

	public static final void init() {

		bauxite = new BauxiteOreBlock();

		initCopper();

		// Aluminum/Bauxite
		GameRegistry.registerBlock(bauxite, "Bauxite Ore");

		OreDictionary.registerOre("oreCopper", copper);
		OreDictionary.registerOre("oreBauxite", bauxite);

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
