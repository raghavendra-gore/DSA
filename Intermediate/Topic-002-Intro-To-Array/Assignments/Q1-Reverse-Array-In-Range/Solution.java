/**
 * Reverses the elements of an array in place within a specified inclusive range [l, r].
 *
 * This uses a two-pointer technique to swap elements from the ends of the range
 * inward until the pointers cross or meet.
 *
 * Time Complexity: O(k), where k is the number of elements in the range (r - l + 1).
 * Space Complexity: O(1) auxiliary space, as the operation is in place.
 *
 * @param arr The integer array to modify.
 * @param l The left/start index of the range (inclusive).
 * @param r The right/end index of the range (inclusive).
 */
static void reverseArrayInRange(int[] arr, int n){
    reverseArrayHelp(arr, 0, n-1);
}

static void reverseArrayHelp(int[] arr, int l, int r) {
    // Continue swapping as long as the left pointer is to the left of the right pointer.
    while (l < r) {
        // Step 1: Use a temporary variable to store the value at the right pointer's position.
        int temp = arr[r];

        // Step 2: Overwrite the right position with the value from the left position.
        arr[r] = arr[l];

        // Step 3: Overwrite the left position with the temporarily stored value (completing the swap).
        arr[l] = temp;

        // Step 4: Move the left pointer one step to the right (inward).
        l++;

        // Step 5: Move the right pointer one step to the left (inward).
        r--;
    }
    // The loop terminates when l >= r, indicating the range has been fully reversed.
}