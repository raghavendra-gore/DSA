public class Solution {
    public int solve(int[][] A) {
        int n = A.length; // Get the dimension of the square matrix (N x N)
        int ans = 0, i, j; // Initialize the answer variable (row index) and loop counters

        // Start traversal from the top-right corner of the matrix
        // 'i' iterates through rows (0 to N-1), 'j' iterates backwards through columns (N-1 to 0)
        for (i = 0, j = n - 1; i < n && j >= 0; i++){

            // While the current cell contains a '1' and we haven't run off the left edge
            while(A[i][j] == 1 && j >= 0){
                // This row 'i' has at least one '1', making it a potential candidate
                // for the row with the maximum number of '1's found so far.
                // We update 'ans' because we prioritize the top-most (lowest index) row
                // among those with the same number of '1's.
                ans = i;

                // Move one step left in the current row to find the boundary
                // between 0s and 1s, optimizing search for subsequent rows.
                j--;
            }
            // If the current cell is '0', we stop the inner while loop and
            // the outer loop increments 'i' to check the next row down,
            // reusing the current column 'j' index (or the last optimized index).
        }

        // Return the index of the row that was last recorded as having '1's.
        return ans;
    }
}