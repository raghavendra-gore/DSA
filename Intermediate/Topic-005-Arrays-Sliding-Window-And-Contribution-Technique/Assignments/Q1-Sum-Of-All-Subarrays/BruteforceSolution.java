public class SubarraySumCalculator {

    public static int allSubarraySum(int[] arr, int N) {
        // 'ans' will store the final sum of all subarray sums.
        // Consider using 'long' if the total sum might exceed the maximum value of 'int'.
        int ans = 0;

        // The outer loop determines the starting index (i) of the subarray.
        for (int i = 0; i < N; i++) {
            // The middle loop determines the ending index (j) of the subarray.
            // It ensures j is always greater than or equal to i, forming a valid subarray.
            for (int j = i; j < N; j++) {
                // 'subarraySum' temporarily stores the sum of the current subarray [i...j].
                int subarraySum = 0;

                // The inner loop iterates through the elements from index i to j (inclusive)
                // to calculate the sum of the current subarray.
                for (int k = i; k <= j; k++) {
                    subarraySum += arr[k];
                }

                // Add the sum of the current subarray to the overall answer.
                ans += subarraySum;
            }
        }
        // Return the final accumulated sum of all subarray sums.
        return ans;
    }
}