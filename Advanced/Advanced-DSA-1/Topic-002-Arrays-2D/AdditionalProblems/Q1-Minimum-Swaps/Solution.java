public class Solution {
    // Method to find the minimum number of swaps to bring all elements <= B together
    public int solve(int[] A, int B) {
        int n = A.length;
        int cnt = 0;
        // Count the number of elements in the array that are less than or equal to B
        // This count 'cnt' determines the size of our target contiguous window
        for(int x : A)
            if(x <= B)
                cnt++;

        // If there are 0 or 1 favorable elements, they are already "together", so 0 swaps are needed
        if(cnt <= 1)
            return 0;
        else {
            int l = 0, r = 0, x = 0;
            // 'l' and 'r' are pointers for the sliding window
            // 'x' counts the number of "unfavorable" elements (elements > B) within the current window

            // Initialize the first sliding window of size 'cnt'
            while(r < cnt) {
                // If the current element in the initial window is unfavorable, increment the bad count 'x'
                if(A[r] > B)
                    x++;
                r++;
            }

            // 'ans' stores the minimum number of unfavorable elements found in any window of size 'cnt'
            // Initialize 'ans' with the count from the first window
            int ans = x;

            // Slide the window across the rest of the array
            while(r < n) {
                // When moving the right edge 'r' into the window:
                // If the new element A[r] is unfavorable, increment 'x'
                if(A[r] > B)
                    x++;

                // When moving the left edge 'l' out of the window:
                // If the element A[l] leaving the window was unfavorable, decrement 'x'
                if(A[l] > B)
                    x--;

                // Update the minimum count of unfavorable elements found so far
                ans = Math.min(ans, x);

                // Move the window forward
                r++;
                l++;
            }
            // The minimum count of unfavorable items within a 'cnt'-sized window
            // is equal to the minimum swaps required
            return ans;
        }
    }
}