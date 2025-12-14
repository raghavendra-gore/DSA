public class Solution {
    public int solve(int[][] A) {

        int ans = 0;

        // Number of rows
        int n = A.length;

        // Number of columns
        int m = A[0].length;

        // Iterate over each element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Contribution of A[i][j] to all submatrices
                ans += A[i][j] * (i + 1) * (j + 1) * (m - j) * (n - i);
            }
        }

        return ans;
    }
}