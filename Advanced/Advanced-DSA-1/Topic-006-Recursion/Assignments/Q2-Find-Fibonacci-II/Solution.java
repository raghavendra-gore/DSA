public class Solution {
    /**
     * Calculates the Ath Fibonacci number using recursion.
     * The sequence is defined by F(n) = F(n-1) + F(n-2),
     * with base cases F(0) = 0 and F(1) = 1.
     *
     * @param A The index of the Fibonacci number to find (0 <= A <= 20).
     * @return The Ath Fibonacci number.
     */
    public int findAthFibonacci(int A) {
        // Base Cases: F(0) = 0 and F(1) = 1.
        // If A is 0 or 1, we return A itself, terminating the recursion for these starting points.
        if (A == 0 || A == 1) {
            return A;
        }

        // Recursive Step: For A > 1, the result is the sum of
        // the (A-1)th and (A-2)th Fibonacci numbers.
        // This breaks the problem down until the base cases are reached.
        return findAthFibonacci(A - 1) + findAthFibonacci(A - 2);
    }
}