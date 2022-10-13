package com.bedless.spawnerplus.gui.utils;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import javax.annotation.Nullable;

public class SPInventoryHolder {

    public InventoryHolder inventoryHolder() {
        return new InventoryHolder() {
            @Override
            @Nullable
            public Inventory getInventory() {
                return null;
            }

            public InventoryHolder getInventoryHolder() {
                return this;
            }
        };
    }

}
