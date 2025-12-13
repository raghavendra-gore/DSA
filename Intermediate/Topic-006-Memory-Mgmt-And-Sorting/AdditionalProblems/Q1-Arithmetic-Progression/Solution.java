public class Solution {
    public int solve(int[] A) {
        int N = A.length;

        // Step 1: Handle edge cases (0 or 1 elements always form an AP)
        if (N <= 1) {
            return 1;
        }

        // Step 2: Sort the array
        Arrays.sort(A);

        // Step 3: Calculate the common difference from the first two elements
        int commonDiff = A[1] - A[0];

        // Step 4: Verify that all subsequent differences match the common difference
        for (int i = 2; i < N; i++) {
            if (A[i] - A[i - 1] != commonDiff) {
                // Not an arithmetic progression
                return 0;
            }
        }

        // Step 5: All differences matched
        return 1;
    }
}
