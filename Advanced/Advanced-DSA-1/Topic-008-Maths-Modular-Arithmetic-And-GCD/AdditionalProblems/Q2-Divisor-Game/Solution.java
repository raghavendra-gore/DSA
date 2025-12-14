public class Solution {
    /**
     * Calculates the Greatest Common Divisor (GCD) of two non-negative integers
     * using the recursive implementation of the Euclidean Algorithm.
     * This specific implementation uses a slight variation where the remainder
     * is calculated as y % x.
     *
     * @param x The first non-negative integer.
     * @param y The second non-negative integer.
     * @return The greatest common divisor of x and y.
     */
    public int gcd(int x, int y) {
        // Base Case: If the first number (x) is 0, the second number (y) is the GCD.
        if (x == 0)
            return y;
        // Recursive Step: Call gcd with the remainder (y % x) and x.
        // The algorithm continues until the remainder becomes 0.
        return gcd(y % x, x);
    }

    /**
     * Finds the number of "special" integers less than or equal to A.
     * A special integer is defined as one that is divisible by both B and C.
     * This is equivalent to finding the number of positive multiples of LCM(B, C) that are <= A.
     *
     * @param A The upper bound for the special integers.
     * @param B The first divisor.
     * @param C The second divisor.
     * @return The count of special integers <= A.
     */
    public int solve(int A, int B, int C) {
        // find lcm of B and C using the formula: LCM(B, C) = (B * C) / GCD(B, C)
        // We cast B to a 'long' before multiplication to prevent potential integer overflow
        // if B * C exceeds the maximum value of a 32-bit signed integer.
        long lcm = (long) B * C / gcd(B, C);

        // If the calculated Least Common Multiple is greater than A, there are no
        // positive multiples of this LCM that are less than or equal to A.
        if (lcm > A)
            return 0;

        // The number of multiples of 'lcm' that are less than or equal to A
        // is calculated using integer division (floor division).
        // no of multiples of lcm that is <= A
        return (int)(A / lcm);
    }
}