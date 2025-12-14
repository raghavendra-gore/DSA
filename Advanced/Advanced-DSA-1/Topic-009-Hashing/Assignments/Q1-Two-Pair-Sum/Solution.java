public class Solution {
    /**
     * Checks if there exists a pair of distinct elements in the array B that sums up to the target A.
     *
     * @param A The target sum.
     * @param B The input array of integers.
     * @return 1 if such a pair exists, otherwise 0.
     */
    public int solve(int A, int[] B) {
        // Get the length of the input array.
        int n = B.length;

        // Initialize a HashSet to store the numbers encountered so far.
        // HashSets provide O(1) average time complexity for add and contains operations,
        // which makes this solution efficient (O(N) time complexity overall).
        HashSet<Integer> hs = new HashSet<>();

        // Iterate through the array B.
        for(int i = 0; i < n; i++){
            // 'a' is the current number being examined in the array.
            int a = B[i];

            // 'b' is the complement needed to reach the target sum A (A - a).
            // If 'b' is found later in the array, we have a valid pair.
            int b = A - a;

            // Check if the required complement 'b' is already present in the HashSet.
            // If it is, a pair has been found (since 'b' was added in a previous iteration,
            // it guarantees we are using two different indices i and j).
            if(hs.contains(b)){
                return 1; // A valid pair exists.
            }

            // If the complement is not found, add the current number 'a' to the HashSet
            // so it can serve as a complement for subsequent numbers in the array.
            hs.add(a);
        }

        // If the loop completes without finding any such pair, return 0.
        return 0;
    }
}