package ca.bradj.orecore;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class OreCoreWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

		//TODO: Say no to switch statements! -BJ
		switch (world.provider.dimensionId) {
			case -1: //nether
				return;
			case 0: //overworld
				new OreCoreOverworldGen(world, random, chunkX*16, chunkZ*16).generate();
			case 1: //end
				return;
		}
		
		
	}
	
}
