package ru.java.courses.fishstore.factory;

import ru.java.courses.fishstore.Snook;
import ru.java.courses.fishstore.Carp;
import ru.java.courses.fishstore.Redfish;

import java.util.Date;

public class FishFactory {
    public Fish getFish(FishTypes type){
        Fish fish = null;
        switch (type) {
            case CARP:
                fish = new Carp(new Date());
                break;
            case REDFISH:
                fish = new Redfish(new Date());
                break;
            case SNOOK:
                fish = new Snook(new Date());
                break;
            default:
                throw new IllegalArgumentException("Wrong fish type:" + type);
        }
        return fish;
    }
}
