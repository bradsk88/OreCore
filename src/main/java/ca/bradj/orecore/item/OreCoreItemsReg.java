package ca.bradj.orecore.item;

import ca.bradj.orecore.item.brass.BrassDust;
import ca.bradj.orecore.item.brass.BrassIngot;
import ca.bradj.orecore.item.brass.BrassNugget;
import ca.bradj.orecore.item.brass.BrassPureBlock;
import ca.bradj.orecore.item.bronze.BronzeDust;
import ca.bradj.orecore.item.bronze.BronzeIngot;
import ca.bradj.orecore.item.bronze.BronzeNugget;
import ca.bradj.orecore.item.bronze.BronzePureBlock;
import ca.bradj.orecore.item.iron_manganese.IronManganeseBlock;
import ca.bradj.orecore.item.lead.LeadBlock;
import ca.bradj.orecore.item.lead.LeadBlockInferior;
import ca.bradj.orecore.item.lead.LeadDust;
import ca.bradj.orecore.item.lead.LeadGravel;
import ca.bradj.orecore.item.lead.LeadIngot;
import ca.bradj.orecore.item.lead.LeadNugget;
import ca.bradj.orecore.item.lead.LeadPureBlock;
import ca.bradj.orecore.item.manganese.ManganeseDust;
import ca.bradj.orecore.item.manganese.ManganeseIngot;
import ca.bradj.orecore.item.manganese.ManganeseNugget;
import ca.bradj.orecore.item.manganese.ManganesePureBlock;
import ca.bradj.orecore.item.nickel.NickelBlock;
import ca.bradj.orecore.item.nickel.NickelBlockInferior;
import ca.bradj.orecore.item.nickel.NickelDust;
import ca.bradj.orecore.item.nickel.NickelGravel;
import ca.bradj.orecore.item.nickel.NickelIngot;
import ca.bradj.orecore.item.nickel.NickelNugget;
import ca.bradj.orecore.item.nickel.NickelPureBlock;
import ca.bradj.orecore.item.osmium.OsmiumBlock;
import ca.bradj.orecore.item.osmium.OsmiumBlockInferior;
import ca.bradj.orecore.item.osmium.OsmiumDust;
import ca.bradj.orecore.item.osmium.OsmiumGravel;
import ca.bradj.orecore.item.osmium.OsmiumIngot;
import ca.bradj.orecore.item.osmium.OsmiumNugget;
import ca.bradj.orecore.item.osmium.OsmiumPureBlock;
import ca.bradj.orecore.item.silver.SilverBlock;
import ca.bradj.orecore.item.silver.SilverBlockInferior;
import ca.bradj.orecore.item.silver.SilverDust;
import ca.bradj.orecore.item.silver.SilverGravel;
import ca.bradj.orecore.item.silver.SilverIngot;
import ca.bradj.orecore.item.silver.SilverNugget;
import ca.bradj.orecore.item.silver.SilverPureBlock;
import ca.bradj.orecore.item.steel.SteelDust;
import ca.bradj.orecore.item.steel.SteelIngot;
import ca.bradj.orecore.item.steel.SteelNugget;
import ca.bradj.orecore.item.steel.SteelPureBlock;
import ca.bradj.orecore.item.titanium.IlmeniteBlock;
import ca.bradj.orecore.item.titanium.IlmeniteBlockInferior;
import ca.bradj.orecore.item.titanium.RutileBlock;
import ca.bradj.orecore.item.titanium.RutileBlockInferior;
import ca.bradj.orecore.item.titanium.TitaniumDust;
import ca.bradj.orecore.item.titanium.TitaniumIngot;
import ca.bradj.orecore.item.titanium.TitaniumNugget;
import ca.bradj.orecore.item.titanium.TitaniumPureBlock;
import ca.bradj.orecore.item.zinc.ZincBlock;
import ca.bradj.orecore.item.zinc.ZincBlockInferior;
import ca.bradj.orecore.item.zinc.ZincDust;
import ca.bradj.orecore.item.zinc.ZincGravel;
import ca.bradj.orecore.item.zinc.ZincIngot;
import ca.bradj.orecore.item.zinc.ZincNugget;
import ca.bradj.orecore.item.zinc.ZincPureBlock;

/**
 * Centralized location for all OreCore item registration.
 */
class OreCoreItemsReg {

    static OsmiumBlock osmium;
    static OsmiumBlockInferior osmiumInferior;
    static OsmiumIngot osmiumIngot;
    static OsmiumNugget osmiumNugget;
    static OsmiumGravel osmiumGravel;
    static OsmiumDust osmiumDust;
    static OsmiumPureBlock osmiumBlock;

    static IronManganeseBlock ironManganese;

    static ManganeseDust manganeseDust;
    static ManganeseNugget manganeseNugget;
    static ManganeseIngot manganeseIngot;
    static ManganesePureBlock manganeseBlock;

    static SteelDust steelDust;
    static SteelIngot steelIngot;
    static SteelNugget steelNugget;
    static SteelPureBlock steelBlock;

    static BronzeDust bronzeDust;
    static BronzeIngot bronzeIngot;
    static BronzeNugget bronzeNugget;
    static BronzePureBlock bronzeBlock;

    static SilverBlock silver;
    static SilverBlockInferior silverInferior;
    static SilverIngot silverIngot;
    static SilverNugget silverNugget;
    static SilverDust silverDust;
    static SilverGravel silverGravel;
    static SilverPureBlock silverBlock;

    static BrassDust brassDust;
    static BrassIngot brassIngot;
    static BrassNugget brassNugget;
    static BrassPureBlock brassBlock;

    static NickelBlock nickel;
    static NickelBlockInferior nickelInferior;
    static NickelIngot nickelIngot;
    static NickelNugget nickelNugget;
    static NickelDust nickelDust;
    static NickelGravel nickelGravel;
    static NickelPureBlock nickelBlock;

    static ZincBlock zinc;
    static ZincBlockInferior zincInferior;
    static ZincIngot zincIngot;
    static ZincNugget zincNugget;
    static ZincDust zincDust;
    static ZincGravel zincGravel;
    static ZincPureBlock zincBlock;

    static LeadBlock lead;
    static LeadBlockInferior leadInferior;
    static LeadIngot leadIngot;
    static LeadNugget leadNugget;
    static LeadDust leadDust;
    static LeadGravel leadGravel;
    static LeadPureBlock leadBlock;

    static RutileBlock rutile;
    static RutileBlockInferior rutileInferior;
    static IlmeniteBlock ilmenite;
    static IlmeniteBlockInferior ilmeniteInferior;
    static TitaniumIngot titaniumIngot;
    static TitaniumNugget titaniumNugget;
    static TitaniumDust titaniumDust;
    static TitaniumPureBlock titaniumBlock;

    static void preInit() {
        Brass.preInit();
        Bronze.preInit();
        IronManganese.preInit();
        Lead.preInit();
        Manganese.preInit();
        Nickel.preInit();
        Osmium.preInit();
        Silver.preInit();
        Steel.preInit();
        Titanium.preInit();
        Zinc.preInit();
    }

    static final void init() {
        Brass.init();
        Bronze.init();
        IronManganese.init();
        Lead.init();
        Manganese.init();
        Nickel.init();
        Osmium.init();
        Silver.init();
        Steel.init();
        Titanium.init();
        Zinc.init();
    }

}
