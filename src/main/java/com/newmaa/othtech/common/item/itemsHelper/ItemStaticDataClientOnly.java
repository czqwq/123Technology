package com.newmaa.othtech.common.item.itemsHelper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import net.minecraft.util.IIcon;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ItemStaticDataClientOnly {

    @SideOnly(Side.CLIENT)
    public static Map<Integer, IIcon> iconsMap01 = new ConcurrentHashMap<>();
    @SideOnly(Side.CLIENT)
    public static Map<Integer, IIcon> iconsMap02 = new ConcurrentHashMap<>();
    @SideOnly(Side.CLIENT)
    public static Map<Integer, IIcon> iconsMapRune = new ConcurrentHashMap<>();
    @SideOnly(Side.CLIENT)
    public static Map<Integer, IIcon> iconsMapIzumik = new ConcurrentHashMap<>();

    /**
     * @param aMetaName The Name of the Icon.
     * @return Return the Path of the Icon.
     */
    @SideOnly(Side.CLIENT)
    public static String getIconPath01(String aMetaName) {
        return "gtnhcommunitymod:MetaItem01/" + aMetaName;
    }

}
