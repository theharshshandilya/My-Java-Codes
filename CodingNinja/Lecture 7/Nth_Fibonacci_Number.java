import java.util.Scanner;

class Nth_Fibonacci_Number {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f1 = 0, f2 = 1;
        int fn;
        for (int i = 0; i < n; i++) {
            System.out.println(f1);
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
    }
}