public class Solution {
    /**
     * Counts the number of "good" subarrays in a given integer array A based on specific criteria.
     *
     * A subarray is "good" if:
     * 1. Its length is even, AND its sum is less than B.
     * 2. Its length is odd, AND its sum is greater than B.
     *
     * @param A The input integer array.
     * @param B The integer threshold for sum comparison.
     * @return The total count of good subarrays.
     */
    public int solve(int[] A, int B) {
        int n = A.length;
        int goodSubarrayCount = 0;

        // Step 1: Precompute prefix sums to allow O(1) sum lookups for any subarray
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            // prefixSum[k] stores the sum of elements A[0]...A[k-1]
            prefixSum[i + 1] = prefixSum[i] + A[i];
        }

        // Step 2 & 3: Iterate through all possible subarrays using nested loops (O(N^2) time complexity)
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                // Calculate the length of the current subarray (A[start]...A[end])
                int currentLength = end - start + 1;

                // Calculate the sum of the current subarray in O(1) time using prefix sums
                // The sum is prefixSum[end + 1] - prefixSum[start]
                // Use long for sum calculations to avoid potential integer overflow if sums get large
                long currentSum = prefixSum[end + 1] - prefixSum[start];

                // Check Criterion 1: Even length and sum < B
                if (currentLength % 2 == 0 && currentSum < B) {
                    goodSubarrayCount++;
                }
                // Check Criterion 2: Odd length and sum > B
                else if (currentLength % 2 != 0 && currentSum > B) {
                    goodSubarrayCount++;
                }
            }
        }

        // Return the final count of subarrays that met the criteria
        return goodSubarrayCount;
    }
}