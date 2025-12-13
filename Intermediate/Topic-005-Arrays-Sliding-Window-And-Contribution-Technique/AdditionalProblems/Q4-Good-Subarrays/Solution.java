public class Solution {
    // Method to count subarrays based on size parity and sum conditions
    public int solve(int[] A, int B) {

        // Store the length of the input array
        int n = A.length;

        // Prefix sum array to store cumulative sums of the array
        int pref[] = new int[n];

        // Initialize the first prefix sum with the first element
        pref[0] = A[0];

        // Variable to store the count of valid subarrays
        int ans = 0;

        // Build the prefix sum array
        for(int i = 1 ; i < n ; i++){
            pref[i] = pref[i - 1] + A[i];
        }

        // Iterate over all possible starting indices of subarrays
        for(int i = 0 ; i < n ; i++){

            // Iterate over all possible ending indices of subarrays
            for (int j = i ; j < n ; j++){

                // Calculate the size (length) of the current subarray
                int sz = j - i + 1;

                // Variable to store the sum of the current subarray
                int sum;

                // If subarray starts from index 0, take prefix sum directly
                if(i == 0){
                    sum = pref[j];
                }
                // Otherwise, subtract prefix sum before index i
                else{
                    sum = pref[j] - pref[i - 1];
                }

                // If subarray size is even and sum is less than B, count it
                if(sz % 2 == 0 && sum < B) ans++;

                // If subarray size is odd and sum is greater than B, count it
                if(sz % 2 == 1 && sum > B) ans++;
            }
        }

        // Return the total count of valid subarrays
        return ans;
    }
}