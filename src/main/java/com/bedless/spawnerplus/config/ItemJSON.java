package com.bedless.spawnerplus.config;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.bukkit.ChatColor;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.json.simple.parser.ParseException;

public class ItemJSON {

    private File file;
    private JSONObject json;

    private JSONObject generalInfo;
    private JSONObject masterSkeleton;
    private JSONObject skeletonEssence;
    private JSONObject skeletonSpawner;

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
            generalInfo.put("Info", "PlaceHolders: %%ITEM_RARITY_COLOR%% | %%EMPTY_LINE%% | %%ITEM_RARITY_STRING%% | %%NULL_LINE%%");
            defaults.put("Information", generalInfo);

            masterSkeleton = new JSONObject();

            skeletonSpawner = new JSONObject();
            /*Spawner*/
            skeletonSpawner.put("Name", "Skeleton Spawner");
            skeletonSpawner.put("Desc1", "Skely");
            skeletonSpawner.put("Desc2", "Skely");
            skeletonSpawner.put("Desc3", "Skely");
            skeletonSpawner.put("Desc4", "Skely");
            skeletonSpawner.put("Desc5", "Skely");
            skeletonSpawner.put("Desc6", "Skely");
            skeletonSpawner.put("Desc7", "Skely");
            skeletonSpawner.put("Desc8", "Skely");
            skeletonSpawner.put("Desc9", "Skely");
            skeletonSpawner.put("Desc10", "Skely");

            /*Essence*/
            skeletonEssence = new JSONObject();
            skeletonEssence.put("Name", "%%ITEM_RARITY_COLOR%% Skeleton Essence");
            skeletonEssence.put("Desc1", "%7Extremly Rare Item,");
            skeletonEssence.put("Desc2", "%7Obtained by Killing");
            skeletonEssence.put("Desc3", "%7Skeletons");
            skeletonEssence.put("Desc4", "%%EMPTY_LINE%%");
            skeletonEssence.put("Desc5", "%5Right-Click to View");
            skeletonEssence.put("Desc6", "%5Recipes!");
            skeletonEssence.put("Desc7", "%%EMPTY_LINE%%");
            skeletonEssence.put("Desc8", "%%ITEM_RARITY_STRING%%");
            skeletonEssence.put("Desc9", "%%NULL_LINE%%");
            skeletonEssence.put("Desc10", "%%NULL_LINE%%");

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
                if (o instanceof String) {
                    toSave.put(s, getString(s));
                } else if (o instanceof Double) {
                    toSave.put(s, getDouble(s));
                } else if (o instanceof Integer) {
                    toSave.put(s, getInteger(s));
                } else if (o instanceof JSONObject) {
                    toSave.put(s, getObject(s));
                } else if (o instanceof JSONArray) {
                    toSave.put(s, getArray(s));
                }
            }

            TreeMap<String, Object> treeMap = new TreeMap<String, Object>(String.CASE_INSENSITIVE_ORDER);
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

    public JSONObject getSkeletonEssence(){
        return skeletonEssence;
    }

    public JSONObject getSkeletonSpawner(){
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