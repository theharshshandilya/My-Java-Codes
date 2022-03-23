import java.util.Scanner;

class temp7 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double basic = s.nextInt();
        char allow = s.next().charAt(0);
        double hra = (20 * basic) / 100;
        double da = (50 * basic) / 100;
        double pf = (11 * basic) / 100;
        double TS = (basic + hra + da - pf);
        if (allow == 'A')
            TS = TS + 1700;

        else if (allow == 'B')
            TS = TS + 1500;

        else
            TS = TS + 1300;

        if (TS - (int) TS > 0.5)
            TS += 1;
        System.out.print((int) TS);

    }
}