public class conditional {
    public static void main(String[] args) {
        /*
         * int x = 23;
         * if (x % 2 == 0) {
         * System.out.println(x + "is even");
         * } else {
         * System.out.println(x + "is odd");
         * 
         * }
         * System.out.println("hardwork is better than smart work");
         * }
         * 
         * }
         */
        // question:2
        int n1 = 20;
        int n2 = 30;
        if (n1 == n2) {
            System.out.println(n1 + "is equal to" + n2);
        } else {
            if (n1 > n2) {
                System.out.println(n1 + "is greater is than" + n2);

            } else {
                System.out.println(n1 + "is smaller than" + n2);
            }

        }
    }
}
