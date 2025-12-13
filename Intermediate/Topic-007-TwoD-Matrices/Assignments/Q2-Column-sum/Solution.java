public class Solution {
    /**
     * Calculates the column-wise sums of a 2D integer matrix A.
     *
     * @param A The input 2D integer matrix.
     * @return A 1D integer array containing the sum of each column.
     */
    public int[] solve(int[][] A) {
        // Get the number of rows in the matrix.
        int n = A.length;
        // Get the number of columns in the first row (assuming a rectangular matrix).
        int m = A[0].length;

        // Initialize the result array 'ans' with the size equal to the number of columns.
        // This array will store the final sum for each column.
        int[] ans = new int[m];

        // Iterate through each column index 'j' from 0 to m-1.
        for(int j = 0; j < m; j++){
            // Initialize a temporary sum variable for the current column 'j'.
            int sum = 0;

            // Iterate through each row index 'i' from 0 to n-1.
            for(int i = 0; i < n; i++){
                // Add the element at the current row 'i' and current column 'j' to the temporary sum.
                sum += A[i][j];
            }

            // After summing all elements in column 'j', assign the total sum to the
            // corresponding position in the result array 'ans'.
            ans[j] = sum;
        }

        // Return the final 1D array containing all column sums.
        return ans;
    }
}