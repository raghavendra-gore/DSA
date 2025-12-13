# Best Time to Buy and Sell Stock (At most one transaction)

## Problem Description

Say you have an array, `A`, for which the $i^{th}$ element is the price of a given stock on day $i$.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Return the maximum possible profit.

## Problem Constraints

*   `0 <= A.size() <= 700000`
*   `1 <= A[i] <= 10^7`

## Input Format

The first and the only argument is an array of integers, `A`.

## Output Format

Return an integer, representing the maximum possible profit.

## Example Input

### Input 1:

A = [1, 2]

### Input 2:
A = [1, 4, 5, 2, 4]

## Example Output

### Output 1:
1

### Output 2:
4

## Example Explanation

### Explanation 1:
Buy the stock on day 0 (price 1), and sell it on day 1 (price 2). Profit = $2 - 1 = 1$.

### Explanation 2:
Buy the stock on day 0 (price 1), and sell it on day 2 (price 5). Profit = $5 - 1 = 4$. Although selling on day 4 (price 4) after buying on day 2 (price 2) yields a profit of 2, the maximum possible profit is 4.
