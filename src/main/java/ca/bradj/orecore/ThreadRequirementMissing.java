package ca.bradj.orecore;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ThreadRequirementMissing extends Thread {
    private static Side threadSide;
    public static ThreadRequirementMissing INSTANCE;

    public ThreadRequirementMissing(Side threadSide)
    {
        super("OreCore Requirement Check Thread");
        this.setDaemon(true);
        ThreadRequirementMissing.threadSide = threadSide;
    }

    public static void beginCheck(Side threadSide)
    {
        INSTANCE = new ThreadRequirementMissing(threadSide);
        INSTANCE.start();
    }

    @Override
    public void run()
    {
        if (!Loader.isModLoaded("OreCoreMin"))
        {
            if (ThreadRequirementMissing.threadSide.isServer())
            {
                FMLCommonHandler.instance().getMinecraftServerInstance().logSevere("===================================================================");
                FMLCommonHandler.instance().getMinecraftServerInstance().logSevere("OreCore-Minimal not found in mods folder. OreCore will not load.");
                FMLCommonHandler.instance().getMinecraftServerInstance().logSevere("===================================================================");
            }
            else
            {
                ThreadRequirementMissing.openGuiClient();
            }
        }
    }

    @SideOnly(Side.CLIENT)
    private static void openGuiClient()
    {
        FMLClientHandler.instance().getClient().displayGuiScreen(new GuiMissingCore());
    }
}
