package org.levelup.lession5.square;

public class SquareCalculator {
    public static void main(String[] args) {
        Shape shape = new Rectangle(10,5);
        System.out.println("PLOSHYAD' " + shape.square());

        Drawable drawable = new Rectangle(90,1);
        drawable.draw();
    }
}
