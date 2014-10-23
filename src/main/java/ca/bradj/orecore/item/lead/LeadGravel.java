package ca.bradj.orecore.item.lead;

import java.util.ArrayList;

import com.google.common.collect.Lists;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.OreCoreItems;

public class LeadGravel extends GravelBlock {

	protected LeadGravel(int id) {
		super(id, "leadGravel");
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(OreCoreItems.leadDust, 1));
	}

}
