public class Solution {
    /**
     * Calculates the sum of elements along the secondary (anti-diagonal) of a square matrix.
     * The secondary diagonal runs from the top right corner to the bottom left corner.
     *
     * @param A a 2D integer array representing a square matrix. The array should not be modified.
     * @return the sum of the elements on the secondary diagonal.
     */
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(final int[][] A) {
        // Get the dimension (number of rows or columns) of the square matrix.
        int N = A.length;

        // Initialize a variable to store the sum of diagonal elements.
        int sum = 0;

        // Iterate through the rows of the matrix.
        for (int i = 0; i < N;i++){
            // The secondary diagonal elements have row index 'i' and column index 'N - 1 - i'.
            // When i=0, column is N-1 (top right).
            // When i=N-1, column is 0 (bottom left).
            sum += A[i][N - 1 - i];
        }

        // Return the final calculated sum.
        return sum;
    }
}