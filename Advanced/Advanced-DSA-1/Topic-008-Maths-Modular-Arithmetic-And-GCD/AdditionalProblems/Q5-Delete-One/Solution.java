public class Solution {

    /**
     * Calculates the Greatest Common Divisor (GCD) of two integers using the Euclidean algorithm (recursive implementation).
     * The GCD(0, b) is b.
     */
    public int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    /**
     * Calculates the suffix GCD array for the input array A.
     * The suffix GCD at index i is the GCD of all elements from index i to the end of the array.
     */
    public int[] suffixGCD(int[] A) {
        int n = A.length;
        int[] suf = new int[n];
        int g = 0; // 'g' accumulates the running GCD from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Update the running GCD: GCD(current_element, previous_running_GCD)
            g = gcd(g, A[i]);
            // Store the cumulative suffix GCD at this index
            suf[i] = g;
        }
        return suf;
    }

    /**
     * Finds the maximum possible GCD of the remaining elements after deleting exactly one element from the array A.
     */
    public int solve(int[] A) {
        int n = A.length;
        // 'ans' stores the maximum GCD found so far.
        int ans = 1;

        // suf stores the suffix gcd of the array
        int[] suf = suffixGCD(A);

        // 'curGcd' accumulates the prefix GCD as we iterate from left to right.
        int curGcd = 0;

        // Iterate through each element A[i], treating it as the element to be deleted.
        for (int i = 0; i < n; i++) {
            // When A[i] is deleted, the GCD of the remaining array is GCD(Prefix_GCD_up_to_[i-1], Suffix_GCD_from_[i+1])

            if (i != n - 1) {
                // Case: Deleting a non-last element.
                // The remaining elements span across the prefix up to i-1 (represented by 'curGcd')
                // and the suffix starting from i+1 (represented by 'suf[i+1]').
                ans = Math.max(ans, gcd(suf[i + 1], curGcd));
            } else {
                // Case: Deleting the last element (i == n-1).
                // The remaining elements are just the prefix elements up to index n-2,
                // which is exactly the 'curGcd' accumulated up to the previous iteration.
                ans = Math.max(ans, curGcd);
            }

            // Update the prefix GCD to include the current element A[i] for the next iteration (when A[i+1] is considered for deletion).
            curGcd = gcd(curGcd, A[i]);
        }

        return ans;
    }
}