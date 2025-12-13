public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    // Method to find the B-th smallest element in an integer array A
    public int kthsmallest(final int[] A, int B) {
        // Iterate B times to place the B smallest elements at the beginning of the array
        for (int i = 0; i < B; i++) {
            // finding the minimum element from the remaining array (from index i to the end)
            int minn = Integer.MAX_VALUE, idx = 0;
            for (int j = i; j < A.length; j++) {
                // Check if the current element is smaller than the current minimum found so far
                if (A[j] < minn) {
                    // Update the minimum value and its index
                    minn = A[j];
                    idx = j;
                }
            }
            // Swap the found minimum element with the element at the current position 'i'
            // This effectively places the i-th smallest element into its correct sorted position
            int tmp = A[i];
            A[i] = A[idx];
            A[idx] = tmp;
        }
        // After B iterations, the first B elements are the B smallest elements
        // Return the element at index B-1, which is the B-th smallest element
        return A[B - 1];
    }
}