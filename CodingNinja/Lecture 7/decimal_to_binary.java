import java.util.*;

class decimal_to_binary {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 7;
		int ans = 0;
		for (int i = n - 1; i >= 0; i--) {
			ans += n % 2;
			n /= 2;
			System.out.print(ans);
			if (n == 1) {
				System.out.println("1");
			}
		}
	}
}