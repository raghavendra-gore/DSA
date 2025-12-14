public class Solution {
    /**
     * Reverses the characters of the input string A.
     *
     * @param A The input string to be reversed.
     * @return The reversed string.
     */
    public String solve(String A) {
        // Convert the immutable String A into a mutable character array
        char[] arr = A.toCharArray();
        int n = arr.length;

        // Initialize two pointers: 'l' for left (start) and 'r' for right (end)
        int l = 0;
        int r = n - 1;

        // Use a two-pointer approach to swap characters from the outside in
        while(l < r){
            // Store the character at the left pointer in a temporary variable
            char temp = arr[l];
            // Replace the character at the left with the character from the right
            arr[l] = arr[r];
            // Replace the character at the right with the stored temporary character (original left character)
            arr[r] = temp;
            // Move the left pointer one step to the right
            l++;
            // Move the right pointer one step to the left
            r--;
        }

        // Convert the modified character array back into a new String object and return it
        return new String(arr);
    }
}