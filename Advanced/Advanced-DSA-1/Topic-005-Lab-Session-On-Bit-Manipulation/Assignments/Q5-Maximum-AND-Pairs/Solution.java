public class Solution {
    public int solve(int[] A) {
        int n = A.length; // Get the length of the array
        int ans = 0; // Initialize the answer (maximum AND value) to 0
        // Iterate from the most significant bit (31) down to the least significant bit (0)
        for(int i = 31; i >= 0; i--){
            int count = 0; // Initialize a counter for the current bit position
            // Iterate through the array elements
            for(int j = 0; j < n; j++){
                // Check if the i-th bit of the current element is set
                if(checkBit(A[j], i) == true){
                    count++; // Increment count if the bit is set
                }
            }
            // If at least two numbers have this bit set
            if(count >= 2){
                // Set the i-th bit in the answer (greedy approach to maximize the result)
                ans = ans | (1<<i);
                // Optimization: Invalidate numbers that don't have this bit set
                // for subsequent bit checks (effectively filtering the pool of numbers)
                for(int j = 0; j < n; j++){
                    if(checkBit(A[j], i) == false){
                        A[j] = 0;
                    }
                }
            }
        }
        return ans; // Return the maximum pairwise bitwise AND result
    }

    // Helper method to check if the i-th bit of integer n is set
    boolean checkBit(int n, int i){
        // Perform bitwise AND with a mask (1 shifted left by i)
        if((n&(1<<i)) == 0){
            return false; // Bit is not set
        } else{
            return true; // Bit is set
        }
    }
}