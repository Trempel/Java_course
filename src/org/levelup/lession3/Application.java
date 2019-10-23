package org.levelup.lession3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("VVEDI NAME");
        Scanner sc = new Scanner(System.in);
        String enteredName = sc.nextLine();

        System.out.println("VVEDI weight");
        double enteredWeight = sc.nextDouble();

        System.out.println("VVEDI count");
        int enteredCount =  sc.nextInt();

        Product p1;
        p1 = new Product();

        p1.name = enteredName;
        p1.weight = enteredWeight;
        p1.count = enteredCount;

        System.out.println(p1.name + " " + p1.weight);
        System.out.println("KOL-VO: " + p1.count);
        int newCount = p1.increaseAndGet(10);
        System.out.println("KOL-VO after UVELICHENIYA " + newCount);
    }
}
