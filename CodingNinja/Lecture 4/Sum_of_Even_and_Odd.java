import java.util.Scanner;

class Sum_of_Even_and_Odd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ES = 0;
        int OS = 0;
        // ES is evenSum, OS is oddSum
        while (n > 0) {
            int LD = n % 10;
            // LD is lastDigit
            // int num = lastdigit/2;
            if (LD % 2 == 0) {
                ES += LD;
            } else {
                OS += LD;
            }
            n = n / 10;
        }

        System.out.println(ES + " " + OS);
    }
}