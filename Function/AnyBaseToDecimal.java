package Function;

import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        // [634]base 10-->1172 with base 8
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();// number input
        int b = scn.nextInt();// base input
        int d = GetValueInDecimal(n, b);
        System.out.println(d);
        scn.close();

    }

    public static int GetValueInDecimal(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv += dig * p;
            p = p * b;

        }
        return rv;
    }
}
