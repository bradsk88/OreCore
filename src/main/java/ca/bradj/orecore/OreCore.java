package ca.bradj.orecore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import ca.bradj.orecore.item.OreCoreItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = OreCore.MODID, version = OreCore.VERSION, dependencies = "required-after:OreCoreMin@[1.0.2,)")
public class OreCore {

	@SidedProxy(clientSide="ca.bradj.orecore.ClientProxy", serverSide="ca.bradj.orecore.ServerProxy")
    public static CommonProxy proxy;

	public static final String MODID = "OreCore";
	public static final String VERSION = "2.1.0";

	public static CreativeTabs tabOreCore = new CreativeTabs("tabOreCore") {
	    @Override
	    @SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return OreCoreItems.osmium().asIngot();
	    }
	};

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and
     * register them with the GameRegistry.
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        OreCore.proxy.preInit(e);
    }

    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes.
     */
    @EventHandler
    public void init(@SuppressWarnings("unused") FMLInitializationEvent e) {
    	OreCore.proxy.init();
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    @EventHandler
    public void postInit(@SuppressWarnings("unused") FMLPostInitializationEvent e) {
    	OreCore.proxy.postInit();
    }

}
