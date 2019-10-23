package org.levelup.lession5;

public class Product {
    private String name;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    @Override
    public int hashCode() {
        
        int result = 31;
        result = result*17+count;
        result = result*17+name.hashCode();
        return result;
    }
}
