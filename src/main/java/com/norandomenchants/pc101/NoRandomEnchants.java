package com.norandomenchants.pc101;

import com.norandomenchants.pc101.tabs.NoRandomEnchantsTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import com.norandomenchants.pc101.proxy.CommonProxy;
import com.norandomenchants.pc101.util.Reference;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, name = Reference.NAME) //maybe add modLanguageAdapter and updateJSON which are mentioned in the forge documentation
public class NoRandomEnchants
{
    @Instance
    public static NoRandomEnchants instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final CreativeTabs NORANDOMENCHANTSTAB = new NoRandomEnchantsTab("norandomenchants");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event)
    {

    }
}