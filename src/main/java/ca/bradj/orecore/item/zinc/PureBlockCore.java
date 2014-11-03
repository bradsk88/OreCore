package ca.bradj.orecore.item.zinc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ca.bradj.orecore.OreCore;

public class PureBlockCore extends Block {

    public PureBlockCore(String texture) {
        super(Material.rock);
        setHardness(3.0f);
        setHarvestLevel("pickaxe", 1);
        setBlockTextureName("orecore:" + texture);
        setCreativeTab(OreCore.tabOreCore);
    }

}
