public class Solution {

    // Define a public method named solve that accepts a String argument A and returns a String
    public String solve(String A) {

        // Get the length of the input string A and store it in an integer variable n
        int n = A.length();

        // Convert the input string A into a character array and store it in arr
        char[] arr = A.toCharArray();

        // Iterate through the character array arr using a for loop from index 0 to n-1
        for(int i = 0; i < n; i++){

            // Check if the character at the current index i is an uppercase letter (between 'A' and 'Z')
            if(arr[i] >= 'A' && arr[i] <= 'Z'){

                // If it is uppercase, convert it to a lowercase letter by adding 32 to its ASCII value and cast it back to a char
                arr[i] = (char)(arr[i] + 32);
            } else{

                // If it is not uppercase (meaning it is lowercase based on problem constraints),
                // convert it to an uppercase letter by subtracting 32 from its ASCII value and cast it back to a char
                arr[i] = (char)(arr[i] - 32);
            }

        }

        // Convert the modified character array arr back into a new String object and return it
        return new String(arr);
    }
}