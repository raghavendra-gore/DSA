public class Solution {
    // This method calculates the prefix sum of an array A and modifies A in-place to store the results.
    public int[] solve(int[] A) {
        // Get the length of the array A
        int n = A.length;

        // Iterate through the array starting from the second element (index 1)
        for(int i = 1; i < n; i++){
            // Update the current element A[i] to be the sum of the previous element
            // (which now holds the prefix sum up to index i-1) and the original A[i] value.
            // This transforms the array into its prefix sum representation in-place.
            A[i] = A[i-1]+A[i];
        }

        // Return the modified array A, which now contains the prefix sums
        return A;
    }
}