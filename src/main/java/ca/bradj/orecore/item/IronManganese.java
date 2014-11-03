package ca.bradj.orecore.item;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.iron_manganese.IronManganeseBlock;

public class IronManganese {

	private static final String I_M_NAME = "Iron.Manganese";

	public static final int IRON_MANGANESE_TOP_LEVEL = 40;

	public static final int IRON_MANGANESE_VEIN_SIZE = 4;

	public static void preInit() {
		OreCoreItemsReg.ironManganese = OreCoreRegistration.registerBlock(new IronManganeseBlock(), I_M_NAME);

		OreDictionary.registerOre("oreIronManganese", OreCoreItems.ironManganese());
	}

    public static void init() {
        //Nothing, yet?
    }
}
