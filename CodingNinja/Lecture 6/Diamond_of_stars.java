import java.util.Scanner;

class Diamond_of_stars {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = n - i - n / 2; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = (i - 1) * 2; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n / 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n - i - 1; j >= i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
        
    }
}