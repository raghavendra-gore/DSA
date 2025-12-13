public class CarryForwardSolution {

    /**
     * Calculates the sum of all subarray sums efficiently in O(N^2) time complexity.
     *
     * @param arr The input integer array.
     * @param N The length of the input array.
     * @return The total sum of all subarray sums.
     */
    public static long allSubarraySum(int[] arr, int N) {
        // 'ans' stores the final total sum. Using 'long' is crucial to prevent
        // integer overflow, as the sum can become very large.
        long ans = 0;

        // The outer loop determines the starting index (i) of the subarray.
        for (int i = 0; i < N; i++) {
            // 'subarraySum' keeps track of the sum for subarrays starting at index 'i'
            // and ending at the current index 'j'. It resets for every new 'i'.
            int subarraySum = 0;

            // The inner loop determines the ending index (j) of the subarray.
            // As 'j' increases, we just add the next element to the running sum.
            for (int j = i; j < N; j++) {
                // Add the next element of the current subarray.
                subarraySum += arr[j];

                // Every time the inner loop runs, 'subarraySum' holds the sum of a
                // complete subarray (from index i to the current index j).
                // We add this sum to our final answer.
                ans += subarraySum;
            }
        }

        // Return the final accumulated sum.
        return ans;
    }