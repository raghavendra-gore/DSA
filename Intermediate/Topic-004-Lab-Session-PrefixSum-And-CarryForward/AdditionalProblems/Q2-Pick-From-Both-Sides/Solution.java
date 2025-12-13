public class Solution {
    /**
     * Calculates the maximum possible sum of B elements removed from either end of the array A.
     *
     * @param A The input integer array.
     * @param B The number of elements to remove.
     * @return The maximum possible sum.
     */
    public int solve(int[] A, int B) {
        int n = A.length;
        int currentSum = 0;

        // Calculate the initial sum assuming we take all B elements from the front (left side)
        for(int i = 0; i < B; i++){
            currentSum += A[i];
        }

        // Initialize maxSum with the initial front-only sum
        int maxSum = currentSum;

        // Iterate B times to explore all combinations of taking elements from the front and back
        // In each iteration 'i', we swap the i-th element from the end of the initial front selection
        // with the i-th element from the physical back of the array.
        for(int i = 1; i <= B; i++){
            // Remove the element from the front selection that is being swapped out
            // A[B - i] is the element that corresponds to the 'i'th position from the right end of our initial B elements
            currentSum -= A[B - i];

            // Add the element from the back of the full array that is being swapped in
            // A[n - i] is the 'i'th element from the right end of the entire array
            currentSum += A[n - i];

            // Update maxSum if the current combination yields a higher sum
            maxSum = Math.max(maxSum, currentSum);
        }

        // Return the maximum sum found across all possible combinations
        return maxSum;
    }
}