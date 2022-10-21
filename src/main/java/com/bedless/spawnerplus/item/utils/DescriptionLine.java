package com.bedless.spawnerplus.item.utils;

public record DescriptionLine(String line) {
    public boolean isNoLine(){
        return line.contains("-NO_LINE-");
    }
}
