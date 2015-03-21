package ca.bradj.orecore;

import java.net.URI;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class GuiMissingCore extends GuiScreen {
    private int urlX;
    private int urlY;
    private int urlWidth;
    private int urlHeight;

    @Override
    public void initGui()
    {
        super.initGui();
    }

    @Override
    public void drawScreen(int par1, int par2, float par3)
    {
        this.drawDefaultBackground();
        int offset = this.height / 2 - 50;
        this.drawCenteredString(this.fontRendererObj, StatCollector.translateToLocal("gui.missingCoreMin.name.0"), this.width / 2, offset, 0xFF5555);
        offset += 25;
        this.drawCenteredString(this.fontRendererObj, StatCollector.translateToLocal("gui.missingCoreMin.name.1"), this.width / 2, offset, 0xFF5555);
        offset += 20;
        this.drawCenteredString(this.fontRendererObj, StatCollector.translateToLocal("gui.missingCoreMin.name.2"), this.width / 2, offset, 0x999999);
        offset += 20;
        String s = EnumChatFormatting.UNDERLINE + StatCollector.translateToLocal("gui.missingCore.name.3");
        this.urlX = this.width / 2 - this.fontRendererObj.getStringWidth(s) / 2 - 10;
        this.urlY = offset - 2;
        this.urlWidth = this.fontRendererObj.getStringWidth(s) + 20;
        this.urlHeight = 14;
        Gui.drawRect(this.urlX, this.urlY, this.urlX + this.urlWidth, this.urlY + this.urlHeight, 0xFF0000);
        this.drawCenteredString(this.fontRendererObj, s, this.width / 2, offset, 0x999999);
    }

    @Override
    protected void keyTyped(char par1, int par2)
    {
    }

    public void actionPerformed()
    {
        this.actionPerformed(null);
    }

    @Override
    protected void actionPerformed(GuiButton par1GuiButton)
    {
        FMLClientHandler.instance().getClient().displayGuiScreen((GuiScreen) null);
    }

    @Override
    protected void mouseClicked(int x, int y, int which)
    {
        if (x > this.urlX && x < this.urlX + this.urlWidth && y > this.urlY && y < this.urlY + this.urlHeight)
        {
            try
            {
                Class<?> oclass = Class.forName("java.awt.Desktop");
                Object object = oclass.getMethod("getDesktop", new Class[0]).invoke((Object) null, new Object[0]);
                oclass.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { new URI("http://micdoodle8.com/mods/galacticraft/downloads") });
            }
            catch (Throwable throwable)
            {
                throwable.printStackTrace();
            }
        }
    }
}