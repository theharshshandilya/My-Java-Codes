import java.util.Scanner;

public class random {
    public static boolean fibonacci(int n) {
        int ans;
        ans = (n - 1) + (n - 2);
        if (n == ans)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        boolean ans = fibonacci(n);
        System.out.println(ans);
    }

}
