public class Solution {

    /**
     * Finds the length of the smallest subarray that contains both the minimum and maximum
     * values present in the array. This implementation uses a brute-force O(N^2) approach
     * by checking all possible subarrays efficiently.
     *
     * @param arr The input array of integers.
     * @param N The size of the array.
     * @return The length of the smallest valid subarray.
     */
    // Note: The original method signature in the prompt was incomplete/incorrect Java syntax (e.g., 'arr[]').
    // This is the correct signature for a Java class method.
    public int minMax(int[] arr, int N) {
        // Find the global minimum and maximum values in the array
        int min_val = getMin(arr, N);
        int max_val = getMax(arr, N);

        // Initialize the answer with the full array length (worst case scenario)
        int ans = N;

        // Outer loop iterates through all possible start indices 'i'
        for (int i = 0; i < N; i++) {
            // Track if min and max have been found *within the current subarray starting at 'i'*
            boolean min_present = false; // Fixed typo: 'flase' should be 'false'
            boolean max_present = false;

            // Inner loop extends the subarray from index 'i' to index 'j'
            for (int j = i; j < N; j++) {
                // Check the current element arr[j] (fixed typo: 'k' should be 'j')
                if (arr[j] == min_val) {
                    min_present = true;
                }
                if (arr[j] == max_val) { // Fixed typo: 'k' should be 'j'
                    max_present = true;
                }

                // If both min and max are found within the current subarray [i, j]
                if (min_present && max_present) {
                    // Calculate the length of the current subarray (j-i+1)
                    // Update the overall answer with the minimum length found so far
                    ans = Math.min(ans, j - i + 1);
                    // Optimization: Once a valid subarray starting at 'i' is found,
                    // we can stop extending 'j' for this 'i', as any longer subarray
                    // starting at 'i' will not be the *smallest* one.
                    break;
                }
            }
        }

        // Return the length of the smallest valid subarray found across all start points
        return ans;
    }

    /**
     * Helper method to find the maximum value in an array.
     * @param arr The input array.
     * @param n The size of the array.
     * @return The maximum element.
     */
    public int getMax(int[] arr, int n) {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * Helper method to find the minimum value in an array.
     * @param arr The input array.
     * @param n The size of the array.
     * @return The minimum element.
     */
    public int getMin(int[] arr, int n) {
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}