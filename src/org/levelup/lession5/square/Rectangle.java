package org.levelup.lession5.square;

public class Rectangle extends Shape implements Drawable{
    public Rectangle(int width, int height){
        super(new int[]{width,height,width,height});
    }
    @Override
    public double square() {
        return sideSizes[0]*sideSizes[1];
    }

    @Override
    public void draw() {
        System.out.println("[]");
    }
}
