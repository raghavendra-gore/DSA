public class Solution {

    /**
     * Checks if there exists any subarray of a specific length B that sums to a target value C.
     * This uses an optimized O(N) sliding window approach.
     *
     * @param A The input array of integers.
     * @param B The required length of the subarray.
     * @param C The target sum.
     * @return 1 if such a subarray exists, 0 otherwise.
     */
    public static int solve(int[] A, int B, int C) {
        // Get the total number of elements in the array
        int N = A.length;

        // Handle edge case where B is larger than the array size
        if (B > N) {
            return 0;
        }

        // --- Step 1: Calculate the sum of the initial window [0...B-1] ---
        int currentWindowSum = 0;
        for (int idx = 0; idx < B; idx++) {
            currentWindowSum += A[idx];
        }

        // Check if the very first window matches the target sum
        if (currentWindowSum == C) {
            return 1;
        }

        // --- Step 2: Slide the window across the rest of the array ---
        // 'i' represents the starting index of the window
        // 'j' represents the ending index of the window
        int i = 1;
        int j = B; // j starts at the index of the new element to be included in the second window

        // Iterate while the end of the window (j) is within the array bounds
        while (j < N) {
            // Update the current sum efficiently (O(1) operation):
            // Add the new element entering the window (at index j)
            // Subtract the element leaving the window (at index i-1)
            currentWindowSum += A[j] - A[i - 1];

            // Check if the current window's sum matches the target C
            if (currentWindowSum == C) {
                return 1; // Found a matching subarray
            }

            // Slide the window pointers one step to the right
            i++;
            j++;
        }

        // If the loop finishes without finding any matching subarray
        return 0;
    }
}