public class Solution {
    // This method counts the number of subarrays whose sum is less than B
    public int solve(int[] A, int B) {

        // Length of the input array
        int n  = A.length;

        // Prefix sum array where pref[i] stores sum of elements from index 0 to i
        int pref[] = new int[n];

        // Initialize the first prefix sum with the first element
        pref[0] = A[0];

        // Variable to store the final count of valid subarrays
        int ans = 0;

        // Build the prefix sum array
        for(int i = 1; i < n; i++)
            pref[i] = pref[i - 1] + A[i];

        // Iterate over all possible starting indices of subarrays
        for(int i = 0; i < n; i++) {

            // Iterate over all possible ending indices of subarrays
            for (int j = i; j < n; j++) {

                // Calculate sum of subarray from i to j using prefix sums
                int sum = pref[j];

                // If subarray does not start at index 0, subtract prefix sum before i
                if(i > 0) {
                    sum -= pref[i - 1];
                }

                // If the subarray sum is less than B, increment the count
                if(sum < B) ans++;
            }
        }

        // Return the total number of valid subarrays
        return ans;
    }
}