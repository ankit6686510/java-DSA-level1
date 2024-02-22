package Arrays;

public class PairsINaArray {
    public static void printpairs(int num[]) {
        int tp = 0;
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];

            for (int j = 0; j < num.length; j++) {
                System.out.println("(" + curr + " , " + num[j] + ")");

            }
            System.out.println();
            System.out.println("tottal pairs: " + tp);
            tp++;

        }
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10 };
        printpairs(num);
    }
}
