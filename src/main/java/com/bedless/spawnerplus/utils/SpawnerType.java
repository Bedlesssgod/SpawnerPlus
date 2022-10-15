package com.bedless.spawnerplus.utils;

import com.bedless.spawnerplus.item.ItemPresets;
import org.bukkit.inventory.ItemStack;

public enum SpawnerType {
    SKELETON, ZOMBIE, SPIDER, ENDERMAN;

    public static ItemStack getSpawnerType(SpawnerType spawnerType) {
        return switch (spawnerType.name()) {
            case "SKELETON" -> ItemPresets.getSkeletonSpawner();
            case "SPIDER" -> ItemPresets.getSpiderSpawner();
            case "ENDERMAN" -> ItemPresets.getEndermanSpawner();
            default -> ItemPresets.getZombieSpawner();
        };
    }

    public static String getSpawnerName(Essence essence) {
        return switch (essence.name()) {
            case "SKELETON" -> "Skeleton Spawner";
            case "SPIDER" -> "Spider Spawner";
            case "ENDERMAN" -> "Enderman Spawner";
            default -> "Zombie Spawner";
        };
    }

    public static String getLocalizedName(SpawnerType spawnerType){
        return switch (spawnerType.name()) {
            case "SKELETON" -> "SKELETON_SPAWNER";
            case "SPIDER" -> "SPIDER_SPAWNER";
            case "ENDERMAN" -> "ENDERMAN_SPAWNER";
            default -> "ZOMBIE_SPAWNER";
        };
    }
}
