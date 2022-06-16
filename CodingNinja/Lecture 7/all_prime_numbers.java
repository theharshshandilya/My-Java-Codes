import java.util.Scanner;

class all_prime_numbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 2; i <= n; i++) {
            isPrime(i);
        }
    }

    private static void isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return;
            }
        }
        System.out.println(n);
    }
}
