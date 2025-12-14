public class Solution {
    /**
     * Helper recursive function to search for a target element within an array, starting
     * from a specific index and moving backward towards the beginning of the array.
     * This private method manages the recursive search state.
     *
     * @param index   The current position in the array being checked. It starts at the last valid index (A.length - 1).
     * @param target  The integer value to search for (B).
     * @param array   The input array (A).
     * @return The index where the target is last found, or -1 if the search finishes without a match.
     */
    private int run(int index, int target, int[] array) {
        // Base Case 1: If the current index is less than 0, it means we have exhausted
        // the array while searching backwards without finding the target element.
        if (index == -1) {
            return -1;
        }

        // Base Case 2: If the element at the current index matches the target value,
        // we've found the *last* occurrence when searching backward, so we return its index.
        if (array[index] == target) {
            return index;
        }

        // Recursive Step: If neither base case is met, we recursively call the
        // function again, decrementing the index to check the previous element in the array.
        return run(index - 1, target, array);
    }

    /**
     * Public method to find the last index of element B in array A.
     * This method serves as the entry point for the user, initiating the private
     * recursive helper function starting from the very end of the array (the last possible index).
     *
     * @param A The input array of integers provided by the user.
     * @param B The integer value to search for.
     * @return The last index of B in A, or -1 if not found.
     */
    public int LastIndex(int[] A, int B) {
        // Start the recursive search from the final index of the array.
        return run(A.length - 1, B, A);
    }
}