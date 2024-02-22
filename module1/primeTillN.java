import java.util.Scanner;

public class primeTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the begining no.");

        int low = scn.nextInt();
        System.out.println("enter the last no.");
        int high = scn.nextInt();
        scn.close();
        for (int n = low; n <= high; n++) {
            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n);

            }

        }
    }
}
