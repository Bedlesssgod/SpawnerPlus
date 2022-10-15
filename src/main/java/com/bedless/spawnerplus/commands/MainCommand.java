package com.bedless.spawnerplus.commands;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.Subcommand;
import com.bedless.spawnerplus.config.FormattedItemJSON;
import com.bedless.spawnerplus.gui.SpawnerRecipeGUI;
import com.bedless.spawnerplus.item.ItemBuilder;
import com.bedless.spawnerplus.item.ItemPresets;
import com.bedless.spawnerplus.mainthread.Config;
import com.bedless.spawnerplus.mainthread.SpawnerPlus;
import com.bedless.spawnerplus.utils.Essence;
import com.bedless.spawnerplus.utils.MainUtils;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.json.simple.JSONObject;

@CommandAlias("SP|SpawnersPlus|SpawnerPlus")
public class MainCommand extends BaseCommand {

    private boolean debugChecked = false;

    public MainCommand() {
        SpawnerPlus.getInstance().pcm.registerCommand(this);
    }

    @Subcommand("debug")
    @CommandCompletion("debug")
    public void toggleDebug(Player player) {
        if (SpawnerPlus.getInstance().getInDebug().contains(player.getUniqueId())) {
            SpawnerPlus.getInstance().getInDebug().remove(player.getUniqueId());
            debugChecked = true;
        } else if (!debugChecked) {
            SpawnerPlus.getInstance().getInDebug().add(player.getUniqueId());
            debugChecked = true;
        }
        if (debugChecked) {
            MainUtils.sendMessageToAllDebug("Player-Name: " + player.getDisplayName());
            MainUtils.sendMessageToAllDebug("Current-Status: " + SpawnerPlus.getInstance().getInDebug().contains(player.getUniqueId()));
            player.sendMessage(SpawnerPlus.getInstance().getInDebug().contains(player.getUniqueId()) ? "Enabled Debug Mode" : "Disabled Debug Mode");
            debugChecked = false;
        }
    }

    @Subcommand("recipe")
    public class recipeCommand extends BaseCommand {
        @Subcommand("spawner")
        public void genericSpawnerRecipe(Player player) {

            SpawnerRecipeGUI.run(player);
            player.sendMessage(MainUtils.openingRecipe("Spawner"));
        }
    }

    @Subcommand("giveAllEssence")
    public void giveAllEssenceCommand(Player player){
        player.getInventory().addItem(ItemPresets.getAllItemStacks());
    }

    @Subcommand("test")
    public void printAllConfig(Player player){
        player.getInventory().addItem(ItemBuilder.buildEssenceFromConfig(
                FormattedItemJSON.getSkeletonEssenceName(),
                Essence.SKELETON,
                FormattedItemJSON.getSkeletonEssenceDesc1(),
                FormattedItemJSON.getSkeletonEssenceDesc2(),
                FormattedItemJSON.getSkeletonEssenceDesc3(),
                FormattedItemJSON.getSkeletonEssenceDesc4(),
                FormattedItemJSON.getSkeletonEssenceDesc5(),
                FormattedItemJSON.getSkeletonEssenceDesc6(),
                FormattedItemJSON.getSkeletonEssenceDesc7(),
                FormattedItemJSON.getSkeletonEssenceDesc8(),
                FormattedItemJSON.getSkeletonEssenceDesc9(),
                FormattedItemJSON.getSkeletonEssenceDesc10()
        ));
    }
}
