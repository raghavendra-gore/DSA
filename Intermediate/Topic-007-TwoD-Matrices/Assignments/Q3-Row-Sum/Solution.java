public class Solution {
    // Method to calculate the sum of each row in a 2D integer array
    public int[] solve(int[][] A) {
        // Get the number of rows in the input matrix A
        int n = A.length;
        // Get the number of columns in the first row of A (assuming all rows have the same number of columns based on problem constraints)
        int m = A[0].length;
        // Initialize a 1D array to store the sum of each row, sized to the number of rows
        int[] ans = new int[n];
        // Loop through each row of the matrix
        for(int i = 0; i < n; i++){
            // Initialize a variable to accumulate the sum of the current row
            int sum = 0;
            // Loop through each element in the current row
            for(int j = 0; j < m; j++){
                // Add the current element to the row sum
                sum += A[i][j];
            }
            // Store the calculated sum for the current row in the result array
            ans[i] = sum;
        }
        // Return the array containing the sums of all rows
        return ans;
    }
}