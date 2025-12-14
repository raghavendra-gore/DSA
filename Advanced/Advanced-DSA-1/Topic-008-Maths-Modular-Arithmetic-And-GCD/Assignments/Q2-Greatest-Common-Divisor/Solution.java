public class Solution {
    /**
     * Calculates the Greatest Common Divisor (GCD) of two non-negative integers
     * A and B using the recursive implementation of the Euclidean Algorithm.
     *
     * The Euclidean Algorithm is based on the principle that gcd(A, B) = gcd(B, A % B).
     *
     * @param A The first non-negative integer.
     * @param B The second non-negative integer.
     * @return The greatest common divisor of A and B.
     */
    public int gcd(int A, int B) {
        // Base Case: The algorithm terminates when the second number (B) becomes 0.
        // At this point, the first number (A) is the GCD.
        if (B == 0) {
            return A;
        }

        // Recursive Step: Replace A with B, and replace B with the remainder of A divided by B (A % B).
        // The process continues with these new, smaller numbers.
        return gcd(B, A % B);
    }
}