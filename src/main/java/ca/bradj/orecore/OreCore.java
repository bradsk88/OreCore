package ca.bradj.orecore;

import java.util.logging.Logger;

import org.apache.logging.log4j.core.config.Loggers;

import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = OreCore.MODID, version = OreCore.VERSION)
public class OreCore {
	
	@SidedProxy(clientSide="ca.bradj.orecore.ClientProxy", serverSide="ca.bradj.orecore.ServerProxy")
    public static CommonProxy proxy;
	
	private static final Logger LOGGER = Logger.getLogger("Minecraft");
	
	public static final String MODID = "OreCore";
	public static final String VERSION = "0.1";

	@Instance
	public static OreCore INSTANCE = new OreCore();

    /**
     * Run before anything else. Read your config, create blocks, items, etc, and
     * register them with the GameRegistry.
     */
    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        this.proxy.preInit(e);
    }
    
    /**
     * Do your mod setup. Build whatever data structures you care about. Register recipes.
     */
    @EventHandler
    public void init(FMLInitializationEvent e) {
        this.proxy.init(e);
    }

    /**
     * Handle interaction with other mods, complete your setup based on this.
     */
    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        this.proxy.postInit(e);
    }
    
}
