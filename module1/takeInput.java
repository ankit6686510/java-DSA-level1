import java.util.Scanner;

public class takeInput {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextInt());
        String name = scn.nextLine();
        System.out.println("dear" + name + "here is the counting");

        for (int i = 0; i <= n; i++) {
            System.out.println(i);

        }
    }

}
