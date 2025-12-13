public class AGPairCounter {

    /**
     * Counts the total number of occurrences of 'g' that appear after an 'a' in the string.
     *
     * @param s The input string.
     * @param N The length of the string (can also use s.length()).
     * @return The total count of 'a'-'g' pairs.
     */
    public static int countAG(String s, int N) {
        // We accumulate the total count here
        int ans = 0;

        // Iterate through each character of the string using the index 'i'
        for (int i = 0; i < N; i++) {
            // Use charAt() to access characters in a Java string.
            // Check if the current character at index 'i' is 'a'.
            if (s.charAt(i) == 'a') {
                // If it is 'a', initialize a counter for 'g's found *after* this 'a'
                int g_count = 0;
                // Start a nested loop from the character immediately following the current 'a' (index i + 1)
                for (int j = i + 1; j < N; j++) {
                    // Check subsequent characters for 'g'
                    if (s.charAt(j) == 'g') {
                        // Increment the local 'g' counter for every 'g' found
                        g_count++;
                    }
                }
                // Add all 'g's found after the current 'a' to the total answer.
                // This correctly counts all pairs starting with the 'a' at index 'i'.
                ans += g_count;
            }
        }
        // Return the final accumulated count of all 'a'-'g' pairs found in the string
        return ans;
    }
}