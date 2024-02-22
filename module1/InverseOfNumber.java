import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv = 0; // inverted
        int op = 1; // original position
        while (n != 0) {
            int od = n % 10;
            int id = op; // inverted digti
            int ip = od; // inverted position
            // make change to inv using ip and id
            inv = inv + id * (int) Math.pow(10, ip - 1);
            n = n / 10;
            op++;

        }
        System.out.println(inv);
        scn.close();

    }
}
