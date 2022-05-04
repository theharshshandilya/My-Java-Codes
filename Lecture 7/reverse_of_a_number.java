import java.util.Scanner;

class reverse_of_a_number {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int nf = 0;
        for (int i = n; i >= 1; i--) {
            nf = n % 10;
            if (nf != 0) {
                System.out.print(nf);

            } else
            n /= 10;
        }

    }
}
