package ca.bradj.orecore.item;

import ca.bradj.orecore.OreCore;
import net.minecraft.item.Item;

public class OreCoreItem extends Item {

	public OreCoreItem(String name) {
		setTextureName("orecore:"+name);
		setCreativeTab(OreCore.tabOreCore);
	}

}
