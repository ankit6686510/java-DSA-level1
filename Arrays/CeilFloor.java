package Arrays;

import java.util.Scanner;

public class CeilFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
        int data = scn.nextInt();
        int lo = 0;
        int hi = arr.length - 1;
        int ceil = -1;
        int floor = -1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid]; // Update ceil when data is less than current element

            } else if (data > arr[mid]) {
                lo = mid + 1;
                floor = arr[mid];// Update floor when data is greater than current element
            }

            else {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }

        }
        System.out.println("ceil" + ceil);
        System.out.println("floor" + floor);
        scn.close();
    }

}
