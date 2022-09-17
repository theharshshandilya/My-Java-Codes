import java.util.*;

class random {
    public static int helper(int[] arr) {
        
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = arr[i++];
            arr[i++] = arr[i];
        }
        return ;
        
        
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int arr[] = new int[s.nextInt()];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println(helper(arr));


        }
    }
}