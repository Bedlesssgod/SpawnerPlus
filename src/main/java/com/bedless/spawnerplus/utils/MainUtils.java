package com.bedless.spawnerplus.utils;

import com.bedless.spawnerplus.mainthread.SpawnerPlus;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Content;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nullable;
import java.util.List;
import java.util.UUID;

public class MainUtils {

    public static void sendHoverableMessage(Player player, String message, String displayOnHover) {
        TextComponent msg = new TextComponent(ChatColor.translateAlternateColorCodes('&', message));
        msg.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText(displayOnHover)));
    }

    public static void sendClickableMessage(Player player, String message, String command) {
        TextComponent msg = new TextComponent(ChatColor.translateAlternateColorCodes('&', message));
        msg.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + command));
    }


    @Deprecated
    public static void sendModifiedMessage(Player player, String actionPart,boolean clickAble,
                                           @Nullable String command, boolean hoverAble, @Nullable String hoverText) {
        TextComponent clickAbleComp = new TextComponent(ChatColor.translateAlternateColorCodes('&', actionPart));

        if (clickAble) clickAbleComp.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/" + command));
        if (hoverAble)
            clickAbleComp.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, TextComponent.fromLegacyText(ChatColor.translateAlternateColorCodes('&', hoverText))));

        player.spigot().sendMessage(clickAbleComp);

    }

    public static void sendMessageToAllDebug(String message) {
        try {
            for (UUID uuid : SpawnerPlus.getInstance().getInDebug()) {

                Bukkit.getPlayer(uuid).sendMessage(message);
            }
        } catch (NullPointerException ex) {
            //Nothing
        }
    }

    public static String translate(String toTranslate) {
        return ChatColor.translateAlternateColorCodes('&', toTranslate);
    }

    public static String openingRecipe(String recipeName) {
        return SpawnerPlus.getInstance().getOpenRecipeBase().replace("${RECIPE_NAME}$", recipeName);
    }

}
