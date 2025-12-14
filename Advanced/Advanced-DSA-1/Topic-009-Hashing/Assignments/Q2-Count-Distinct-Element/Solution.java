public class Solution {
    /**
     * Counts the number of unique elements in an integer array.
     *
     * @param A The input array of integers.
     * @return The count of distinct elements in the array.
     */
    public int solve(int[] A) {
        // Get the length of the input array.
        int n = A.length;

        // Initialize a HashSet to store unique numbers encountered.
        // HashSets automatically prevent duplicate entries.
        HashSet<Integer> hs = new HashSet();

        // Iterate through all elements of the input array.
        for(int i = 0; i < n; i++){
            // Add the current element to the HashSet.
            // If the element is already in the set, the add operation
            // does nothing, ensuring only unique values are stored.
            hs.add(A[i]);
        }

        // The size of the HashSet at the end of the iteration
        // is exactly the number of unique elements in the original array A.
        return hs.size();
    }
}