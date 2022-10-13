package com.bedless.spawnerplus.item;

import com.bedless.spawnerplus.utils.Rarity;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ItemPresets {

    public static ItemStack getSpawnerShard() {
        return ItemBuilder.createItem("&6&lSpawner Shard"
                , "SPAWNER_SHARD_SP"
                , Material.PRISMARINE_SHARD
                , true
                , true
                , "§7Obtained by mining Spawners with the"
                , "§6§lSpawner-Miner"
                , "§7"
                , "§eRight-Click To View Recipes!"
                , Rarity.getRarityInfo(Rarity.LEGENDARY));
    }

    public static ItemStack[] getAllItemStacks(){
        return new ItemStack[]{
                getEndermanSpawner(),
                getSkeletonEssence(),
                getZombieEssence(),
                getSpiderEssence()
        };
    }

    public static ItemStack getZombieSpawner() {
        return ItemBuilder.createItem("&6&lZombie Spawner", "SPAWNER_ZOMBIE", Material.SPAWNER, true,true,  
                "yes"

        );
    }

    public static ItemStack getSkeletonSpawner() {
        return ItemBuilder.createItem("&6&lSkeleton Spawner", "SPAWNER_SKELETON",Material.SPAWNER, true,true,
                "§7Extremely Rare Item,",
                "§7Dropped by Killing Skeletons",
                "§7",
                "§eRight-Click to",
                "§eView Recipes!",
                "§7",
                Rarity.getRarityInfo(Rarity.EPIC)
        );
    }

    public static ItemStack getEndermanSpawner() {
        return ItemBuilder.createItem("&6&lEnderman Spawner", "SPAWNER_ENDERMAN",Material.SPAWNER, true, true, "yes");
    }

    public static ItemStack getSpiderSpawner() {
        return ItemBuilder.createItem("&6&lSpider Spawner", "SPAWNER_SPIDER",Material.SPAWNER, true, true, "yes");
    }

    /*Essence*/

    public static ItemStack getZombieEssence() {
        return ItemBuilder.createItem("&5&lZombie Essence", "ESSENCE_ZOMBIE",Material.ORANGE_DYE, true,true
                ,"§7Extremely Rare Item,"
                ,"§7Obtained by Killing Zombies"
                ,"§7"
                ,"§eRight-Click to"
                ,"§eView Recipes!"
                ,"§7"
                ,Rarity.getRarityInfo(Rarity.EPIC)
        );
    }

    public static ItemStack getSkeletonEssence() {
        return ItemBuilder.createItem("&5&lSkeleton Essence", "ESSENCE_SKELETON",Material.WHITE_DYE, true,true
                ,"§7Extremely Rare Item,"
                ,"§7Obtained by Killing Skeletons"
                ,"§7"
                ,"§eRight-Click to"
                ,"§eView Recipes!"
                ,"§7"
                ,Rarity.getRarityInfo(Rarity.EPIC)
        );
    }

    public static ItemStack getEndermanEssence() {
        return ItemBuilder.createItem("&5&lEnderman Essence", "ESSENCE_ENDERMAN",Material.PURPLE_DYE, true, true
                ,"§7Extremely Rare Item,"
                ,"§7Obtained by Killing Endermen"
                ,"§7"
                ,"§eRight-Click to"
                ,"§eView Recipes!"
                ,"§7"
                ,Rarity.getRarityInfo(Rarity.EPIC)
        );
    }

    public static ItemStack getSpiderEssence() {
        return ItemBuilder.createItem("&5&lSpider Essence", "ESSENCE_SPIDER",Material.RED_DYE, true, true
                ,"§7Extremely Rare Item,"
                ,"§7Obtained by Killing Spiders"
                ,"§7"
                ,"§eRight-Click to"
                ,"§eView Recipes!"
                ,"§7"
                ,Rarity.getRarityInfo(Rarity.EPIC)
        );
    }
}
