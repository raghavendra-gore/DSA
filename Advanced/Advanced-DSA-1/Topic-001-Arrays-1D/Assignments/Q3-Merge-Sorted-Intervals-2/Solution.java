public class Solution {
    // Function to merge overlapping intervals from a list of sorted intervals
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        // Get the total number of intervals
        int n = A.size();
        // Initialize the start time of the current merged interval with the first interval's start
        int currS = A.get(0).get(0);
        // Initialize the end time of the current merged interval with the first interval's end
        int currE = A.get(0).get(1);

        // Initialize the list to store the final non-overlapping intervals
        ArrayList<ArrayList<Integer>> ans = new ArrayList();

        // Iterate through the intervals starting from the second one (index 1)
        for(int i = 1; i < n; i++){
            // Get the start time of the current interval being considered
            int iS = A.get(i).get(0);
            // Get the end time of the current interval being considered
            int iE = A.get(i).get(1);

            // Check if the current interval overlaps with the ongoing merged interval (if current start <= ongoing end)
            if(currE >= iS){
                // Overlap: update the merged start time (take the minimum start time)
                currS = Math.min(currS, iS);
                // Overlap: update the merged end time (take the maximum end time)
                currE = Math.max(currE, iE);
            } else{
                // No overlap: add the completed merged interval to the result list
                ans.add(new ArrayList<>(Arrays.asList(currS, currE)));
                // Start a new merged interval with the current interval's start time
                currS = iS;
                // Start a new merged interval with the current interval's end time
                currE = iE;
            }
        }
        // After the loop finishes, add the last processed merged interval to the result list
        ans.add(new ArrayList<>(Arrays.asList(currS, currE)));
        // Return the final list of merged intervals
        return ans;
    }
}