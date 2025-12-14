public class Solution {
    public int solve(int A) {
        // Initialize 'bit' to track the current bit position (starting from 0 for LSB)
        int bit = 0, x = 0;

        // Loop iterates through the bits of the original integer A from least significant to most significant
        // This process essentially decomposes A and constructs X simultaneously
        while (A != 0) {
            // Check if the least significant bit of the current A is 0 (unset)
            if (A % 2 == 0) {
                // If the bit is unset in A, set the corresponding bit in X
                // The expression (1 << bit) generates a mask with only the current bit position set
                x = x | (1 << bit);
            }
            // Right shift A by one bit (equivalent to integer division by 2)
            A /= 2;
            // Increment the bit position counter
            bit++;
        }

        // After the loop, 'bit' holds the position one greater than the highest set bit in the original A
        // Calculate Y: Y is a power of 2 just greater than the original A (e.g., if A=5, Y=8)
        int y = (1 << bit);

        // Return the bitwise XOR of the calculated X and Y
        return x ^ y;
    }
}