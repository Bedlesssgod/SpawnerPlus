package com.bedless.spawnerplus.mainthread;

import co.aikar.commands.PaperCommandManager;
import com.bedless.spawnerplus.commands.MainCommand;
import com.bedless.spawnerplus.events.MainEventHandler;
import com.bedless.spawnerplus.gui.SpawnerRecipeGUI;
import com.bedless.spawnerplus.gui.utils.SPInventoryHolder;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.UUID;

import com.bedless.spawnerplus.mainthread.ConfigHandler;
public final class SpawnerPlus extends JavaPlugin {

    private static SpawnerPlus instance;

    @Getter
    public PaperCommandManager pcm;

    @Getter
    ConfigHandler configHandler = new ConfigHandler();

    @Getter
    SPInventoryHolder inventoryHolder;

    @Getter
    @Setter
    ArrayList<UUID> inDebug = new ArrayList<>();


    @Getter
    @Setter
    String prefix = "§8§l[§6Spawners-Plus§8§l] §r";

    @Getter
    String openRecipeBase = getPrefix() + ChatColor.GOLD + "Opening Recipe " + ChatColor.RED + "${RECIPE_NAME}$" + ChatColor.GOLD + "!";

    @Getter
    @Setter
    String debugPrefix = "§8§l[§7§lDEBUG§8§l] §r";

    public static SpawnerPlus getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        pcm = new PaperCommandManager(this);
        inventoryHolder = new SPInventoryHolder();
        registerEvents();
        registerCommands();
        Bukkit.getConsoleSender().sendMessage(
                "Spawners" + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonName() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription1() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription2() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription3() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription4() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription5() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription6() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription7() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription8() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription9() + "\n" +
               ConfigHandler.getItemConfigManager().getSpawnerSkeletonDescription10() +  "\n" +
                "Essence" + "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonName() + "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription1() + "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription2() + "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription3() +  "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription4() +  "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription5() + "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription6() + "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription7() +  "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription8() +  "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription9() +  "\n" +
               ConfigHandler.getItemConfigManager().getEssenceSkeletonDescription10()
        );
    }

    @Override
    public void onDisable() {

    }

    public void registerCommands() {
        new MainCommand();
    }

    public void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new MainEventHandler(), this);
        new SpawnerRecipeGUI();
    }
}
