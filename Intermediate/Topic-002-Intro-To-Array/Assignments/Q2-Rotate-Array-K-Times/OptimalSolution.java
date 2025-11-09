/**
 * Rotates an integer array 'arr' to the right by 'k' steps in-place.
 * This utilizes the three-step array reversal technique for O(N) time complexity.
 *
 * Algorithm Steps:
 * 1. Normalize 'k' to handle cases where k >= n.
 * 2. Reverse the entire array.
 * 3. Reverse the first 'k' elements.
 * 4. Reverse the remaining 'n - k' elements.
 *
 * @param arr The integer array to be rotated.
 * @param n The size of the array.
 * @param k The number of positions to rotate the array to the right.
 */
static void rotateArray(int[] arr, int n, int k) {
    // Normalize k: Calculate the effective number of rotations required.
    // If k is greater than n, the extra rotations loop back to the start.
    k = k % n;

    // Step 1: Reverse the entire array.
    // E.g., [1, 2, 3, 4] -> [4, 3, 2, 1]
    reverseArrayHelp(arr, 0, n - 1);

    // Step 2: Reverse the first k elements.
    // If k=2: [4, 3 | 2, 1] -> [3, 4 | 2, 1]
    reverseArrayHelp(arr, 0, k - 1);

    // Step 3: Reverse the remaining (n - k) elements.
    // If k=2: [3, 4 | 2, 1] -> [3, 4 | 1, 2]
    reverseArrayHelp(arr, k, n - 1);

    // The array is now correctly rotated to the right by k steps.
}

/**
 * Helper function to reverse elements of an array in place within a specified
 * inclusive range [l, r] using a two-pointer approach.
 *
 * @param arr The integer array being modified.
 * @param l The left/start index of the range (inclusive).
 * @param r The right/end index of the range (inclusive).
 */
static void reverseArrayHelp(int[] arr, int l, int r) {
    // Use two pointers starting from the boundaries of the range, moving inward.
    while (l < r) {
        // Swap the elements at the left and right pointers.
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;

        // Move pointers toward the center.
        l++;
        r--;
    }
}