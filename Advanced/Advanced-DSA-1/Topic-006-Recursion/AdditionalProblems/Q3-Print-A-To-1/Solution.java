public class Solution {

    /**
     * Recursive helper function to print numbers from A down to 1.
     *
     * @param A The current integer to print.
     */
    public void printAto1(int A){
        // Base case: If A is 0, we've printed all numbers, so we return and stop the recursion.
        if(A == 0){
            return;
        }

        // Print the current value of A followed by a space.
        System.out.print(A + " ");

        // Recursive step: Call the function again with A-1 to print the next number in the sequence.
        printAto1(A - 1);
    }

    /**
     * Main method to solve the problem. It initiates the recursive process
     * and ensures a newline is printed at the very end.
     *
     * @param A The starting integer.
     */
    public void solve(int A) {
        // Start the recursive printing from the given integer A.
        printAto1(A);

        // After the recursion completes and all numbers are printed, print a newline character.
        System.out.print("\n");
    }
}