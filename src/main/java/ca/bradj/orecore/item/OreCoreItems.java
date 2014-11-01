package ca.bradj.orecore.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import ca.bradj.orecore.item.brass.Brass;
import ca.bradj.orecore.item.brass.BrassDust;
import ca.bradj.orecore.item.brass.BrassIngot;
import ca.bradj.orecore.item.brass.BrassNugget;
import ca.bradj.orecore.item.brass.BrassPureBlock;
import ca.bradj.orecore.item.bronze.Bronze;
import ca.bradj.orecore.item.bronze.BronzeDust;
import ca.bradj.orecore.item.bronze.BronzeIngot;
import ca.bradj.orecore.item.bronze.BronzeNugget;
import ca.bradj.orecore.item.bronze.BronzePureBlock;
import ca.bradj.orecore.item.iron_manganese.IronManganese;
import ca.bradj.orecore.item.iron_manganese.IronManganeseBlock;
import ca.bradj.orecore.item.lead.Lead;
import ca.bradj.orecore.item.lead.LeadBlock;
import ca.bradj.orecore.item.lead.LeadBlockInferior;
import ca.bradj.orecore.item.lead.LeadDust;
import ca.bradj.orecore.item.lead.LeadGravel;
import ca.bradj.orecore.item.lead.LeadIngot;
import ca.bradj.orecore.item.lead.LeadNugget;
import ca.bradj.orecore.item.lead.LeadPureBlock;
import ca.bradj.orecore.item.manganese.Manganese;
import ca.bradj.orecore.item.manganese.ManganeseDust;
import ca.bradj.orecore.item.manganese.ManganeseIngot;
import ca.bradj.orecore.item.manganese.ManganeseNugget;
import ca.bradj.orecore.item.manganese.ManganesePureBlock;
import ca.bradj.orecore.item.nickel.Nickel;
import ca.bradj.orecore.item.nickel.NickelBlock;
import ca.bradj.orecore.item.nickel.NickelBlockInferior;
import ca.bradj.orecore.item.nickel.NickelDust;
import ca.bradj.orecore.item.nickel.NickelGravel;
import ca.bradj.orecore.item.nickel.NickelIngot;
import ca.bradj.orecore.item.nickel.NickelNugget;
import ca.bradj.orecore.item.nickel.NickelPureBlock;
import ca.bradj.orecore.item.osmium.Osmium;
import ca.bradj.orecore.item.osmium.OsmiumBlock;
import ca.bradj.orecore.item.osmium.OsmiumBlockInferior;
import ca.bradj.orecore.item.osmium.OsmiumDust;
import ca.bradj.orecore.item.osmium.OsmiumGravel;
import ca.bradj.orecore.item.osmium.OsmiumIngot;
import ca.bradj.orecore.item.osmium.OsmiumNugget;
import ca.bradj.orecore.item.osmium.OsmiumPureBlock;
import ca.bradj.orecore.item.silver.Silver;
import ca.bradj.orecore.item.silver.SilverBlock;
import ca.bradj.orecore.item.silver.SilverBlockInferior;
import ca.bradj.orecore.item.silver.SilverDust;
import ca.bradj.orecore.item.silver.SilverGravel;
import ca.bradj.orecore.item.silver.SilverIngot;
import ca.bradj.orecore.item.silver.SilverNugget;
import ca.bradj.orecore.item.silver.SilverPureBlock;
import ca.bradj.orecore.item.steel.Steel;
import ca.bradj.orecore.item.steel.SteelDust;
import ca.bradj.orecore.item.steel.SteelIngot;
import ca.bradj.orecore.item.steel.SteelNugget;
import ca.bradj.orecore.item.steel.SteelPureBlock;
import ca.bradj.orecore.item.titanium.IlmeniteBlock;
import ca.bradj.orecore.item.titanium.IlmeniteBlockInferior;
import ca.bradj.orecore.item.titanium.RutileBlock;
import ca.bradj.orecore.item.titanium.RutileBlockInferior;
import ca.bradj.orecore.item.titanium.Titanium;
import ca.bradj.orecore.item.titanium.TitaniumDust;
import ca.bradj.orecore.item.titanium.TitaniumIngot;
import ca.bradj.orecore.item.titanium.TitaniumNugget;
import ca.bradj.orecore.item.titanium.TitaniumPureBlock;
import ca.bradj.orecore.item.zinc.Zinc;
import ca.bradj.orecore.item.zinc.ZincBlock;
import ca.bradj.orecore.item.zinc.ZincBlockInferior;
import ca.bradj.orecore.item.zinc.ZincDust;
import ca.bradj.orecore.item.zinc.ZincGravel;
import ca.bradj.orecore.item.zinc.ZincIngot;
import ca.bradj.orecore.item.zinc.ZincNugget;
import ca.bradj.orecore.item.zinc.ZincPureBlock;

import com.google.common.base.Preconditions;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Centralized location for all OreCore items.
 */
public class OreCoreItems {

	public static OsmiumBlock osmium;
	public static OsmiumBlockInferior osmiumInferior;
	public static OsmiumIngot osmiumIngot;
	public static OsmiumNugget osmiumNugget;
	public static OsmiumGravel osmiumGravel;
	public static OsmiumDust osmiumDust;
	public static OsmiumPureBlock osmiumBlock;

	public static IronManganeseBlock ironManganese;

	public static ManganeseDust manganeseDust;
	public static ManganeseNugget manganeseNugget;
	public static ManganeseIngot manganeseIngot;
	public static ManganesePureBlock manganeseBlock;

	public static SteelDust steelDust;
	public static SteelIngot steelIngot;
	public static SteelNugget steelNugget;
	public static SteelPureBlock steelBlock;

	public static BronzeDust bronzeDust;
	public static BronzeIngot bronzeIngot;
	public static BronzeNugget bronzeNugget;
	public static BronzePureBlock bronzeBlock;

	public static SilverBlock silver;
	public static SilverBlockInferior silverInferior;
	public static SilverIngot silverIngot;
	public static SilverNugget silverNugget;
	public static SilverDust silverDust;
	public static SilverGravel silverGravel;
	public static SilverPureBlock silverBlock;

	public static BrassDust brassDust;
	public static BrassIngot brassIngot;
	public static BrassNugget brassNugget;
	public static BrassPureBlock brassBlock;

	public static NickelBlock nickel;
	public static NickelBlockInferior nickelInferior;
	public static NickelIngot nickelIngot;
	public static NickelNugget nickelNugget;
	public static NickelDust nickelDust;
	public static NickelGravel nickelGravel;
	public static NickelPureBlock nickelBlock;

	public static ZincBlock zinc;
	public static ZincBlockInferior zincInferior;
	public static ZincIngot zincIngot;
	public static ZincNugget zincNugget;
	public static ZincDust zincDust;
	public static ZincGravel zincGravel;
	public static ZincPureBlock zincBlock;

	public static LeadBlock lead;
	public static LeadBlockInferior leadInferior;
	public static LeadIngot leadIngot;
	public static LeadNugget leadNugget;
	public static LeadDust leadDust;
	public static LeadGravel leadGravel;
	public static LeadPureBlock leadBlock;

	public static RutileBlock rutile;
	public static RutileBlockInferior rutileInferior;
	public static IlmeniteBlock ilmenite;
	public static IlmeniteBlockInferior ilmeniteInferior;
	public static TitaniumIngot titaniumIngot;
	public static TitaniumNugget titaniumNugget;
	public static TitaniumDust titaniumDust;
	public static TitaniumPureBlock titaniumBlock;

	// 4029 is next

	public static final void init() {
		Brass.init();
		Bronze.init();
		IronManganese.init();
		Lead.init();
		Manganese.init();
		Nickel.init();
		Osmium.init();
		Silver.init();
		Steel.init();
		Titanium.init();
		Zinc.init();
	}

	public static class OreCoreRegistration {

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
			Preconditions.checkNotNull(ingotOut);
			Preconditions.checkArgument(nuggetDictString.length() > 0);
			GameRegistry
					.addRecipe(new ShapedOreRecipe(ingotOut, true, new Object[] { "CCC", "CCC", "CCC", Character.valueOf('C'), nuggetDictString }));
		}

		public static void ingotToBlockStandard(String ingotDictString, Block blockOut) {
			Preconditions.checkNotNull(blockOut);
			Preconditions.checkArgument(ingotDictString.length() > 0);
			GameRegistry
					.addRecipe(new ShapedOreRecipe(blockOut, true, new Object[] { "CCC", "CCC", "CCC", Character.valueOf('C'), ingotDictString }));
		}

		public static void ingotToNuggetStandard(String ingotDictString, Item nuggetOut) {
			addShapelessRecipe(nuggetOut, 9, ingotDictString);
		}

		public static void blockToIngotStandard(String blockDictString, Item ingotOut) {
			addShapelessRecipe(ingotOut, 9, blockDictString);
		}

		@SuppressWarnings("all")
		// I know, I know -BJ
		public static void addShapelessRecipe(Item out, int numOut, String... inDictStrings) {
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(out, numOut), inDictStrings));
		}
	}

}
