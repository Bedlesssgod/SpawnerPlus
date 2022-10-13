package com.bedless.spawnerplus.gui.utils;

import com.bedless.spawnerplus.utils.MainUtils;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class GuiBuilder {

    public static void fillInventory(HashMap<Integer, ItemStack> allItems, Inventory inv) {
        try {
            int i = 0;
            while (i != allItems.size()) {
                for (ItemStack item : allItems.values()) {
                    if (item.getItemMeta().getDisplayName().equalsIgnoreCase("{AIR}"))
                        inv.setItem(i, new ItemStack(Material.AIR));
                    if (item.getType() != Material.ACACIA_BOAT) inv.setItem(i, item);
                    MainUtils.sendMessageToAllDebug("Type: " + item.getType());
                    MainUtils.sendMessageToAllDebug("Name: " + item.getItemMeta().getDisplayName());
                    i++;
                }
            }
        } catch (NullPointerException ex) {
            /*Prevents Error*/
        }

    }

}
