/**
 * Checks if a "good pair" exists in the array A that sums to the target integer B.
 * A good pair (i, j) satisfies i != j and A[i] + A[j] == B.
 *
 * This uses a HashSet to efficiently track seen elements and achieve O(N) time complexity.
 *
 * Time Complexity: O(N), where N is the length of the array A.
 * Space Complexity: O(N) in the worst case, to store elements in the set.
 *
 * @param A The input integer array.
 * @param B The target sum for the pair.
 * @return An integer: 1 if a good pair is found, 0 otherwise.
 */
public int solve(int[] A, int B) {
    // A set to store elements encountered so far during the iteration.
    Set<Integer> set = new HashSet<>();

    // Iterate through each element in the array A once.
    for (int i = 0; i < A.length; i++) {
        int currentElement = A[i];

        // Calculate the 'potentialMatch' (complement) needed to reach the target sum B.
        int potentialMatch = B - currentElement;

        // Check if the required complement has already been added to the set.
        // This lookup operation in a HashSet is O(1) on average.
        if (set.contains(potentialMatch)) {
            // We found a valid pair where the indices are necessarily different
            // (the complement was added in a previous iteration).
            // Return 1 immediately as soon as a pair is found.
            return 1;
        }

        // If the complement wasn't found in the current iteration,
        // add the current element to the set for potential matches in future iterations.
        set.add(currentElement);

    }

    // If the loop completes without finding any pair that sums to B, return 0.
    return 0;
}