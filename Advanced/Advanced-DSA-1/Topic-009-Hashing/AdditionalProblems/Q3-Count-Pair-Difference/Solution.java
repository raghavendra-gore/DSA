public class Solution {
    /**
     * Counts the number of pairs (i, j) in an array A such that |A[i] - A[j]| = B.
     * This implementation counts both A[i] - A[j] = B and A[j] - A[i] = B during a single pass.
     *
     * @param A The input array of integers.
     * @param B The target absolute difference.
     * @return The count of pairs modulo 10^9 + 7.
     */
    public int solve(int[] A, int B) {
        // Frequency map to store counts of elements encountered so far
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();

        // The modulo constant to handle large results
        final int mod = (int)(1e9 + 7);

        // Variable to accumulate the count of valid pairs (using long to prevent intermediate overflow)
        long ans = 0;

        // Iterate through the array elements one by one
        for(int i = 0 ; i < A.length ; i++){
            // For the current element A[i], check how many 'target' elements exist in the map
            // Target 1: A[i] - B (for pairs A[k] = A[i] - B)
            // Target 2: A[i] + B (for pairs A[k] = A[i] + B)
            // Add the frequencies of both potential targets to the answer
            ans += freq.getOrDefault(A[i] - B, 0) + freq.getOrDefault(A[i] + B, 0);

            // After checking existing pairs, increment the frequency of the current element A[i] in the map
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }

        // Return the final accumulated count modulo 10^9 + 7, cast back to int
        return (int)(ans % mod);
    }
}