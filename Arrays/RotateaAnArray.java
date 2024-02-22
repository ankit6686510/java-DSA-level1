package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateaAnArray {
    public static void rotateArray(int[] arr, int position) {
        int length = arr.length;
        position = (length - (Math.abs(position) % length)) % length;
        int[] temp = new int[length];

        for (int i = 0; i < length; i++) {
            temp[(i + position) % length] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array:");
        int size = scn.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            array[i] = scn.nextInt();
        }

        System.out.println("Enter the number of rotations:");
        int rotations = scn.nextInt();
        System.out.println("Original array: " + Arrays.toString(array));
        rotateArray(array, rotations);
        System.out.println("Rotated array: " + Arrays.toString(array));
        scn.close();
    }
}
