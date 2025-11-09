/**
 * Finds the number of occurrences of a target integer B within an integer array A.
 *
 * This method performs a linear scan through the array to count matches.
 *
 * Time Complexity: O(N), where N is the length of the array A.
 * Space Complexity: O(1) auxiliary space.
 *
 * @param A The input array of integers.
 * @param B The target integer to count occurrences of.
 * @return The total number of times B appears in A.
 */
public static int solve(int[] A, int B) {
    // Initialize a counter to store the number of times B is found.
    int count = 0;

    // Iterate through every element of the array A.
    for (int i = 0; i < A.length; i++) {
        // Check if the current element matches the target integer B.
        if (A[i] == B) {
            // If there is a match, increment the counter.
            count++;
        }
    }

    // Return the final count after checking all elements.
    return count;
}