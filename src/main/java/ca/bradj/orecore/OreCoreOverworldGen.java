package ca.bradj.orecore;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.aluminum.Aluminum;
import ca.bradj.orecore.item.copper.Copper;
import ca.bradj.orecore.item.iron_manganese.IronManganese;
import ca.bradj.orecore.item.osmium.Osmium;
import ca.bradj.orecore.item.tin.Tin;

import com.google.common.base.Preconditions;

public class OreCoreOverworldGen {

	private World world;
	private Random random;
	private int x;
	private int z;

	public OreCoreOverworldGen(World world, Random random, int x, int z) {
		this.world = Preconditions.checkNotNull(world);
		this.random = Preconditions.checkNotNull(random);
		this.x = x;
		this.z = z;
	}

	public void generate() {
		doGenerateOre(OreCoreItems.bauxite, 0, Aluminum.BAUXITE_TOP_LEVEL, Aluminum.BAUXITE_VEIN_SIZE);
		
		doGenerateOre(OreCoreItems.copper, 0, Copper.COPPER_TOP_LEVEL, Copper.COPPER_VEIN_SIZE);
		doGenerateOre(OreCoreItems.copperGravel, 0, Copper.COPPER_GRAVEL_TOP_LEVEL, Copper.COPPER_GRAVEL_VEIN_SIZE);
		doGenerateOre(OreCoreItems.copperInferior, 0, Copper.COPPER_INFERIOR_TOP_LEVEL, Copper.COPPER_INFERIOR_VEIN_SIZE);
		
		doGenerateOre(OreCoreItems.ironManganese, 0, IronManganese.IRON_MANGANESE_TOP_LEVEL, IronManganese.IRON_MANGANESE_VEIN_SIZE);
		
		doGenerateOre(OreCoreItems.osmium, 0, Osmium.OSMIUM_TOP_LEVEL, Osmium.OSMIUM_VEIN_SIZE);
		doGenerateOre(OreCoreItems.osmiumInferior, 0, Osmium.OSMIUM_INFERIOR_TOP_LEVEL, Osmium.OSMIUM_INFERIOR_VEIN_SIZE);
		
		doGenerateOre(OreCoreItems.tin, 0, Tin.TIN_TOP_LEVEL, Tin.TIN_VEIN_SIZE);
		doGenerateOre(OreCoreItems.tinGravel, 0, Tin.TIN_GRAVEL_TOP_LEVEL, Tin.TIN_GRAVEL_VEIN_SIZE);
		doGenerateOre(OreCoreItems.tinInferior, 0, Tin.TIN_INFERIOR_TOP_LEVEL, Tin.TIN_INFERIOR_VEIN_SIZE);
	}

	private void doGenerateOre(Block ore, int minLayer, int maxLayer, int veinSize) {
		for (int i = 0; i < 25; i++) {
			int chunkX = x + random.nextInt(16);
			int chunkY = minLayer + random.nextInt(maxLayer - minLayer);
			int chunkZ = z + random.nextInt(16);

			new WorldGenMinable(ore, 0, veinSize, Blocks.stone).generate(world, random, chunkX, chunkY, chunkZ);
		}
	}

}
