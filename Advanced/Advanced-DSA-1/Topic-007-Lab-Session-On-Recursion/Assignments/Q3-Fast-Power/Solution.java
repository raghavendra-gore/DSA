public class Solution {
    /**
     * Public interface method to calculate A raised to the power of B.
     * Delegates the calculation to a private recursive helper function.
     * @param A The base.
     * @param B The exponent.
     * @return A^B as a long integer.
     */
    public long power(int A, int B) {
        return calculatePowerRecursive(A, B); // Start the recursive calculation
    }

    /**
     * Recursive helper function implementing the optimized "Exponentiation by Squaring" algorithm.
     * @param A The base.
     * @param B The exponent.
     * @return A^B as a long integer.
     */
    long calculatePowerRecursive(int A, int B){
        // Base case: If the exponent B is 0, the result is 1.
        if(B == 0){
            return 1;
        }

        // Recursively calculate the power of A^(B/2).
        // This is done once to avoid redundant calculations.
        long p = power(A, B/2);

        // Check if B is even or odd.
        if(B % 2 == 0){
            // If B is even: A^B = (A^(B/2)) * (A^(B/2)) = p * p.
            return p * p;
        } else{
            // If B is odd: A^B = A * (A^(B/2)) * (A^(B/2)) = A * p * p.
            return p * p * A;
        }
    }
}