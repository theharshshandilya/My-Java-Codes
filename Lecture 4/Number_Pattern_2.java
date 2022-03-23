import java.util.Scanner;

class temp3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= i + i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}