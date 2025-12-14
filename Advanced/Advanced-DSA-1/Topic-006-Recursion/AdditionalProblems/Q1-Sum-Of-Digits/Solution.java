public class Solution {
    /**
     * Calculates the sum of the digits of a given integer A using recursion.
     *
     * @param A The input integer.
     * @return The sum of the digits.
     */
    public int solve(int A) {
        // Base Case: If A is 0 or negative, there are no more digits to sum (or the problem context implies positive inputs).
        // The recursion terminates and returns A (which will be 0 for a non-negative A that has been fully processed).
        if (A <= 0) {
            return A;
        }

        // Recursive Step:
        // A % 10 extracts the last (rightmost) digit of A.
        // A / 10 performs integer division, effectively removing the last digit.
        // The function returns the sum of the last digit and the recursive sum of the remaining digits.
        return (A % 10) + solve(A / 10);
    }
}