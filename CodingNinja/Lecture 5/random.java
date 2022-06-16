import java.util.Scanner;

class random {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;
        for (int i = n; i >= 1; i--) {
            // int firstChar = 64 + n;
            for (int j = i; j <= n; j++) {
                System.out.print((char)(j+64));
                // firstChar--;
            }
            System.out.println();
        }

    }
}
