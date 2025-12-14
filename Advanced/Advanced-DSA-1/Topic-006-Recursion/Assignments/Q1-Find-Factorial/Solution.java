public class Solution {
    /**
     * Calculates the factorial of a given integer A using recursion.
     * Note: This implementation implicitly assumes A >= 1.
     * For a complete factorial function handling A=0 as well, the base case should check for A <= 1 or A == 0.
     *
     * @param A The positive integer for which to calculate the factorial.
     * @return The factorial of A as an integer.
     */
    public int solve(int A) {
        // Base Case: The factorial of 1 is 1. This stops the recursion.
        if (A == 1) {
            return 1;
        }

        // Recursive Step: Factorial of A is A multiplied by the factorial of (A - 1).
        // This breaks the problem down until the base case (A=1) is reached.
        return A * solve(A - 1);
    }
}