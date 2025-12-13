public class Solution {
    /**
     * Helper function to expand outwards from a center point (c1 and c2)
     * to find the longest palindrome centered there.
     *
     * @param s The input string.
     * @param c1 The left center index.
     * @param c2 The right center index.
     * @return The palindromic substring found by expanding.
     */
    public String expandAroundCenter(String s, int c1, int c2) {
        // Initialize left and right pointers to the center indices.
        int l = c1, r = c2;
        // Get the length of the string for boundary checks.
        int n = s.length();

        // Expand outwards as long as the pointers are within bounds and characters match.
        while (l >= 0 && r <= n - 1 && s.charAt(l) == s.charAt(r)) {
            // Move left pointer inward (leftward in string).
            l--;
            // Move right pointer outward (rightward in string).
            r++;
        }

        // When the loop terminates, l and r are one step outside the valid palindrome boundaries.
        // The palindrome substring starts at l + 1 and ends just before r.
        return s.substring(l + 1, r);
    }

    /**
     * Finds the longest palindromic substring in the given string A using the expand around center method.
     *
     * @param A The input string.
     * @return The longest palindromic substring.
     */
    public String longestPalindrome(String A) {
        // Get the length of the input string.
        int n = A.length();
        // Handle edge case for an empty string.
        if (n == 0)
            return "";

        // Initialize the 'longest' tracking string with the first character (minimum palindrome).
        String longest = A.substring(0, 1); // a single char itself is a palindrome

        // Iterate through all possible center points (including spaces between characters).
        for (int i = 0; i < n - 1; i++) {
            // Check for odd length palindromes (center at index i).
            String p1 = expandAroundCenter(A, i, i);
            // If the palindrome found is longer than the current longest, update 'longest'.
            if (p1.length() > longest.length())
                longest = p1;

            // Check for even length palindromes (center between index i and i+1).
            String p2 = expandAroundCenter(A, i, i + 1);
            // If the palindrome found is longer than the current longest, update 'longest'.
            // The tie-breaking rule (least starting index) is implicitly handled by processing from left to right.
            if (p2.length() > longest.length())
                longest = p2;
        }

        // Return the final longest palindromic substring found.
        return longest;
    }
}