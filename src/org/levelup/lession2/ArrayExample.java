package org.levelup.lession2;

public class ArrayExample {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 100;
        arr[2] = 165;
        arr[4] = 54;

        int value = arr[4];
        System.out.println("ETO PYATAYA YACHEIKA " + value);
        System.out.println("DLINA " + arr.length);
        for (int i = 0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
