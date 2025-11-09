/**
 * Calculates the minimum time required to make all elements in the array A equal.
 * In one second, any single element can be increased by 1.
 * The optimal target value for all elements is the maximum value present in the array.
 *
 * Time Complexity: O(N), where N is the length of the array A.
 * Space Complexity: O(1) auxiliary space.
 *
 * @param A The input integer array.
 * @return The minimum total seconds required to equalize all elements.
 */
public int solve(int[] A) {
    if (A == null || A.length == 0) {
        return 0;
    }

    // --- Step 1: Find the Maximum Element ---
    // Initialize max with the first element of the array.
    int maxElement = A[0];
    for (int i = 1; i < A.length; i++) {
        if (A[i] > maxElement) {
            maxElement = A[i];
        }
    }

    // --- Step 2: Calculate the Total Time (Sum of Differences) ---
    int totalTime = 0;
    // Iterate through the array again to sum up the differences from the maximum value.
    for (int i = 0; i < A.length; i++) {
        // The time needed for an element is the difference between the max and the element's current value.
        totalTime += (maxElement - A[i]);
    }

    // Return the accumulated total time.
    return totalTime;
}