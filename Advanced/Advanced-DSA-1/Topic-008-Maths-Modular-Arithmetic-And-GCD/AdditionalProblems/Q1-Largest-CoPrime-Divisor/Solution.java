public class Solution {
    /**
     * Calculates the Greatest Common Divisor (GCD) of two non-negative integers
     * using the recursive implementation of the Euclidean Algorithm.
     *
     * The algorithm is based on the principle that $gcd(a, b) = gcd(b, a \pmod b)$.
     *
     * @param a The first non-negative integer.
     * @param b The second non-negative integer.
     * @return The greatest common divisor of a and b.
     */
    public int gcd(int a, int b) {
        // Base Case: If b is 0, then a is the GCD. This terminates the recursion.
        if (b == 0)
            return a;
        // Recursive Step: Call gcd again with (b) and the remainder of (a / b).
        return gcd(b, a % b);
    }

    /**
     * Finds the maximum valued integer X such that X divides A and gcd(X, B) == 1.
     * This method iteratively removes all common prime factors of A and B from A
     * until the remaining value of A is coprime to B.
     *
     * @param A The original integer for which we seek the largest coprime divisor.
     * @param B The integer used for the coprime condition check.
     * @return The maximum value of X satisfying the conditions.
     */
    public int cpFact(int A, int B) {
        // Continue loop as long as A and B share common factors (GCD > 1).
        while (gcd(A, B) != 1) {
            // dividing A by gcd(A, B) to remove common factors.
            // We use integer division to ensure A remains an integer.
            A = A / gcd(A, B);
        }
        // The remaining value of A is the largest divisor of the original A
        // that is coprime to B.
        return A;
    }
}