import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);// take input

        System.out.println("enter the marks in %");

        int marks = Scn.nextInt();
        Scn.close();// this will close the scn class
        if (marks > 90) {
            System.out.println("excellent");
        } else if (marks > 80) {
            System.out.println("good");
        }

        else if (marks > 70) {
            System.out.println("fair");
        }

        else if (marks > 60) {
            System.out.println("meets expectations");
        }

        else {
            System.out.println("below average");
        }

    }
}
