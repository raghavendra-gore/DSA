public class Solution {
    /**
     * Function to find the two integers that appear only once in an array
     * where all other elements appear exactly twice.
     *
     * @param A The input array of integers.
     * @return An array containing the two unique numbers in ascending order.
     */
    public int[] solve(int[] A) {
        int n = A.length;
        // Step 1: Calculate the XOR sum of all elements.
        // This results in the XOR of the two unique numbers (num1 ^ num2).
        int xorAll = 0;
        for(int i = 0; i < n; i++){
            xorAll = xorAll ^ A[i];
        }

        // Step 2: Find the position of a set bit (1) in the overall XOR sum.
        // This bit position guarantees that the two unique numbers have different values (0 vs 1) at this position.
        int pos = 0;
        for(int i =0; i < 32; i++){
            // Use helper function to find the first set bit position (starting from LSB).
            if(checkBit(xorAll, i) == true){
                pos = i;
                break; // Found the differentiating bit position
            }
        }

        // Step 3 & 4: Partition the numbers into two groups based on the differentiating bit 'pos'
        // and XOR elements within each group to isolate the unique numbers.
        int firstGroup = 0; // Accumulator for the group where the bit at 'pos' is 1
        int secondGroup = 0; // Accumulator for the group where the bit at 'pos' is 0
        // The following line initializes a List which is not used later and can be ignored for functionality:
        List<int[]> ans = new ArrayList();

        for(int i = 0; i < n; i++){
            // Check the bit at the determined 'pos' for the current array element A[i]
            if(checkBit(A[i], pos) == true){
                // If the bit is set (1), XOR it into the first group accumulator
                firstGroup = firstGroup ^ A[i];
            } else{
                // If the bit is not set (0), XOR it into the second group accumulator
                secondGroup = secondGroup ^ A[i];
            }
        }

        // Step 5: Store the two isolated unique numbers in a result array.
        int[] result = new int[]{firstGroup, secondGroup};
        // Sort the result array in ascending order as required by the problem statement.
        Arrays.sort(result);

        // Return the final array containing the two unique elements.
        return result;
    }

    /**
     * Helper function to check if the j-th bit of an integer n is set (1) or unset (0).
     *
     * @param n The integer to check.
     * @param j The bit position (0-indexed) to check.
     * @return true if the bit is 1, false if the bit is 0.
     */
    boolean checkBit(int n, int j){

        // Use bitwise AND with a mask (1 shifted left by j positions) to isolate the j-th bit.
        if((n&(1<<j)) == 0){
            return false;
        }
        else{
            return true;
        }
    }
}