public class Solution {

    // Finds the starting index of the subarray of size k
    // that has the minimum average (minimum sum)
    private int findMinAvgSubarray(int arr[], int n, int k)
    {
        // Stores the starting index of the result subarray
        int res_index = 0;

        // Compute the sum of the first subarray of size k
        int curr_sum = 0;
        for (int i = 0; i < k; i++)
            curr_sum += arr[i];

        // Initialize minimum sum as the sum of the first subarray
        int min_sum = curr_sum;

        // Slide the window from index k to n-1
        for (int i = k; i < n; i++) {

            // Add the current element and subtract
            // the element that is no longer in the window
            curr_sum += arr[i] - arr[i - k];

            // Update minimum sum and result index
            // if the current window has a smaller sum
            if (curr_sum < min_sum) {
                min_sum = curr_sum;
                res_index = (i - k + 1);
            }
        }

        // Return the starting index of the minimum average subarray
        return res_index;
    }

    // Wrapper method called by the platform
    public int solve(int[] A, int B) {

        // Length of the input array
        int n = A.length;

        // Create a copy of the input array
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = A[i];

        // Call helper method to find the result
        return findMinAvgSubarray(arr, n, B);
    }
}