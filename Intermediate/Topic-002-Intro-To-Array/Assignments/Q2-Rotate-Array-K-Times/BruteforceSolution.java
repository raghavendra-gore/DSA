/**
 * Rotates an integer array 'arr' to the right by 'k' steps in-place using a
 * naive approach.
 *
 * NOTE: This method has a time complexity of O(N * K). Given that K can be
 * very large (up to 10^9), this implementation is inefficient and will likely
 * result in a "Time Limit Exceeded" error for large inputs.
 * The O(N) reversal method is highly recommended instead.
 *
 * @param arr The integer array to be rotated.
 * @param n The size of the array.
 * @param k The number of positions to rotate the array to the right.
 */
static void rotateArray(int[] arr, int n, int k) {
    // This outer loop runs 'k' times, performing one right rotation in each iteration.
    for (int i = 0; i < k; i++) {
        // Store the last element of the array in a temporary variable.
        // This element needs to wrap around to the front.
        int temp = arr[n - 1];

        // This inner loop shifts all elements one position to the right.
        // It starts from the second-to-last element and moves backwards.
        for (int j = n - 1; j >= 1; j--) {
            arr[j] = arr[j - 1];
        }

        // Place the stored last element (temp) into the first position of the array.
        arr[0] = temp;
    }
    // The total operations are k (outer loop) * n (inner loop), hence O(N * K) complexity.
}