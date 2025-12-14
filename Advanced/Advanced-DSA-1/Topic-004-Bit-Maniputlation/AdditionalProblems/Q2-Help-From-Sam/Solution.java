public class Solution {
    public int solve(int A) {
        int count = 0; // Initialize a counter to store the number of set bits
        // Iterate through all possible bit positions (0 to 31) in a 32-bit integer
        for(int i = 0; i < 32; i++){
            // Check if the i-th bit of A is set (true)
            if(checkBit(A, i) ==true){
                count++; // If the bit is set, increment the counter
            }
        }
        return count; // Return the final count of set bits (minimum help needed)
    }

    // Helper method to check if a specific bit at position 'i' is set in integer 'n'
    boolean checkBit(int n, int i){
        // Perform a bitwise AND operation between 'n' and a mask (1 shifted left by 'i' positions)
        // If the result is 0, the bit at position 'i' is not set
        if((n&(1<<i)) == 0){
            return false;
        }else{
            // Otherwise, the bit at position 'i' is set
            return true;
        }
    }
}