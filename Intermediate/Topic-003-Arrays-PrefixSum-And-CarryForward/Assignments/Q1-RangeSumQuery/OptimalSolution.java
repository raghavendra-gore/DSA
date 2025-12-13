public class Solution {
    /**
     * Calculates the sum of elements within specified ranges for a given array.
     * This method uses the prefix sum technique for O(1) query time.
     *
     * @param A The input integer array (0-indexed).
     * @param B A 2D array of queries, where each row B[i] = [L, R].
     * @return A long array of results where results[i] is the sum of A[L...R] for the i-th query.
     */
    public long[] rangeSum(int[] A, int[][] B) {
        // Step 1: Pre-compute the prefix sum array from A.
        // We use 'long' for the prefix sum array to prevent potential integer overflow,
        // as the sum of elements can exceed the range of an 'int'.
        long[] pf = getPrefixSum(A, A.length);

        // Initialize the answer array to store the results for all M queries.
        long[] ans = new long[B.length];

        // Step 2: Iterate through each query in the input array B.
        for(int i = 0; i < B.length; i++){
            // Extract the left (L) and right (R) indices for the current query.
            int L = B[i][0];
            int R = B[i][1];

            // Step 3: Use the prefix sum array to calculate the range sum in O(1) time.
            if(L == 0){
                // If L is 0, the sum from A[0] to A[R] is simply pf[R].
                ans[i] = pf[R];
            } else{
                // The sum from A[L] to A[R] is total sum up to R minus total sum up to L-1.
                // Sum(L, R) = Sum(0, R) - Sum(0, L-1)
                ans[i] = pf[R] - pf[L-1];
            }
        }
        // Return the array containing all calculated range sums.
        return ans;
    }

    /**
     * Helper function to generate the prefix sum array for a given input array.
     *
     * @param arr The original integer array.
     * @param n The length of the array.
     * @return The prefix sum array as a long array.
     */
    static long[] getPrefixSum(int[] arr, int n){
        // Initialize the prefix sum array.
        long[] pf = new long[n];

        // The prefix sum at index 0 is the element itself.
        pf[0] = arr[0];

        // Iterate from the second element to the end of the array.
        for(int i = 1; i < n; i++){
            // Calculate the current prefix sum:
            // pf[i] = (cumulative sum up to i-1) + (current element at i)
            pf[i] = pf[i-1] + arr[i];
        }

        return pf;
    }
}