package ru.java.courses.fishstore;

import java.util.Date;

public class SnookBuilder {

        private Snook snook = new Snook(new Date());

        public SnookBuilder() {
        }

        public SnookBuilder color(String color) {
            snook.setColor(color);
            return this;
        }

        public SnookBuilder frozen(boolean frozen) {
            snook.setFrozen(frozen);
            return this;
        }

        public SnookBuilder size(int size) {
            snook.setSize(size);
            return this;
        }

        public SnookBuilder weight(int weight) {
            snook.setWeight(weight);
            return this;
        }

         public Snook build() {
        return snook;
    }
}
