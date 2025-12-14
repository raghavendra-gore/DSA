public class Solution {
    // Method to find the frequency of elements in array B within array A
    public int[] solve(int[] A, int[] B) {
        // Get the length of array A
        int n = A.length;
        // Get the length of array B (the queries)
        int m = B.length;
        // Create a HashMap to store element frequencies from array A
        HashMap<Integer, Integer> hm = new HashMap();

        // Iterate through array A to count occurrences of each element
        for(int i = 0; i < n; i++){
            // Check if the current element A[i] is already a key in the map
            if(!hm.containsKey(A[i])){
                // If not present, add it with an initial count of 1
                hm.put(A[i], 1);
            } else{
                // If present, get the current frequency
                int ov = hm.get(A[i]);
                // Increment the frequency and update the map
                hm.put(A[i], ov+1);
            }
        }

        // Create an integer array to store the results of the frequency queries for array B
        int[] ans = new int[m];

        // Iterate through the query array B
        for(int i = 0; i < m; i++){
            // Check if the current query element B[i] exists as a key in the frequency map
            if(!hm.containsKey(B[i])){
                // If not found (frequency is zero), assign 0 to the result array
                ans[i] = 0;
            } else{
                // If found, retrieve its frequency count from the map and assign it to the result array
                ans[i] = hm.get(B[i]);
            }
        }
        // Return the array containing the frequencies for all elements in B
        return ans;
    }
}