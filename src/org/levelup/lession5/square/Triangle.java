package org.levelup.lession5.square;

public class Triangle extends Shape {

    public Triangle(int first, int second, int third){
        super(new int[] {first, second, third});
    }

    @Override
    public double square() {
        return 0;
    }
}
