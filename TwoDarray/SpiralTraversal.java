package TwoDarray;

import java.util.Scanner;

public class SpiralTraversal {
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
        int minR = 0;
        int minC = 0;
        int maxR = n - 1; // also we can use -->arr.length()-1;
        int maxC = m - 1; // also we can use -->arr[0].length()-1;
        int tne = n * m;
        int cnt = 0;

        while (cnt < tne) {
            // LEFT WALL
            for (int i = minR, j = minC; i <= maxR && cnt < tne; i++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minC++;
            // Bottom wall
            for (int i = maxR, j = minC; j <= maxC && cnt < tne; j++) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxR--;

            // RIGHT WALL
            for (int i = maxR, j = maxC; i >= minR && cnt < tne; i--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxC--;
            // TOP WALL
            for (int i = minR, j = maxC; j >= minC && cnt < tne; j--) {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minR++;

        }
        scn.close();
    }
}
