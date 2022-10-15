package com.bedless.spawnerplus.mainthread;

import co.aikar.commands.PaperCommandManager;
import com.bedless.spawnerplus.commands.MainCommand;
import com.bedless.spawnerplus.config.FormattedItemJSON;
import com.bedless.spawnerplus.events.MainEventHandler;
import com.bedless.spawnerplus.gui.SpawnerRecipeGUI;
import com.bedless.spawnerplus.gui.utils.SPInventoryHolder;
import com.bedless.spawnerplus.utils.MainUtils;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.UUID;

public final class SpawnerPlus extends JavaPlugin {

    private static SpawnerPlus instance;

    @Getter
    public PaperCommandManager pcm;

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
        Config.loadConfig(Config.Configs.ITEM);
        FormattedItemJSON.load();
    }

    @Override
    public void onDisable() {
        Config.save();
    }

    public void registerCommands() {
        new MainCommand();
    }

    public void registerEvents() {
        Bukkit.getPluginManager().registerEvents(new MainEventHandler(), this);
        new SpawnerRecipeGUI();
    }
}
