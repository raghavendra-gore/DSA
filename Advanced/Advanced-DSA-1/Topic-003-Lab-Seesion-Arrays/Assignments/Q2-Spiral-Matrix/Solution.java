public class Solution {
    // Method to generate a square matrix of size A*A filled in spiral order.
    public int[][] generateMatrix(int A) {
        // Initialize an A x A matrix with default values (zeros).
        int[][] ans = new int[A][A];

        // 'count' keeps track of the number to fill in the current cell, starting from 1.
        int count = 1;
        // 'r' and 'c' track the current row and column indices (top-left corner of the current spiral layer).
        int r = 0, c= 0;
        // The main loop processes the matrix layer by layer (outermost to innermost).
        // 'A' dynamically represents the dimension of the current *remaining* square layer.
        while(A > 1){
            // 1. Move Right: Fill cells along the top edge of the current layer.
            for(int i = 1; i < A; i++){
                ans[r][c] = count;
                c++; // Move to the next column.
                count++;
            }
            // 2. Move Down: Fill cells along the right edge of the current layer.
            for(int i = 1; i < A; i++){
                ans[r][c] = count;
                r++; // Move to the next row.
                count++;
            }
            // 3. Move Left: Fill cells along the bottom edge of the current layer.
            for(int i = 1; i < A; i++){
                ans[r][c] = count;
                c--; // Move to the previous column.
                count++;
            }
            // 4. Move Up: Fill cells along the left edge of the current layer.
            for(int i = 1; i < A; i++){
                ans[r][c] = count;
                r--; // Move to the previous row.
                count++;
            }
            // Shift the starting point (r, c) to the top-left corner of the *next* inner layer.
            r += 1;
            c += 1;
            // Reduce the dimension A by 2, as two rows/columns have been processed from this layer.
            A -= 2;
        }

        // Handle the center element for odd-sized matrices (e.g., a 1x1 remaining layer).
        if(A == 1){
            ans[r][c] = count;
        }
        // Return the final spirally filled matrix.
        return ans;
    }
}