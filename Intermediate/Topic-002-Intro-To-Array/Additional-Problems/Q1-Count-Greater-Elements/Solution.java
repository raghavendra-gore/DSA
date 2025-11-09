/**
 * Counts the number of elements in the array that have at least one element greater than themselves.
 * This is equivalent to finding the maximum element and counting how many elements are NOT the maximum.
 *
 * Time complexity: O(N) because we iterate through the array twice (once to find the max, once to count).
 * Space complexity: O(1) as no extra significant space is used.
 *
 * @param A The input array of integers.
 * @return The count of elements that are not the maximum value.
 */
public static int solve(int[] A) {
    int N = A.length;
    if (N <= 1) {
        return 0; // If there's 0 or 1 element, no element has a *different* element greater than itself.
    }

    // Step 1: Find the maximum element in the array.
    int maxElement = Integer.MIN_VALUE;
    for (int i = 0; i < N; i++) {
        if (A[i] > maxElement) {
            maxElement = A[i];
        }
    }

    // Step 2: Count how many elements are equal to the maximum element.
    int countMax = 0;
    for (int i = 0; i < N; i++) {
        if (A[i] == maxElement) {
            countMax++;
        }
    }

    // Step 3: The number of elements having at least one element greater than themselves
    // is the total number of elements minus the count of the maximum elements.
    return N - countMax;
}