public class Solution {

    /**
     * Finds the length of the smallest subarray that contains both the minimum and maximum
     * values present in the array using an optimal O(N) single-pass approach.
     *
     * @param arr The input array of integers.
     * @param N The size of the array.
     * @return The length of the smallest valid subarray.
     */
    // Note: The original method signature in the prompt was incomplete/incorrect Java syntax (e.g., 'arr[]').
    // This is the correct signature for a Java class method.
    public int minMax(int[] arr, int N) {
        // Find the global minimum and maximum values in the array
        int min_val = getMin(arr, N); // Renamed from 'min' to avoid confusion with Math.min
        int max_val = getMax(arr, N); // Renamed from 'max' to avoid confusion with Math.max

        // Initialize the answer with the full array length (worst case scenario)
        int ans = N;

        // Track the most recent index where the minimum value was found
        int min_index = -1;
        // Track the most recent index where the maximum value was found
        int max_index = -1;

        // Check if all elements are the same (min == max)
        if (min_val == max_val) {
            return 1; // The smallest subarray is length 1
        }

        // Iterate through the array from left to right in a single pass
        for (int i = 0; i < N; i++) {

            // If the current element is the minimum value
            if (arr[i] == min_val) {
                min_index = i; // Update the latest minimum index
                // If we have previously seen a maximum value
                if (max_index != -1) {
                    // Calculate the length of the subarray between the last max and current min
                    // and update the answer with the minimum length found so far
                    ans = Math.min(ans, i - max_index + 1);
                }
            }

            // If the current element is the maximum value
            // Note: Original code had assignment operator '=' instead of comparison '=='
            if (arr[i] == max_val) {
                max_index = i; // Update the latest maximum index
                // If we have previously seen a minimum value
                if (min_index != -1) {
                    // Calculate the length of the subarray between the last min and current max
                    // and update the answer with the minimum length found so far
                    ans = Math.min(ans, i - min_index + 1);
                }
            }
        }

        // Return the length of the smallest valid subarray found
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