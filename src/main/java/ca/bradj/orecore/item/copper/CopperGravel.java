package ca.bradj.orecore.item.copper;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.OreCoreItems;

import com.google.common.collect.Lists;

public class CopperGravel extends GravelBlock {

	private static final int COPPER_DUST_CHANCE = 100; //TODO: Configurable -BJ
	private static final int COPPER_CARBONATE_DUST_CHANCE = 50;

	public CopperGravel(int id) {
		super(id, "copperGravel");
		setHardness(1.5f);
		setHarvestLevel("shovel", 2);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList();
		if (world.rand.nextInt(100) < COPPER_DUST_CHANCE) {
			drops.add(new ItemStack(OreCoreItems.copperDust, 1));
		}
		if (world.rand.nextInt(100) < COPPER_CARBONATE_DUST_CHANCE) {
			drops.add(new ItemStack(OreCoreItems.copper2CarbonateDust, 1));
		}
		return drops;
	}

}
