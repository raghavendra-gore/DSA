public class Solution {
    /**
     * Finds the minimum cost to remove all elements from the array.
     * The optimal approach is to sort the array in descending order
     * and calculate the weighted sum: sum(A[i] * (i + 1))
     *
     * @param A The input integer array.
     * @return The minimum total cost as an integer.
     */
    public int solve(int[] A) {
        // Sort the array in ascending order (default for int[])
        Arrays.sort(A);

        long totalCost = 0;
        int n = A.length;

        // Iterate backward to effectively use descending order
        for (int i = 0; i < n; i++) {
            // A[n - 1 - i] accesses elements from largest to smallest.
            // This element is multiplied by (i + 1)
            totalCost += (long) A[n - 1 - i] * (i + 1);
        }

        // The constraints (N <= 1000, A[i] <= 1000) mean the total cost
        // can fit within a standard 'int' range in Java, but 'long' prevents
        // any potential intermediate overflow during calculation.
        return (int) totalCost;
    }
}