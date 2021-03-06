package ca.bradj.orecore.item.osmium;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.base.GravelBlock;

public class OsmiumGravel extends GravelBlock {

	public OsmiumGravel() {
		super("osmiumGravel");
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(OreCoreItems.osmium().asDust(), 1));
	}

}
