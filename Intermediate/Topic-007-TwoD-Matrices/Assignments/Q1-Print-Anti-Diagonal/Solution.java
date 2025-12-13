public class Solution {

    /**
     * Given a N*N square matrix A, returns an array of its anti-diagonals,
     * padding vacant spaces with 0.
     *
     * The input is expected to be a square matrix, so n == m is assumed.
     */
    public int[][] diagonal(int[][] A) {
        // N is the dimension of the square matrix.
        int N = A.length;

        // The problem statement requires an output matrix of size (2*N-1) * N.
        int[][] allDiagonals = new int[2 * N - 1][N];

        // Use a counter to track which row of allDiagonals we are filling.
        int diagonalIndex = 0;

        // 1. Iterate through the starting points on the top edge (row 0, columns 0 to N-1)
        for (int j = 0; j < N; j++) {
            storeAntiDiagonal(A, 0, j, N, allDiagonals, diagonalIndex++);
        }

        // 2. Iterate through the starting points on the right edge (column N-1, rows 1 to N-1)
        for (int i = 1; i < N; i++) {
            storeAntiDiagonal(A, i, N - 1, N, allDiagonals, diagonalIndex++);
        }

        return allDiagonals;
    }

    /**
     * Helper function to extract a single anti-diagonal and store it in the results array.
     */
    private void storeAntiDiagonal(int[][] arr, int startI, int startJ, int N,
                                   int[][] allDiagonals, int diagonalIndex) {

        int i = startI;
        int j = startJ;
        int elementIndex = 0;

        // Traverse the diagonal while within bounds
        while (i < N && j >= 0) {
            // Place the element into the correct position in the output 2D array
            allDiagonals[diagonalIndex][elementIndex] = arr[i][j];
            i++;
            j--;
            elementIndex++;
        }

        // Note: The remaining elements in the allDiagonals[diagonalIndex] array
        // are already initialized to 0 by Java's default array behavior,
        // satisfying the padding requirement automatically.
    }
}