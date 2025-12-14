public class Solution {
    /**
     * Finds common elements in two integer ArrayLists, respecting element frequencies.
     *
     * @param A The first integer ArrayList.
     * @param B The second integer ArrayList.
     * @return An ArrayList containing all common elements.
     */
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Create HashMaps to store the frequency of each element in both arrays.
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> b = new HashMap<Integer, Integer>();

        // Populate the frequency map for ArrayList A.
        for(int x: A){
            a.put(x, a.getOrDefault(x, 0)+1);
        }

        // Populate the frequency map for ArrayList B.
        for(int x: B){
            b.put(x, b.getOrDefault(x, 0)+1);
        }

        // Create an ArrayList to store the final result (common elements).
        ArrayList<Integer> ans = new ArrayList<Integer>();

        // Iterate over the unique elements (keys) present in frequency map 'a'.
        for(int k: a.keySet()){
            // Check if the current element 'k' also exists in frequency map 'b'.
            if(b.containsKey(k)){
                // Determine the minimum frequency of 'k' between both arrays.
                // This minimum frequency is how many times 'k' should appear in the result.
                for(int i = 0; i < Math.min(a.get(k), b.get(k)); ++i){
                    // Add the common element 'k' to the result list that many times.
                    ans.add(k);
                }
            }
        }

        // Return the final list of common elements.
        return ans;
    }
}