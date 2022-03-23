import java.util.Scanner;

public class code_interesting_alphabets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j <= n; j++) {
                System.out.print((char)(j+64));
            }
            System.out.println();
        }
    }
}
