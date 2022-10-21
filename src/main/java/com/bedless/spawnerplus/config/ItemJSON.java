package com.bedless.spawnerplus.config;

import java.io.*;
import java.util.*;

import com.google.gson.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ItemJSON {

    private File file;
    private JSONObject json;

    private JSONObject generalInfo;
    private JSONObject masterSkeleton;
    private JSONArray skeletonEssence;
    private JSONArray skeletonSpawner;

    private JSONParser parser = new JSONParser();
    private HashMap<String, Object> defaults = new HashMap<String, Object>();

    public ItemJSON(File file) {
        this.file = file;
        reload();
    }

    @SuppressWarnings("unchecked")
    public void reload() {
        try {
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }

            if (!file.exists()) {
                PrintWriter pw = new PrintWriter(file, "UTF-8");
                pw.print("{");
                pw.print("}");
                pw.flush();
                pw.close();
            }

            json = (JSONObject) parser.parse(new InputStreamReader(new FileInputStream(file), "UTF-8"));

            generalInfo = new JSONObject();
            generalInfo.put("Info", "PlaceHolders: -ITEM_RARITY_COLOR- | -EMPTY_LINE- | -ITEM_RARITY_STRING- | -NO_LINE-");
            defaults.put("Information", generalInfo);

            masterSkeleton = new JSONObject();

            //Spawner--
            skeletonSpawner = new JSONArray();
            skeletonSpawner.add(0,"Name: Skeleton Spawner");
            skeletonSpawner.add(1, "DESCRIPTION: 1");
            skeletonSpawner.add(2, "DESCRIPTION: 2");
            skeletonSpawner.add(3, "DESCRIPTION: 3");
            skeletonSpawner.add(4, "DESCRIPTION: 4");
            skeletonSpawner.add(5, "DESCRIPTION: 5");
            skeletonSpawner.add(6, "DESCRIPTION: 6");
            skeletonSpawner.add(7, "DESCRIPTION: 7");
            skeletonSpawner.add(8, "DESCRIPTION: 8");
            skeletonSpawner.add(9, "DESCRIPTION: 9");
            skeletonSpawner.add(10, "DESCRIPTION: 10");
            //Essence
            skeletonEssence = new JSONArray();
            skeletonEssence.add(0,"Name: -ITEM_RARITY_COLOR- Skeleton Essence");
            skeletonEssence.add(1,"DESCRIPTION: %7Extremely Rare Item, 1");
            skeletonEssence.add(2,"DESCRIPTION: %7Obtained by Killing 2");
            skeletonEssence.add(3,"DESCRIPTION: %7Skeletons 3");
            skeletonEssence.add(4,"DESCRIPTION: -EMPTY_LINE- 4");
            skeletonEssence.add(5,"DESCRIPTION: %5Right-Click to View 5");
            skeletonEssence.add(6,"DESCRIPTION: %5Recipes! 6");
            skeletonEssence.add(7,"DESCRIPTION: -EMPTY_LINE- 7");
            skeletonEssence.add(8,"DESCRIPTION: -ITEM_RARITY_STRING- 8");
            skeletonEssence.add(9,"DESCRIPTION: -NO_LINE- 9");
            skeletonEssence.add(10,"DESCRIPTION: -NO_LINE- 10");


            masterSkeleton.put("Essence", skeletonEssence);
            masterSkeleton.put("Spawner", skeletonSpawner);
            defaults.put("Skeleton", masterSkeleton);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    public boolean save() {
        try {
            JSONObject toSave = new JSONObject();

            for (String s : defaults.keySet()) {
                Object o = defaults.get(s);
                Bukkit.getConsoleSender().sendMessage(s + " " + o);
                if (o instanceof String) toSave.put(s, getString(s));
                if (o instanceof Double) toSave.put(s, getDouble(s));
                if (o instanceof Integer) toSave.put(s, getInteger(s));
                if (o instanceof JSONObject) toSave.put(s, getObject(s));
                if (o instanceof JSONArray) toSave.put(s, getArray(s));
            }


            TreeMap<String, Object> treeMap = new TreeMap<String, Object>();
            treeMap.putAll(toSave);

            Gson g = new GsonBuilder().setPrettyPrinting().create();
            String prettyJsonString = g.toJson(treeMap);


            FileWriter fw = new FileWriter(file);
            fw.write(prettyJsonString);
            fw.flush();
            fw.close();

            return true;

        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public JSONArray getSkeletonEssence(){
        return skeletonEssence;
    }

    public JSONArray getSkeletonSpawner(){
        return skeletonSpawner;
    }


    public String getRawData(String key) {
        if(!json.containsKey(key)) return "";

        return String.valueOf(defaults.get(key));
    }

    public File getFile(){
        return file;
    }


    public String getString(String key) {
        return ChatColor.translateAlternateColorCodes('§', getRawData(key));
    }

    public boolean getBoolean(String key) {
        return Boolean.parseBoolean(getRawData(key));
    }

    public double getDouble(String key) {
        try {
            return Double.parseDouble(getRawData(key));
        } catch (Exception ex) { }
        return -1;
    }

    public double getInteger(String key) {
        try {
            return Integer.parseInt(getRawData(key));
        } catch (Exception ex) { }
        return -1;
    }

    public JSONObject getObject(String key) {
        return json.containsKey(key) ? (JSONObject) json.get(key)
                : (defaults.containsKey(key) ? (JSONObject) defaults.get(key) : new JSONObject());
    }

    public JSONArray getArray(String key) {
        return json.containsKey(key) ? (JSONArray) json.get(key)
                : (defaults.containsKey(key) ? (JSONArray) defaults.get(key) : new JSONArray());
    }


    public boolean contains(String key) {
        return json.containsKey(key);
    }

    public void remove(String key) {
        json.remove(key);
    }
}