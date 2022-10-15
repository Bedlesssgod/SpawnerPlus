package com.bedless.spawnerplus.config;

import com.bedless.spawnerplus.mainthread.Config;
import com.bedless.spawnerplus.utils.MainUtils;
import lombok.Getter;
import org.json.simple.JSONObject;

public class FormattedItemJSON {

    @Getter
    public static String skeletonSpawnerName;
    @Getter
    public static String skeletonSpawnerDesc1;
    @Getter
    public static String skeletonSpawnerDesc2;
    @Getter
    public static String skeletonSpawnerDesc3;
    @Getter
    public static String skeletonSpawnerDesc4;
    @Getter
    public static String skeletonSpawnerDesc5;
    @Getter
    public static String skeletonSpawnerDesc6;
    @Getter
    public static String skeletonSpawnerDesc7;
    @Getter
    public static String skeletonSpawnerDesc8;
    @Getter
    public static String skeletonSpawnerDesc9;
    @Getter
    public static String skeletonSpawnerDesc10;

    @Getter
    public static String skeletonEssenceName;
    @Getter
    public static String skeletonEssenceDesc1;
    @Getter
    public static String skeletonEssenceDesc2;
    @Getter
    public static String skeletonEssenceDesc3;
    @Getter
    public static String skeletonEssenceDesc4;
    @Getter
    public static String skeletonEssenceDesc5;
    @Getter
    public static String skeletonEssenceDesc6;
    @Getter
    public static String skeletonEssenceDesc7;
    @Getter
    public static String skeletonEssenceDesc8;
    @Getter
    public static String skeletonEssenceDesc9;
    @Getter
    public static String skeletonEssenceDesc10;

    public static void load(){
        JSONObject spawnerSkel = Config.getItemJSON().getSkeletonSpawner();
        skeletonSpawnerName = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Name"), true);
        skeletonSpawnerDesc1 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc1"), true);
        skeletonSpawnerDesc2 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc2"), true);
        skeletonSpawnerDesc3 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc3"), true);
        skeletonSpawnerDesc4 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc4"), true);
        skeletonSpawnerDesc5 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc5"), true);
        skeletonSpawnerDesc6 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc6"), true);
        skeletonSpawnerDesc7 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc7"), true);
        skeletonSpawnerDesc8 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc8"), true);
        skeletonSpawnerDesc9 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc9"), true);
        skeletonSpawnerDesc10 = MainUtils.translatePlaceHolders((String) spawnerSkel.get("Desc10"), true);

        JSONObject essenceSkel = Config.getItemJSON().getSkeletonEssence();
        skeletonEssenceName = MainUtils.translatePlaceHolders((String) essenceSkel.get("Name"), false);
        skeletonEssenceDesc1 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc1"), false);
        skeletonEssenceDesc2 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc2"), false);
        skeletonEssenceDesc3 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc3"), false);
        skeletonEssenceDesc4 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc4"), false);
        skeletonEssenceDesc5 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc5"), false);
        skeletonEssenceDesc6 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc6"), false);
        skeletonEssenceDesc7 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc7"), false);
        skeletonEssenceDesc8 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc8"), false);
        skeletonEssenceDesc9 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc9"), false);
        skeletonEssenceDesc10 = MainUtils.translatePlaceHolders((String) essenceSkel.get("Desc10"), false);

    }

}
