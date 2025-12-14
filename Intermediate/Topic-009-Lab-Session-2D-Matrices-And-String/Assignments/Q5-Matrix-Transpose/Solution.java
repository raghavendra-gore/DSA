public class Solution {
    /**
     * Calculates and returns the transpose of a given 2D integer matrix A.
     * The transpose operation swaps the row and column indices.
     *
     * @param A The input 2D integer matrix.
     * @return A new 2D integer matrix representing the transpose of A.
     */
    public int[][] solve(int[][] A) {
        // Create a new result matrix 'transpose' with swapped dimensions:
        // Rows of 'transpose' = Columns of 'A' (A[0].length)
        // Columns of 'transpose' = Rows of 'A' (A.length)
        int[][] transpose = new int[A[0].length][A.length];

        // Iterate through the columns of the original matrix A (outer loop controls the new row index)
        for(int j = 0; j < A[0].length; j++){
            // Iterate through the rows of the original matrix A (inner loop controls the new column index)
            for(int i = 0; i < A.length; i++){
                // Assign the element from A[i][j] to the transposed position transpose[j][i]
                transpose[j][i] = A[i][j];
            }
        }

        // Return the newly populated transpose matrix
        return transpose;
    }
}