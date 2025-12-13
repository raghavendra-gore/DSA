public class Solution {

    // Define a public method named solve that accepts an integer array A and returns an integer array (containing leaders)
    public int[] solve(int[] A) {
        // Get the length of the input array A
        int size = A.length;

        // Declare and initialize a new integer array 'ans' (potential leaders) with the same size as A
        int[] ans = new int[size];
        // Initialize 'max_from_right' with the last element of the array A, which is always a leader by definition
        int max_from_right = A[size - 1];
        // Initialize a counter 'count' to 0, which tracks the number of leaders found so far
        int count = 0;
        // Add the initial leader (last element) to the 'ans' array and increment the count
        ans[count++] = max_from_right;

        // Iterate through the array from the second-to-last element down to the first element (index 0)
        for (int i = size - 2; i >= 0; i--) {
            // Check if the current element A[i] is greater than the maximum element found so far while moving from right to left
            if (max_from_right < A[i]) {
                // If A[i] is greater, it is a new leader. Add it to the 'ans' array and increment the count.
                ans[count++] = A[i];
                // Update 'max_from_right' to the new maximum leader found
                max_from_right = A[i];
            }
        }

        // Create a new integer array 'result' with the exact size of the 'count' of leaders found
        int[] result = new int[count];
        // Copy the leaders from the temporary 'ans' array into the 'result' array
        for (int i = 0; i < count; i++) {
            result[i] = ans[i];
        }
        // Return the final 'result' array containing all leaders in the order they were found (right to left)
        return result;
    }
}