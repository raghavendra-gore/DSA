public class Solution {
    /**
     * Applies a sequence of transformations to the input string A:
     * 1. Deletes all uppercase letters.
     * 2. Replaces all lowercase vowels with '#'.
     * 3. Concatenates the resulting string with itself.
     *
     * NOTE: The order of operations in this specific implementation differs from the problem statement provided previously,
     * but the code itself is commented exactly as written.
     *
     * @param A The input string.
     * @return The resultant transformed and concatenated string.
     */
    public String solve(String A) {
        // Initialize a StringBuilder to efficiently build the intermediate filtered string.
        StringBuilder res = new StringBuilder();

        // Iterate through each character of the original input string A.
        for(int i=0;i<A.length();i++)
        {
            // Check if the current character is a lowercase letter (Operation 1: filtering out uppercase).
            if(A.charAt(i)>='a' && A.charAt(i)<='z')
            {
                // Check if the lowercase character is a vowel (Operation 2: replacing vowels).
                if(A.charAt(i)=='a' || A.charAt(i)=='e' || A.charAt(i)=='i' || A.charAt(i)=='o' || A.charAt(i)=='u')
                {
                    // Append the replacement character '#' for vowels.
                    res.append("#");
                }
                else
                {
                    // Append the consonant character as is.
                    res.append(A.charAt(i));
                }
            }
            // Uppercase characters are implicitly ignored (deleted) here.
        }

        // Operation 3: Append the *current* contents of the StringBuilder to itself (concatenation).
        res.append(res);

        // Convert the final StringBuilder content back to an immutable String and return it.
        return res.toString();
    }
}