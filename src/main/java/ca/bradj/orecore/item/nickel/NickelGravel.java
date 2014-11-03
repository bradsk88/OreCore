package ca.bradj.orecore.item.nickel;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Lists;

import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.base.GravelBlock;

public class NickelGravel extends GravelBlock {

	public NickelGravel() {
		super("nickelGravel");
		setHardness(1.5f);
		this.setHarvestLevel("shovel", 2);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(OreCoreItems.nickel().asDust(), 1));
	}
}
