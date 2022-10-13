package com.bedless.spawnerplus.events;

import com.bedless.spawnerplus.gui.SpawnerRecipeGUI;
import com.bedless.spawnerplus.item.ItemPresets;
import com.bedless.spawnerplus.mainthread.SpawnerPlus;
import com.bedless.spawnerplus.utils.MainUtils;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class MainEventHandler implements Listener {

    @EventHandler
    @Deprecated
    public void onBlockBreakEvent(BlockBreakEvent event) {
        if (event.getBlock().getType() == null) return;
        if (event.getBlock().getType() != Material.SPAWNER) return;
        event.getPlayer().getInventory().addItem(ItemPresets.getSpawnerShard());
        MainUtils.sendModifiedMessage(event.getPlayer(),
                SpawnerPlus.getInstance().getPrefix() + ChatColor.GOLD + "You have obtained " + ChatColor.RED + "Spawner Shard" + ChatColor.GOLD + "!",
                true,
                "sp recipe spawner",
                true,
                "&6&lClick on this Message to see Possible Recipes, with Spawner Shards!");

    }

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent event) {
        if (!(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
        if (event.getItem() == null || event.getItem().getItemMeta() == null) return;
        if (!(event.getItem().getType() == Material.PRISMARINE_SHARD && event.getItem().getItemMeta().getLocalizedName().equalsIgnoreCase("SPAWNER_SHARD_SP")))
            return;
        SpawnerRecipeGUI.run(event.getPlayer());
        event.setCancelled(true);
    }


    /*TEMP || Debug Mode*/
    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent event) {
        MainUtils.sendModifiedMessage(event.getPlayer(),
                SpawnerPlus.getInstance().getDebugPrefix() + ChatColor.GRAY + "Would you like to Enter Debug Mode?" + ChatColor.GREEN + "Yes!",
                true,
                "SP DEBUG",
                true,
                "&cClick to enter Debug Mode!");
    }

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent event) {
        SpawnerPlus.getInstance().getInDebug().remove(event.getPlayer().getUniqueId());
    }

}
