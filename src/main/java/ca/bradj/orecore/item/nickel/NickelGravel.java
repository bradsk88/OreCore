package ca.bradj.orecore.item.nickel;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.google.common.collect.Lists;

import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.OreCoreItems;

public class NickelGravel extends GravelBlock {

	public NickelGravel(int id) {
		super(id, "nickelGravel");
		setHardness(1.5f);
		this.setHarvestLevel("shovel", 2);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(OreCoreItems.nickelDust, 1));
	}
}
