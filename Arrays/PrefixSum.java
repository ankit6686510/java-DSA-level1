package Arrays;

public class PrefixSum {
    public static void Prefixsum(int num[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];

        }
        for (int i = 0; i < num.length; i++) {
            // int start = i;
            for (int j = i; j < num.length; j++) {
                // int end = j;
                currsum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (maxsum < currsum) {
                    maxsum = currsum;

                }

            }

        }
        System.out.println("maxsum:" + maxsum);
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        Prefixsum(num);
    }
}
