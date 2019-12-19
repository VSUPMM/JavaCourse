package ru.java.courses.fishstore;
import ru.java.courses.fishstore.factory.Fish;

import java.util.Calendar;
import java.util.Date;

public class Redfish extends AbstractFish implements Fish {

    public static final String NAME = "Redfish";

    public static final int DAYS_COUNT = 5;

    public static final int PRICE = 220;

    private final Date date;

    public Redfish(Date date) {
        this.date = date;
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