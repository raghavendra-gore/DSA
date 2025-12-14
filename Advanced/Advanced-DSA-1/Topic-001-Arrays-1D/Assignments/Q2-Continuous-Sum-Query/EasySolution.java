public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] arr = new int[A];

        // Step 2: Apply Range Updates using the difference array technique
        for (int i = 0; i < B.length; i++) {
            int L = B[i][0];
            int R = B[i][1];
            int P = B[i][2];

            // Add P at the starting index L (using 0-based indexing as implied by the code's usage of L/R directly)
            arr[L - 1] += P;

            // Subtract P at the index immediately after the ending index R (R+1)
            if (R < A) {
                arr[R] -= P;
            }
        }

        // Step 3: Calculate the Prefix Sum (Cumulative Sum)
        // CRITICAL FIX: The loop must start from the second element (i = 1)
        // because the prefix sum for the first element (i = 0) is just arr[0] itself.
        for (int i = 1; i < A; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }
}
