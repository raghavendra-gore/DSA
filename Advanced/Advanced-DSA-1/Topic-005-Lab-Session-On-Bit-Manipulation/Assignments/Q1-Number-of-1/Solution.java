public class Solution {
    public int numSetBits(int A) {
        int count=0; // Initialize a counter for the number of set bits
        while (A > 0) { // Loop continues as long as there are bits remaining to check
            if ((A & 1) == 1) { // Check if the rightmost bit (least significant bit) is set (equals 1)
                count++; // Increment the counter if the rightmost bit is 1
            }
            A >>= 1; // Right-shift A by 1 position (equivalent to integer division by 2) to examine the next bit
        }
        return count; // Return the final tally of set bits
    }
}