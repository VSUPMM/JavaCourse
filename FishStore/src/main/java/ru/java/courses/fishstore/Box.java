package ru.java.courses.fishstore;

public class Box {

    private int count;

    private AbstractFish fish;

    public Box(int count, AbstractFish fish) {
        this.count = count;
        this.fish = fish;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public AbstractFish getFish() { return fish; }

    public void setFish(AbstractFish fish) {
        this.fish = fish;
    }

    public int getTotalPrice(){
        return getCount() * getFish().getPrice();
    }

}
