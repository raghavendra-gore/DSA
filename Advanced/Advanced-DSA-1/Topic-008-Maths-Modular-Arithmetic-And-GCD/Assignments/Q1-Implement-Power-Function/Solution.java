public class Solution {
    /**
     * Calculates (A^B) % C using recursive modular exponentiation (exponentiation by squaring).
     * This function handles the constraints, including negative results for A, to ensure
     * the final remainder is non-negative.
     *
     * @param A The base (can be negative).
     * @param B The exponent (non-negative).
     * @param C The modulo (positive).
     * @return The value of (A^B) % C as a non-negative integer.
     */
    public int pow(int A, int B, int C) {
        // Base case 1: 0^B = 0 (assuming B > 0, which is covered implicitly by B=0 case below)
        if (A == 0)
            return 0;

        // Base case 2: A^0 = 1
        if (B == 0)
            return 1;

        // Recursive step: Calculate pow(A, B/2) % C.
        // We use 'long' to prevent potential intermediate overflow during multiplication.
        long ans = pow(A, B / 2, C);

        // Square the result: (ans * ans)
        // Apply modulo C immediately to keep the number manageable.
        ans = (ans * ans) % C;

        // If the original exponent B was odd, we need to multiply by A one more time.
        if (B % 2 == 1) {
            ans = (ans * A);
        }

        // The problem requires a non-negative result.
        // The modulo operation in Java can return a negative number if the dividend (ans * A above) is negative.
        // Adding C ensures the result of (ans % C) is shifted into the positive range [0, C-1].
        ans = (ans + C) % C;

        // Cast the final result back to an integer type before returning.
        return (int)ans;
    }
}