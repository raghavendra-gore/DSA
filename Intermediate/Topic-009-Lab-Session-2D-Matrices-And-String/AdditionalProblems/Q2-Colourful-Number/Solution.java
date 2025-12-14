public class Solution {
    public int colorful(int A) {
        // Use a HashSet to store unique products of sub-sequences to check for duplicates
        HashSet < Integer > hashSet = new HashSet < > ();
        // Use an ArrayList to store the individual digits of the number
        ArrayList < Integer > numbers = new ArrayList < > ();

        // Extract digits from the integer A and store them in the list in reverse order
        while (A != 0) {
            int num = A % 10;
            numbers.add(num);
            A /= 10;
        }

        // Reverse the list so the digits are in their original order (left to right)
        Collections.reverse(numbers);

        // Get the total number of digits
        int n = numbers.size();

        // Iterate through all possible starting indices (i) for a sub-sequence
        for (int i = 0; i < n; i++) {
            // Initialize product for the current sub-sequence
            int prod = 1;
            // Iterate through all possible ending indices (j) for the sub-sequence, starting from i
            for (int j = i; j < n; j++) {
                // prod stores the product of every digit in the range [i..j]
                prod *= numbers.get(j);

                // check if the product is unique (if it's already in the set)
                if (hashSet.contains(prod))
                    // If a duplicate product is found, the number is not colorful, return 0
                    return 0;

                // Add the new, unique product to the set
                hashSet.add(prod);
            }
        }

        // If the loops complete without finding any duplicate products, the number is colorful, return 1
        return 1;
    }
}