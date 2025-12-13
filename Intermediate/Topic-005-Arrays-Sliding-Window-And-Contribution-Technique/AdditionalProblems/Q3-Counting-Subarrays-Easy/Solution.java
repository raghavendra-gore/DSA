public class Solution {
    /**
     * Finds the number of contiguous subarrays in A with a sum strictly less than B.
     * Uses a two-pointer/sliding window approach.
     *
     * @param A The input array of non-negative integers.
     * @param B The non-negative threshold value.
     * @return The total count of valid subarrays.
     */
    public int solve(int[] A, int B) {
        int n = A.length;
        if (B <= 0) {
            // Since all A[i] are non-negative, if B is 0 or less,
            // no subarray sum can be strictly less than B.
            return 0;
        }

        int count = 0; // Total count of subarrays satisfying the condition (sum < B)
        int currentSum = 0; // The running sum within the sliding window [left, right]
        int left = 0; // The left pointer of the sliding window

        // The right pointer expands the window to the right
        for (int right = 0; right < n; right++) {
            currentSum += A[right];

            // If the current window sum becomes >= B, we must shrink the window
            // from the left side to restore the sum < B property.
            while (currentSum >= B) {
                currentSum -= A[left]; // Remove the element at the left pointer from the sum
                left++; // Move the left pointer one step right
            }

            // At this stage, the window [left...right] has a sum < B.
            // Because all elements are non-negative, any subarray ending at 'right'
            // and starting from an index between 'left' and 'right' also has sum < B.
            // The number of such valid subarrays is the current window size: (right - left + 1).
            count += (right - left + 1);
        }

        return count;
    }
}