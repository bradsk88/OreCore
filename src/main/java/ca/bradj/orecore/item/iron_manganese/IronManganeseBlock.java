package ca.bradj.orecore.item.iron_manganese;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import ca.bradj.orecore.item.OreBlock;
import ca.bradj.orecore.item.OreCoreItems;

import com.google.common.collect.Lists;

public class IronManganeseBlock extends OreBlock {

	private static final int DEFAULT_MANGANESE_DROP = 1;
	private static final int DEFAULT_IRON_DROP = 1;

	public IronManganeseBlock(int id) {
		super(id, "ironManganese");
		setHardness(3f);
		this.setHarvestLevel("pickaxe", 2);
	}

	@Override
	public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) {
		int quantity = quantityDropped(metadata, fortune, world.rand);
		return Lists.newArrayList(new ItemStack(OreCoreItems.manganeseDust, DEFAULT_MANGANESE_DROP * quantity),
				new ItemStack(OreCoreItems.ironDust, DEFAULT_IRON_DROP * quantity));
	}
	

}
