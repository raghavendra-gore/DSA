public class Solution {
    /**
     * Performs scalar multiplication on the input matrix A in-place using the scalar B.
     * Modifies the original matrix A directly.
     *
     * @param A The input 2D integer matrix (which will be modified).
     * @param B The integer scalar value for multiplication.
     * @return The modified 2D integer matrix A after scalar multiplication.
     */
    public int[][] solve(int[][] A, int B) {
        // Get the number of rows in the matrix.
        int n = A.length;
        // Get the number of columns in the first row of the matrix.
        int m = A[0].length;

        // Iterate through each row of the matrix using index i (0 to n-1).
        for(int i = 0; i < n; i++){
            // Iterate through each column in the current row using index j (0 to m-1).
            for(int j = 0; j < m; j++){
                // Multiply the current element A[i][j] by the scalar B and update the element in-place.
                A[i][j] = B * A[i][j];
            }
        }
        // Return the reference to the original, now modified, matrix A.
        return A;
    }
}