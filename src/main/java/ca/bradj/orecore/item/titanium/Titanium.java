package ca.bradj.orecore.item.titanium;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.orecore.item.IDs;
import ca.bradj.orecore.item.OreCoreItems;
import ca.bradj.orecore.item.OreCoreItems.OreCoreRegistration;

public class Titanium {
	
	public static final int RUTILE_TOP_LEVEL = 70;
	public static final int RUTILE_VEIN_SIZE = 2;
	
	public static final int RUTILE_INFERIOR_TOP_LEVEL = 100;
	public static final int RUTILE_INFERIOR_VEIN_SIZE = 4;
	
	public static final int ILMENITE_TOP_LEVEL = 40;
	public static final int ILMENITE_VEIN_SIZE = 4;
	
	public static final int ILMENITE_INFERIOR_TOP_LEVEL = 60;
	public static final int ILMENITE_INFERIOR_VEIN_SIZE = 4;

	public static final String DICT_ORE = "oreTitanium";
	public static final String DICT_INFERIOR = "oreTitaniumInferior";
	public static final String DICT_DUST = "dustTitanium";
	public static final String DICT_INGOT = "ingotTitanium";
	public static final String DICT_NUGGET = "nuggetTitanium";
	public static final String DICT_PURE_BLOCK = "blockTitanium";
	
	private static final String TITANIUM_INGOT_NAME = "Titanium.Ingot";
	private static final String TITANIUM_NUGGET_NAME = "Titanium.Nugget";
	private static final String TITANIUM_DUST_NAME = "Titanium.Dust";
	private static final String TITANIUM_BLOCK_NAME = "Titanium.Block";
	private static final String RUTILE_NAME = "Rutile";
	private static final String RUTILE_INFERIOR_NAME = "Rutile.Inferior";
	private static final String ILMENITE_NAME = "Ilmenite";
	private static final String ILMENITE_INFERIOR_NAME = "Ilmenite.Inferior";

	public static void init() { new Titanium().doInit(); }
	
	private void doInit() { 
		OreCoreItems.rutile = OreCoreRegistration.registerBlock(new RutileBlock(IDs.RUTILE_ORE_ID), RUTILE_NAME);
		OreCoreItems.rutileInferior = OreCoreRegistration.registerBlock(new RutileBlockInferior(IDs.RUTILE_INFERIOR_ORE_ID), RUTILE_INFERIOR_NAME);
		OreCoreItems.ilmenite = OreCoreRegistration.registerBlock(new IlmeniteBlock(IDs.ILMENITE_ORE_ID), ILMENITE_NAME);
		OreCoreItems.ilmeniteInferior = OreCoreRegistration.registerBlock(new IlmeniteBlockInferior(IDs.ILMENITE_INFERIOR_ORE_ID), ILMENITE_INFERIOR_NAME);
		OreCoreItems.titaniumIngot = OreCoreRegistration.registerItem(new TitaniumIngot(IDs.TITANIUM_INGOT_ID), TITANIUM_INGOT_NAME);
		OreCoreItems.titaniumNugget = OreCoreRegistration.registerItem(new TitaniumNugget(IDs.TITANIUM_NUGGET_ID), TITANIUM_NUGGET_NAME);
		OreCoreItems.titaniumDust = OreCoreRegistration.registerItem(new TitaniumDust(IDs.TITANIUM_DUST_ID), TITANIUM_DUST_NAME);
		OreCoreItems.titaniumBlock = OreCoreRegistration.registerBlock(new TitaniumPureBlock(IDs.TITANIUM_BLOCK_ID), TITANIUM_BLOCK_NAME);

		OreDictionary.registerOre(DICT_DUST, OreCoreItems.titaniumDust);
		OreDictionary.registerOre(DICT_NUGGET, OreCoreItems.titaniumNugget);
		OreDictionary.registerOre(DICT_INGOT, OreCoreItems.titaniumIngot);
		OreDictionary.registerOre(DICT_PURE_BLOCK, OreCoreItems.titaniumBlock);

		OreCoreRegistration.nuggetToIngotStandard(DICT_NUGGET, OreCoreItems.titaniumIngot);
		OreCoreRegistration.ingotToNuggetStandard(DICT_INGOT, OreCoreItems.titaniumNugget);
		OreCoreRegistration.ingotToBlockStandard(DICT_INGOT, OreCoreItems.titaniumBlock);
		OreCoreRegistration.blockToIngotStandard(DICT_PURE_BLOCK, OreCoreItems.titaniumIngot);

		OreCoreRegistration.addSmelting(OreCoreItems.rutileInferior, OreCoreItems.titaniumNugget, 2);
		OreCoreRegistration.addSmelting(OreCoreItems.rutile, OreCoreItems.titaniumNugget, 4);
		OreCoreRegistration.addSmelting(OreCoreItems.ilmeniteInferior, OreCoreItems.titaniumNugget, 6);
		OreCoreRegistration.addSmelting(OreCoreItems.ilmenite, OreCoreItems.titaniumIngot, 1);
		OreCoreRegistration.addSmelting(OreCoreItems.titaniumDust, OreCoreItems.titaniumIngot, 1);
	}
	
}
