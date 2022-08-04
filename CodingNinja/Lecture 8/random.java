import java.util.Scanner;

public class random {

    public static float formula(int n) {
        float c;
        c = (float) ((5.0 / 9.0) * (n - 32));
        return c;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int f1 = s.nextInt();
        int fn = s.nextInt();
        int gap = s.nextInt();

        for (int i = f1; i <= fn; i += gap) {
            int c = (int) formula(i);
            System.out.println(i + " " + (int) c);
        }
    }

}
