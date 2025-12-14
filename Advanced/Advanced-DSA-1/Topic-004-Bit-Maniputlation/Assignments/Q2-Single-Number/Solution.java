public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    /**
     * Function to find the single integer that appears only once in an array
     * where all other elements appear exactly twice.
     *
     * This solution uses a bit manipulation approach by counting bits at each position.
     *
     * @param A The input array of integers.
     * @return The single non-duplicate integer.
     */
    public int singleNumber(final int[] A) {
        int n = A.length;
        // 'ans' will store the result as we reconstruct it bit by bit.
        int ans = 0;

        // Iterate through all 32 possible bits of an integer (from 0 to 31).
        for(int i =0; i < 32; i++){
            // 'count' stores how many times the i-th bit is set across all numbers in the array.
            int count = 0;

            // Iterate through every number in the input array.
            for(int j = 0; j < n; j++){
                // Check if the i-th bit of the current number A[j] is set (equal to 1).
                if(checkBit(A[j], i) == true){
                    count++; // Increment count if the bit is set.
                }
            }

            // If the total count of the i-th bit across all numbers is odd,
            // it means the single occurring number must have this bit set.
            if(count % 2 == 1){
                // Set the i-th bit in our 'ans' variable using bitwise OR.
                ans = ans | (1<<i);
            }
        }

        // Return the reconstructed integer 'ans'.
        return ans;
    }

    /**
     * Helper function to check if the i-th bit of an integer n is set (1) or unset (0).
     *
     * @param n The integer to check.
     * @param i The bit position (0-indexed) to check.
     * @return true if the bit is 1, false if the bit is 0.
     */
    boolean checkBit(int n, int i){
        // Use bitwise AND with a mask (1 shifted left by i positions) to isolate the i-th bit.
        if((n&(1<<i)) == 0){
            return false;
        }else{
            return true;
        }
    }
}