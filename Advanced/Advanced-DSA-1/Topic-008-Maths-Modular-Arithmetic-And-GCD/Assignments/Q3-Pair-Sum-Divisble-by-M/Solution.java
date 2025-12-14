public class Solution {
    // Define the modulo constant for clarity
    private static final int MOD = 1000000007; // 10^9 + 7

    public int solve(int[] A, int B) {
        int n = A.length;
        // Use a long array for freq if B can be extremely large,
        // but int[] is fine for typical constraints where B < A.length
        long[] freq = new long[B];

        for (int i = 0; i < n; i++) {
            // Ensure the remainder is positive in Java if A[i] can be negative
            int remainder = A[i] % B;
            if (remainder < 0) {
                remainder += B;
            }
            freq[remainder]++;
        }

        long ans = 0;

        // Case 1: Pairs where both remainders are 0
        // Calculate the combinations (nC2) safely using long arithmetic
        ans = (ans + (freq[0] * (freq[0] - 1L)) / 2) % MOD;

        // Case 2: Pairs where sum of remainders is B (or 0)
        int l = 1;
        int r = B - 1;

        while (l < r) {
            // Multiply counts of complementary remainders (l and r)
            ans = (ans + freq[l] * freq[r]) % MOD;
            l++;
            r--;
        }

        // Case 3: Middle element for even B (remainder B/2)
        if (l == r && (B % 2 == 0)) {
            // Calculate the combinations (nC2) safely using long arithmetic
            ans = (ans + (freq[l] * (freq[l] - 1L)) / 2) % MOD;
        }

        // The logic for B%2 == 0 in your original code was slightly redundant/misplaced
        // within the while loop structure. This reorganized structure handles all cases cleanly.

        return (int) ans;
    }
}