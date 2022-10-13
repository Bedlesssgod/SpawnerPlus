package com.bedless.spawnerplus.gui;

import com.bedless.spawnerplus.events.GUIItemClickEvent;
import com.bedless.spawnerplus.gui.utils.BaseGUI;
import com.bedless.spawnerplus.gui.utils.GuiPreset;
import com.bedless.spawnerplus.item.ItemBuilder;
import com.bedless.spawnerplus.item.ItemPresets;
import com.bedless.spawnerplus.mainthread.SpawnerPlus;
import com.bedless.spawnerplus.utils.Essence;
import com.bedless.spawnerplus.utils.SpawnerType;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class SpawnerRecipeGUI implements Listener {


    public SpawnerRecipeGUI() {
        Bukkit.getPluginManager().registerEvents(this, SpawnerPlus.getInstance());
    }

    public static void run(Player player) {
        BaseGUI baseGUI = new BaseGUI("RECIPE1", 9, 5, true, true, true, GuiPreset.BaseSpawnerRecipeGUI(
                Essence.getEssenceItemStack(Essence.SPIDER),
                SpawnerType.getSpawnerType(SpawnerType.SPIDER)
        ));

        baseGUI.openGUI(player);
    }

    @EventHandler
    public void inventoryClickListener(GUIItemClickEvent event) {
        if(event.getClickedItem() == null) return;
        if (!event.getClickedItem().getItemMeta().getLocalizedName().equalsIgnoreCase("EXIT")) {
        }
    }

}
