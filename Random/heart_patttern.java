import java.io.*;
import java.util.*;

class heart_patttern {

    public static void main(String[] args) {
        int n = 31;
        int arr[][] = new int[n][n];
        int centx = n / 4;
        int centy = n / 4 + 1;
        int rad = n / 4 - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = (centx - i) * (centx - i) + (centy - j) * (centy - j);
                if (temp > (rad * rad) - rad && temp < (rad * rad) + rad)
                    arr[i][j] = 1;
            }
        }
        centx = n / 4;
        centy = 3 * n / 4 - 1;
        rad = n / 4 - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = (centx - i) * (centx - i) + (centy - j) * (centy - j);
                if (temp > (rad * rad) - rad && temp < (rad * rad) + rad)
                    arr[i][j] = 1;
            }
        }

        for (int i = n / 2, j = n - 8; i >= 2; i--, j--) {
            arr[j][i] = 1;
        }
        for (int i = n / 2, j = n - 8; i < n - 2; i++, j--) {
            arr[j][i] = 1;
        }

        for (int i = 0; i < arr.length / 4; i++) {
            int j1 = 0, j2 = 0;
            boolean flag1 = false;
            boolean flag2 = false;
            for (int j = 0; j < arr.length / 2; j++) {
                if (!flag1 && arr[i][j] == 1 && arr[i][j + 1] == 0) {
                    j1 = j;
                    flag1 = true;
                }
                if (flag1 && arr[i][j] == 0 && arr[i][j + 1] == 1) {
                    j2 = j;
                    flag2 = true;
                }
            }
            if (flag2) {
                for (int b = j1; b <= j2; b++) {
                    arr[i][b] = 1;
                }
            }
        }

        for (int i = 0; i < arr.length / 4; i++) {
            int j1 = 0, j2 = 0;
            boolean flag1 = false;
            boolean flag2 = false;
            for (int j = arr.length / 2; j < arr.length - 1; j++) {
                if (!flag1 && arr[i][j] == 1 && arr[i][j + 1] == 0) {
                    j1 = j;
                    flag1 = true;
                }
                if (flag1 && arr[i][j] == 0 && arr[i][j + 1] == 1) {
                    j2 = j;
                    flag2 = true;
                }
            }
            if (flag2) {
                for (int b = j1; b <= j2; b++) {
                    arr[i][b] = 1;
                }
            }
        }

        for (int i = arr.length / 4; i < arr.length - 6; i++) {
            int j1 = 0, j2 = 0;
            boolean flag1 = false;
            for (int j = 0; j < arr.length; j++) {
                if (!flag1 && arr[i][j] == 1) {
                    j1 = j;
                    flag1 = true;
                }
                if (arr[i][j] == 1) {
                    j2 = j;
                }
            }
            for (int b = j1; b <= j2; b++) {
                arr[i][b] = 1;
            }
        }

        for (int i = 0; i < arr.length - 5; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}