/**
 * Counts the total number of factors for a given integer 'n'.
 *
 * NOTE: This implementation is simple but has a time complexity of O(n),
 * which can be inefficient for very large values of n (e.g., n > 10^7).
 * A more efficient O(sqrt(n)) approach is usually preferred for performance.
 */
static int countFactors(int n) {
    // Initialize a counter to keep track of the number of factors found so far.
    int factCount = 0;

    // Iterate through all possible integers starting from 1 up to and including 'n'.
    for (int i = 1; i <= n; i++) {
        // Check if 'i' divides 'n' evenly (i.e., the remainder of n divided by i is 0).
        if (n % i == 0) {
            // If it divides evenly, 'i' is a factor, so increment the count.
            factCount++;
        }
    }

    // Return the final accumulated count of all factors found.
    return factCount;
}