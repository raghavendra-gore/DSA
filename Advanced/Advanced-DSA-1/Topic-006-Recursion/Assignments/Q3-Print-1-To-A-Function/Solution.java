public class Solution {
    /**
     * Public entry method to print numbers from 1 to A using recursion,
     * followed by a newline character.
     *
     * @param A The maximum number to print.
     */
    public void solve(int A) {
        // Start the recursive process with A as the initial value to drive the recursion stack depth
        printRecursiveHelper(A);
        // After the helper function completes and returns (meaning all numbers 1 to A are printed),
        // print the required newline character.
        System.out.println();
    }

    /**
     * Private helper method that uses recursion to print numbers in ascending order.
     * This function calls itself first, building up the call stack, then prints
     * as the stack unwinds from 1 up to the initial A.
     *
     * @param currentNum The current number being processed in this stack frame (starts at A).
     */
    private void printRecursiveHelper(int currentNum) {
        // Base Case: If the current number is 0 or less, stop the recursion
        // and start unwinding the stack.
        if (currentNum <= 0) {
            return;
        }

        // Recursive Step: First, call the function for the previous number (currentNum - 1).
        // This ensures the smallest numbers are reached and printed first upon unwinding.
        printRecursiveHelper(currentNum - 1);

        // Action: After the recursive call returns (meaning all numbers less than currentNum are printed),
        // print the current number followed by a space.
        System.out.print(currentNum + " ");
    }
}