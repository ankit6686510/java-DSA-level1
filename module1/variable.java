public class variable {
    public static void main(String[] args) {
        int x = 15;
        int y = 10;
        int sum = x + y;
        System.out.println("sum of " + x + "and " + y + "is " + sum);
        int prd = x * y;
        System.out.println("product of " + x + " and " + y + " is " + prd);
        int v1 = x / y; // 1
        int v2 = y / x; // 0
        int v3 = x % y; // 5

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        // EXP

        int exp = (x * y) / (x + y);
        System.out.println(exp);
    }
}
