package org.levelup.lession4.homework;

public class ArrayUtil {

 public static int minimum(int[] mass){
     int min = mass[0];
     for (int i=0;i<mass.length;i++)
     {
         if (mass[i]<min)
         {
             min = mass[i];
         }
     }
     return min;
 }
    static int maximum(int[] mass){
        int max = mass[0];
        for (int i=0;i<mass.length;i++)
        {
            if (mass[i]>max)
            {
                max= mass[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

     int[] mass = new int[10];
        mass[0] = 2;
        mass[1] = 1;
        mass[2] = 6;
        mass[3] = 0;
        mass[4] = 15;
        mass[5] = -3;


        System.out.println(minimum(mass));
        System.out.println(maximum(mass));
    }
}
