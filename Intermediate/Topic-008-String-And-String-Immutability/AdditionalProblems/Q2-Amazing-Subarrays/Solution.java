public class Solution {

    // Define a public method named solve that accepts a String argument A and returns an integer
    public int solve(String A) {
        // Get the length of the input string A and store it in an integer variable N
        int N = A.length();
        // Initialize a long integer variable 'count' to 0. Using long helps prevent intermediate integer overflow.
        long count = 0;
        // Define the modulo value as required by the problem constraints
        int MOD = 10003;

        // Iterate through the string using a for loop, where 'i' is the current character index
        for (int i = 0; i < N; i++) {
            // Get the character at the current index 'i'
            char c = A.charAt(i);
            // Check if the current character is a vowel (both lowercase and uppercase)
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {

                // If the character is a vowel, add the number of possible substrings starting at this index (N - i) to the count
                // The modulo operation is applied at each addition to keep the count within a manageable range
                count = (count + (N - i)) % MOD;
            }
        }

        // Cast the final count (which is already modulo MOD) back to an integer and return it
        return (int) count;
    }
}