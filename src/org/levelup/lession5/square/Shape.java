package org.levelup.lession5.square;

public abstract class Shape{

    protected int[] sideSizes;

    public Shape(int[] sideSizes){
        this.sideSizes = sideSizes;
    }

    public abstract double square();

    public double perimetr(){
        double result = 0;
        for (int i=0;i<sideSizes.length;i++)
        {
            result = result + sideSizes[i];
        }return result;
    }
}
