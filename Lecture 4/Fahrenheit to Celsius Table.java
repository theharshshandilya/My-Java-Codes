import java.util.Scanner;

class temp2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int E = scan.nextInt();
        int W = scan.nextInt();
        int i = S;
        while (i <= E) {
            int cW = (5 * (S - 32)) / 9;
            System.out.println(i + " " + cW);
            S = S + W;
            i = S;
        }

    }
}