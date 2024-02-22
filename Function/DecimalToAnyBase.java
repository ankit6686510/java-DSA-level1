package Function;

import java.util.Scanner;

public class DecimalToAnyBase {
    public static void main(String[] args) {
        // [634]base 10-->1172 with base 8
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();// number input
        int b = scn.nextInt();// base input
        int dn = GetValueInBase(n, b);
        System.out.println(dn);
        scn.close();

    }

    public static int GetValueInBase(int n, int b) {
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            rv += dig * p;
            p = p * 10;

        }
        return rv;
    }
}
