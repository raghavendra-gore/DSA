public class Solution {
    // Method to add one to a number represented by an ArrayList of digits
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {

        // Initialize carry for addition process, starting with 1 to increment the number
        int carry = 1;
        int num;
        // Get the size of the input digit list
        int size = A.size();

        // traversing the digits of the number in reverse order (from least significant to most significant)
        for (int i = size - 1; i >= 0; i--) {

            // Get the current digit
            num = A.get(i);
            // Add the carry to the current digit
            num += carry;
            // Reset the carry for the next iteration initially
            carry = 0;

            // Check if the sum resulted in a carry-over (e.g., 9 + 1 = 10)
            if (num == 10) {
                // If sum is 10, the digit becomes 0
                num = 0;
                // Set carry to 1 for the next digit to the left
                carry = 1;
            }

            // Update the digit in the original list in-place
            A.set(i, num);

        }

        // Initialize a new ArrayList to store the final result, handling the potential new leading digit and leading zeros
        ArrayList<Integer> res = new ArrayList<Integer>();

        // If a final carry remains after processing all digits (e.g., input [9, 9, 9]), add a leading '1' to the result
        if (carry == 1)
            res.add(1);

        // Iterate through the modified original list A to build the final result array list
        for (int x : A) {
            // Condition to skip leading zeros in the input/modified array
            // If current digit is 0 AND the result list is currently empty, skip it (as per problem constraints: no leading zeros in output)
            if (x == 0 && res.size() == 0)
                continue;
            // Add the valid digit to the result list
            res.add(x);
        }

        // Return the final ArrayList of digits
        return res;

    }
}