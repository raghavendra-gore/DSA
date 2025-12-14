public class Solution {
    /**
     * Rotates an n x n 2D matrix by 90 degrees clockwise in-place.
     * This method first transposes the matrix and then reverses each row.
     *
     * @param A The input n x n integer matrix.
     */
    public void solve(int[][] A) {
        // Get the dimensions of the square matrix
        int n = A.length;
        // Assuming it's a square matrix, m should also be n, but using A[0].length is fine
        int m = A[0].length;

        // Step 1: Transpose the matrix in-place
        // Iterate through the upper triangle of the matrix (above the main diagonal)
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                // Swap element A[i][j] with A[j][i]
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        // Step 2: Reverse each row of the transposed matrix
        for(int i = 0; i < n; i++){
            // Call a helper function to reverse the current row
            reverseRow(A[i]);
        }
    }

    /**
     * Helper method to reverse the elements of a single integer array in-place.
     *
     * @param arr The input integer array (a row of the matrix).
     */
    static void reverseRow(int[] arr){
        // Initialize two pointers, one at the start and one at the end of the array
        int i = 0;
        int j =  arr.length - 1;

        // Swap elements until the pointers meet or cross in the middle
        while(i < j){
            // Swap the elements at the current pointer positions
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            // Move the left pointer forward
            i++;
            // Move the right pointer backward
            j--;
        }
    }
}