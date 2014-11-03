package ca.bradj.orecore;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiMainMenu;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;

public class TickHandlerClient {


    private static ThreadRequirementMissing missingRequirementThread;

    @SubscribeEvent
    public void onClientTick(@SuppressWarnings("unused") ClientTickEvent event) {
        final Minecraft minecraft = FMLClientHandler.instance().getClient();
        if (minecraft.currentScreen != null && minecraft.currentScreen instanceof GuiMainMenu)
        {
            if (TickHandlerClient.missingRequirementThread == null)
            {
                TickHandlerClient.missingRequirementThread = new ThreadRequirementMissing(FMLCommonHandler.instance().getEffectiveSide());
                TickHandlerClient.missingRequirementThread.start();
            }
        }

    }

}
