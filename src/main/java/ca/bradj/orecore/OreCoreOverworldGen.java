package ca.bradj.orecore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import org.apache.logging.log4j.Logger;

import ca.bradj.orecore.item.IronManganese;
import ca.bradj.orecore.item.Nickel;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.Osmium;
import ca.bradj.orecore.item.Silver;
import ca.bradj.orecore.item.Titanium;
import ca.bradj.orecore.item.Zinc;

import com.google.common.base.Preconditions;

public class OreCoreOverworldGen {

	private World world;
	private Random random;
	private Configuration config;
	private int x;
	private int z;

	public OreCoreOverworldGen(Configuration config, @SuppressWarnings("unused") Logger logger, World world, Random random, int x, int z) {
		this.world = Preconditions.checkNotNull(world);
		this.random = Preconditions.checkNotNull(random);
		this.config = Preconditions.checkNotNull(config);
		this.x = x;
		this.z = z;
	}

	public void generate() {

		doGenerateOre(OreCoreItems.ironManganese(), 0, IronManganese.IRON_MANGANESE_TOP_LEVEL, IronManganese.IRON_MANGANESE_VEIN_SIZE, config, "ironManganese");

		doGenerateOre(OreCoreItems.nickel().asOre(), 0, Nickel.NICKEL_TOP_LEVEL, Nickel.NICKEL_VEIN_SIZE, config, "nickel");
		doGenerateOre(OreCoreItems.nickel().asGravel(), 0, Nickel.NICKEL_GRAVEL_TOP_LEVEL, Nickel.NICKEL_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "nickelGravel");
		doGenerateOre(OreCoreItems.nickel().asInferior(), 0, Nickel.NICKEL_INFERIOR_TOP_LEVEL, Nickel.NICKEL_INFERIOR_VEIN_SIZE, config, "nickelInferior");

		doGenerateOre(OreCoreItems.osmium().asOre(), 0, Osmium.OSMIUM_TOP_LEVEL, Osmium.OSMIUM_VEIN_SIZE, config, "osmium");
		doGenerateOre(OreCoreItems.osmium().asGravel(), 0, Osmium.OSMIUM_GRAVEL_TOP_LEVEL, Osmium.OSMIUM_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "osmiumGravel");
		doGenerateOre(OreCoreItems.osmium().asInferior(), 0, Osmium.OSMIUM_INFERIOR_TOP_LEVEL, Osmium.OSMIUM_INFERIOR_VEIN_SIZE, config, "osmiumInferior");

		doGenerateOre(OreCoreItems.silver().asOre(), 0, Silver.SILVER_TOP_LEVEL, Silver.SILVER_VEIN_SIZE, config, "silver");
		doGenerateOre(OreCoreItems.silver().asGravel(), 0, Silver.SILVER_GRAVEL_TOP_LEVEL, Silver.SILVER_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "silverGravel");
		doGenerateOre(OreCoreItems.silver().asInferior(), 0, Silver.SILVER_INFERIOR_TOP_LEVEL, Silver.SILVER_INFERIOR_VEIN_SIZE, config, "silverInferior");

		doGenerateOre(OreCoreItems.rutileOre(), 0, Titanium.RUTILE_TOP_LEVEL, Titanium.RUTILE_VEIN_SIZE, Blocks.sand, config, "rutile");
		doGenerateOre(OreCoreItems.rutileOreInferior(), 0, Titanium.RUTILE_INFERIOR_TOP_LEVEL, Titanium.RUTILE_INFERIOR_VEIN_SIZE, Blocks.sand, config, "rutileInferior");
		doGenerateOre(OreCoreItems.ilmeniteOre(), 0, Titanium.ILMENITE_TOP_LEVEL, Titanium.ILMENITE_VEIN_SIZE, config, "ilmenite");
		doGenerateOre(OreCoreItems.ilmeniteOreInferior(), 0, Titanium.ILMENITE_INFERIOR_TOP_LEVEL, Titanium.ILMENITE_INFERIOR_VEIN_SIZE, config, "ilmeniteInferior");

		doGenerateOre(OreCoreItems.zinc().asOre(), 0, Zinc.ZINC_TOP_LEVEL, Zinc.ZINC_VEIN_SIZE, config, "zinc");
		doGenerateOre(OreCoreItems.zinc().asGravel(), 0, Zinc.ZINC_GRAVEL_TOP_LEVEL, Zinc.ZINC_GRAVEL_VEIN_SIZE, Blocks.gravel, config, "zincGravel");
		doGenerateOre(OreCoreItems.zinc().asInferior(), 0, Zinc.ZINC_INFERIOR_TOP_LEVEL, Zinc.ZINC_INFERIOR_VEIN_SIZE, config, "zincInferior");
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
