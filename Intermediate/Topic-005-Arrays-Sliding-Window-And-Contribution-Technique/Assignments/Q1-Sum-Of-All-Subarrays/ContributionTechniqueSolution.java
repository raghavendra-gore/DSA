public class Solution {

    /**
     * Calculates the total sum of all possible contiguous subarray sums in an array.
     *
     * @param A The input integer array.
     * @return The single integer denoting the sum of all subarray sums. The return type is Long
     * to handle potentially large sums without integer overflow.
     */
    public Long subarraySum(int[] A) {
        // Use 'long' for the answer variable to prevent integer overflow during calculations.
        // Initialize 'ans' to 0.
        long ans = 0L;

        // Get the length of the array using the array property 'length'.
        int N = A.length;

        // Iterate through each element of the array using its index 'i'.
        for (int i = 0; i < N; i++) {
            // Calculate the number of times the element A[i] contributes to the total sum.
            // An element at index 'i' appears in (i + 1) * (N - i) subarrays.
            long occurrences = (long) (i + 1) * (N - i);

            // Add the contribution of the current element (A[i] * occurrences) to the total sum.
            // Cast A[i] to long before multiplication to prevent intermediate overflow.
            ans += occurrences * (long) A[i];
        }

        // Return the final accumulated sum.
        return ans;
    }
}