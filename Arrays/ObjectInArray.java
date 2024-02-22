package Arrays;

import java.util.Scanner;

public class ObjectInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        Object[] arr = new Object[n]; // Use Object array

        for (int i = 0; i < arr.length; i++) {
            if (scn.hasNextInt()) {
                arr[i] = scn.nextInt(); // Read an integer
            } else {
                arr[i] = scn.next().charAt(0); // Read a character
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }

        scn.close();
    }
}
