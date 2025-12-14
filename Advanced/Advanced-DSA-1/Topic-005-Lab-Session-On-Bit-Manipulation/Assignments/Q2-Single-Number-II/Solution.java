public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int singleNumber(final int[] A) {
        int n = A.length; // Store the length of the array
        int ans = 0; // Initialize the answer variable that will hold the single number
        // Iterate over all 32 possible bit positions (0 to 31)
        for(int i = 0; i < 32; i++){
            int count = 0; // Initialize a counter for the current bit position
            // Iterate over all elements in the input array
            for(int j = 0; j < n; j++){
                // Check if the i-th bit of the current element A[j] is set
                if(checkBit(A[j], i) == true){
                    count++; // Increment the counter if the bit is set
                }
            }
            // If the total count of the i-th bit across all numbers modulo 3 is 1
            if(count%3 == 1){
                // This means the single non-repeating number must have this bit set
                // Use XOR to set the i-th bit in the 'ans' variable
                ans = ans ^ (1<<i);
            }
        }
        return ans; // Return the reconstructed single number
    }

    // Helper method to check if the i-th bit is set in integer n
    boolean checkBit(int n, int i){
        // Create a mask with 1 at the i-th position (1<<i) and perform bitwise AND
        if((n&(1<<i)) == 0){
            return false; // Bit is not set
        } else{
            return true; // Bit is set
        }
    }
}