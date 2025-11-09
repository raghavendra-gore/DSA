/**
 * Finds the second largest element in an integer array A.
 * This implementation uses two separate passes through the array: 
 * one to find the maximum element and a second to find the second maximum.
 *
 * Time Complexity: O(N), as the array is traversed twice.
 * Space Complexity: O(1) auxiliary space.
 *
 * @param A The input integer array.
 * @return The value of the second largest element, or -1 if no such element exists.
 */
public int solve(int[] A) {
    // Handle edge case: If the array has fewer than 2 elements, a second 
    // largest element cannot exist. Return -1 as specified by the problem constraints/output format.
    if (A.length < 2) {
        return -1;
    }

    // --- First Pass: Find the Maximum Element ---
    // Initialize max with the first element of the array.
    int max = A[0];

    // Iterate through the array to find the true maximum value.
    for (int i = 0; i < A.length; i++) {
        if (A[i] > max) {
            max = A[i];
        }
    }

    // --- Second Pass: Find the Second Maximum Element ---
    // Initialize secondMax (second max) to -1. 
    // NOTE: This initialization works only if all array elements are >= 0, 
    // which is true based on the problem constraints (0 <= A[i] <= 10^9).
    int secondMax = -1;

    // Iterate through the array again to find the largest element that is NOT the 'max'.
    for (int i = 0; i < A.length; i++) {
        // Check if the current element is not equal to the overall maximum
        // AND if it is greater than the current 'secondMax' found so far.
        if (A[i] != max && A[i] > secondMax) {
            secondMax = A[i];
        }
    }

    // 'secondMax' now holds the second largest distinct element in the array.
    // If the initial -1 persists, it means all elements were the same as 'max'.
    return secondMax;
}