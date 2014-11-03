package ca.bradj.orecore.item.lead;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.base.GravelBlock;

import com.google.common.collect.Lists;

public class LeadGravel extends GravelBlock {

	public LeadGravel() {
		super("leadGravel");
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(OreCoreItems.lead().asDust(), 1));
	}

}
