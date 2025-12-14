public class Solution {
    /**
     * Public method to find all indices of a target integer B within an array A.
     * Initializes a dynamic list and converts it to a primitive array upon completion.
     */
    public int[] allIndices(int[] A, int B) {
        int n = A.length; // Store the length of the input array A.
        ArrayList<Integer> ans = new ArrayList(); // Initialize a dynamic ArrayList to store indices.
        solution(A, B, n, 0, ans); // Call the recursive helper function starting from index 0.

        // Convert the ArrayList of indices into a fixed-size integer array required by the return type.
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result; // Return the final array of indices.
    }

    /**
     * A static recursive helper function to traverse the array and collect indices where arr[i] == B.
     *
     * @param arr The input array.
     * @param B The target value to search for.
     * @param n The total length of the array (used for the base case check).
     * @param i The current index being examined in the recursion.
     * @param ans The ArrayList where matching indices are stored.
     */
    static void solution(int[] arr, int B, int n, int i, ArrayList<Integer> ans){
        // Base Case: If the current index 'i' reaches the end of the array, stop the recursion.
        if(i == n){
            return;
        }

        // Check if the element at the current index 'i' matches the target 'B'.
        if(arr[i] == B){
            ans.add(i); // If it matches, add the current index to the results list.
        }

        // Recursive Step: Call the function again for the next index (i + 1).
        solution(arr, B, n, i+1, ans);
    }
}