package org.levelup.lession2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lession2Homework {
    public static void main(String[] args) {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        //aufgabe1(rd);
        //aufgabe2(rd);
        //aufgabe3();
        //aufgabe4();
        //aufgabe5(rd);
        //aufgabe6();
        //aufgabe7();
        //aufgabe8();
        //aufgabe9();
        //aufgabe10(rd);
        aufgabe11(rd);
    }

    public static void aufgabe1(BufferedReader rd) {
        int n;
        try {
            System.out.println("Input something");
            n = Integer.parseInt(rd.readLine());
            if (n%2!=0)
            {
                System.out.println("uneven");
            }else {
                System.out.println("even");
            }
        }catch (IOException e){
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

    public static void aufgabe2(BufferedReader rd){
        double n;
        double m;
        try{
            System.out.println("Input first number");
            n = Double.parseDouble(rd.readLine());
            System.out.println("Input second number");
            m = Double.parseDouble(rd.readLine());

            if (n<0||m<0)
            {
                System.out.println("One of the numbers is OTRITZATELNOE!!");
            }else if (n==m){
                System.out.println("Numbers are equals");
            }
            else if(Math.abs(10-n)<Math.abs(10-m))
            {
                System.out.println(n + " is closer to 10");
            }else {
                System.out.println(m + " is closer to 10");
                }
            }
            catch (IOException e){
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

    public static void aufgabe3() {
        int[] arr = new int[74];
        for (int i = 0; i<arr.length;i++)
        {
            arr[i] = 26+i;
        }
        Random random = new Random();
        int numb = random.nextInt(146) + 5;
        for (int i = 0;i<arr.length;i++)
        {
            if (arr[i] ==numb)
            {
                System.out.println(numb+" is in range [" + arr[0] +";" + arr[73] + "]");
                break;
            }
            else if (i ==arr.length-1)
            {
                System.out.println(numb+" is not in range [" + arr[0] +";" + arr[73] + "]");
            }
        }
    }
    public static void aufgabe4() {
        Random random = new Random();
        int numb = random.nextInt(899) + 100;
        System.out.println("Number is " + numb);
        int[] m = new int[3];
        m[0] = numb/100;
        m[1] = (numb%100)/10;
        m[2] = numb%10;
        int result = m[0];
        for (int i = 1; i<3;i++){
            if(result < m[i])
            {
                result = m[i];
            }
        }
        System.out.println("largest digit is " + result);
    }
    public static void aufgabe5(BufferedReader rd){
        System.out.println("Input something");
        int a;
        int b;
        int c;
        try{
            a = Integer.parseInt(rd.readLine());
            b = Integer.parseInt(rd.readLine());
            c = Integer.parseInt(rd.readLine());
            if (a==b||a==c||b==c){
                System.out.println("Some of the numbers are equals");
            }
            System.out.println("Variables a, b and c: " + a + ", " + b + ", " + c);
            int[] mass = new int[3];
            int tmp = a;
            mass[0] = a;
            mass[1] = b;
            mass[2] = c;
            for (int i=mass.length - 1; i>=1;i--)
            {
                for (int j = 0; j<i;j++)
                {
                    if(mass[j]>mass[j+1])
                    {
                        tmp = mass[j];
                        mass[j] = mass[j+1];
                        mass[j+1] = tmp;
                    }
                }
            }
            System.out.print("Vozrastayuschaya posledovatelnost' ");
            for (int i =0;i<mass.length;i++)
            {
                System.out.print(mass[i] + " ");
            }
        }catch (IOException e)
        {
            System.out.println("Wrong input");
            e.printStackTrace();
        }
    }

    public static void aufgabe6(){
        for (int i=1000; i<9999; i=i+3)
        {
            System.out.print(i + " ");
        }
    }
    public static void aufgabe7(){
        int[] mass = new int[55];
        mass[0] = 1;
        System.out.print(mass[0]);
        for (int i=1;i<mass.length;i++)
        {
            mass[i] = i+2;
            System.out.print(" " + mass[i]);
        }
    }
    public static void aufgabe8(){
        for (int i = 90; i>=0;i=i-5)
        {
            System.out.print(i + " ");
        }
    }
    public static void aufgabe9(){
        int i = 2;
        int count = 1;
        do {
            System.out.print(i + " ");
            i=i*2;
            count++;
        }while(count!=21);
    }
    public static void aufgabe10(BufferedReader rd){
        System.out.println("Input number");
        try {
            int numb = Integer.parseInt(rd.readLine());
            int result = 1;
            int tmp = 1;
            for (int i = 1; i<numb; i++)
            {
                for (int j = 1;j<=i;j++)
                {
                    tmp = 1+j;
                }
                result = result*tmp;
            }
            System.out.println("Factorial is " +result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void aufgabe11(BufferedReader rd){
        System.out.println("Input number");
        try {
            int numb = Integer.parseInt(rd.readLine());
            System.out.print("Deliteli: ");
            for (int i=1;i<=numb;i++){
                if(numb%i==0)
                {
                    System.out.print(i + " ");
                }
            }
        }catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
