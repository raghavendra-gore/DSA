public class PrefixSumSolution {

    /**
     * Helper method to generate the prefix sum array from the input array.
     * <p>
     * The prefix sum at index k stores the sum of all elements from arr[0] to arr[k].
     *
     * @param arr The input integer array.
     * @param N   The length of the input array.
     * @return The prefix sum array.
     */
    public static int[] getPrefixSum(int[] arr, int N) {
        int[] pf = new int[N];
        if (N == 0) {
            return pf;
        }

        pf[0] = arr[0];
        for (int k = 1; k < N; k++) {
            pf[k] = pf[k - 1] + arr[k];
        }
        return pf;
    }

    /**
     * Calculates the sum of all subarray sums using prefix sums.
     * Time Complexity: O(N^2)
     *
     * @param arr The input integer array.
     * @param N   The length of the input array.
     * @return The total sum of all subarray sums.
     */
    public static int allSubarraySum(int[] arr, int N) {
        // Generate the prefix sum array first.
        int[] pf = getPrefixSum(arr, N);

        // 'ans' stores the final total sum. Use 'long' to prevent potential integer overflow
        // as the total sum can be large given the constraints.
        long ans = 0;

        // Outer loop determines the starting index (i) of the subarray.
        for (int i = 0; i < N; i++) {
            // Inner loop determines the ending index (j) of the subarray.
            for (int j = i; j < N; j++) {
                // Calculate the sum of the subarray [i...j] using prefix sums in O(1) time.
                // Sum(i, j) = pf[j] - pf[i-1] if i > 0, otherwise pf[j].
                int subarraySum = pf[j];
                if (i != 0) {
                    subarraySum -= pf[i - 1];
                }

                // Add the sum of the current subarray to the overall answer.
                ans += subarraySum;
            }
        }

        // Return the final accumulated sum. Cast to int assuming the final sum fits,
        // but prefer returning 'long' based on problem constraints.
        return (int) ans;
    }
}