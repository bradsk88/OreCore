package ca.bradj.orecore.item;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;

public class BauxiteOreBlock extends Block {

	protected BauxiteOreBlock() {
		super(Material.ground);
		setBlockName("Bauxite");
		this.setBlockTextureName("orecore:bauxite");
		setHarvestLevel("pickaxe", 0);
	}
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(this);
    }
 
}
