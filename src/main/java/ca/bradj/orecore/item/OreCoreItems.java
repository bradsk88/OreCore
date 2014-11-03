package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.google.common.base.Preconditions;

import cpw.mods.fml.common.registry.GameRegistry;

public class OreCoreItems {

    public static class OreCoreRegistration {

        @SuppressWarnings("all")
        // I know, I know -BJ
        static void addShapelessRecipe(Item out, int numOut, String... inDictStrings) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(out, numOut), inDictStrings));
        }

        static void addSmelting(Block oreIn, Item out, int numOut) {
            GameRegistry.addSmelting(oreIn, new ItemStack(out, numOut), 0);
        }

        static void addSmelting(Item oreIn, Item out, int numOut) {
            GameRegistry.addSmelting(oreIn, new ItemStack(out, numOut), 0);
        }

        static void blockToIngotStandard(String blockDictString, Item ingotOut) {
            addShapelessRecipe(ingotOut, 9, blockDictString);
        }

        static void ingotToBlockStandard(String ingotDictString, Block blockOut) {
            Preconditions.checkNotNull(blockOut);
            Preconditions.checkArgument(ingotDictString.length() > 0);
            GameRegistry
                    .addRecipe(new ShapedOreRecipe(blockOut, true, new Object[] { "CCC", "CCC", "CCC", Character.valueOf('C'), ingotDictString }));
        }

        static void ingotToNuggetStandard(String ingotDictString, Item nuggetOut) {
            addShapelessRecipe(nuggetOut, 9, ingotDictString);
        }

        static void nuggetToIngotStandard(String nuggetDictString, Item ingotOut) {
            Preconditions.checkNotNull(ingotOut);
            Preconditions.checkArgument(nuggetDictString.length() > 0);
            GameRegistry
                    .addRecipe(new ShapedOreRecipe(ingotOut, true, new Object[] { "CCC", "CCC", "CCC", Character.valueOf('C'), nuggetDictString }));
        }

        static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, String name) {
            GameRegistry.registerBlock(block, name);
            block.setBlockName(name);
            return block;
        }

        static <ITEM extends Item> ITEM registerItem(ITEM item, String name) {
            GameRegistry.registerItem(item, name);
            item.setUnlocalizedName(name);
            return item;
        }
    }

    public static Block ilmeniteOre() {
        return OreCoreItemsReg.ilmenite;
    }

    public static Block ilmeniteOreInferior() {
        return OreCoreItemsReg.ilmeniteInferior;
    }

    public static void init() {
        OreCoreItemsReg.init();
    }

    public static Block ironManganese() {
        return OreCoreItemsReg.ironManganese;
    }

    public static Lead lead() {
        return Lead.getInstance();
    }

    public static Manganese manganese() {
        return Manganese.getInstance();
    }

    public static Nickel nickel() {
        return Nickel.getInstance();
    }

    public static Osmium osmium() {
        return Osmium.getInstance();
    }

    public static void preInit() {
        OreCoreItemsReg.preInit();
    }

    public static Block rutileOre() {
        return OreCoreItemsReg.rutile;
    }

    public static Block rutileOreInferior() {
        return OreCoreItemsReg.rutileInferior;
    }

    public static Silver silver() {
        return Silver.getInstance();
    }

    public static Zinc zinc() {
        return Zinc.getInstance();
    }

}
