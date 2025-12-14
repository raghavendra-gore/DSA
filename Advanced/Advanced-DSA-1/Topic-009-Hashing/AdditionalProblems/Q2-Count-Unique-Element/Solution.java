public class Solution {
    /**
     * Counts the number of elements that appear exactly once in the given array.
     *
     * @param A The input integer array.
     * @return The count of elements with a frequency of 1.
     */
    public int solve(int[] A) {
        // Map to store the frequency of each element in the array.
        Map<Integer, Integer> freq = new HashMap<>();

        // Iterate through the array to populate the frequency map.
        for(int i = 0 ; i < A.length ; i++){
            // Check if the current element is already in the map.
            if(freq.containsKey(A[i])){
                // If present, increment its frequency count.
                freq.put(A[i], freq.get(A[i]) + 1);
            }
            else{
                // If not present, add it to the map with a frequency of 1.
                freq.put(A[i], 1);
            }
        }

        // Variable to store the final count of elements with frequency 1.
        int count = 0;

        // Iterate through the entries (key-value pairs) in the frequency map.
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()){
            // Check if the frequency (value) of the current element is exactly 1.
            if(entry.getValue() == 1){
                // If it is, increment the count.
                count++;
            }
        }

        // Return the final count of elements with a frequency of 1.
        return count;
    }
}