public class Solution {
    /**
     * Public entry method to print the elements of the array A using recursion.
     * This method calls a helper function to perform the recursion and handles the final newline.
     *
     * @param A The input integer array.
     */
    public void PrintArray(int[] A) {
        // Start the recursive printing process from the first element (index 0) up to the length N
        printArrayHelper(A, 0, A.length);
        // Print a newline character after all elements have been processed and printed
        System.out.println();
    }

    /**
     * Private (package-private in Java) recursive helper function to iterate through the array elements.
     *
     * @param arr The array to print.
     * @param idx The current index being processed.
     * @param n The total length of the array (used for the base case).
     */
    void printArrayHelper(int[] arr, int idx, int n){
        // Base Case: If the current index equals the array length, all elements have been visited.
        // Stop the recursion and return.
        if(idx == n){
            return;
        }

        // Action: Print the element at the current index followed by a space.
        System.out.print(arr[idx]+" ");

        // Recursive Step: Call the helper function again for the next index (idx + 1).
        // This processes elements sequentially from left to right.
        printArrayHelper(arr, idx+1, n);
    }
}