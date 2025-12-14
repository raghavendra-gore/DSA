public class Solution {

    public int[][] solve(int[][] A) {

        int n = A.length;

        // Temporary result array (max possible size = n)
        int[][] temp = new int[n][2];
        int idx = 0; // number of merged intervals

        int i = 0;
        while (i < n) {

            // Start a new interval
            int start = A[i][0];
            int end = A[i][1];
            i++;

            // Merge overlapping intervals
            while (i < n && overlap(start, end, A[i][0], A[i][1])) {
                end = Math.max(end, A[i][1]);
                i++;
            }

            // Store merged interval
            temp[idx][0] = start;
            temp[idx][1] = end;
            idx++;
        }

        // Create result array of exact size
        int[][] res = new int[idx][2];
        for (int j = 0; j < idx; j++) {
            res[j][0] = temp[j][0];
            res[j][1] = temp[j][1];
        }

        return res;
    }

    // Check if two intervals overlap
    private boolean overlap(int s1, int e1, int s2, int e2) {
        return e1 >= s2 && s1 <= e2;
    }
}