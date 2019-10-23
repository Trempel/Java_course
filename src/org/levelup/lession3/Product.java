package org.levelup.lession3;

public class Product {

    String name;
    double weight;
    int count;
    int increaseAndGet(int value) {
        count = count + value;
        return count;
    }
    public void setupCount(int count){
        if (count>=0){
            this.count = count;
        }
    }
}
