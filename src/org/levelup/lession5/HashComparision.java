package org.levelup.lession5;

public class HashComparision {
    public static void main(String[] args) {
        Product[] products = new Product[]{
                new Product("",123456),
                new Product("",123356),
                new Product("",1275656),
                new Product("",1115656),
                new Product("",1272225656),
        };
        Product forCompare = new Product("",123456);
        for (int i=0;i<products.length;i++){
            if (products[i].hashCode() ==forCompare.hashCode()){
            if (products[i].equals(forCompare)) {
                System.out.println("ELEMENT INDEX "+i);
            }
            }
        }
    }
}
