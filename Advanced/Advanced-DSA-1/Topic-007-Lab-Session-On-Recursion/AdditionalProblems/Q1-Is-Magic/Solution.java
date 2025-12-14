public class Solution {
    /**
     * Recursively calculates the sum of digits until a single digit remains (the digital root),
     * then checks if that final single digit is 1.
     *
     * @param A The input integer.
     * @return 1 if the digital root is 1 (magic number), otherwise 0.
     */
    public int solve(int A) {
        // Base Case: If A is already a single-digit number (< 10).
        if (A < 10) {
            // Check if that single digit is 1. If yes, return 1 (magic), otherwise 0 (not magic).
            return (A == 1) ? 1 : 0;
        }

        // Calculate the sum of the digits for the current multi-digit A.
        int digit_sum = 0;
        int temp = A; // Use a temporary variable to avoid modifying the original A during summation if needed elsewhere, though here A is modified in the while loop.
        while (A > 0) {
            digit_sum += A % 10; // Add the last digit to the sum.
            A /= 10;             // Remove the last digit.
        }

        // Recursive Step: Call the solve function again with the newly calculated sum of digits.
        // The process repeats until the base case (a single digit) is hit.
        return solve(digit_sum);
    }
}