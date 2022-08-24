import java.util.Scanner;

class fibonacci_number {
    public static boolean fibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int f3;

        for (int i = 0; i < n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        if (f1 == n)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        boolean m = fibonacci(n);
        System.out.println(m);
    }

}
