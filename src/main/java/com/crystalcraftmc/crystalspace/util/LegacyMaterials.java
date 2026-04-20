package com.crystalcraftmc.crystalspace.util;

import org.bukkit.Material;

public final class LegacyMaterials {
    private LegacyMaterials() {}

    public static Material fromId(int id) {
        switch (id) {
            case 0: return Material.AIR;
            case 1: return Material.STONE;
            case 8:
            case 9: return Material.WATER;
            case 10:
            case 11: return Material.LAVA;
            case 17: return Material.OAK_LOG;
            case 18: return Material.OAK_LEAVES;
            case 20: return Material.GLASS;
            case 35: return Material.WHITE_WOOL;
            case 79: return Material.ICE;
            case 89: return Material.GLOWSTONE;
            case 102: return Material.GLASS_PANE;
            case 120: return Material.END_PORTAL_FRAME;
            default: return Material.AIR;
        }
    }
}
