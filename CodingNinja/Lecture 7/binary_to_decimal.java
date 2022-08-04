import java.util.*;

class binary_to_decimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = n;
		int ans = 0;
		for (int i = 0; i < Integer.toString(k).length(); i++) {
			ans += (n % 10) * Math.pow(2, i);
			n /= 10;
		}
		System.out.println(ans);
	}
}
