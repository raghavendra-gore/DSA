public class Solution {
    /**
     * Recursive helper function that prints numbers in descending order (pre-recursion print)
     * and ascending order (post-recursion print) around its recursive call.
     * This achieves the N...1...N pattern for a given starting number A.
     *
     * @param A The current number to process in the sequence.
     */
    public void run(int A){
        // Base Case: If A is 0, we stop the recursion and start unwinding the stack.
        if (A == 0) {
            return;
        }

        // Descending Phase (executed as the call stack builds):
        // Print the current number before the recursive call to handle N down to 1.
        System.out.print(A + " ");

        // Recursive Step: Dive deeper into the recursion with the next smaller number.
        run(A - 1);

        // Ascending Phase (executed as the call stack unwinds):
        // Print the current number again after the recursive call returns to handle 1 up to N.
        System.out.print(A + " ");
    }

    /**
     * Public entry method as required by the problem signature.
     * Initiates the recursive process and ensures the final newline is printed.
     *
     * @param A The positive integer N provided as input.
     */
    public void DecThenInc(int A) {
        // Start the recursive printing using the helper function 'run'
        run(A);
        // After the entire recursive process in 'run(A)' completes, print a newline.
        System.out.println();
    }
}