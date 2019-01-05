package com.netcracker.collectioninjecting.ci;

import java.util.Map;

public class MyMap {
    Map<Integer, String> carMap;

    public MyMap(Map<Integer, String> carMap) {
        this.carMap = carMap;
    }

    public Map<Integer, String> getCarMap() {
        return carMap;
    }


}
