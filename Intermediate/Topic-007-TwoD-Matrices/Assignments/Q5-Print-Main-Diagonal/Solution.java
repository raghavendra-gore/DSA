public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    /**
     * Calculates the sum of the main diagonal elements of a given square matrix A.
     * The main diagonal consists of elements A[i][j] where i equals j.
     *
     * @param A The input N x N integer matrix.
     * @return The sum of the main diagonal elements.
     */
    public int solve(final int[][] A) {
        // Get the number of rows in the matrix. This is N for an NxN matrix.
        int n = A.length;
        // Get the number of columns in the first row. This is also N.
        int m = A[0].length; // Note: 'm' is defined but not used in the final loop, as expected for a square matrix diagonal sum.
        // Initialize a variable to store the running sum of the diagonal elements.
        int sum = 0;
        // Iterate through the matrix indices from 0 up to N-1.
        for(int i = 0; i < n; i++){
            // Add the element at the current diagonal position (row i, column i) to the sum.
            sum += A[i][i];
        }
        // Return the final calculated sum.
        return sum;
    }
}