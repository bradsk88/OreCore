package ca.bradj.orecore.item.silver;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Lists;

import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.base.GravelBlock;

public class SilverGravel extends GravelBlock {

	public SilverGravel() {
		super("silverGravel");
		setHardness(2f);
		setHarvestLevel("shovel", 2);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(OreCoreItems.silver().asDust(), 1));
	}

}
