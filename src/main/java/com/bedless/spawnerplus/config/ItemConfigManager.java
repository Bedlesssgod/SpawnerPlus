package com.bedless.spawnerplus.config;

import com.bedless.spawnerplus.mainthread.SpawnerPlus;
import lombok.Getter;

public class ItemConfigManager {

    @Getter
    public final String spawnerSkeletonName;
    @Getter
    public final String spawnerSkeletonDescription1;
    @Getter
    public final String spawnerSkeletonDescription2;
    @Getter
    public final String spawnerSkeletonDescription3;
    @Getter
    public final String spawnerSkeletonDescription4;
    @Getter
    public final String spawnerSkeletonDescription5;
    @Getter
    public final String spawnerSkeletonDescription6;
    @Getter
    public final String spawnerSkeletonDescription7;
    @Getter
    public final String spawnerSkeletonDescription8;
    @Getter
    public final String spawnerSkeletonDescription9;
    @Getter
    public final String spawnerSkeletonDescription10;

    @Getter
    public final String essenceSkeletonName;
    @Getter
    public final String essenceSkeletonDescription1;
    @Getter
    public final String essenceSkeletonDescription2;
    @Getter
    public final String essenceSkeletonDescription3;
    @Getter
    public final String essenceSkeletonDescription4;
    @Getter
    public final String essenceSkeletonDescription5;
    @Getter
    public final String essenceSkeletonDescription6;
    @Getter
    public final String essenceSkeletonDescription7;
    @Getter
    public final String essenceSkeletonDescription8;
    @Getter
    public final String essenceSkeletonDescription9;
    @Getter
    public final String essenceSkeletonDescription10;


    public ItemConfigManager(){
        this.spawnerSkeletonName = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_NAME");
        this.spawnerSkeletonDescription1 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_1");
        this.spawnerSkeletonDescription2 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_2");
        this.spawnerSkeletonDescription3 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_3");
        this.spawnerSkeletonDescription4 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_4");
        this.spawnerSkeletonDescription5 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_5");
        this.spawnerSkeletonDescription6 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_6");
        this.spawnerSkeletonDescription7 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_7");
        this.spawnerSkeletonDescription8 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_8");
        this.spawnerSkeletonDescription9 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_9");
        this.spawnerSkeletonDescription10 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("SPAWNER_SKELETON_DESCRIPTION_10");



        this.essenceSkeletonName = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_NAME");
        this.essenceSkeletonDescription1 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_1");
        this.essenceSkeletonDescription2 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_2");
        this.essenceSkeletonDescription3 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_3");
        this.essenceSkeletonDescription4 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_4");
        this.essenceSkeletonDescription5 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_5");
        this.essenceSkeletonDescription6 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_6");
        this.essenceSkeletonDescription7 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_7");
        this.essenceSkeletonDescription8 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_8");
        this.essenceSkeletonDescription9 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_9");
        this.essenceSkeletonDescription10 = SpawnerPlus.getInstance().getConfigHandler().getItemConfig().getString("ESSENCE_SKELETON_DESCRIPTION_10");
    }

}
