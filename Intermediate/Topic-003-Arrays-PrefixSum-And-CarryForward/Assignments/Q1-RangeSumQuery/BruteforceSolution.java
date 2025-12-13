public class Solution {

    /**
     * Calculates the sum of elements within specified ranges for a given array using a naive approach.
     * For each query, it iterates through the range [L, R] to calculate the sum.
     *
     * Time Complexity: O(N * Q) in the worst case (where Q is the number of queries).
     *
     * @param arr The input integer array (0-indexed).
     * @param queries A 2D array of queries, where each row represents a [L, R] query.
     * @param N The length of the input array arr (can be derived from arr.length).
     * @param Q The number of queries (can be derived from queries.length).
     * @return An integer array of results where results[i] is the sum of arr[L...R] for the i-th query.
     */
    public int[] querySum(int[] arr, int[][] queries, int N, int Q) {
        // Initialize an array to store the results for all Q queries.
        int[] ans = new int[Q];

        // Iterate through each query provided in the 'queries' array.
        for (int i = 0; i < Q; i++) {
            // Extract the left (L) and right (R) indices for the current query.
            int L = queries[i];
            int R = queries[i];

            // Initialize a variable to accumulate the sum for the current range.
            int sum = 0;

            // Iterate from index L to R (inclusive) in the original array 'arr'.
            // This nested loop makes the solution inefficient for large inputs.
            for (int j = L; j <= R; j++) {
                sum += arr[j];
            }

            // Store the calculated sum in the answer array for the current query index 'i'.
            ans[i] = sum;
        }

        // Return the array containing all calculated range sums.
        return ans;
    }
}