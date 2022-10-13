package com.bedless.spawnerplus.events;


import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUIItemClickEvent extends Event implements Cancellable {

    private static final HandlerList handlers = new HandlerList();
    private final Player player;
    private final ItemStack clickedItem;
    private final boolean isCancelled;
    private final Inventory clickedInventory;

    public GUIItemClickEvent(Player player, ItemStack clickedItem, Inventory clickedInventory) {
        this.player = player;
        this.clickedItem = clickedItem;
        this.isCancelled = false;
        this.clickedInventory = clickedInventory;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    @Override
    public void setCancelled(boolean cancel) {

    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public Player getPlayer() {
        return this.player;
    }

    public ItemStack getClickedItem() {
        return this.clickedItem;
    }

    public Inventory getClickedInventory() {
        return clickedInventory;
    }
}
