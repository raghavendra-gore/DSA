public class Solution {

    /**
     * Calculates the maximum possible sum of a contiguous subarray within C that
     * is less than or equal to B.
     *
     * @param A The size of the array C. (Note: A can also be derived from C.length)
     * @param B The maximum allowed sum limit.
     * @param C The input integer array containing positive elements.
     * @return The maximum sum under the limit B, or 0 if no valid subarray is found.
     */
    public int maxSubarray(int A, int B, int[] C) {
        // 'ans' stores the maximum sum found so far that respects the limit B.
        // Initialized to 0, which handles cases where no element/subarray is <= B.
        int ans = 0;

        // The outer loop iterates through all possible starting indices of a subarray.
        for (int start = 0; start < C.length; start++) {
            // 'sum' keeps track of the running sum of the current subarray starting at 'start'.
            // Use 'long' here temporarily to prevent potential intermediate overflow
            // if individual elements of C are large, before checking against the 'B' limit.
            long sum = 0;

            // The inner loop iterates through all possible ending indices of the subarray,
            // extending the subarray one element at a time from the 'start' index.
            for (int end = start; end < C.length; end++) {
                // Add the next element to the running sum.
                sum += C[end];

                // Check if the current subarray sum is within the allowed limit B.
                if (sum <= B) {
                    // If it is within the limit, update 'ans' to be the maximum of its
                    // current value and the current valid 'sum'.
                    // We cast 'sum' back to 'int' as the final answer fits within the return type bounds.
                    ans = Math.max(ans, (int) sum);
                } else {
                    // Optimization: Since all elements in C are positive (1 <= C[i]),
                    // if the sum exceeds B at this 'end' index, adding any further
                    // elements will also exceed B. We can safely break the inner loop
                    // and move to the next starting index 'start'.
                    break;
                }
            }
        }

        // Return the final maximum valid sum found.
        return ans;
    }
}