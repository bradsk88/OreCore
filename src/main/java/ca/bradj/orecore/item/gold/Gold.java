package ca.bradj.orecore.item.gold;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.gold.GoldDust;

public class Gold {

	private static final String GOLD_DUST_DICT = "dustGold";
	
	private static final String GOLD_DUST_NAME = "Gold.Dust";

	public static void init() {
		OreCoreItems.goldDust = OreCoreRegistration.registerItem(new GoldDust(IDs.GOLD_DUST_ID), GOLD_DUST_NAME);

		OreDictionary.registerOre(GOLD_DUST_DICT, OreCoreItems.goldDust);
		
		OreCoreRegistration.addSmelting(OreCoreItems.goldDust, Items.gold_ingot, 1);
	}

}
