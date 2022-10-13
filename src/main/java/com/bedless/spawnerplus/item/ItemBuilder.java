package com.bedless.spawnerplus.item;

import com.bedless.spawnerplus.utils.Essence;
import lombok.NonNull;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import java.util.Arrays;
import java.util.UUID;

public class ItemBuilder {


    public static ItemStack createGUIItem(String name, Material material, boolean unbreakable, boolean filler, String... description) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(filler ? "§c" : ChatColor.translateAlternateColorCodes('&', name));
        meta.setLore(filler || Arrays.asList(description).toString().toLowerCase().contains("filler") ? null : Arrays.asList(description));
        meta.setUnbreakable(unbreakable);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createItem(String name, Material material, boolean unbreakable, String... description) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));

        meta.setLore(Arrays.asList(description).toString().toLowerCase().contains("filler") ? null : Arrays.asList(description));
        meta.setUnbreakable(unbreakable);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createItem(String name, String localizedName, Material material, boolean unbreakable, String... description) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        meta.setLocalizedName(localizedName);
        meta.setLore(Arrays.asList(description).toString().toLowerCase().contains("filler") ? null : Arrays.asList(description));
        meta.setUnbreakable(unbreakable);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createItem(String name, String localizedName, Material material, boolean unbreakable,boolean randomEnchant, String... description) {
        ItemStack item = new ItemStack(material);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
        meta.setLocalizedName(localizedName);
        meta.setLore(Arrays.asList(description).toString().toLowerCase().contains("filler") ? null : Arrays.asList(description));
        meta.setUnbreakable(unbreakable);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        if(randomEnchant) meta.addEnchant(Enchantment.DURABILITY, 3, true);
        if(randomEnchant) meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack essenceGenerator(Essence essence, String... description) {
        ItemStack item = new ItemStack(Essence.getEssenceItem(essence));
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§5" + Essence.getEssenceName(essence));
        meta.setLocalizedName(Essence.getEssenceLocalName(essence));
        meta.setLore(Arrays.asList(description).toString().toLowerCase().contains("filler") ? null : Arrays.asList(description));
        meta.setUnbreakable(true);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        meta.addEnchant(Enchantment.DURABILITY, 3, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        return item;
    }

    public static ItemStack createItem(@NonNull String name, @NonNull UUID playerUUID, @NonNull boolean unbreakable, @NonNull boolean filler, String... lore) {
        ItemStack item = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) item.getItemMeta();
        /*Advanced way of
        if(filler == true){
            meta.setDisplayName("§c")
        } else {
            meta.setDisplayName(name);
        }
        */
        meta.setDisplayName(filler ? "§c" : name);
        meta.setLore(filler ? null : Arrays.asList(lore));
        if (Bukkit.getOfflinePlayer(playerUUID).getPlayer() != null)
            meta.setOwningPlayer(Bukkit.getOfflinePlayer(playerUUID));
        meta.setUnbreakable(unbreakable);
        meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
        item.setItemMeta(meta);
        return item;
    }


}
