package org.levelup.lession4.homework;

public class Rectangles {

//    Point firstRectLeftPoint = new Point(1,10);
//    Point firstRectRightPoint = new Point(5,5);
//
//    Point secondRectLeftPoint = new Point(6,10);
//    Point secondRectRightPoint = new Point(7,2);

//    private void createAnotherPoints(Point left, Point right){
//        Point up = new Point(right.getX(),left.getY());
//        Point down = new Point(left.getX(),right.getY());
//    }

    private int[] createXArray(Point left, Point right)
    {
        int[] xArray = new int[]{
                left.getX(),
                right.getX()};
        return xArray;
    }

    private int[] createYArray(Point left, Point right)
    {
        int[] yArray = new int[]{
                right.getY(),
                left.getY()};
        return yArray;
    }

    private boolean isInRange(int[] arr, int numb)
    {
        if (numb>arr[0]&&numb<arr[arr.length-1])
        {return true;
        }else {return false;}
    }

    private void compareRectangles(int[] x1Array, int[] y1Array,int[] x2Array, int[] y2Array)
    {
        for (int i=0;i<x1Array.length;i++)
        {
            if (isInRange(x1Array,x2Array[i])){
                for(int j=0;j<y1Array.length;j++){
                    if (isInRange(y1Array,y2Array[i]))
                    {
                        System.out.println("Rectangles peresekayutsya");
                    }else {
                        if(y1Array[i]<y2Array[i]&&y1Array[y1Array.length-1]>y2Array[y1Array.length-1])
                        {
                            System.out.println("Rectangles realy peresekayutsya");
                        }else {
                            System.out.println("Rectangles NE peresekayutsya");
                        }
                    }
                }
            }else if (isInRange(y1Array,y2Array[i])){
                System.out.println("Rectangles still peresekayutsya");
            }
        }
    }

}
