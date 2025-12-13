public class Solution {

    /**
     * Generates all contiguous subarrays of a given integer array A and returns them as a jagged int[][].
     *
     * @param A The input array of integers.
     * @return A 2D jagged array containing all subarrays.
     */
    public int[][] solve(int[] A) {
        int n = A.length;

        // Calculate the total number of subarrays: N * (N + 1) / 2
        int totalSubarrays = n * (n + 1) / 2;

        // Initialize the outer array with the correct total count of subarrays.
        int[][] allSubarrays = new int[totalSubarrays][];

        int subarrayIndex = 0;

        // Outer loop: iterates through all possible starting indices 'i'.
        for (int i = 0; i < n; i++) {
            // Middle loop: iterates through all possible ending indices 'j', starting from 'i'.
            for (int j = i; j < n; j++) {

                // The length of the current subarray [i...j] is (j - i + 1).
                int currentSubarrayLength = j - i + 1;

                // Create a new array for the current subarray with the exact required length.
                int[] currentSubarray = new int[currentSubarrayLength];

                // Inner loop: Manually copy elements from the original array A
                // to the new currentSubarray array.
                for (int k = i; k <= j; k++) {
                    // Place the element A[k] into the correct relative position in the new array.
                    // The relative position is k - i.
                    currentSubarray[k - i] = A[k];
                }

                // Assign the newly created subarray to the next available slot in the result array.
                allSubarrays[subarrayIndex] = currentSubarray;

                // Move to the next slot in the result array.
                subarrayIndex++;
            }
        }

        // Return the fully populated jagged 2D array.
        return allSubarrays;
    }
}