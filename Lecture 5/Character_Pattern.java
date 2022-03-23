import java.util.Scanner;

class Character_Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int firstChar = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (firstChar + j - 1));
            
            }
            System.out.println();
            firstChar++;
        }

    }
}
