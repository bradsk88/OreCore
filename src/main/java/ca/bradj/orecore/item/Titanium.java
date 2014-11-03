package ca.bradj.orecore.item;

import net.minecraftforge.oredict.OreDictionary;
import ca.bradj.forge.OreCoreRegistration;
import ca.bradj.orecore.item.titanium.IlmeniteBlock;
import ca.bradj.orecore.item.titanium.IlmeniteBlockInferior;
import ca.bradj.orecore.item.titanium.RutileBlock;
import ca.bradj.orecore.item.titanium.RutileBlockInferior;
import ca.bradj.orecore.item.titanium.TitaniumDust;
import ca.bradj.orecore.item.titanium.TitaniumIngot;
import ca.bradj.orecore.item.titanium.TitaniumNugget;
import ca.bradj.orecore.item.titanium.TitaniumPureBlock;

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

    private static Titanium INSTANCE;

    private static Titanium getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Titanium();
        }
        return INSTANCE;
    }

    public static void init() {
        getInstance().doInit();
    }

    public static void preInit() {
        getInstance().doPreInit();
    }

    public void doPreInit() {
        OreCoreItemsReg.rutile = OreCoreRegistration.registerBlock(new RutileBlock(), RUTILE_NAME);
        OreCoreItemsReg.rutileInferior = OreCoreRegistration.registerBlock(new RutileBlockInferior(), RUTILE_INFERIOR_NAME);
        OreCoreItemsReg.ilmenite = OreCoreRegistration.registerBlock(new IlmeniteBlock(), ILMENITE_NAME);
        OreCoreItemsReg.ilmeniteInferior = OreCoreRegistration.registerBlock(new IlmeniteBlockInferior(), ILMENITE_INFERIOR_NAME);
        OreCoreItemsReg.titaniumIngot = OreCoreRegistration.registerItem(new TitaniumIngot(), TITANIUM_INGOT_NAME);
        OreCoreItemsReg.titaniumNugget = OreCoreRegistration.registerItem(new TitaniumNugget(), TITANIUM_NUGGET_NAME);
        OreCoreItemsReg.titaniumDust = OreCoreRegistration.registerItem(new TitaniumDust(), TITANIUM_DUST_NAME);
        OreCoreItemsReg.titaniumBlock = OreCoreRegistration.registerBlock(new TitaniumPureBlock(), TITANIUM_BLOCK_NAME);

        OreDictionary.registerOre(DICT_DUST, OreCoreItemsReg.titaniumDust);
        OreDictionary.registerOre(DICT_NUGGET, OreCoreItemsReg.titaniumNugget);
        OreDictionary.registerOre(DICT_INGOT, OreCoreItemsReg.titaniumIngot);
        OreDictionary.registerOre(DICT_PURE_BLOCK, OreCoreItemsReg.titaniumBlock);
    }

    private void doInit() {
        OreCoreRegistration.nuggetToIngotStandard(DICT_NUGGET, OreCoreItemsReg.titaniumIngot);
        OreCoreRegistration.ingotToNuggetStandard(DICT_INGOT, OreCoreItemsReg.titaniumNugget);
        OreCoreRegistration.ingotToBlockStandard(DICT_INGOT, OreCoreItemsReg.titaniumBlock);
        OreCoreRegistration.blockToIngotStandard(DICT_PURE_BLOCK, OreCoreItemsReg.titaniumIngot);

        OreCoreRegistration.addSmelting(OreCoreItemsReg.rutileInferior, OreCoreItemsReg.titaniumNugget, 2);
        OreCoreRegistration.addSmelting(OreCoreItemsReg.rutile, OreCoreItemsReg.titaniumNugget, 4);
        OreCoreRegistration.addSmelting(OreCoreItemsReg.ilmeniteInferior, OreCoreItemsReg.titaniumNugget, 6);
        OreCoreRegistration.addSmelting(OreCoreItemsReg.ilmenite, OreCoreItemsReg.titaniumIngot, 1);
        OreCoreRegistration.addSmelting(OreCoreItemsReg.titaniumDust, OreCoreItemsReg.titaniumIngot, 1);
    }

}
