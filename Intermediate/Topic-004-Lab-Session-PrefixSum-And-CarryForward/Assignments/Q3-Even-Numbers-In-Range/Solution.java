public class Solution {
    // Main method to solve the queries
    public int[] solve(int[] A, int[][] B) {
        // Get the length of the input array A
        int n = A.length;
        // Create a prefix frequency array (pf) of size n+1 to handle 1-based indexing for calculations
        int[] pf = new int[n+1];

        // Call helper function to populate the prefix frequency array
        pf = getPrefixEven(A, pf, n);

        // Initialize the result array (ans) with the same length as the number of queries (B)
        int[] ans = new int[B.length];

        // Iterate through each query in the input B
        for(int i = 0; i < B.length; i++){
            // Extract the left boundary (L) from the current query
            int L = B[i][0];
            // Extract the right boundary (R) from the current query
            int R = B[i][1];

            // Calculate the count of even numbers in the range [L, R] using the prefix sum formula: pf[R+1] - pf[L]
            // This works because pf[R+1] is the cumulative count up to index R, and pf[L] is the count up to index L-1.
            ans[i] = pf[R+1] - pf[L];
        }

        // Return the array of results for all queries
        return ans;
    }

    // Helper function to build the prefix even count array
    int[] getPrefixEven(int[] arr, int[] pfo, int n){
        // Iterate through the input array 'arr'
        for(int i = 0; i < n; i++){
            // Populate the prefix array 'pfo' using 1-based indexing (pfo[i+1])
            // Add 1 to the previous count (pfo[i]) if the current element arr[i] is even, otherwise add 0
            pfo[i+1] = pfo[i] + (arr[i] % 2 == 0 ? 1 : 0);
        }
        // Return the populated prefix frequency array
        return pfo;
    }
}