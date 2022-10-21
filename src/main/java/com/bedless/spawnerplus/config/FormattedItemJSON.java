package com.bedless.spawnerplus.config;

import com.bedless.spawnerplus.item.utils.DescriptionLine;
import com.bedless.spawnerplus.mainthread.Config;
import com.bedless.spawnerplus.utils.MainUtils;
import lombok.Getter;
import org.json.simple.JSONArray;

@Getter
public class FormattedItemJSON {

    public static String skeletonSpawnerName;
    public static DescriptionLine skeletonSpawnerDesc1;
    public static DescriptionLine skeletonSpawnerDesc2;
    public static DescriptionLine skeletonSpawnerDesc3;
    public static DescriptionLine skeletonSpawnerDesc4;
    public static DescriptionLine skeletonSpawnerDesc5;
    public static DescriptionLine skeletonSpawnerDesc6;
    public static DescriptionLine skeletonSpawnerDesc7;
    public static DescriptionLine skeletonSpawnerDesc8;
    public static DescriptionLine skeletonSpawnerDesc9;
    public static DescriptionLine skeletonSpawnerDesc10;

    public static String skeletonEssenceName;
    public static DescriptionLine skeletonEssenceDesc1;
    public static DescriptionLine skeletonEssenceDesc2;
    public static DescriptionLine skeletonEssenceDesc3;
    public static DescriptionLine skeletonEssenceDesc4;
    public static DescriptionLine skeletonEssenceDesc5;
    public static DescriptionLine skeletonEssenceDesc6;
    public static DescriptionLine skeletonEssenceDesc7;
    public static DescriptionLine skeletonEssenceDesc8;
    public static DescriptionLine skeletonEssenceDesc9;
    public static DescriptionLine skeletonEssenceDesc10;

    public static void load(){

        JSONArray spawnerSkel = Config.getItemJSON().getSkeletonSpawner();
        skeletonSpawnerName = MainUtils.translatePlaceHolders((String) spawnerSkel.get(0), true);
        skeletonSpawnerDesc1 = MainUtils.translateDescription((String) spawnerSkel.get(1), true);
        skeletonSpawnerDesc2 = MainUtils.translateDescription((String) spawnerSkel.get(2), true);
        skeletonSpawnerDesc3 = MainUtils.translateDescription((String) spawnerSkel.get(3), true);
        skeletonSpawnerDesc4 = MainUtils.translateDescription((String) spawnerSkel.get(4), true);
        skeletonSpawnerDesc5 = MainUtils.translateDescription((String) spawnerSkel.get(5), true);
        skeletonSpawnerDesc6 = MainUtils.translateDescription((String) spawnerSkel.get(6), true);
        skeletonSpawnerDesc7 = MainUtils.translateDescription((String) spawnerSkel.get(7), true);
        skeletonSpawnerDesc8 = MainUtils.translateDescription((String) spawnerSkel.get(8), true);
        skeletonSpawnerDesc9 = MainUtils.translateDescription((String) spawnerSkel.get(9), true);
        skeletonSpawnerDesc10 = MainUtils.translateDescription((String) spawnerSkel.get(10), true);

        JSONArray essenceSkel = Config.getItemJSON().getSkeletonEssence();
        skeletonEssenceName = MainUtils.translatePlaceHolders((String) essenceSkel.get(0), false);
        skeletonEssenceDesc1 = MainUtils.translateDescription((String) essenceSkel.get(1), false);
        skeletonEssenceDesc2 = MainUtils.translateDescription((String) essenceSkel.get(2), false);
        skeletonEssenceDesc3 = MainUtils.translateDescription((String) essenceSkel.get(3), false);
        skeletonEssenceDesc4 = MainUtils.translateDescription((String) essenceSkel.get(4), false);
        skeletonEssenceDesc5 = MainUtils.translateDescription((String) essenceSkel.get(5), false);
        skeletonEssenceDesc6 = MainUtils.translateDescription((String) essenceSkel.get(6), false);
        skeletonEssenceDesc7 = MainUtils.translateDescription((String) essenceSkel.get(7), false);
        skeletonEssenceDesc8 = MainUtils.translateDescription((String) essenceSkel.get(8), false);
        skeletonEssenceDesc9 = MainUtils.translateDescription((String) essenceSkel.get(9), false);
        skeletonEssenceDesc10 = MainUtils.translateDescription((String) essenceSkel.get(10), false);
    }

}
