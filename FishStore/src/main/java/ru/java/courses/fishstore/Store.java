package ru.java.courses.fishstore;

import java.util.Arrays;
import java.util.HashMap;

public class Store {

    private int budget;

    private HashMap<AbstractFish, Box[]> fishBoxes = new HashMap<>();

    public Box sell(AbstractFish requiedFish){
        Box box = removeFishBoxes(requiedFish);
        budget += box.getTotalPrice();
        return box;
    }

    public int buy (Box box){
        addFishBoxes(box);
        budget -= box.getTotalPrice();
        return box.getTotalPrice();
    }

    public void addFishBoxes (Box box){
        Box[] boxes = fishBoxes.get(box.getFish());
        boxes = Arrays.copyOf(boxes, boxes.length + 1);
        boxes[boxes.length-1] = box;
        fishBoxes.put(box.getFish(), boxes); //replace with new array
    }

    public Box removeFishBoxes (AbstractFish requiedFish){
        Box[] boxes = fishBoxes.get(requiedFish);
        Box box = boxes[boxes.length - 1]; //last box
        boxes = Arrays.copyOf(boxes, boxes.length - 1);
        fishBoxes.put(box.getFish(), boxes);
        return box;
    }

}
