package com.bedless.spawnerplus.gui.utils;

import com.bedless.spawnerplus.events.SpawnerPlusEventManager;
import com.bedless.spawnerplus.mainthread.SpawnerPlus;
import com.bedless.spawnerplus.utils.MainUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class BaseGUI implements Listener {
    private final String GUIName;
    private final int GUIWidth;
    private final int GUIHeight;
    private final HashMap<Integer, ItemStack> GUIContents;
    private final boolean cancelGUIClicks;
    private final boolean cancelGUIDrags;
    private final boolean notifyEvents;

    private final Inventory inv;

    public BaseGUI(String GUIName, int GUIWidth, int GUIHeight, boolean cancelGUIDrags, boolean cancelGUIClicks, boolean notifyEvents, HashMap<Integer, ItemStack> GUIContents) {
        this.GUIName = GUIName;
        this.GUIWidth = GUIWidth;
        this.GUIHeight = GUIHeight;
        this.GUIContents = GUIContents;
        this.cancelGUIDrags = cancelGUIDrags;
        this.cancelGUIClicks = cancelGUIClicks;
        this.notifyEvents = notifyEvents;
        inv = Bukkit.createInventory(SpawnerPlus.getInstance().getInventoryHolder().inventoryHolder(), GUIWidth * GUIHeight, MainUtils.translate(GUIName));
        GuiBuilder.fillInventory(GUIContents, inv);
        Bukkit.getPluginManager().registerEvents(this, SpawnerPlus.getInstance());
    }

    @EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {
        if (!cancelGUIClicks) return;
        try {
            if (!(e.getClickedInventory()).getHolder().toString().toLowerCase().contains("com.bedless.spawnerplus.gui.utils.spinventoryholder"))
                return;
            if (!e.getInventory().getViewers().contains(e.getWhoClicked())) return;
            e.setCancelled(true);
            if (!notifyEvents) return;
            SpawnerPlusEventManager.callGUIClickEvent((Player) e.getWhoClicked(), e.getCurrentItem(), e.getClickedInventory());
        } catch (NullPointerException ex) {
            //Do Nothing, Ignore
        }
    }

    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (!cancelGUIDrags) return;
        try {
            if (!(e.getInventory().getHolder().toString().toLowerCase().contains("com.bedless.spawnerplus.gui.utils.spinventoryholder")))
                return;
            if (!e.getInventory().getViewers().contains(e.getWhoClicked())) return;
            e.getCursor().setType(Material.AIR);
            e.setCancelled(true);
        } catch (NullPointerException ex) {
            //Do Nothing, Ignore
        }
    }

    public void openGUI(Player player) {
        player.openInventory(inv);
    }


}
