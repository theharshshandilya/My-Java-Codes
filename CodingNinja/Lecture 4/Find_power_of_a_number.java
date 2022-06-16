import java.util.Scanner;

class Find_power_of_a_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int Result = 1;
        for (; n > 0; n--) {
            Result *= x;
        }
        System.out.println(Result);
    }
}