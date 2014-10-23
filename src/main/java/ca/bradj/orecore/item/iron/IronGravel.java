package ca.bradj.orecore.item.iron;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Lists;

import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.OreCoreItems;

public class IronGravel extends GravelBlock {

	protected IronGravel(int id) {
		super(id, "ironGravel");
		setHardness(2f);
		setHarvestLevel("shovel", 0);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		ArrayList<ItemStack> drops = Lists.newArrayList(new ItemStack(OreCoreItems.ironDust, 1));
		return drops;
	}
}
