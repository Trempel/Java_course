package org.levelup.lession2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int secret = random.nextInt(11)-5;
        int number = 0;
        int tryCount = 3;
        do {
            System.out.println("YOU HAVE " + tryCount + " POPYTOK");
            System.out.println("VVEDY");
            number = sc.nextInt();
            if (number>secret)
            {
                System.out.println("VY VVELY >");
            }else if (number < secret){
                System.out.println("VY VVELY <");
            }
            tryCount--;
        }while (number!=secret || tryCount !=0);
        if (number ==secret){
        System.out.println("RIGHT");

    }
}
}
//        if (number == secret)
//        {
//            System.out.println("EEEEEEEEEEEEE");
//        }else{
//            if (number > secret)
//            {
//                System.out.println("MOOOREEEEE");
//            }else {
//                System.out.println("LEEEEEEESSSSS");
//            }
//        }
//        do {
//        if (number > secret)
//            {
//                System.out.println("MOOOREEEEE");
//
//        }else {
//            System.out.println("LEEEEEEESSSSS");
//        }
//            {while (number ==secret);
//        System.out.println("EEEEEEEEEEEEE");
//    }
//}