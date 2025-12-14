# Beggars and Donations (Prefix Sum / Difference Array)

This project provides a solution to calculate the final amount of money in a row of beggars' pots after a series of donations, where each donation affects a contiguous range of beggars.

## Problem Description

There are $A$ beggars sitting in a row, initially with empty pots. Devotees donate money to contiguous ranges of beggars. The input is a total number of beggars ($A$) and a list of donations ($B$). Each entry in $B$ specifies a donation: `[L, R, P]`, where the devotee gives amount $P$ to all beggars from index $L$ to $R$ (1-based indexing).

The task is to return an array (0-based indexing) representing the final total amount of coins in each beggar's pot.

### Constraints

*   `1 <= A <= 2 * 10^5` (Number of beggars)
*   `1 <= L <= R <= A` (Donation range indices, 1-based)
*   `1 <= P <= 10^3` (Donation amount)
*   `0 <= len(B) <= 10^5` (Number of donations)

### Input Format

*   The first argument is a single integer `A` (number of beggars).
*   The second argument is a 2D integer array `B` (list of donations).

### Output Format

Return an array (or list/vector) of integers representing the final counts in each pot (0-based indexing).

## Example Input and Output

### Input 1:

A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

### Output 1:
[10, 55, 45, 25, 25]

**Explanation 1:**

First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]

Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]

Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]