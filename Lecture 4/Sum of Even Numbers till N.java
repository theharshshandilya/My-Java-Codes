import java.util.Scanner;

class temp1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int n = 10;
        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i++;
        }
        System.out.print(sum);

    }
}