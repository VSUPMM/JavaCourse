package ru.java.courses.fishstore;
import ru.java.courses.fishstore.factory.Fish;

import java.util.Calendar;
import java.util.Date;

public class Snook extends AbstractFish implements Fish {

    public static final String NAME = "Salmon";

    public static final int DAYS_COUNT = 4;

    public static final int PRICE = 220;

    private String color;

    private int size;

    private int weight;

    private boolean frozen;

    private final Date date;

    public Snook(Date date) {
        this.date = date;
    };

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public int getFishLife() {
        return DAYS_COUNT;
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public boolean isFresh(){
        return Calendar.getInstance().after(date);
    }

}