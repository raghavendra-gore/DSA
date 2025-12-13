public class Solution {
    // Main method to process queries for sums of even-indexed elements within given ranges
    public int[] sumOfEvenIndexedElements(int[] A, int[][] B) {
        // Calculate the prefix sums array tailored for even indices
        int[] pf = getPrefixSum(A, A.length);
        // Initialize an array to store the results for each query in B
        int[] ans = new int[B.length];

        // Iterate through each query in the input 2D array B
        for(int i = 0; i < B.length; i++){
            // Extract the left (L) and right (R) bounds of the current query range
            int L = B[i][0];
            int R = B[i][1];

            // If the range starts at index 0, the sum is simply the prefix sum up to R
            if(L == 0){
                ans[i] = pf[R];
            }
            // Otherwise, calculate the range sum using the difference method:
            // Sum[L..R] = Sum[0..R] - Sum[0..L-1]
            else{
                ans[i] = pf[R] - pf[L-1];
            }
        }
        // Return the array containing all calculated range sums
        return ans;
    }

    // Helper method to generate the prefix sum array for even indices
    static int[] getPrefixSum(int[] arr, int n){
        // Create a new array to store the prefix sums
        int[] pf = new int[n];
        // The first element of the prefix sum is just the first element of the original array (index 0 is even)
        pf[0] = arr[0];

        // Iterate through the array starting from the second element
        for(int i = 1; i < n; i++){
            // Copy the previous prefix sum value initially
            pf[i] = pf[i-1];
            // If the current index 'i' is even, add the value of arr[i] to the running total
            if(i % 2 == 0){
                pf[i]+=arr[i];
            }
        }
        // Return the completed prefix sum array
        return pf;
    }
}