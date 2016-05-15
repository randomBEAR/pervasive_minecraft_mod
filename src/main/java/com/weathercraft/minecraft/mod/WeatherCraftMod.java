package com.weathercraft.minecraft.mod;

import com.weathercraft.minecraft.gui.RenderGuiHandler;
import com.weathercraft.minecraft.treegen.TemporizedTreeBlock;
import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;


/**
 * /////////////////////////////////////
 * Created by randomBEAR on 05/05/2016.
 * /////////////////////////////////////
 */

@Mod(modid = WeatherCraftMod.MODID, version = WeatherCraftMod.VERSION)
public class WeatherCraftMod {

    public static final String MODID = "WeatherCraft";
    public static final String VERSION = "0.01";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        TemporizedTreeBlock ttB = new TemporizedTreeBlock();
        if(event.getSide() == Side.CLIENT) {
            MinecraftForge.EVENT_BUS.register(new RenderGuiHandler());
        }
    }
}