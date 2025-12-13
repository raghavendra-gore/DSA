public class Solution {

    // Define a public method named solve that accepts a character array A and returns an integer (1 for true, 0 for false)
    public int solve(char[] A) {
        // Get the length of the input character array A and store it in an integer variable n
        int n = A.length;

        // Iterate through the character array using a for loop from index 0 to n-1
        for(int i = 0; i < n; i++) {
            // Get the current character at index i
            char c = A[i];

            // Check if the character 'c' falls within any of the alphanumeric ASCII ranges:
            // 1. Uppercase letters (A-Z) OR
            // 2. Lowercase letters (a-z) OR
            // 3. Digits (0-9)
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                // If it is alphanumeric, continue to the next iteration of the loop (check the next character)
                continue;
            }
            // If the character is not alphanumeric (the 'if' condition evaluated to false),
            // the entire array is not fully alphanumeric, so immediately return 0 (false)
            return 0;
        }

        // If the loop completes entirely without returning 0, it means all characters were alphanumeric.
        // Return 1 (true)
        return 1;
    }
}