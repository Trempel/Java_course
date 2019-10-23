import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи на");
        int firstVar = sc.nextInt();
        System.out.println("Введи на");
        int secondVar = sc.nextInt();
        int result = firstVar / secondVar;
        System.out.println("На нна "+ result);
    }
}