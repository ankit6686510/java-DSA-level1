import java.util.Scanner;

public class digitCount {
    public static void main(String[] args) {
        // PROBLEM WITH THIS CODE IS IF IN BEGINING 0 WILL BE ADDED IT WILL NOT COUNT
        // THAT
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number to count digit:");
        int n = scn.nextInt();
        scn.close();
        int dig = 0;
        while (n != 0) {// num is not equal to zero
            n = n / 10;
            dig++;
        }
        System.out.println(dig);
    }
}
