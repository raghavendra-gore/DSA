public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        // Step 1: Count the number of elements <= B.
        // This count determines the size of our required window (k).
        int window = 0;

        for(int x: A){
            if(x <= B){
                window++;
            }
        }
        // If there are 0 or 1 favorable elements, no swaps are needed.
        if(window <= 1){
            return 0;
        }

        // Step 2: Count "unfavorable" elements (those > B) within the initial window (first 'k' elements).
        int irrEle = 0; // 'irrEle' stands for irrelevant/unfavorable elements

        for(int i = 0; i < window; i++){
            if(A[i] > B){
                irrEle++;
            }
        }

        // Initialize minimum swaps needed with the count from the first window.
        int minSwaps = irrEle;

        // Step 3: Slide a window of fixed size 'window' across the array.
        // The loop runs from the start of the second possible window to the end.
        for(int i = 1; i <= n - window; i++){
            // When the window moves right by one step:

            // Check the element leaving the window from the left.
            if(A[i - 1] > B){
                irrEle--; // If it was unfavorable, decrement the count.
            }

            // Check the element entering the window from the right.
            if(A[i + window - 1] > B){
                irrEle++; // If it is unfavorable, increment the count.
            }

            // Step 4: Update the minimum swaps found across all windows.
            minSwaps = Math.min(minSwaps, irrEle);
        }

        // The minimum count of unfavorable elements within any 'window' sized subarray
        // is the minimum number of swaps required.
        return minSwaps;
    }
}