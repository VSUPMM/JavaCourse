package ru.java.courses.fishstore;

public class Store {

    private Box[] shelf = new Box[100];

    private int count;

    private int budget;

    public Store(Box[] shelf, int count, int budget) {
        this.shelf = shelf;
        this.count = count;
        this.budget = budget;
    }

    public Box sell(int money ){
        Box box = shelf[count-1];
        shelf[count-1] = null;
        count--;
        budget += money;
        return box;
    }

    public int buy ( Box box ){
        shelf[count] = box;
        count++;
        budget -= box.getTotalPrice();
        return box.getTotalPrice();
    }

}
