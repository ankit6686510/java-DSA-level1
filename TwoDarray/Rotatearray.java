package TwoDarray;

import java.util.Scanner;

public class Rotatearray {
    // ROTATE ARRAY BY 90 degree
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) { // for rows
            for (int j = 0; j < arr[0].length; j++) { // for column
                arr[i][j] = scn.nextInt();

            }

        }
        // Transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }

        }
        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            int ri = arr[i].length - 1;
            while (li < ri) {

                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;

            }

        }
        display(arr);
    }

    public static void display(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j] + " ");

            }
        }
        System.out.println();
    }
}
