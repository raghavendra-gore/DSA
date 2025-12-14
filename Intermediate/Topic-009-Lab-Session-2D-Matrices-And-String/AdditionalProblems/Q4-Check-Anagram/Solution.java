public class Solution {
    public int solve(String A, String B) {
        // Initialize two frequency arrays of size 26 (for 'a' through 'z')
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Iterate through both strings simultaneously
        for(int i = 0 ; i < A.length() ; i++){
            // Increment the count for the corresponding character in string A
            freq1[A.charAt(i) - 'a']++;
            // Increment the count for the corresponding character in string B
            freq2[B.charAt(i) - 'a']++;
        }

        // Iterate through all 26 possible character counts
        for(int i = 0 ; i < 26 ; i++){
            // Compare the frequency of the i-th character in both strings
            if(freq1[i] != freq2[i]){
                // If any frequency count doesn't match, they are not anagrams, return 0
                return 0;
            }
        }

        // If all frequency counts match perfectly, they are anagrams, return 1
        return 1;
    }
}