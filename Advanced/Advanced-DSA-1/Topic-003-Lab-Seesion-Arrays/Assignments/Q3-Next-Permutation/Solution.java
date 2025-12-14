public class Solution {
    // Helper function to swap two elements in an array at specified indices
    void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    // Helper function to reverse a portion of the array in-place, defined by start and end indices (inclusive)
    void reverse(int[] A, int start, int end) {
        while (start < end) {
            swap(A, start, end);
            start++;
            end--;
        }
    }

    // Main function to find the next lexicographically greater permutation of the array A
    public int[] nextPermutation(int[] A) {

        int n = A.length;
        // Edge case: an array of size 0 or 1 is already its own 'next' permutation
        if (n <= 1) {
            return A;
        }

        // Implements Step 1: Find the largest index `idx` such that A[idx] < A[idx + 1]
        // Start search from the second-to-last element, moving left
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] < A[i + 1]) {
                idx = i;
                break; // Found the pivot point
            }
        }

        // If no such index exists (idx remains -1), the array is in descending order.
        // This means it is the largest possible permutation.
        // The problem requires rearranging it to the lowest possible order (ascending).
        if (idx == -1) {
            reverse(A, 0, n - 1); // Reverse the whole array
            return A;
        }

        // Implements Step 2: Find the largest index `swapIdx` greater than `idx`
        // such that A[swapIdx] > A[idx]
        int swapIdx = -1;
        for (int i = n - 1; i > idx; i--) {
            if (A[i] > A[idx]) {
                swapIdx = i;
                break; // Found the element to swap with the pivot
            }
        }

        // Implements Step 3: Swap A[idx] and A[swapIdx]
        // The swapIdx will always be found if idx is not -1
        if (swapIdx != -1) {
            swap(A, idx, swapIdx);
        }

        // Implements Step 4: Reverse the sub-array strictly to the right of `idx`
        // This makes the suffix the smallest possible arrangement (ascending order)
        reverse(A, idx + 1, n - 1);

        return A;
    }
}