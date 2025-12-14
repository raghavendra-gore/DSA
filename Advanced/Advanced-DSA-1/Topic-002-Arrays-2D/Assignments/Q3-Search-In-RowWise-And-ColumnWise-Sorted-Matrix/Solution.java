public class Solution {
    // Method to find the target integer B in a row/column-sorted matrix A
    public int solve(int[][] A, int B) {
        int n = A.length; // Get the number of rows (N)
        int m = A[0].length; // Get the number of columns (M)
        int i = 0, j = m-1; // Start the search from the top-right corner of the matrix (0-based indexing)

        // Iterate as long as we are within the bounds of the matrix
        while(i < n && j >=0){
            // If the current element matches the target B
            if(A[i][j] == B){
                // Return the position using the specified formula (1-based indexing)
                // Note: The original code snippet was incomplete here, assuming standard formula completion
                return (i + 1) * 1009 + (j + 1);
            }
            // If the current element is greater than B
            else if(A[i][j] > B){
                // B must be to the left (if present), so move one column left
                j--;
            }
            // If the current element is less than B
            else{
                // B must be below (if present), so move one row down
                i++;
            }
        }
        // If the loop finishes without finding B, return -1 as specified
        return -1;
    }
}