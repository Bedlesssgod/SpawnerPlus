package com.bedless.spawnerplus.mainthread;

import com.bedless.spawnerplus.config.ItemConfigManager;
import com.bedless.spawnerplus.utils.MainUtils;
import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class ConfigHandler {

    @Getter
    private static FileConfiguration itemConfig;

    @Getter
    private static File itemConfigFile;

    @Getter
    private static ItemConfigManager itemConfigManager;

    public ConfigHandler(){
        itemConfigFile = new File("plugins/SpawnersPlus", "items.yml");
        itemConfig = YamlConfiguration.loadConfiguration(itemConfigFile);
        try {
            loadItemConfiguration();
        } catch (IOException ex){
            MainUtils.sendMessageToAllDebug(ChatColor.RED + "Failed To Save Configuration!");
        }
        itemConfigManager = new ItemConfigManager();
    }

    private void loadItemConfiguration() throws IOException {
        itemConfig.options().copyDefaults(true);
        itemConfig.addDefault("SPAWNER", "PlaceHolders: None");
        itemConfig.addDefault("SPAWNER_SKELETON_NAME", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_1", "");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_2", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_3", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_4", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_5", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_6", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_7", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_8", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_9", "Skeleton Spawner");
        itemConfig.addDefault("SPAWNER_SKELETON_DESCRIPTION_10", "Skeleton Spawner");

        itemConfig.addDefault("ESSENCE", "PlaceHolders: ${ITEM_RARITY_COLOR} | ${EMPTY_LINE} | ${ITEM_RARITY} | ${NULL_LINE}");
        itemConfig.addDefault("ESSENCE_SKELETON_NAME", "${ITEM_RARITY_COLOR} Skeleton Essence");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_1", "&7Extremly Rare Item,");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_2", "&7Obtained by Killing");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_3", "&7Skeletons");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_4", "${EMPTY_LINE}");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_5", "&5Right-Click to View");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_6", "&5Recipes!");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_7", "${EMPTY_LINE}");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_8", "${ITEM_RARITY}");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_9", "${NULL_LINE}");
        itemConfig.addDefault("ESSENCE_SKELETON_DESCRIPTION_10", "${NULL_LINE}");


        try {
            itemConfig.save(itemConfigFile);
        } catch (IOException ex){
            File error = new File("plugins/SpawnersPlus", System.currentTimeMillis() + " BROKENFILE");
            FileConfiguration errorConf = YamlConfiguration.loadConfiguration(error);
            errorConf.addDefaults(itemConfig.getDefaults());
            errorConf.save(error);
            ex.printStackTrace();
        }
    }

}
