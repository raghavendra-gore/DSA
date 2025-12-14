public class Solution {
    /**
     * Finds the majority element that appears more than N/3 times in the array A.
     * Implements the Boyer-Moore Voting Algorithm extended for N/3 majority (finding up to two candidates).
     *
     * @param A The input integer array.
     * @return The integer appearing more than N/3 times, or -1 if none exists.
     */
    public int repeatedNumber(int[] A) {
        int n = A.length;
        // count1 and count2 track the current vote counts for the candidates
        int count1 = 0, count2 = 0;
        // first and second store the potential majority elements (candidates)
        // Initialize candidates to values highly unlikely to be in the input array based on constraints
        int first =  Integer.MIN_VALUE;;
        int second = Integer.MAX_VALUE;

        // First pass: Find potential majority candidates using the voting algorithm
        for (int i = 0; i < n; i++) {
            // If the current element matches the first candidate, increment its count
            if (first == A[i])
                count1++;
                // If the current element matches the second candidate, increment its count
            else if (second == A[i])
                count2++;
                // If the first count is zero, assign the current element as the first candidate
            else if (count1 == 0) {
                count1++;
                first = A[i];
            }
            // If the second count is zero, assign the current element as the second candidate
            else if (count2 == 0) {
                count2++;
                second = A[i];
            }
            // If neither candidate matches and both counts are non-zero, decrement both counts
            else {
                count1--;
                count2--;
            }
        }

        // Second pass: Verify the actual counts of the potential candidates found
        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            // Count occurrences of the first candidate
            if (A[i] == first)
                count1++;
                // Count occurrences of the second candidate
            else if (A[i] == second) // Use else if to handle cases where first and second might accidentally be the same value if we didn't pick distinct initial values
                count2++;
        }

        // Check if the first candidate appears more than N/3 times
        if (count1 > n / 3)
            return first;

        // Check if the second candidate appears more than N/3 times
        if (count2 > n / 3)
            return second;

        // If neither candidate meets the threshold, no such element exists
        return -1;
    }
}