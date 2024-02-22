package Arrays;

public class intro {
    public static void main(String[] args) {
        /*
         * int[] marks;
         * marks = new int[5];
         * marks[0] = 51;
         * marks[1] = 41;
         * marks[2] = 63;
         * marks[3] = 59;
         * marks[4] = 58;
         * System.out.println(marks.length);
         * for (int i = 0; i < marks.length; i++) {
         * System.out.println(marks[i]);
         * }
         */
        int[] one = new int[3];
        one[0] = 10;
        one[1] = 20;
        one[2] = 30;

        int[] two = one;
        two[1] = 200;

        for (int i = 0; i < one.length; i++) {
            System.out.println(one[i]);
        }

        for (int i = 0; i < two.length; i++) {
            System.out.println(two[i]);

        }
    }
}
