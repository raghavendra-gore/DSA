public class Solution {
    /**
     * Finds the majority element that appears more than N/3 times in the array A using a HashMap.
     * This approach uses O(N) time and O(N) space complexity.
     *
     * @param A The input integer array.
     * @return The integer appearing more than N/3 times, or -1 if none exists.
     */
    public int repeatedNumber(int[] A) {
        // Create a HashMap to store the frequency of each element in the array
        Map<Integer, Integer> map = new HashMap<>();

        // First pass: Iterate through the array and populate the frequency map
        for(int i: A){
            // If the element is already in the map, increment its count
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }
            // If the element is not in the map, add it with a count of 1
            else{
                map.put(i, 1);
            }

        }

        // Initialize the answer variable to -1 (default value if no majority element is found)
        int ans = -1;
        // Calculate the threshold for the frequency: N / 3
        int threshold = A.length / 3;

        // Second pass: Iterate through the entries in the frequency map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            // Check if the current element's frequency (value) is greater than the threshold
            if (entry.getValue() > threshold) {
                // If it is, assign this element (key) as the answer
                ans = entry.getKey();
            }
        }

        // Return the found majority element or the default -1
        return ans;
    }
}