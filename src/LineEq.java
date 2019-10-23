import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineEq {
    public static void main(String[] args) {
        int a;
        int b;
        int res;

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Input a");
            a = Integer.parseInt(rd.readLine());
            System.out.println("Input b");
            b = Integer.parseInt(rd.readLine());
            if (a == 0 && b == 0) {
                System.out.println("Infinity solutions");
            } else {
                try {
                    res = -b / a;
                    System.out.println("Result is " + res);
                } catch (ArithmeticException e) {
                    System.out.println("No solutions");
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
