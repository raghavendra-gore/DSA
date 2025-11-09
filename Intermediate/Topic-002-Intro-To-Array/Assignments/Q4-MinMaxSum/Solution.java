/**
 * Finds the sum of the maximum and minimum elements in an integer array A.
 *
 * This method performs a single pass through the array to find both the maximum and
 * minimum values simultaneously, achieving O(N) time complexity.
 *
 * Time Complexity: O(N), where N is the length of the array A.
 * Space Complexity: O(1) auxiliary space.
 *
 * @param A The input integer array.
 * @return The sum of the maximum element and the minimum element found in the array.
 */
public int solve(int[] A) {
    int n = A.length;

    // Initialize 'max' to the smallest possible integer value so that
    // the first array element is guaranteed to replace it.
    int max = Integer.MIN_VALUE;

    // Initialize 'min' to the largest possible integer value so that
    // the first array element is guaranteed to replace it.
    int min = Integer.MAX_VALUE;

    // Iterate through every element of the array exactly once.
    for (int i = 0; i < n; i++) {

        // Check if the current element is greater than the current maximum found so far.
        if (A[i] > max) {
            // If it is, update the maximum value.
            max = A[i];
        }

        // Check if the current element is smaller than the current minimum found so far.
        if (A[i] < min) {
            // If it is, update the minimum value.
            min = A[i];
        }
    }

    // After the loop completes, 'max' holds the array's maximum value,
    // and 'min' holds the array's minimum value.
    // Return their sum as the final result.
    return max + min;
}