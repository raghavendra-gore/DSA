public class Solution {
    public int subarraysWithOR1(int[] A) {
        int ans = 0; // 'ans' will store the count of subarrays consisting entirely of zeros
        int ele = 0; // 'ele' tracks the length of the current consecutive run of zeros
        int n = A.length; // Store the total length of the array

        // Iterate through the array to find contiguous zero segments
        for (int i = 0; i < n; i++) {
            if (A[i] == 0) {
                ele++; // Increment the run length counter if the element is 0
            } else {
                // If we encounter a 1, calculate the number of subarrays from the previous zero run
                // Formula for subarrays of length k: k * (k + 1) / 2
                ans += (ele * (ele + 1)) / 2;
                ele = 0; // Reset the current zero run length
            }
        }

        // Handle any trailing sequence of zeros at the end of the array
        ans += (ele * (ele + 1)) / 2;

        // Calculate the total number of possible subarrays in the array of length n
        int tot = (n * (n + 1)) / 2;

        // The result is Total Subarrays minus Subarrays with only zeros (OR=0)
        return tot - ans;
    }
}