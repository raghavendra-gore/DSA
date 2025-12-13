public class Solution {

    /**
     * Finds the length of the smallest subarray that contains both the minimum and maximum
     * values present in the array. This implementation uses a brute-force O(N^3) approach.
     *
     * @param arr The input array of integers.
     * @param N The size of the array.
     * @return The length of the smallest valid subarray.
     */
    public int minMax(int[] arr, int N) {
        // Find the global minimum and maximum values in the array
        int min_val = getMin(arr, N);
        int max_val = getMax(arr, N);

        // Initialize the answer with the full array length (worst case)
        int ans = N;

        // Outer loop iterates through all possible start indices 'i'
        for (int i = 0; i < N; i++) {
            // Middle loop iterates through all possible end indices 'j' starting from 'i'
            for (int j = i; j < N; j++) {
                boolean min_present = false;
                boolean max_present = false;

                // Inner loop checks if both min and max are present in the current subarray [i, j]
                for (int k = i; k <= j; k++) {
                    if (arr[k] == min_val) {
                        min_present = true;
                    }
                    if (arr[k] == max_val) {
                        max_present = true;
                    }

                    // Optimization: if both are found, we can potentially break the inner-most loop
                    if (min_present && max_present) {
                        // Calculate the length of the current subarray (j-i+1)
                        // Update the answer with the minimum length found so far
                        ans = Math.min(ans, j - i + 1);
                    }
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