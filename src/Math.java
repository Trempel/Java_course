import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        float a;
        float b;
        float res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme a");
        a = sc.nextFloat();
        System.out.println("Gimme b");
        b = sc.nextFloat();
            res = a + b;
            System.out.println("Sum is " + res);
            res = a -b;
            System.out.println("Diff is " + res);
            res = a * b;
            System.out.println("Mult is " + res);
            try{
                res = a/b;
                System.out.println("Div is " + res);
            }catch(ArithmeticException e)
            {
                e.printStackTrace();
            }
        }
    }
