package com.bedless.spawnerplus.mainthread;

import com.bedless.spawnerplus.config.ItemJSON;
import lombok.Getter;
import org.bukkit.Bukkit;

import java.io.File;

public class Config {

    @Getter
    public static ItemJSON itemJSON;

    public enum Configs{
        ITEM, OTHER
    }

    public static void loadConfig(Configs configType){
        switch (configType){
            case ITEM -> itemJSON = new ItemJSON(new File(SpawnerPlus.getInstance().getDataFolder() + File.separator, "Items.json"));
            case OTHER -> Bukkit.broadcastMessage("NO OTHER");
        }
    }

    public static void save(){
        itemJSON.save();
    }

}
