public class Solution {

    /**
     * Extracts a range of elements from an input array A, specifically from index B to index C (inclusive),
     * and returns them as a new integer array.
     *
     * @param A The input array of integers.
     * @param B The starting index of the sub-array (inclusive).
     * @param C The ending index of the sub-array (inclusive).
     * @return A new int array containing elements from A[B] to A[C].
     */
    public int[] solve(int[] A, int B, int C) {
        // Calculate the length of the sub-array needed.
        // The number of elements is C - B + 1.
        int subArrayLength = C - B + 1;

        // Declare and initialize a new native integer array of the exact size required.
        int[] ans = new int[subArrayLength];

        // Iterate from the start index B to the end index C (inclusive) of the original array.
        for (int i = B; i <= C; i++) {
            // Map the index 'i' from the original array A to the corresponding
            // relative index in the new 'ans' array (i - B).
            ans[i - B] = A[i];
        }

        // Return the newly created array containing the specified range.
        return ans;
    }
}