public class Solution {
    /**
     * Counts the number of unique pairs (i, j) such that A[i] + A[j] = B and i != j.
     * The result is modulo 10^9 + 7.
     *
     * @param A The input array of integers.
     * @param B The target sum.
     * @return The count of pairs modulo 10^9 + 7.
     */
    public int solve(int[] A, int B) {
        // Map to store the frequency of elements encountered so far.
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();

        // Define the modulo value as specified in the problem (10^9 + 7).
        final int mod = (int)(1e9 + 7);

        // Initialize the answer counter using long to prevent overflow during accumulation.
        long ans = 0;

        // Iterate through the array A from left to right.
        for(int i = 0 ; i < A.length ; i++){
            // Calculate the required complement to reach the target sum B.
            int complement = B - A[i];

            // Check if the complement has already been seen (and stored in the frequency map).
            if(freq.containsKey(complement)){
                // If the complement exists, add its current frequency count to the answer.
                // Each existing instance of the complement forms a new unique pair with A[i].
                // Apply modulo operation to keep 'ans' within bounds.
                ans = (ans + freq.get(complement)) % mod;
            }

            // Update the frequency map: add the current element A[i] to the map
            // or increment its count if it's already present.
            freq.put(A[i], freq.getOrDefault(A[i], 0) + 1);
        }

        // Cast the final long result back to an int before returning.
        return (int)(ans);
    }
}