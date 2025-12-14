public class Solution {
    /**
     * Helper recursive function to search for a target element within an array.
     * This function traverses the array starting from a specific index.
     *
     * @param index   The current position in the array being checked (starts at 0).
     * @param target  The integer value to search for (B).
     * @param array   The input array (A).
     * @return The index where the target is first found, or -1 if the end is reached without a match.
     */
    private int run(int index, int target, int[] array) {
        // Base Case 1: If the current index equals the array length,
        // it means we've iterated through the entire array without finding the target.
        if (index == array.length) {
            return -1;
        }

        // Base Case 2: If the element at the current index matches the target value,
        // we've found the first occurrence and return its index immediately.
        if (array[index] == target) {
            return index;
        }

        // Recursive Step: If neither base case is met, we recursively call the
        // function again, incrementing the index to check the next element in the array.
        return run(index + 1, target, array);
    }

    /**
     * Public method to find the first index of element B in array A.
     * This method acts as the entry point, calling the private recursive helper
     * function starting from the beginning of the array (index 0).
     *
     * @param A The input array of integers provided by the user.
     * @param B The integer value to search for.
     * @return The first index of B in A, or -1 if not found.
     */
    public int FirstIndex(int[] A, int B) {
        // Start the recursive search from the very beginning of the array (index 0).
        return run(0, B, A);
    }
}