public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        // Get the length of the input array
        int n = A.length;
        // currentSum tracks the maximum sum of a subarray ending at the current index
        int currentSum = 0;
        // ans stores the overall maximum subarray sum found so far globally
        int ans = Integer.MIN_VALUE;

        // Iterate through each element of the array
        for(int i = 0; i < n; i++){
            // Add the current element to the running sum
            currentSum += A[i];

            // Update the overall maximum answer found so far
            ans = Math.max(ans, currentSum);

            // If currentSum becomes negative, reset it to 0 (start a new potential max subarray from the next element)
            // Note: This specific implementation handles non-empty arrays by initializing 'ans' to MIN_VALUE
            currentSum = Math.max(currentSum, 0);
        }

        // Return the final maximum sum found
        return ans;

    }
}