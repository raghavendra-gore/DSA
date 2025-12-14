public class Solution {
    // Method to find the first missing positive integer
    public int firstMissingPositive(int[] A) {
        int n = A.length;
        // The 'ans' variable is not used in the final logic and can be ignored/removed in a clean-up
        int ans = 0;
        int i = 0;
        // Iterate through the array using a while loop for conditional increment
        while(i < n){
            // Calculate the target index where A[i] should belong if it's a valid positive integer
            int idx = A[i] - 1;
            // Check if A[i] is within the valid range [1, n]
            // and if it is not already in its correct position
            if(A[i] >= 1 && A[i] <= n && A[i] != A[idx]){
                // Perform a swap operation to place A[i] into its correct index 'idx'
                int temp = A[i];
                A[i] = A[idx];
                A[idx] = temp;
                // Note: The index 'i' is not incremented here, as we need to re-check the new A[i]
            } else{
                // If the number is out of bounds, already in place, or a duplicate of its target location
                // move on to the next element in the array
                i++;
            }
        }

        // After the rearrangement (cyclic sort), iterate through the array again
        for(int k = 0; k < n; k++){
            // The first index 'k' where A[k] does not equal 'k + 1'
            // indicates that 'k + 1' is the first missing positive integer
            if(A[k] != k+1){
                return k+1;
            }
        }

        // If all numbers from 1 to n are present in the array in their correct order
        // the first missing positive integer is n + 1
        return n+1;
    }
}