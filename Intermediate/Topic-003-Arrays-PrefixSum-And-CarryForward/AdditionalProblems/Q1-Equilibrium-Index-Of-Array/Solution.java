public class Solution {
    // Main method to find the equilibrium index of the given array A
    public int solve(int[] A) {
        // Calculate the standard prefix sum array of A
        int[] pf = getPrefixSum(A, A.length);
        int n = A.length;
        // Initialize answer variable, though the return statement handles output
        int ans = 0;

        // Iterate through potential equilibrium indices, skipping the edge cases (0 and n-1) for now
        // Loop runs from index 1 up to index n-2
        for(int i = 1; i < n - 1; i++){
            // Calculate the sum of elements to the left of index i (indices 0 to i-1)
            int lsum = pf[i - 1];
            // Calculate the sum of elements to the right of index i (indices i+1 to n-1)
            // Total Sum (pf[n-1]) - Sum up to index i (pf[i]) gives sum from i+1 to n-1
            int rsum = pf[n-1] - pf[i];

            // Check if the left sum equals the right sum
            if(lsum == rsum){
                // If true, we found the first (minimum) equilibrium index, return it immediately
                return i;
            }
        }

        // --- Handle Edge Cases ---

        // Check if index 0 is an equilibrium index.
        // Left sum is 0 by definition. Right sum is the total sum minus A[0] (pf[n-1] - pf[0]).
        // If 0 == pf[n-1] - pf[0], then index 0 works.
        if(0 == pf[n-1] - pf[0]){
            return 0;
        }

        // Check if the last index (n-1) is an equilibrium index.
        // Right sum is 0 by definition. Left sum is the sum up to index n-2 (pf[n-2]).
        // If pf[n-2] == 0, then the last index works.
        if(pf[n-2] == 0){
            return n-1;
        }

        // If no equilibrium index was found in the loop or edge cases, return -1
        return -1;
    }

    // Helper method to generate the standard cumulative prefix sum array
    static int[] getPrefixSum(int[] arr, int n){
        int[] pf = new int[n];
        // The first element of the prefix sum array is the first element of the original array
        pf[0] = arr[0];
        // Iterate from the second element onwards
        for(int i = 1; i < n; i++){
            // The current prefix sum is the previous prefix sum plus the current array element
            pf[i] = pf[i-1] + arr[i];
        }
        // Return the fully computed prefix sum array
        return pf;
    }
}