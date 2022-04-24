import java.util.Scanner;

class random {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int f1 = 1, f2 = 1;
        int fn = f1 + f2;
        for (int i = 2; i < n; i++) {
            f1=f2;
            f2=fn;
            fn=f1+f2;
            
        }
        System.out.println(f2);

        



    }
}