package com.bedless.spawnerplus.utils;

import com.bedless.spawnerplus.item.ItemPresets;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public enum Essence {
    SKELETON, ZOMBIE, SPIDER, ENDERMAN;

    public static ItemStack getEssenceItemStack(Essence essence) {
        return switch (essence.name()) {
            case "SKELETON" -> ItemPresets.getSkeletonEssence();
            case "SPIDER" -> ItemPresets.getSpiderEssence();
            case "ENDERMAN" -> ItemPresets.getEndermanEssence();
            default -> ItemPresets.getZombieEssence();
        };
    }

    public static String getEssenceName(Essence essence) {
        return switch (essence.name()) {
            case "SKELETON" -> "Skeleton Essence";
            case "SPIDER" -> "Spider Essence";
            case "ENDERMAN" -> "Enderman Essence";
            default -> "Zombie Essence";
        };
    }

    public static String getLocalizedName(Essence essence) {
        return switch (essence.name()) {
            case "SKELETON" -> "SKELETON_ESSENCE";
            case "SPIDER" -> "SPIDER_ESSENCE";
            case "ENDERMAN" -> "ENDERMAN_ESSENCE";
            default -> "ZOMBIE_ESSENCE";
        };
    }

    public static Material getEssenceItem(Essence essence){
        return switch (essence.name()) {
            case "SKELETON" -> Material.LIGHT_GRAY_DYE;
            case "SPIDER" -> Material.RED_DYE;
            case "ENDERMAN" -> Material.LIGHT_BLUE_DYE;
            default -> Material.BROWN_DYE;
        };
    }
}
