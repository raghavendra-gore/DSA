public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY

    /**
     * Calculates the maximum profit achievable by completing at most one transaction (buy one, sell one share).
     *
     * @param A An array of integers representing stock prices on different days.
     * @return The maximum possible profit.
     */
    public int maxProfit(final int[] A) {
        // Handle edge cases: if the array is null or has fewer than 2 elements (cannot complete a buy and sell transaction)
        if(A == null || A.length < 2){
            return 0;
        }

        // Initialize minPrice to a very large value to ensure the first element becomes the initial min price
        int minPrice = Integer.MAX_VALUE;
        // Initialize maxProfit to 0, as the minimum possible profit is 0 (no transaction)
        int maxProfit = 0;

        // Iterate through each stock price in the array
        for(int price: A){
            // If the current price is lower than the minimum price found so far, update minPrice
            // This suggests a better potential buying opportunity
            if(price < minPrice){
                minPrice = price;
            }
            // If the current price is not a new minimum, check if selling at this price
            // after buying at the previously recorded minPrice yields a higher profit than the current maxProfit
            else if(price - minPrice > maxProfit){
                // Update maxProfit if a better selling opportunity is found
                maxProfit = price - minPrice;
            }
        }

        // After iterating through all prices, return the accumulated maximum profit
        return maxProfit;
    }
}