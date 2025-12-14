public class Solution {
    public int solve(int A) {
        long magicNumber = 0;
        long powerOfFive = 5;
        int n = A;

        // Iterate through the bits of the input integer A
        while (n > 0) {
            // Check if the rightmost bit is set (if A is odd)
            if ((n & 1) == 1) {
                magicNumber += powerOfFive;
            }

            // Move to the next bit (equivalent to dividing n by 2)
            n >>= 1;

            // Move to the next power of 5
            powerOfFive *= 5;
        }

        return (int)magicNumber;
    }
}
