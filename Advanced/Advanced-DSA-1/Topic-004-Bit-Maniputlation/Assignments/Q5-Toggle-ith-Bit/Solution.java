public class Solution {
    /**
     * Toggles the state of the B-th bit in integer A using the XOR operation.
     * The method does not use conditional checks, relying purely on bitwise logic.
     *
     * @param A The original integer value.
     * @param B The 0-indexed bit position to toggle.
     * @return The updated integer value with the B-th bit flipped.
     */
    public int solve(int A, int B) {
        // (1 << B) creates a mask with only the B-th bit set to 1.
        // The XOR operator (^) flips the B-th bit in A if it is 1, and sets it if it is 0.
        // All other bits remain unchanged because they are XORed with 0.
        return (A^(1<<B));
    }
}