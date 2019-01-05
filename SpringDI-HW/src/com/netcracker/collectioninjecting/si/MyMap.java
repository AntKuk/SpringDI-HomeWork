package com.netcracker.collectioninjecting.si;

import java.util.Map;

public class MyMap {
    Map<Integer, String> carMap;

    public Map<Integer, String> getCarMap() {
        return carMap;
    }

    public void setCarMap(Map<Integer, String> carMap) {
        System.out.println("It's a setter-based map");
        this.carMap = carMap;
    }
}
