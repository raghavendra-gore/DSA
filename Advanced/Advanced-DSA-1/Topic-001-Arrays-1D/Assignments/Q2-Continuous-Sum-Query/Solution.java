public class Solution {
    // Helper function to calculate the prefix sum of an array in-place.
    // The prefix sum is used here to transform the difference array into the final array of total coins.
    public int[] prefixSum(int[] A){
        int[] pref = A;
        // Iterate through the array starting from the second element
        for(int i = 1; i < A.length; i++){
            // Accumulate the value from the previous index
            pref[i] += pref[i - 1];
        }
        // Return the modified array, which is now the prefix sum array
        return pref;
    }

    // Function to distribute donations to beggars and return the final distribution using the difference array concept
    // A: The total number of beggars
    // B: A 2D array representing donations, where each row B[i] contains [left_index, right_index, amount]
    public int[] solve(int A, int[][] B) {
        // Initialize an array to store the net effect of donations at specific indices (a difference array)
        int[] coins = new int[A];
        // Initialize all elements to 0
        for (int i = 0; i < A; i++) coins[i] = 0;

        // coins is an array which denotes the number of coins that each beggar has. Initially each beggar has 0 coins.

        // Iterate through each donation instruction provided in B
        for (int i = 0; i < B.length; i++) {
            // Extract the 0-based start index (L)
            int leftIndex = B[i][0] - 1,
                    // Extract the 0-based end index (R)
                    rightIndex = B[i][1] - 1;
            // Extract the donation amount (P)
            int donationByDevotee = B[i][2];

            // Add the donation amount at the start index in the difference array
            coins[leftIndex] += donationByDevotee;

            // If the index immediately after the end index (R + 1) is within bounds
            if ((rightIndex + 1) < A)
                // Subtract the donation amount at R + 1 to cancel the cumulative effect after index R
                coins[rightIndex + 1] -= donationByDevotee;
        }

        // Calculate the prefix sum of the difference array
        // This transforms the difference array into the actual cumulative coin counts for each beggar
        int[] ans = prefixSum(coins);

        // Return the final array containing the total coins for each beggar
        return ans;
    }
}