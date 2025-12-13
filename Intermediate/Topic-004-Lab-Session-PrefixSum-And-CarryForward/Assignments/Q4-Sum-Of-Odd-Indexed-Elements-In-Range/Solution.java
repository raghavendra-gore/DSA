public class Solution {
    // Main method to process queries for sums of odd-indexed elements within given ranges
    public int[] sumOfOddIndexedElements(int[] A, int[][] B) {
        int n = A.length;
        // Initialize an array to store prefix sums of only odd-indexed elements
        int[] pfo = new int[n];
        // Populate the prefix sum array
        pfo = getPrefixOddSum(A, pfo, n);

        // Array to store the results for all queries
        int[] ans = new int[B.length];
        // Iterate through each query in B
        for(int i = 0; i < B.length; i++){
            // Extract the left (L) and right (R) bounds of the current range query
            int L = B[i][0];
            int R = B[i][1];

            // Calculate the sum using the prefix sum array
            // If the left bound is 0, the sum is simply the prefix sum up to index R
            if(L == 0){
                ans[i] = pfo[R];
            } else{
                // Otherwise, the sum in range [L, R] is pfo[R] - pfo[L-1]
                ans[i] = pfo[R] - pfo[L - 1];
            }
        }
        // Return the final array of answers
        return ans;
    }

    // Helper method to compute the prefix sum array for odd indices
    int[] getPrefixOddSum(int[] arr, int[] pfo, int n){
        // The prefix sum up to index 0 (inclusive) is 0 because 0 is even
        pfo[0] = 0;
        // Iterate from the second element up to the end of the array
        for(int i = 1; i < n; i++){
            // Start with the previous prefix sum
            pfo[i] = pfo[i-1];
            // If the current index 'i' is odd, add the element A[i] to the sum
            if(i % 2 == 1){
                pfo[i] += arr[i];
            }
        }
        // Return the populated prefix sum array
        return pfo;
    }
}