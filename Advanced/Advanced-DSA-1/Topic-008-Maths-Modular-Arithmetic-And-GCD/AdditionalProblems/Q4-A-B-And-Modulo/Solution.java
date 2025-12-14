public class Solution {
    /**
     * Finds the greatest possible positive integer M such that A % M == B % M.
     *
     * The condition A % M == B % M is mathematically equivalent to stating that
     * the absolute difference between A and B must be perfectly divisible by M.
     * Since we want the greatest such M, M must be the largest divisor of |A - B|.
     * The largest divisor of any positive number is the number itself.
     *
     * @param A The first positive integer (1 <= A <= 10^9).
     * @param B The second positive integer (1 <= B <= 10^9, A != B).
     * @return The greatest positive integer M, which is Math.abs(A - B).
     */
    public int solve(int A, int B) {
        // The greatest M that satisfies A % M = B % M is the absolute difference |A - B|.
        // Constraints guarantee A != B, so the difference is always a positive integer >= 1.
        return Math.abs(A - B);
    }
}