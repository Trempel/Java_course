package org.levelup.lession4.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Point {
    private int x;
    private int y;

    //Конструктор класса
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    static String quadrant(Point point){
        String result = "";
        if ((point.x ==0)||(point.y ==0))
        {
            return result = "0";
        }
        else if(point.x >0){
            if (point.y>0){
                result = "Quadrant 1";
            }else{
                result = "Quadrant 2";
            }
        }else {
            if (point.y>0)
            {
                result = "Quadrant 4";
            }else{
                result = "Quadrant 3";
            }
        }
        return result;
    }

    Point flip(Point point){
        this.x = (-1)*point.x;
        this.y = (-1)*point.y;
        Point NewPoint = new Point(point.x, point.y);
        return NewPoint;
    }
    public static void main(String[] args) {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("input x");
            int x = Integer.parseInt(rd.readLine());
            System.out.println("input y");
            int y = Integer.parseInt(rd.readLine());
            Point point = new Point(x,y);
            System.out.println(point);
            System.out.println(quadrant(point));
            System.out.println(point.flip(point));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
