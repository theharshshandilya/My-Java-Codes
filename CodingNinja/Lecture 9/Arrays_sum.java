import java.util.*;

class Arrays_sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int size = s.nextInt();
            int arr[] = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            helper(arr);
        }
    }
    public static void helper(int arr[]) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        System.out.println(ans);
    }
}
// 2
// 5
// 1 2 3 4 5 
// 3
// 10 20 30
