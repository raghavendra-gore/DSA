public class Solution {

    /**
     * Finds the maximum sum among all subarrays of a given length B.
     * This uses an optimized O(N) sliding window approach to find the max sum efficiently.
     *
     * @param A The input array of integers.
     * @param B The required length of the subarray.
     * @return The maximum sum found among all subarrays of length B, returned as a Long to prevent overflow.
     */
    public Long solve(int[] A, int B) {
        // Use a long to store sums, as the sum can exceed standard integer limits (up to N * A[i] = 10^5 * 10^6 = 10^11)
        long currentWindowSum = 0L;
        long maxSum = 0L;
        int N = A.length;

        // Handle edge case where B is invalid relative to array size
        if (B > N || B <= 0) {
            // Depending on problem constraints/requirements, you might throw an exception.
            // Returning MIN_VALUE might be appropriate if a result is expected.
            return Long.MIN_VALUE;
        }

        // The original code had a specific edge case check for size 1,
        // which isn't strictly necessary with the main logic but included here for fidelity:
        if (N == 1 && B == 1) {
            return (long)A[0];
        }

        // --- Step 1: Calculate the sum of the first window [0...B-1] ---
        for (int idx = 0; idx < B; idx++) {
            currentWindowSum += A[idx];
        }

        // Initialize our maximum sum found so far with the first window's sum
        maxSum = currentWindowSum;

        // --- Step 2: Slide the window across the rest of the array ---
        // 'i' represents the starting index of the window
        // 'j' represents the ending index of the window (the new element entering)
        int i = 1;
        int j = B;

        // Iterate while the end of the window (j) is within the array bounds
        while (j < N) {
            // Update the current window sum efficiently (O(1) operation):
            // Add the new element entering the window (at index j)
            // Subtract the element leaving the window (at index i-1)
            currentWindowSum += A[j] - A[i - 1];

            // Update the maximum sum found so far if the current window sum is greater
            maxSum = Math.max(maxSum, currentWindowSum);

            // Slide the window pointers one step to the right
            i++;
            j++;
        }

        // Return the final maximum sum found
        return maxSum;
    }
}