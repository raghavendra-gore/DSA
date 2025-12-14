public class Solution {
    /**
     * Recursive helper function to check if a substring of A from index i to j (inclusive) is a palindrome.
     *
     * @param i The starting index of the substring.
     * @param j The ending index of the substring.
     * @param A The input string.
     * @return 1 if the substring is a palindrome, 0 otherwise.
     */
    public int solve(int i, int j, String A){
        // Base Case 1: If the left index (i) crosses or meets the right index (j),
        // the segment is a palindrome (or empty/single character).
        if(i >= j){
            return 1;
        }

        // Base Case 2: If the characters at the current start and end positions do not match,
        // the entire string cannot be a palindrome.
        if(A.charAt(i) != A.charAt(j)){
            return 0;
        }

        // Recursive Step: If the current characters match, continue the check
        // for the inner substring by moving 'i' one step right and 'j' one step left.
        return solve(i+1, j-1, A);
    }

    /**
     * Public interface method to initiate the palindrome check for the entire string A.
     *
     * @param A The full input string.
     * @return 1 if the entire string A is a palindrome, 0 otherwise.
     */
    public int solve(String A) {
        // Start the recursive check from the beginning (index 0) to the end (index length-1) of the string.
        return solve(0, A.length()-1, A);
    }
}