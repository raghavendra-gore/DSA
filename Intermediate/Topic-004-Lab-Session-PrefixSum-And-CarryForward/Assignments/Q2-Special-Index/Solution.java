public class Solution {
    // Main method to count "special" indices where removing the element makes
    // the sum of remaining even-indexed and odd-indexed elements equal.
    public int solve(int[] A) {
        int n = A.length;
        // Arrays to store prefix sums of even indices and odd indices of the original array A
        int[] pfe = new int[n];
        int[] pfo = new int[n];

        // Populate the prefix sum arrays using helper functions
        pfe = getPrefixEvenSum(A, pfe, n);
        pfo = getPrefixOddSum(A, pfo, n);

        int count = 0; // Counter for the number of special indices found
        int se = 0; // Variable to store the new sum of even-indexed elements after removal
        int so = 0; // Variable to store the new sum of odd-indexed elements after removal

        // Iterate through each index 'i' of the array to simulate removal of A[i]
        for (int i = 0; i < n; i++) {
            // Special handling for the first index (i == 0)
            if (i == 0) {
                // If A[0] is removed, the new even sum is the sum of all original odd elements (since indices shift)
                se = pfo[n - 1] - pfo[0]; // pfo[n-1] holds total odd sum, pfo[0] is 0
                // The new odd sum is the sum of all original even elements (since indices shift)
                so = pfe[n - 1] - pfe[0]; // pfe[n-1] holds total even sum, pfe[0] is A[0]
            } else {
                // For i > 0, calculate sums:
                // New Even Sum (se) = (Left Even Sum) + (Right Odd Sum after shift)
                // Right Odd Sum in original array = Total Odd Sum - Sum of Odds up to i (pfo[i])
                se = pfe[i - 1] + pfo[n - 1] - pfo[i];

                // New Odd Sum (so) = (Left Odd Sum) + (Right Even Sum after shift)
                // Right Even Sum in original array = Total Even Sum - Sum of Evens up to i (pfe[i])
                so = pfo[i - 1] + pfe[n - 1] - pfe[i];
            }

            // Check if the modified even sum equals the modified odd sum
            if (se == so) {
                count++; // If they are equal, increment the special index count
            }
        }
        // Return the total count of special indices
        return count;
    }

    // Helper method to generate the prefix sum array for only even indices
    int[] getPrefixEvenSum(int[] arr, int[] pfe, int n) {
        pfe = arr; // pfe[0] is A[0] (index 0 is even)

        for (int i = 1; i < n; i++) {
            pfe[i] = pfe[i - 1];
            if (i % 2 == 0)
                pfe[i] += arr[i]; // Add A[i] only if the index is even
        }
        return pfe;
    }

    // Helper method to generate the prefix sum array for only odd indices
    int[] getPrefixOddSum(int[] arr, int[] pfo, int n) {
        pfo = 0; // pfo[0] is 0 (index 0 is not odd)

        for (int i = 1; i < n; i++) {
            pfo[i] = pfo[i - 1];
            if (i % 2 == 1)
                pfo[i] += arr[i]; // Add A[i] only if the index is odd
        }
        return pfo;
    }
}