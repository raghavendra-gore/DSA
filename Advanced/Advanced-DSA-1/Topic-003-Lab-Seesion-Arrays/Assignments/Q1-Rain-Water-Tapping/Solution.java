public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    // The main method to calculate the total trapped rainwater.
    public int trap(final int[] A) {
        // Get the length of the input array.
        int n = A.length;
        // Calculate the maximum height to the left of each bar (inclusive).
        int[] lMax = getLMax(A, A.length);
        // Calculate the maximum height to the right of each bar (inclusive).
        int[] rMax = getRMax(A, A.length);

        // Initialize total trapped water count.
        int ans = 0;
        // Iterate through each bar, excluding the edges, which cannot trap water.
        for(int i = 1; i < n-1; i++){
            // Get the highest wall on the immediate left.
            int lm = lMax[i-1];
            // Get the highest wall on the immediate right.
            int rm = rMax[i+1];

            // Water level is determined by the shorter of the two surrounding walls.
            int level = Math.min(lm, rm);

            // Add the trapped water above the current bar's height.
            // Ensure we don't add negative water (use Math.max(..., 0)).
            ans += Math.max(level - A[i], 0);
        }

        // Return the accumulated amount of trapped water.
        return ans;
    }

    // Helper method to compute the prefix maximums array.
    int[] getLMax(int[] arr, int n){
        int[] lMax = new int[n];
        // The first element's left max is itself.
        lMax[0] = arr[0];
        // Iterate from the second element to the end.
        for (int i = 1; i < n; i++) {
            // The current left max is the max of the previous left max and the current height.
            lMax[i] = Math.max(lMax[i - 1], arr[i]);
        }
        return lMax;
    }

    // Helper method to compute the suffix maximums array.
    int[] getRMax(int[] arr, int n){
        int[] suffixMax = new int[n];

        // The last element's right max is itself.
        suffixMax[n - 1] = arr[n - 1];

        // Iterate from the second-to-last element towards the beginning.
        for (int i = n - 2; i >= 0; i--) {
            // The current right max is the max of the current height and the next right max.
            suffixMax[i] = Math.max(arr[i], suffixMax[i + 1]);
        }
        return suffixMax;
    }
}