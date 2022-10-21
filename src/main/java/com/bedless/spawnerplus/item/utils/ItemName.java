package com.bedless.spawnerplus.item.utils;

import lombok.NonNull;

public class ItemName {

    private final String name;

    public ItemName(@NonNull String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
