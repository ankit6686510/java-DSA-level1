package Arrays;

import java.util.Scanner;

public class ReverseOfArray {
    public static void reverse(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;

        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scn.nextInt();

        }
        reverse(num);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i] + " ");

        }
        System.out.println();
        scn.close();

    }

}
