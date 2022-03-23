import java.util.Scanner;

class temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();

        int Avg = (i + j + k) / 3;
        System.out.println(str);
        System.out.println(Avg);

    }

}

git config --global user.email "hpc.harsh.22@gmail.com"
git config --global user.name "Harsh"