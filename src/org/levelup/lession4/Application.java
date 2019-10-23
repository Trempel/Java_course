package org.levelup.lession4;

public class Application {
    public static void main(String[] args) {
        Product first= new Product("First");
        Product second= new Product("Second");
        Product third= new Product("First");

        System.out.println(first.equals(third));
    }
}
