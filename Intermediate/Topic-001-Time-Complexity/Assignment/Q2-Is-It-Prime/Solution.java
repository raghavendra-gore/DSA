/**
 * Determines if a given integer 'n' is a prime number by counting its factors.
 * A prime number has exactly two factors: 1 and itself.
 *
 * @param n The integer to check for primality.
 * @return true if 'n' is a prime number, false otherwise.
 */
static boolean isPrime(int n) {
    // A number is prime if and only if it has exactly two factors.
    // We utilize the highly efficient O(sqrt(n)) countFactors method to check this condition.
    if (countFactors(n) == 2) {
        return true;
    }
    return false;

    // A more concise way to write the above logic: return countFactors(n) == 2;
}

/**
 * Efficiently counts the total number of factors for a given integer 'n'.
 * This implementation uses an optimized O(sqrt(n)) approach by leveraging factor pairs.
 *
 * @param n The integer for which to count the factors.
 * @return The total number of factors.
 */
static int countFactors(int n) {
    // Initialize a counter to keep track of the number of factors found so far.
    int factCount = 0;

    // Iterate through integers starting from 1 up to the square root of 'n'.
    // We only need to check up to the square root because factors appear in pairs (i and n/i).
    for (int i = 1; i * i <= n; i++) {
        // Check if 'i' divides 'n' evenly (i.e., 'i' is a factor of 'n').
        if (n % i == 0) {
            // If 'i' is a factor, we have found at least one factor.

            // Check if 'i' is the square root of 'n' (e.g., n=9, i=3).
            // In this case, 'i' and 'n/i' are the same number, so we only count it once.
            if (i == (n / i)) {
                factCount++;
            }
            // If 'i' and 'n/i' are different factors (e.g., n=10, i=2, n/i=5).
            // We count both 'i' and 'n/i' as two distinct factors.
            else {
                factCount += 2;
            }
        }
    }

    // Return the final accumulated count of all factors found.
    return factCount;
}