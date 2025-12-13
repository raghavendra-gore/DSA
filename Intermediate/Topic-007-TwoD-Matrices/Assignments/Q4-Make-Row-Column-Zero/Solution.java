public class Solution {
    // Method to set entire rows and columns to zero if any element in that row/column is zero
    public int[][] solve(int[][] A) {
        // Get the number of rows (n) in the input matrix A
        int n = A.length;
        // Get the number of columns (m) in the input matrix A (assuming all rows have the same length)
        int m = A[0].length;

        // Create a boolean array 'row' to mark which rows contain at least one zero
        boolean[] row = new boolean[n];
        // Create a boolean array 'col' to mark which columns contain at least one zero
        boolean[] col = new boolean[m];

        // First pass: Iterate through the matrix to find the positions of all zeros
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                // If a zero is found at A[i][j]
                if(A[i][j] == 0){
                    // Mark the corresponding row as needing to be zeroed
                    row[i] = true;
                    // Mark the corresponding column as needing to be zeroed
                    col[j] = true;
                }
            }
        }

        // Second pass: Iterate through the rows and set all elements to zero if the row was marked
        for(int i = 0; i < n; i++){
            // Check if the current row needs to be zeroed
            if(row[i] == true){
                // Iterate through all columns in this specific row
                for(int j = 0; j < m; j++){
                    // Set the element to zero
                    A[i][j] = 0;
                }
            }
        }

        // Third pass: Iterate through the columns and set all elements to zero if the column was marked
        for(int j = 0; j < m; j++){
            // Check if the current column needs to be zeroed
            if(col[j] == true){
                // Iterate through all rows in this specific column
                for(int i = 0; i < n; i++){
                    // Set the element to zero
                    A[i][j] = 0;
                }
            }
        }

        // Return the modified matrix
        return A;
    }
}