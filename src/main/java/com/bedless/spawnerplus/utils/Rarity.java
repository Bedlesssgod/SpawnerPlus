package com.bedless.spawnerplus.utils;

public enum Rarity {
    COMMON,
    UNCOMMON,
    RARE,
    EPIC,
    LEGENDARY,
    MYTHIC;

    public static String getRarityInfo(Rarity rarity) {
        if (rarity == COMMON) {
            return "§f§lCOMMON";
        } else if (rarity == UNCOMMON) {
            return "§a§lUNCOMMON";
        } else if (rarity == RARE) {
            return "§1§lRARE";
        } else if (rarity == EPIC) {
            return "§5§lEPIC";
        } else if (rarity == LEGENDARY) {
            return "§6§lLEGENDARY";
        } else if (rarity == MYTHIC) {
            return "§d§lMYTHIC";
        } else {
            return "§4§lUNKOWN RARITY";
        }
    }

}
