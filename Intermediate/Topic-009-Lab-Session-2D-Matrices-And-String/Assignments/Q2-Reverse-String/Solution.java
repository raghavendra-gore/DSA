public class Solution {
    /**
     * Reverses the words in a given string in-place (mostly), handling multiple spaces.
     * This approach reverses the entire string first, then reverses each individual word.
     *
     * @param A The input string.
     * @return The string with words reversed and proper spacing.
     */
    public String solve(String A) {
        // Convert the input String to a mutable character array for in-place manipulation
        char[] arr = A.toCharArray();
        int n = arr.length;

        // Step 1: Reverse the entire character array (reverses word order, but words are backward)
        reverse(arr, 0, n-1);

        // Step 2: Iterate through the array and reverse each individual word back to normal orientation
        int wordStart = 0;
        for(int i = 0; i < n; i++){
            // If a space is encountered, it marks the end of a word
            if(arr[i] == ' '){
                // Reverse the characters of the found word (from wordStart to the character before the space)
                reverse(arr, wordStart, i-1);
                // Update wordStart to the beginning of the next word (after the space)
                wordStart = i+1;
            }
        }
        // Reverse the last word in the string (since there's no trailing space to trigger the loop condition)
        reverse(arr, wordStart, n-1);

        // Convert the character array back to a String and use .trim()
        // to handle any leading/trailing spaces as per problem requirements.
        // Note: This implementation doesn't strictly handle multiple *internal* spaces perfectly in-place,
        // relying on .trim() for end spaces and the loop structure for internal word boundaries.
        return new String(arr).trim();
    }

    /**
     * Helper method to reverse a specific segment of a character array in-place using two pointers.
     *
     * @param arr The character array.
     * @param i The starting index (inclusive) of the segment to reverse.
     * @param j The ending index (inclusive) of the segment to reverse.
     */
    static void reverse(char[] arr, int i, int j){
        // Continue swapping elements as long as the start pointer is less than the end pointer
        while(i < j){
            // Swap the characters at indices i and j
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            // Move pointers inward
            i++;
            j--;
        }
    }
}