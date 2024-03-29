package Arrays;

import java.util.Scanner;

public class SubsetOfAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }
        int limit = (int) Math.pow(2, arr.length);
        for (int i = 0; i < limit; i++) {
            String set = "_";
            int temp = i;
            for (int j = arr.length - 1; j >= 0; j--) {
                int r = temp % 2;
                temp = temp / 2;
                if (r == 0) {
                    set = "_\t" + set;

                } else {
                    set = arr[j] + "\t" + set;

                }

            }
            System.out.println(set);

        }
        scn.close();
    }

}
