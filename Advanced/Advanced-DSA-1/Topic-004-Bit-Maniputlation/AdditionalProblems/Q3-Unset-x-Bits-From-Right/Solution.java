public class Solution {
    public long solve(long A, int B) {

        long ans=A; // Initialize the answer with the original value of A
        // Iterate through the first B bit positions, starting from the rightmost (index 0)
        for(int i=0;i<B;i++){
            // Check if the i-th bit of A is set (greater than 0 when ANDed with the mask 1L<<i)
            if((A & (1L<<i)) > 0)
                // If the bit is set, unset it in the 'ans' by subtracting its value (1L<<i)
                ans -= (1L<<i);
        }
        return ans; // Return the final value of ans with the rightmost B bits unset
    }
}