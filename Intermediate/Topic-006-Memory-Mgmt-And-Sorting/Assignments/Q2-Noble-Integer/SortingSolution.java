public class Solution {
    public int solve(int[] A) {
        int n = A.length;
        // Step 1: Sort the array in ascending order
        Arrays.sort(A);

        // Step 2 & 3: Iterate and check the condition
        for (int i = 0; i < n; i++) {
            // Check if A[i] is a potential candidate 'p'.
            // The number of elements strictly greater than A[i] is N - 1 - i.
            int count_greater = n - 1 - i;

            // If A[i] equals the count of elements greater than it
            if (A[i] == count_greater) {
                // We need to ensure we don't count duplicate elements incorrectly.
                // A[i] must be strictly greater than all elements to its right.
                // This condition is handled implicitly by the sort, but if there
                // are duplicates, we should only consider the *last* occurrence
                // of that number's block, or ensure the next number is different.

                // If we are at the last element, or the next element is different
                if (i == n - 1 || A[i] != A[i + 1]) {
                    return 1; // Found such an integer p
                }
            }
        }

        // Step 4: No such integer p was found
        return -1;
    }
}