public class Solution {

    /**
     * Counts the number of pairs (i, j) in the string A such that A[i] == 'A',
     * A[j] == 'G', and i < j. This is an O(N) single-pass solution.
     *
     * @param A The input string consisting of uppercase English letters.
     * @return A long integer representing the total count of valid "AG" subsequences.
     */
    public Long solve(String A) {
        // Initialize the total count of valid "AG" pairs found so far.
        // Using Long to prevent potential integer overflow for large strings.
        Long totalAGPairs = 0L;

        // Initialize a counter for the number of 'A' characters encountered so far
        // while traversing the string from left to right.
        Long countA = 0L;

        // Optional: Convert the string to a character array for potentially faster access,
        // although A.charAt(i) is also efficient.
        // char[] ch = A.toCharArray();

        // Iterate through the string from the beginning to the end.
        for (int i = 0; i < A.length(); i++) {
            // Check the current character at index i.
            if (A.charAt(i) == 'A') {
                // If the character is 'A', increment the 'A' counter.
                // This 'A' can potentially form a pair with any future 'G'.
                countA += 1;
            } else if (A.charAt(i) == 'G') {
                // If the character is 'G', it successfully completes an "AG" subsequence
                // with every 'A' that appeared before it in the string.
                // Add the current total count of preceding 'A's to the final answer.
                totalAGPairs += countA;
            }
        }

        // Return the final accumulated count of "AG" pairs.
        return totalAGPairs;
    }
}