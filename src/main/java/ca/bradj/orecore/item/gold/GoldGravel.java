package ca.bradj.orecore.item.gold;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Lists;

import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.OreCoreItems;

public class GoldGravel extends GravelBlock {

	protected GoldGravel(int id) {
		super(id, "goldGravel");
		setHardness(1.5f);
		setHarvestLevel("shovel", 2);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreItems.goldDust, 1));
		return drops;
	}
	
}
