package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.forge.StandardForgeable;
import ca.bradj.orecore.item.steel.SteelDust;
import ca.bradj.orecore.item.steel.SteelIngot;
import ca.bradj.orecore.item.steel.SteelNugget;
import ca.bradj.orecore.item.steel.SteelPureBlock;
import ca.bradj.orecoremin.item.Iron;
import cpw.mods.fml.common.registry.GameRegistry;

public class Steel implements StandardForgeable {

    private static final String STEEL_DUST_DICT = "dustSteel";
    private static final String STEEL_NUGGET_DICT = "nuggetSteel";
    private static final String STEEL_INGOT_DICT = "ingotSteel";
    private static final String STEEL_BLOCK_DICT = "blockSteel";

    private static final String STEEL_DUST_NAME = "Steel.Dust";
    private static final String STEEL_INGOT_NAME = "Steel.Ingot";
    private static final String STEEL_NUGGET_NAME = "Steel.Nugget";
    private static final String STEEL_BLOCK_NAME = "Steel.Block";

    public static void preInit() {
        OreCoreItemsReg.steelDust = OreCoreRegistration.registerItem(new SteelDust(), STEEL_DUST_NAME);
        OreCoreItemsReg.steelIngot = OreCoreRegistration.registerItem(new SteelIngot(), STEEL_INGOT_NAME);
        OreCoreItemsReg.steelNugget = OreCoreRegistration.registerItem(new SteelNugget(), STEEL_NUGGET_NAME);
        OreCoreItemsReg.steelBlock = OreCoreRegistration.registerBlock(new SteelPureBlock(), STEEL_BLOCK_NAME);

        OreDictionary.registerOre(STEEL_DUST_DICT, OreCoreItemsReg.steelDust);
        OreDictionary.registerOre(STEEL_NUGGET_DICT, OreCoreItemsReg.steelNugget);
        OreDictionary.registerOre(STEEL_INGOT_DICT, OreCoreItemsReg.steelIngot);
        OreDictionary.registerOre(STEEL_BLOCK_DICT, OreCoreItemsReg.steelBlock);
    }

    public static void init() {

        ShapelessOreRecipe recipe = new ShapelessOreRecipe(new ItemStack(OreCoreItemsReg.steelDust, 2), Iron.IRON_DUST_DICT,
                Manganese.DICT.DUST.get());
        GameRegistry.addRecipe(recipe);

        OreCoreRegistration.nuggetToIngotStandard(OreCoreItemsReg.steelNugget, STEEL_NUGGET_DICT, OreCoreItemsReg.steelIngot);
        OreCoreRegistration.ingotToNuggetStandard(OreCoreItemsReg.steelIngot, STEEL_INGOT_DICT, OreCoreItemsReg.steelNugget);
        OreCoreRegistration.ingotToBlockStandard(OreCoreItemsReg.steelIngot, STEEL_INGOT_DICT, OreCoreItemsReg.steelBlock);
        OreCoreRegistration.blockToIngotStandard(OreCoreItemsReg.steelBlock, STEEL_BLOCK_DICT, OreCoreItemsReg.steelIngot);

        OreCoreRegistration.addSmelting(OreCoreItemsReg.steelDust, OreCoreItemsReg.steelIngot, 1);
    }

    //@formatter:off
    @Override public Item asDust() { return OreCoreItemsReg.steelDust; }
    @Override public Item asIngot() { return OreCoreItemsReg.steelIngot; }
    @Override public Item asNugget() { return OreCoreItemsReg.steelNugget; }
    @Override public Block asPureBlock() { return OreCoreItemsReg.steelBlock; }

}
