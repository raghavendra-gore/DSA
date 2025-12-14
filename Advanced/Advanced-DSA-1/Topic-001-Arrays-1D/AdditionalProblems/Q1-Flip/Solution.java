public class Solution {
    public int[] flip(String A) {

        int cur = 0;
        int maxx = 0;

        // l = potential starting index, r = current ending index
        int l = 0, r = 0;

        // Result array to store [L, R]
        int[] ans = new int[2];

        // Initialize with invalid indices
        ans[0] = -1;
        ans[1] = -1;

        // Kadane’s algorithm
        for (int i = 0; i < A.length(); i++) {

            // Treat '0' as +1 and '1' as -1
            if (A.charAt(i) == '1')
                cur--;
            else
                cur++;

            // Update max sum and result indices
            if (cur > maxx) {
                maxx = cur;
                ans[0] = l + 1; // 1-based index
                ans[1] = r + 1; // 1-based index
            }

            // If current sum becomes negative, reset
            if (cur < 0) {
                cur = 0;
                l = i + 1;
                r = i + 1;
            } else {
                r++;
            }
        }

        // If no beneficial flip exists
        if (maxx == 0) {
            return new int[0];
        }

        return ans;
    }
}