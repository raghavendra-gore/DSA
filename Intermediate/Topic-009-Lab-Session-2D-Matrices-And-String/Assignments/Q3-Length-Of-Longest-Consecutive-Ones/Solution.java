public class Solution {
    /**
     * Finds the length of the longest consecutive 1's achievable by performing at most one swap of a '0' with a '1'.
     *
     * @param A The input binary string.
     * @return The maximum length of consecutive 1's.
     */
    public int solve(String A) {
        // Convert the string to a character array for easier indexing
        char[] arr = A.toCharArray();
        int n = arr.length;

        int ans = 0;
        int totalCountOfOnes = 0;

        // Step 1: Count the total number of '1's in the string
        for(int i = 0; i < n; i++){
            if(arr[i] == '1'){
                totalCountOfOnes++;
            }
        }

        // Optimization: If all characters are '1's, the answer is the full length
        if(totalCountOfOnes == n){
            return n;
        }

        // Step 2: Iterate through the string, focusing on each '0' as a potential swap point
        for(int i = 0; i < n; i++){
            if(arr[i] == '0'){
                // Calculate the length of consecutive '1's to the immediate left
                int j = i-1;
                int l = 0;
                while(j>=0 && arr[j] == '1'){
                    l++;
                    j--;
                }
                // Calculate the length of consecutive '1's to the immediate right
                j = i+1;
                int r = 0;
                while(j < n && arr[j] == '1'){
                    r++;
                    j++;
                }

                // Step 3: Determine the max length achievable with one swap at this '0'
                // A swap merges the left and right segments (l + r), plus the current 0 becomes a 1 (+1)

                // If the combined length (l + r) is less than the total '1's count,
                // it means we have at least one '1' available elsewhere to perform the swap,
                // so the new sequence length is l + r + 1.
                if(l+r < totalCountOfOnes){
                    ans = Math.max(ans, l+r+1);
                }
                // If l + r is equal to the total count of '1's, we can only form a
                // sequence as long as the total count itself (l + r), as all 1s are accounted for.
                // The current 0 cannot be converted into a 1 unless one of the surrounding 1s is moved.
                else{
                    ans = Math.max(ans, l+r);
                }
            }
        }

        // Return the overall maximum length found
        return ans;
    }
}