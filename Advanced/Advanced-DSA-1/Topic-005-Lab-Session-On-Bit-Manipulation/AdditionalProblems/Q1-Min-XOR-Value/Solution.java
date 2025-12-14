public class Solution {
    public int findMinXor(ArrayList < Integer > A) {
        // sort the array A in ascending order
        Collections.sort(A); // Sort the input ArrayList A in ascending order
        // the answer will be the min of XOR of each adjacent elements
        // Initialize the minimum XOR result 'ans' with the XOR of the first two elements
        int ans = A.get(0) ^ A.get(1);
        // Iterate through the sorted array starting from the second element
        for (int i = 1; i < A.size(); i++) {
            // Calculate the XOR of the current adjacent pair (A[i] and A[i-1])
            // Update 'ans' to be the minimum of the current adjacent XOR and the previous minimum 'ans'
            ans = Math.min(A.get(i) ^ A.get(i - 1), ans);
        }
        return ans; // Return the overall minimum XOR value found
    }
}