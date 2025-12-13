public class BruteforseSolution {

    /**
     * Finds the maximum sum among all subarrays of a given length K.
     * This implementation uses a simple sliding window technique with an inner loop to sum elements.
     *
     * @param arr The input array of integers.
     * @param N   The total length of the array (though arr.length is sufficient in Java).
     * @param K   The required length of the subarray.
     * @return The maximum sum found among all subarrays of length K.
     */
    public static int maxSubarraySumOfLengthK(int[] arr, int N, int K) {
        // Initialize the maximum sum found so far to the smallest possible integer value
        int ans = Integer.MIN_VALUE;

        // 'i' represents the starting index of the current window
        int i = 0;
        // 'j' represents the ending index of the current window
        int j = K - 1;

        // Iterate while the end of the window 'j' is within the bounds of the array 'N'
        while (j < N) {
            // Calculate the sum for the current window [i...j]
            int sum = 0;
            // Iterate through the current window's indices
            for (int idx = i; idx <= j; idx++) {
                sum += arr[idx];
            }

            // Update the maximum sum ('ans') if the current window's sum is greater
            ans = Math.max(ans, sum);

            // Slide the window one position to the right:
            // Increment the start index
            i++;
            // Increment the end index
            j++;
        }

        // Return the maximum sum found
        return ans;
    }
}