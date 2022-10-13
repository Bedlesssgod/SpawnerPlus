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
}
