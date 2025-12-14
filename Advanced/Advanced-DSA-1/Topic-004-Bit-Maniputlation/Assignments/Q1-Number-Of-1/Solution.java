public class Solution {
    public int numSetBits(int A) {
        int count = 0;

        // Java 'int' is 32 bits. We iterate 32 times.
        for (int i = 0; i < 32; i++) {
            // Check if the i-th bit is set.
            // The result of (A & (1 << i)) will be non-zero (specifically, 2^i)
            // if the bit is set, and zero if it is not.
            if ((A & (1 << i)) != 0) {
                count++;
            }
        }
        return count;
    }
}
