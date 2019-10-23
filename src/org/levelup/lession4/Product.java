package org.levelup.lession4;

public class Product {
    String name;

    public Product(String name){
        this.name = name;
    }
    public boolean equals(Object obj){
        if(this == obj) return true;

        Product other = (Product) obj;
        return name.equals(other.name);
    }
}
