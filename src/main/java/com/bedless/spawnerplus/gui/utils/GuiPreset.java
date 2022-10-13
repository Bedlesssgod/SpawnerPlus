package com.bedless.spawnerplus.gui.utils;

import com.bedless.spawnerplus.item.ItemBuilder;
import com.bedless.spawnerplus.item.ItemPresets;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class GuiPreset {

    public static HashMap<Integer, ItemStack> GUISpawnerRecipeBase() {
        HashMap<Integer, ItemStack> i = new HashMap<>();
        /*Line 1*/
        i.put(0, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(1, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(2, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(3, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(4, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(5, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(6, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(7, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(8, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));

        /*Line 2*/
        i.put(9, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(10, ItemBuilder.createGUIItem("§c§l{ITEM_REQUIRED}", Material.CHAIN, true, false, "§c§l{ITEM_REQUIRED_LORE}"));
        i.put(11, ItemBuilder.createGUIItem("{AIR}", Material.BEDROCK, true, false, "{AIR}"));
        i.put(12, ItemBuilder.createGUIItem("§c§l{ITEM_REQUIRED}", Material.CHAIN, true, false, "§c§l{ITEM_REQUIRED_LORE}"));
        i.put(13, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(14, ItemBuilder.createGUIItem("FILLER", Material.GREEN_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(15, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(16, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(17, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));

        /*Line 3*/
        i.put(18, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(19, ItemBuilder.createGUIItem("§c§l{ITEM_REQUIRED}", Material.CHAIN, true, false, "§4§l{ITEM_REQUIRED_LORE}"));
        i.put(20, ItemBuilder.createGUIItem("§c§l{ITEM_REQUIRED}", Material.CHAIN, true, false, "§4§l{ITEM_REQUIRED_LORE}"));
        i.put(21, ItemBuilder.createGUIItem("§c§l{ITEM_REQUIRED}", Material.CHAIN, true, false, "§4§l{ITEM_REQUIRED_LORE}"));
        i.put(22, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(23, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(24, ItemBuilder.createGUIItem("FILLER", Material.GREEN_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(25, ItemBuilder.createGUIItem("§a§l{RECIPE_OUT}", Material.CHAINMAIL_CHESTPLATE, true, false, "§a§l{RECIPE_OUT_LORE}"));
        i.put(26, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));

        /*Line 4*/
        i.put(27, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(28, ItemBuilder.createGUIItem("§c§l{ITEM_REQUIRED}", Material.CHAIN, true, false, "§c§l{ITEM_REQUIRED_LORE}"));
        i.put(29, ItemBuilder.createGUIItem("§c§l{ITEM_REQUIRED}", Material.CHAIN, true, false, "§c§l{ITEM_REQUIRED_LORE}"));
        i.put(30, ItemBuilder.createGUIItem("§c§l{ITEM_REQUIRED}", Material.CHAIN, true, false, "§c§l{ITEM_REQUIRED_LORE}"));
        i.put(31, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(32, ItemBuilder.createGUIItem("FILLER", Material.GREEN_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(33, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(34, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(35, ItemBuilder.createGUIItem("FILLER", Material.BLACK_STAINED_GLASS_PANE, true, true, "FILLER"));

        /*Line 5*/
        i.put(36, ItemBuilder.createGUIItem("§aBack", Material.ARROW, true, false, "§7View Previous Recipe"));
        i.put(37, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(38, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(39, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(40, ItemBuilder.createGUIItem("§c§lClose", Material.BARRIER, true, false, "FILLER"));
        i.put(41, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(42, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(43, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
        i.put(44, ItemBuilder.createGUIItem("§aForward", Material.ARROW, true, false, "§7View Next Recipe"));
        return i;
    }

    public static  HashMap<Integer, ItemStack> BaseRecipeGUI(ItemStack item1, ItemStack item2, ItemStack item3, ItemStack item4, ItemStack item5, ItemStack item6, ItemStack item7, ItemStack item8, ItemStack item9, ItemStack outPut) {
        HashMap<Integer, ItemStack> inventoryMap = new HashMap<>();
        for(int i = 0; i <= 44; i++){
            switch (i){
                case 14, 24, 32 -> inventoryMap.put(i, ItemBuilder.createGUIItem("FILLER", Material.GREEN_STAINED_GLASS_PANE, true, true, "FILLER"));
                case 9, 15, 16, 17, 18, 22, 26, 27, 33, 34, 35 -> inventoryMap.put(i, ItemBuilder.createGUIItem("FILLER", Material.GRAY_STAINED_GLASS_PANE, true, true, "FILLER"));
                case 10 -> inventoryMap.put(i, item1);
                case 11 -> inventoryMap.put(i, item2);
                case 12 -> inventoryMap.put(i, item3);
                case 19 -> inventoryMap.put(i, item4);
                case 20 -> inventoryMap.put(i, item5);
                case 21 -> inventoryMap.put(i, item6);
                case 25 -> inventoryMap.put(i, outPut);
                case 28 -> inventoryMap.put(i, item7);
                case 29 -> inventoryMap.put(i, item8);
                case 30 -> inventoryMap.put(i, item9);
                case 36 -> inventoryMap.put(i, ItemBuilder.createGUIItem("&a<- Previous Page", Material.ARROW, true, false, "§7View Previous Recipe!"));
                case 40 -> inventoryMap.put(i, ItemBuilder.createGUIItem("&c&lExit", Material.BARRIER, true, false, "§b"));
                case 44 -> inventoryMap.put(i, ItemBuilder.createGUIItem("&aNext Page ->", Material.ARROW, true, false, "§7View Next Recipe!"));
                default -> inventoryMap.put(i, ItemBuilder.createGUIItem("FILLER", Material.LIME_STAINED_GLASS_PANE, true, true, "FILLER"));
            }
        }
        return inventoryMap;
    }

    public static HashMap<Integer, ItemStack> BaseSpawnerRecipeGUI(ItemStack essence, ItemStack spawnerType) {
        return BaseRecipeGUI(ItemPresets.getSpawnerShard(),
                ItemPresets.getSpawnerShard(),
                ItemPresets.getSpawnerShard(),
                ItemPresets.getSpawnerShard(),
                essence,
                ItemPresets.getSpawnerShard(),
                ItemPresets.getSpawnerShard(),
                ItemPresets.getSpawnerShard(),
                ItemPresets.getSpawnerShard(),
                spawnerType);
    }

}
