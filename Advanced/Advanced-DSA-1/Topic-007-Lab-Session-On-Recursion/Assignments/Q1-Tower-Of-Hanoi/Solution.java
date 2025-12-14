public class Solution {
    // List to store the sequence of moves
    private List<int[]> moves;

    /**
     * Solves the Tower of Hanoi problem for A disks and returns the moves.
     * The number of minimum moves (M) for A disks is 2^A - 1.
     *
     * @param A The number of disks.
     * @return A 2D array of dimensions M x 3 representing the moves.
     */
    public int[][] towerOfHanoi(int A) {
        moves = new ArrayList<>();
        // Start the recursive process to move A disks from Tower 1 to Tower 3, using Tower 2 as auxiliary.
        solveHanoi(A, 1, 3, 2);

        // Convert the List<int[]> to int[][] as required by the method signature.
        int[][] result = new int[moves.size()][3];
        for (int i = 0; i < moves.size(); i++) {
            result[i] = moves.get(i);
        }
        return result;
    }

    /**
     * Recursive function to solve the Tower of Hanoi problem.
     *
     * @param n     The current number of disks to move.
     * @param start The starting tower (1, 2, or 3).
     * @param end   The destination tower (1, 2, or 3).
     * @param aux   The auxiliary/intermediate tower (1, 2, or 3).
     */
    private void solveHanoi(int n, int start, int end, int aux) {
        // Base case: If there are no disks to move, return.
        if (n <= 0) {
            return;
        }

        // 1. Move n-1 disks from the start tower to the auxiliary tower.
        solveHanoi(n - 1, start, aux, end);

        // 2. Move the nth (largest remaining) disk from the start tower to the end tower.
        // This is a single move we record.
        moves.add(new int[]{n, start, end});

        // 3. Move the n-1 disks from the auxiliary tower to the end tower.
        solveHanoi(n - 1, aux, end, start);
    }
}
