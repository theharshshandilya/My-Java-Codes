import java.util.*;

class linearSearch {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int arr[] = new int[n];
            int ans = -1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }

            int x = s.nextInt();
            System.out.println(helper(arr, x));
        }
    }

    public static int helper(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}