public class PrefixSumSolution {

    /**
     * Finds the maximum sum among all subarrays of a given length K using a prefix sum array.
     * <p>
     * The logic matches the original function signature provided, but internally uses prefix sums.
     *
     * @param arr The input array of integers.
     * @param N   The length of the array.
     * @param K   The required length of the subarray.
     * @return The maximum sum found among all subarrays of length K.
     */
    public static int maxSubarraySumOfLengthK(int[] arr, int N, int K) {
        // Handle edge case where K is invalid
        if (K > N || K <= 0) {
            return Integer.MIN_VALUE; // Or throw an exception, depending on requirements
        }

        // 1. Create a prefix sum array
        // prefixSum[i] will store the sum of all elements from arr[0] to arr[i-1]
        int[] prefixSum = new int[N + 1];
        prefixSum[0] = 0;
        for (int i = 0; i < N; i++) {
            prefixSum[i + 1] = prefixSum[i] + arr[i];
        }

        // 2. Iterate through all possible subarrays of length K using the prefix sums
        int maxSum = Integer.MIN_VALUE;

        // The start index of our subarray 'i' ranges from 0 to N-K
        for (int i = 0; i <= N - K; i++) {
            // The end index of our subarray is 'i + K - 1'

            // To get the sum of elements from index 'i' to 'i + K - 1' using prefix sums:
            // Sum = prefixSum[end + 1] - prefixSum[start]
            // In our case: start = i, end = i + K - 1
            // Sum = prefixSum[i + K] - prefixSum[i]

            int currentSum = prefixSum[i + K] - prefixSum[i];

            // Update the maximum sum found so far
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum sum
        return maxSum;
    }
}