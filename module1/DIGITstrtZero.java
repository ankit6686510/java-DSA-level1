import java.util.Scanner;

public class DIGITstrtZero {
    public static void main(String[] args) {
        // if the digit is started with zero
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nod = 0;
        int temp = n;
        while (temp != 0) {
            temp = temp / 10;
            nod++;

        }
        scn.close();
    }int div=(int)Math.pow(10,nod-1);while(div!=0)
    {
        int q = n / div;
        System.out.println(q);
        n = n % div;
        div = div / 10;

    }

}
