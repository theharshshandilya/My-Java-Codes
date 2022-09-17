import java.util.*;

class arrangeNumbersInArray {
    // public static int[] helper(int) {
        
    // }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            if (n % 2 == 0) {
                for (int i = 1; i <= n; i += 2) {
                    System.out.print(i + " ");
                }
                System.out.print(n + " ");
                for (int i = n - 2; i >= 2; i -= 2) {
                    System.out.print(i + " ");
                }
            } else {
                for (int i = 1; i <= n; i += 2) {
                    System.out.print(i + " ");
                }
                for (int i = n - 1; i >= 2; i -= 2) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}