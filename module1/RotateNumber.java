import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        // 2 3 4 5 7-->rotate by 2 = 5 7 2 3 4
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();// taking input to be rotated
        int k = scn.nextInt();// no of rotation

        int temp = n;
        int nod = 0;// no of digit
        while (temp > 0) {
            temp = temp / 10;
            nod++;

        }
        k = k % nod;
        if (k < 0) {
            k = k + nod;
        }
        int div = 1;
        int mult = 1;
        for (int i = 1; i <= nod; i++) {
            if (i <= k) {
                div = div * 10;

            } else {
                mult = mult * 10;
            }

        }
        int q = n / div;
        int r = n % div;

        int rot = r * mult + q;
        System.out.println(rot);
        scn.close();

    }

}
