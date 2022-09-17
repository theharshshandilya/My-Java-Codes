import java.util.*;
import java.lang.*;
import java.io.*;

class random {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = n;
		int x = 1;
		int i;
		for (i = 1; i < n; i++) {
			ans -= x;
			x += 2;
			if (ans < x)
				break;
		}
		System.out.println(i);
	}
}
