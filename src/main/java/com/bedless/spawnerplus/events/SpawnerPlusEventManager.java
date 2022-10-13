package com.bedless.spawnerplus.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SpawnerPlusEventManager {

    public static void callGUIClickEvent(Player player, ItemStack clickedItem, Inventory clickedInventory) {
        GUIItemClickEvent event = new GUIItemClickEvent(player, clickedItem, clickedInventory);
        Bukkit.getPluginManager().callEvent(event);
    }

}
