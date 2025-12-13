public class Solution {

    // Define a public method named solve that accepts an integer array A and an integer B, and returns an integer
    public int solve(int[] A, int B) {
        // Get the length of the input array A
        int n = A.length;

        // Declare and initialize a new integer array 'suff' (suffix sums) with a size of n + 1
        int []suff = new int[n + 1];

        // Initialize the last element of the suffix sum array to 0 (base case for an empty suffix)
        suff[n] = 0;

        // Initialize the second-to-last element with the last element of the input array A
        suff[n - 1] = A[n - 1];

        // Iterate backwards from the third-to-last element down to the first element (index 0)
        for(int i = n - 2; i >= 0; i--){
            // Calculate the suffix sum starting at index i by adding A[i] to the suffix sum starting at index i + 1
            suff[i] = A[i] + suff[i + 1];
        }

        // Initialize an integer variable 'pref_sum' (prefix sum) to 0
        int pref_sum = 0;

        // Initialize the answer 'ans' with the sum of the last B elements (picking 0 from the left, B from the right)
        int ans = suff[n - B];

        // Iterate from index 0 up to B-1, considering picking 'i+1' elements from the left
        for(int i = 0; i < B; i++){
            // Accumulate the prefix sum by adding the current element A[i]
            pref_sum = pref_sum + A[i];

            // Calculate the required suffix sum: the sum of the remaining B - (i + 1) elements needed from the right side
            int suff_sum = suff[n - B + (i + 1)];

            // Update 'ans' to be the maximum of the current 'ans' and the sum of the current prefix sum and the corresponding suffix sum
            ans = Math.max(ans, pref_sum + suff_sum);
        }

        // Return the final maximum sum found
        return ans;
    }
}