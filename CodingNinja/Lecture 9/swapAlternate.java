import java.io.*;
import java.util.*;

class swapAlternate {
    public static void helper(int[] arr) {
        int a = 0;
        if (arr.length % 2 == 0) {
            for (int i = 0; i < arr.length; i += 2) {
                a = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = a;
            }
        } else {
            for (int i = 0; i < arr.length - 1; i += 2) {
                a = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = a;
            }

        }
    }

    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner s = new Scanner(file);
        int t = s.nextInt();
        while (t-- > 0) {
            int arr[] = new int[s.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("Input Array: " + Arrays.toString(arr));
            helper(arr);
            System.out.println("Output Array: " + Arrays.toString(arr));
        }
    }
}