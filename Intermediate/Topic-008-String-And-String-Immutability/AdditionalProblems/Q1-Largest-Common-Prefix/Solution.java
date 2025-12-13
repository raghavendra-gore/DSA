public class Solution {

    // Define a public method named longestCommonPrefix that takes an ArrayList of Strings A and returns a String
    public String longestCommonPrefix(ArrayList < String > A) {
        // Check if the input ArrayList is empty. If so, return an empty string immediately as there is no common prefix.
        if (A.size() == 0)
            return "";

        // Declare a temporary string variable 'str' (though it is not used in the final logic below)
        String str;
        // Initialize the result string 'res' to an empty string. This will store the LCP as it is built.
        String res = "";

        // Initialize an integer variable 'min' to the maximum possible integer value to find the shortest string length
        int min = Integer.MAX_VALUE;
        // Iterate through all strings in the ArrayList A
        for (int i = 0; i < A.size(); i++) {
            // Update 'min' to be the minimum of its current value and the length of the current string
            min = Math.min(min, A.get(i).length());
        }

        // Iterate through each character position from index 0 up to the length of the shortest string ('min')
        for (int i = 0; i < min; i++) {
            // Get the character at the current position 'i' from the *first* string as the reference character 'c'
            char c = A.get(0).charAt(i);

            // Check if character 'c' is the same in every other string at the current position 'i'
            for (int j = 1; j < A.size(); j++) {
                // If the character 'c' does not match the character at the same position in any subsequent string:
                if (c != A.get(j).charAt(i))
                    // A mismatch is found, so the common prefix ends here. Return the 'res' string accumulated so far.
                    return res;
            }
            // If the inner loop completes (meaning all strings matched the character 'c'), append 'c' to the result 'res'
            res += c;
        }

        // If the outer loop completes (meaning all strings matched up to the length of the shortest string),
        // the entire 'res' string is the longest common prefix.
        return res;
    }
}