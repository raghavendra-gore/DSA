public class Solution {
    /**
     * Calculates the number of "peek" or "valley" triplets (i, j, k) in the array such that
     * A[j] is the middle element, A[i] < A[j], and A[j] < A[k], with i < j < k.
     *
     * The algorithm iterates through each element as a potential middle element (j) and counts
     * the valid left (l) and right (r) elements that can form a valid triplet.
     *
     * @param A an integer array.
     * @return the total count of valid triplets.
     */
    public int solve(int[] A) {
        int n = A.length;
        // Initialize the total count of valid triplets to zero.
        int ans = 0;

        // Outer loop: Iterate through each element A[i] to treat it as the middle element of a potential triplet.
        for (int i = 0; i < n; i++) {
            // Initialize counters for elements smaller than A[i] on the left (l)
            // and elements larger than A[i] on the right (r).
            int l = 0;
            int r = 0;

            // Inner loop 1: Iterate through all elements to the left of A[i] (indices j < i).
            for (int j = 0; j < i; j++) {
                // If A[j] is smaller than A[i], it can serve as the left part of a triplet.
                if (A[j] < A[i]) {
                    l += 1;
                }
            }

            // Inner loop 2: Iterate through all elements to the right of A[i] (indices j > i).
            for (int j = i + 1; j < n; j++) {
                // If A[j] is larger than A[i], it can serve as the right part of a triplet.
                if (A[i] < A[j]) {
                    r += 1;
                }
            }

            // For the current middle element A[i], the number of valid triplets
            // that can be formed is the product of the number of valid left elements (l)
            // and the number of valid right elements (r).
            ans += (l * r);
        }

        // Return the final total count of all such triplets found in the array.
        return ans;
    }
}