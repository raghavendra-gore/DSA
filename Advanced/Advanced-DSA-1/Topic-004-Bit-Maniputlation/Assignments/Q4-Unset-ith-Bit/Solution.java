public class Solution {
    /**
     * Unsets the B-th bit in integer A if it is currently set.
     * If the B-th bit is already unset, it leaves A unchanged.
     *
     * @param A The original integer value.
     * @param B The 0-indexed bit position to check and potentially modify.
     * @return The updated integer value.
     */
    public int solve(int A, int B) {
        // First, check if the B-th bit of A is set using the helper function.
        if(checkBit(A, B) == true){
            // If the B-th bit is set, use the XOR operation (^) to toggle that specific bit off.
            // (1 << B) creates a mask with only the B-th bit set.
            // XOR with this mask flips only that one bit (1 ^ 1 = 0).
            return (A^(1<<B));
        } else{
            // If the B-th bit is already unset (0), return the original value A unchanged.
            return A;
        }
    }

    /**
     * Helper function to check if the i-th bit of an integer n is set (1) or unset (0).
     *
     * @param n The integer to check.
     * @param i The bit position (0-indexed) to check.
     * @return true if the bit is 1, false if the bit is 0.
     */
    boolean checkBit(int n, int i){
        // Create a mask (1 << i) to isolate the i-th bit.
        // Use bitwise AND (&) to see if the isolated bit is 0 or non-zero.
        if((n&(1<<i)) == 0){
            return false; // Bit is 0 (unset)
        }else{
            return true; // Bit is 1 (set)
        }
    }
}