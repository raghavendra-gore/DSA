public class Solution {

    /**
     * Calculates the length of the longest palindromic substring in the given string s.
     * This uses a brute-force approach with O(N^3) time complexity.
     *
     * @param s The input string.
     * @return The length of the longest palindromic substring.
     */
    public int longestPalindromeSubstring(String s) {
        // Get the length of the input string.
        int N = s.length();
        // Initialize the answer (length of the longest palindrome) to 0.
        int ans = 0;

        // Iterate through all possible starting indices 'i' of substrings.
        for (int i = 0; i < N; i++) {
            // Iterate through all possible ending indices 'j' of substrings, starting from 'i'.
            for (int j = i; j < N; j++) {
                // Check if the substring from index i to j is a palindrome.
                // Note: The provided isPalindrome signature needs the string object itself or char array,
                // this implementation assumes the `isPalindrome` method is adapted to accept String and indices.
                if (isPalindrome(s, i, j)) {
                    // Calculate the length of the current palindrome (j - i + 1).
                    int currentLength = j - i + 1;
                    // Update the maximum length found so far.
                    ans = Math.max(ans, currentLength);
                }
            }
        }
        // Return the final maximum length found.
        return ans;
    }

    /**
     * Helper function to check if a substring within string s from start index to end index (inclusive) is a palindrome.
     *
     * @param s The input string (or char array in the original pseudocode).
     * @param start The starting index of the substring.
     * @param end The ending index of the substring.
     * @return True if the substring is a palindrome, false otherwise.
     */
    // Assuming the input signature is adapted to take a String or char[]
    public boolean isPalindrome(String s, int start, int end) {
        // Use two pointers starting from the ends of the potential palindrome segment.
        while (start < end) {
            // If characters at the current pointers do not match, it is not a palindrome.
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            // Move the start pointer forward and the end pointer backward.
            start++;
            end--;
        }
        // If the loop completes without finding mismatches, the substring is a palindrome.
        return true;
    }
}