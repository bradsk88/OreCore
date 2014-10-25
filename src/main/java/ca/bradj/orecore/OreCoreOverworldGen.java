package ca.bradj.orecore;

import java.util.Random;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.aluminum.Aluminum;
import ca.bradj.orecore.item.copper.Copper;
import ca.bradj.orecore.item.gold.Gold;
import ca.bradj.orecore.item.iron.Iron;
import ca.bradj.orecore.item.iron_manganese.IronManganese;
import ca.bradj.orecore.item.nickel.Nickel;
import ca.bradj.orecore.item.osmium.Osmium;
import ca.bradj.orecore.item.silver.Silver;
import ca.bradj.orecore.item.tin.Tin;
import ca.bradj.orecore.item.titanium.Titanium;
import ca.bradj.orecore.item.zinc.Zinc;

import com.google.common.base.Preconditions;

public class OreCoreOverworldGen {

	private World world;
	private Random random;
	private Configuration config;
	private int x;
	private int z;

	public OreCoreOverworldGen(Configuration config, Logger logger, World world, Random random, int x, int z) {
		this.world = Preconditions.checkNotNull(world);
		this.random = Preconditions.checkNotNull(random);
		this.config = Preconditions.checkNotNull(config);
		this.x = x;
		this.z = z;
	}

	public void generate() {

		doGenerateOre(OreCoreItems.bauxite, 0, Aluminum.BAUXITE_TOP_LEVEL, Aluminum.BAUXITE_VEIN_SIZE, config, "bauxite");
		doGenerateOre(OreCoreItems.bauxiteGravel, 0, Aluminum.BAUXITE_TOP_LEVEL, Aluminum.BAUXITE_GRAVEL_VEIN_SIZE, OreCoreItems.bauxite, config, "bauxiteGravel");

		doGenerateOre(OreCoreItems.copper, 0, Copper.COPPER_TOP_LEVEL, Copper.COPPER_VEIN_SIZE, config, "copper");
		doGenerateOre(OreCoreItems.copperGravel, 0, Copper.COPPER_GRAVEL_TOP_LEVEL, Copper.COPPER_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "copperGravel");
		doGenerateOre(OreCoreItems.copperInferior, 0, Copper.COPPER_INFERIOR_TOP_LEVEL, Copper.COPPER_INFERIOR_VEIN_SIZE, config, "copperInferior");

		doGenerateOre(OreCoreItems.goldGravel, 0, Gold.GOLD_GRAVEL_TOP_LEVEL, Gold.GOLD_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "goldGravel");
		doGenerateOre(OreCoreItems.goldInferior, 0, Gold.GOLD_INFERIOR_TOP_LEVEL, Gold.GOLD_INFERIOR_VEIN_SIZE, config, "goldInferior");

		doGenerateOre(OreCoreItems.ironGravel, 0, Iron.IRON_GRAVEL_TOP_LEVEL, Iron.IRON_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "ironGravel");
		doGenerateOre(OreCoreItems.ironInferior, 0, Iron.IRON_INFERIOR_TOP_LEVEL, Iron.IRON_INFERIOR_VEIN_SIZE, config, "ironInferior");

		doGenerateOre(OreCoreItems.ironManganese, 0, IronManganese.IRON_MANGANESE_TOP_LEVEL, IronManganese.IRON_MANGANESE_VEIN_SIZE, config, "ironManganese");

		doGenerateOre(OreCoreItems.nickel, 0, Nickel.NICKEL_TOP_LEVEL, Nickel.NICKEL_VEIN_SIZE, config, "nickel");
		doGenerateOre(OreCoreItems.nickelGravel, 0, Nickel.NICKEL_GRAVEL_TOP_LEVEL, Nickel.NICKEL_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "nickelGravel");
		doGenerateOre(OreCoreItems.nickelInferior, 0, Nickel.NICKEL_INFERIOR_TOP_LEVEL, Nickel.NICKEL_INFERIOR_VEIN_SIZE, config, "nickelInferior");

		doGenerateOre(OreCoreItems.osmium, 0, Osmium.OSMIUM_TOP_LEVEL, Osmium.OSMIUM_VEIN_SIZE, config, "osmium");
		doGenerateOre(OreCoreItems.osmiumGravel, 0, Osmium.OSMIUM_GRAVEL_TOP_LEVEL, Osmium.OSMIUM_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "osmiumGravel");
		doGenerateOre(OreCoreItems.osmiumInferior, 0, Osmium.OSMIUM_INFERIOR_TOP_LEVEL, Osmium.OSMIUM_INFERIOR_VEIN_SIZE, config, "osmiumInferior");

		doGenerateOre(OreCoreItems.silver, 0, Silver.SILVER_TOP_LEVEL, Silver.SILVER_VEIN_SIZE, config, "silver");
		doGenerateOre(OreCoreItems.silverGravel, 0, Silver.SILVER_GRAVEL_TOP_LEVEL, Silver.SILVER_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "silverGravel");
		doGenerateOre(OreCoreItems.silverInferior, 0, Silver.SILVER_INFERIOR_TOP_LEVEL, Silver.SILVER_INFERIOR_VEIN_SIZE, config, "silverInferior");

		doGenerateOre(OreCoreItems.tin, 0, Tin.TIN_TOP_LEVEL, Tin.TIN_VEIN_SIZE, config, "tin");
		doGenerateOre(OreCoreItems.tinGravel, 0, Tin.TIN_GRAVEL_TOP_LEVEL, Tin.TIN_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "tinGravel");
		doGenerateOre(OreCoreItems.tinInferior, 0, Tin.TIN_INFERIOR_TOP_LEVEL, Tin.TIN_INFERIOR_VEIN_SIZE, config, "tinInferior");

		doGenerateOre(OreCoreItems.rutile, 0, Titanium.RUTILE_TOP_LEVEL, Titanium.RUTILE_VEIN_SIZE, Blocks.sand, config, "rutile");
		doGenerateOre(OreCoreItems.rutileInferior, 0, Titanium.RUTILE_INFERIOR_TOP_LEVEL, Titanium.RUTILE_INFERIOR_VEIN_SIZE, Blocks.sand, config, "rutileInferior");
		doGenerateOre(OreCoreItems.ilmenite, 0, Titanium.ILMENITE_TOP_LEVEL, Titanium.ILMENITE_VEIN_SIZE, config, "ilmenite");
		doGenerateOre(OreCoreItems.ilmeniteInferior, 0, Titanium.ILMENITE_INFERIOR_TOP_LEVEL, Titanium.ILMENITE_INFERIOR_VEIN_SIZE, config, "ilmeniteInferior");

		doGenerateOre(OreCoreItems.zinc, 0, Zinc.ZINC_TOP_LEVEL, Zinc.ZINC_VEIN_SIZE, config, "zinc");
		doGenerateOre(OreCoreItems.zincGravel, 0, Zinc.ZINC_GRAVEL_TOP_LEVEL, Zinc.ZINC_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "zincGravel");
		doGenerateOre(OreCoreItems.zincInferior, 0, Zinc.ZINC_INFERIOR_TOP_LEVEL, Zinc.ZINC_INFERIOR_VEIN_SIZE, config, "zincInferior");
	}

	private void doGenerateOre(Block ore, int minLayer, int maxLayer, int veinSize, Configuration config, String configTag) {
		doGenerateOre(ore, minLayer, maxLayer, veinSize, Blocks.stone, config, configTag);
	}

	private void doGenerateOre(Block ore, int minLayer, int maxLayer, int veinSize, Block destination, Configuration config, String configTag) {
		Property attempts = config.get("oregen", configTag, OreCoreWorldGen.DEFAULT_OREGEN_VALUE);
		for (int i = 0; i < attempts.getInt(); i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = minLayer + random.nextInt(maxLayer - minLayer);
			int chunkZ = z + random.nextInt(16);

			new WorldGenMinable(ore, 0, veinSize, destination).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}

}
