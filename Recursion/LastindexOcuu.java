package Recursion;

import java.util.Scanner;

public class LastindexOcuu {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        int li = lastindex(arr, 0, x);
        System.out.println(li); // Print the result
    }

    public static int lastindex(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }
        int liisa = lastindex(arr, idx + 1, x);
        if (liisa != -1) {
            return liisa; // Return liisa if it's not -1
        } else {
            if (arr[idx] == x) {
                return idx; // Return the current index if arr[idx] is equal to x
            } else {
                return -1; // Default return value when x is not found
            }
        }
    }
}
