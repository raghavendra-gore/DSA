public class Solution {

    // Define a public method named solve that accepts a String argument A and returns an integer
    public int solve(String A) {
        // Initialize an integer variable 'ans' (answer) to 0. This will store the count of "bob" occurrences.
        int ans = 0;

        // Iterate through the string using a for loop. The loop runs as long as there are at least 3 characters remaining from the current index 'i'.
        // The condition i+2 < A.length() prevents IndexOutOfBoundsException when checking A.charAt(i+2).
        for(int i = 0; i+2 < A.length(); ++i){
            // Check if the characters at the current index 'i', 'i+1', and 'i+2' exactly match 'b', 'o', and 'b' respectively.
            if(A.charAt(i) == 'b' && A.charAt(i+1) == 'o' && A.charAt(i+2) == 'b'){
                // If the pattern "bob" is found, increment the counter 'ans'.
                ++ans;
            }
        }
        // After iterating through all possible starting positions, return the final accumulated count of "bob" occurrences.
        return ans;
    }
}