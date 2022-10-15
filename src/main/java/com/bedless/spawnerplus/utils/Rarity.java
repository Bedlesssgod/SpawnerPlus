package com.bedless.spawnerplus.utils;

import org.bukkit.ChatColor;

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

    public static String getRarityColor(Rarity rarity){
        if (rarity == COMMON) {
            return ChatColor.WHITE + "" + ChatColor.BOLD;
        } else if (rarity == UNCOMMON) {
            return ChatColor.GREEN + "" + ChatColor.BOLD;
        } else if (rarity == RARE) {
            return ChatColor.BLUE + "" + ChatColor.BOLD;
        } else if (rarity == EPIC) {
            return ChatColor.DARK_PURPLE + "" + ChatColor.BOLD;
        } else if (rarity == LEGENDARY) {
            return ChatColor.GOLD + "" + ChatColor.BOLD;
        } else if (rarity == MYTHIC) {
            return ChatColor.LIGHT_PURPLE + "" + ChatColor.BOLD;
        } else {
            return ChatColor.DARK_RED + "" + ChatColor.BOLD;
        }
    }

}
