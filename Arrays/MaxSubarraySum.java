package Arrays;

public class MaxSubarraySum {
    /*
     * public static void maxsubaaraysum(int num[]) {
     * // int currSum = 0;
     * int maxSum = Integer.MIN_VALUE;
     * 
     * for (int i = 0; i < num.length; i++) {
     * int start = i;
     * int currSum = 0;
     * 
     * for (int j = i; j < num.length; j++) {
     * int end = j;
     * currSum = 0;
     * 
     * for (int k = start; k <= end; k++) {
     * currSum += num[k];
     * 
     * }
     * System.out.println("currSUM:" + currSum);
     * if (maxSum < currSum) {
     * maxSum = currSum;
     * 
     * }
     * 
     * }
     * 
     * }
     * System.out.print("max sum :" + maxSum);
     * }
     * 
     * public static void main(String[] args) {
     * int num[] = { 1, -2, 6, -1, 3 };
     * maxsubaaraysum(num);
     * }
     * }
     */
    // public class MaxSubarraySumBruteforce {
    public static int maxSubarraySum(int num[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < num.length; i++) {
            int currSum = 0;

            for (int j = i; j < num.length; j++) {
                currSum += num[j];
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int num[] = { 1, -2, 6, -1, 3 };
        int result = maxSubarraySum(num);
        System.out.println("Max subarray sum: " + result);
    }
}
