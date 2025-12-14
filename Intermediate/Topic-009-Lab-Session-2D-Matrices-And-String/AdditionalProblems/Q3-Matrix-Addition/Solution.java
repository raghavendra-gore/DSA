public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        // Initialize the result matrix 'ans' with the same dimensions as A (and B)
        int[][] ans = new int[A.length][A[0].length];

        // Iterate through each row of the matrices using index 'i'
        for(int i = 0; i < A.length; i++){
            // Iterate through each column of the matrices using index 'j'
            for(int j = 0; j < A[0].length; j++){
                // Perform element-wise addition and store the result in the corresponding cell of 'ans'
                ans[i][j] = A[i][j] + B[i][j];
            }
        }

        // Return the resulting sum matrix
        return ans;
    }
}