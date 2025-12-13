public class Solution {

    // Define a public method named solve that accepts an integer array A and an integer B, and returns an integer
    public int solve(int[] A, int B) {
        // Get the length of the input array A and store it in an integer variable n
        int n = A.length;
        // Initialize an integer variable 'cnt' (count) to 0
        int cnt = 0;

        // Iterate through all elements 'x' in the array A
        for(int x : A)
            // If the current element 'x' is less than or equal to B, increment the count 'cnt'
            if(x <= B)
                cnt++;

        // Check if the count of elements <= B is less than or equal to 1
        if(cnt <= 1)
            // If true, return 0 as no swaps are needed or possible to make a contiguous block
            return 0;
        else {
            // Initialize three integer variables: 'l' (left pointer), 'r' (right pointer), and 'x' (count of 'bad' elements in current window) to 0
            int l = 0, r = 0, x = 0;

            // Slide a window of size 'cnt' across the array using a two-pointer approach
            // Count the number of elements in the initial window [0, cnt-1] that are greater than B ('bad' elements)
            while(r < cnt) {
                // If the element at the right pointer is greater than B (a 'bad' element)
                if(A[r] > B)
                    // Increment the 'bad' element count 'x'
                    x++;
                // Move the right pointer forward
                r++;
            }

            // Initialize the answer 'ans' with the count of 'bad' elements found in the first window
            int ans = x;

            // Continue sliding the window one step at a time until the right pointer reaches the end of the array
            while(r < n) {
                // When the window moves right, check if the new element entering the window is 'bad' (greater than B)
                if(A[r] > B)
                    x++;
                // Check if the element leaving the window from the left was 'bad' (greater than B)
                if(A[l] > B)
                    x--;
                // Update 'ans' to be the minimum number of 'bad' elements found in any window of size 'cnt'
                ans = Math.min(ans, x);
                // Move both pointers forward to slide the window
                r++;
                l++;
            }
            // Return the minimum number of 'bad' elements found, which corresponds to the minimum number of swaps required
            return ans;
        }
    }
}