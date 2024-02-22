package Arrays;

import java.util.Scanner;

public class InverseofanArray {
    // 0 1 2 3 4 -->index of ana array
    // 3 4 1 2 0
    // inverse of above array will be
    // 0 1 2 3 4
    // 4 2 3 0 1
    public static int[] getinverse(int[] arr) {
        int n = arr.length;
        int[] inverse = new int[n];
        for (int i = 0; i < n; i++) {
            inverse[arr[i]] = i;

        }
        return inverse;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the size of array:");
        int size = scn.nextInt();

        int[] array = new int[size];
        System.out.println("enter the element of array:");
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();

        }
        int[] inverse = getinverse(array);
        System.out.println("inverse of array:");
        for (int i = 0; i < size; i++) {
            System.out.println(inverse[i] + " ");

        }
        scn.close();

    }

}
