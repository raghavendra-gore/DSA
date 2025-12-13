public class Solution {
    /**
     * Finds the starting index of the subarray of size B with the least average/sum.
     * Uses a sliding window approach for efficiency.
     *
     * @param A The input array of integers.
     * @param B The required subarray size.
     * @return The starting index (0-based) of the minimum average subarray.
     */
    public int solve(int[] A, int B) {
        int n = A.length;

        if (n < B) {
            // Cannot form a subarray of size B if the array is shorter than B
            return -1; // Return -1 or handle error as appropriate for constraints/prompt
        }

        // Step 1: Calculate the sum of the first window of size B (indices 0 to B-1)
        int currentSum = 0;
        for (int i = 0; i < B; i++) {
            currentSum += A[i];
        }

        // Initialize minimum sum found so far and its corresponding starting index
        int minSum = currentSum;
        int minIndex = 0; // The starting index of the window with the min sum

        // Step 2: Slide the window across the rest of the array (starting from the second window)
        // The loop iterates through all possible starting indices for a window of size B
        for (int i = 1; i <= n - B; i++) {
            // Step 3: Update the current sum for the next window efficiently (O(1) update)
            // Subtract the element leaving the window (at index i-1)
            // Add the element entering the window (at index i + B - 1, the new right edge)
            currentSum = currentSum - A[i - 1] + A[i + B - 1];

            // Step 4: Check if this new window's sum is smaller than the minimum found so far
            if (currentSum < minSum) {
                minSum = currentSum;
                minIndex = i; // Update the starting index to the current index 'i'
            }
        }

        // Step 5: Return the starting index of the subarray with the least sum/average
        return minIndex;
    }
}