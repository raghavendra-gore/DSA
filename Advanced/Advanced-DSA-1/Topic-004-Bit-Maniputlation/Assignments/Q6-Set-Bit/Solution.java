public class Solution {
    /**
     * Sets the A-th and B-th bits starting from an initial state of zero,
     * returning the resulting integer value. This implementation uses addition
     * to combine the values, handling the A == B case separately.
     *
     * @param A The 0-indexed position of the first bit to set.
     * @param B The 0-indexed position of the second bit to set.
     * @return The resulting integer with only the A-th and B-th bits set.
     */
    public int solve(int A, int B) {
        // Create an integer where only the A-th bit is set (e.g., 1 << 3 results in binary 1000).
        int num = (1 << A);

        // Check if the two bit positions are different.
        if(A != B){
            // If they are different, calculate the value representing the B-th bit set
            // (1 << B) and add it to 'num'.
            // This works correctly because the bits A and B are in different positions, so no carries overlap.
            num += (1 << B);
        }

        // If A == B, the addition is skipped, and 'num' correctly contains only that single bit set.
        // Return the final combined decimal value.
        return num;
    }
}