public class Solution {
    public int solve(int A) {
        int count = 0; // Initialize the count of set bits to 0
        // Iterate through all 32 possible bit positions of an integer (from 0 to 31)
        for(int i =0; i < 32; i++){
            // Check if the i-th bit of A is set using the helper function
            if(checkBit(A, i) == true){
                count++; // Increment the counter if the bit is set
            }
        }
        return count; // Return the total number of set bits found
    }

    // Helper method to determine if the i-th bit of integer n is set
    static boolean checkBit(int n, int i){
        // Create a mask (1 shifted left by i positions) and perform bitwise AND with n
        if((n&(1<<i)) == 0){
            return false; // If result is 0, the bit is not set
        }else{
            return true; // If result is non-zero, the bit is set
        }
    }
}