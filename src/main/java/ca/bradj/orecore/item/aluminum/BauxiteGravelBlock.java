package ca.bradj.orecore.item.aluminum;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.OreCoreItems;

public class BauxiteGravelBlock extends GravelBlock {

	private static final int MAX_DUST_DROP = 5;

	protected BauxiteGravelBlock(int id) {
		super(id, "bauxiteGravel");
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreItems.aluminumDust, world.rand.nextInt(MAX_DUST_DROP - 1) + 1));
		return drops;
	}

}
