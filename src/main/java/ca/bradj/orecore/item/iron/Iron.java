package ca.bradj.orecore.item.iron;

import net.minecraft.init.Items;
import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;
import ca.bradj.orecore.item.iron.IronBlockInferior;
import ca.bradj.orecore.item.iron.IronGravel;

public class Iron {

	public static final String IRON_DUST_DICT = "dustIron";
	public static final String IRON_NUGGET_DICT = "nuggetIron";
	public static final String IRON_INGOT_DICT = "ingotIron";
	public static final String IRON_GRAVEL_DICT = "graveliron";
	public static final String IRON_INFERIOR_DICT = "oreironInferior";

	private static final String IRON_DUST_NAME = "Iron.Dust";
	private static final String IRON_NUGGET_NAME = "Iron.Nugget";
	private static final String IRON_INFERIOR_NAME = "Inferior.Iron";
	private static final String IRON_GRAVEL_NAME = "Iron.Gravel";

	public static final int IRON_GRAVEL_TOP_LEVEL = 70;
	public static final int IRON_INFERIOR_TOP_LEVEL = 50;

	public static final int IRON_GRAVEL_VEIN_SIZE = 4;
	public static final int IRON_INFERIOR_VEIN_SIZE = 6;

	public static void init() {
		OreCoreItems.ironInferior = OreCoreRegistration.registerBlock(new IronBlockInferior(IDs.IRON_INFERIOR_ID), IRON_INFERIOR_NAME);
		OreCoreItems.ironDust = OreCoreRegistration.registerItem(new IronDust(IDs.IRON_DUST_ID), IRON_DUST_NAME);
		OreCoreItems.ironNugget = OreCoreRegistration.registerItem(new IronNugget(IDs.IRON_NUGGET_ID), IRON_NUGGET_NAME);
		OreCoreItems.ironGravel = OreCoreRegistration.registerBlock(new IronGravel(IDs.IRON_GRAVEL_ID), IRON_GRAVEL_NAME);

		OreDictionary.registerOre(IRON_DUST_DICT, OreCoreItems.ironDust);
		OreDictionary.registerOre(IRON_NUGGET_DICT, OreCoreItems.ironNugget);
		OreDictionary.registerOre(IRON_INFERIOR_DICT, OreCoreItems.ironInferior);
		OreDictionary.registerOre(IRON_GRAVEL_DICT, OreCoreItems.ironGravel);

		OreCoreRegistration.addSmelting(OreCoreItems.ironDust, Items.iron_ingot, 1);

		OreCoreRegistration.nuggetToIngotStandard(IRON_NUGGET_DICT, Items.iron_ingot);
		OreCoreRegistration.ingotToNuggetStandard(IRON_INGOT_DICT, OreCoreItems.ironNugget);
		
		OreCoreRegistration.addSmelting(OreCoreItems.ironGravel, Items.iron_ingot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.ironInferior, OreCoreItems.ironNugget, 3);
	}

}
