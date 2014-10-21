package ca.bradj.orecore.item.tin;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecore.item.GravelBlock;
import ca.bradj.orecore.item.OreCoreItems;

import com.google.common.collect.Lists;

public class TinGravel extends GravelBlock {	

	public TinGravel(int id) {
		super(id, "tinGravel");
		setHardness(1.5f);
		setHarvestLevel("shovel", 2);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		return Lists.newArrayList(new ItemStack(OreCoreItems.tinDust, 1));
	}

}
