import java.util.Scanner;

class terms_of_ap {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i = 1; i <= x; i++) {
            if ((3 * i + 2) % 4 != 0) {
                System.out.print((3 * i + 2) + " ");
            } else
                x++;

        }
    }
}
