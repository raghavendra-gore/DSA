public class Solution {
    /**
     * Recursive helper function to find the maximum element in the array starting from a specific index.
     *
     * @param index The current index being considered.
     * @param array The input array of integers.
     * @return The maximum value found in the array from 'index' to the end.
     */
    private int run(int index, int[] array) {
        // Base Case: If we have reached the last element of the array,
        // that element is the maximum for the remaining (single-element) segment.
        if (index == array.length - 1) {
            return array[index];
        }

        // Recursive Step: Compare the current element (array[index]) with
        // the maximum value found in the rest of the array (from index + 1 onwards).
        // 'run(index + 1, array)' recursively finds the max of the remaining part.
        // Math.max returns the larger of the two values.
        return Math.max(array[index], run(index + 1, array));
    }

    /**
     * Public method to initiate the recursive process to find the maximum element of the array A.
     *
     * @param A The input array.
     * @return The maximum integer value present in array A.
     */
    public int getMax(int[] A) {
        // Start the recursive 'run' function from the beginning of the array (index 0).
        return run(0, A);
    }
}