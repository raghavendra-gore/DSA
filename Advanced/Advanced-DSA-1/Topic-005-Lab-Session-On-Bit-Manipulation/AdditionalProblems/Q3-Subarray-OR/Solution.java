public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        // idx[j] stores the last seen index where the j-th bit was set
        int[] idx = new int[32];
        // ans stores the cumulative sum of bitwise ORs of all subarrays
        long ans = 0;

        // Iterate through the array elements starting from index 1 for convenience
        for (int i = 1; i <= n; ++i) {
            // Get the current element
            long tmp = A[i - 1];

            // Iterate through all 32 possible bit positions (0 to 31)
            for (int j = 0; j <= 31; ++j) {
                // Calculate the power of 2 for the current bit position
                long pw = 1 << j;

                // Check if the j-th bit of the current element is set
                if ((tmp & pw) != 0) {
                    // If the bit is set, it contributes to all 'i' subarrays ending at the current index
                    ans += pw * i;
                    // Update the last seen index for this bit position to the current index 'i'
                    idx[j] = i;
                } else if (idx[j] != 0) { // If the j-th bit is not set, but it was set previously
                    // The bit's contribution comes from the last time it was set
                    // It contributes to subarrays from idx[j] up to the current index 'i'
                    ans += pw * idx[j];
                }
                // If idx[j] is 0, this bit has never been set in any subarray ending here, so it contributes nothing
            }
        }
        // Return the final answer modulo 10^9 + 7
        return (int)(ans % 1000000007);
    }
}