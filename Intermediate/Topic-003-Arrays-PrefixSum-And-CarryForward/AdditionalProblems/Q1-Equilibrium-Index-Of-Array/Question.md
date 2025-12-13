# Equilibrium Index of an Array

## Problem Description

You are given an array `A` of integers of size `N`.

The goal is to find the **equilibrium index** of the given array. An equilibrium index `P` is an index such that the sum of elements at indices lower than `P` is equal to the sum of elements at indices higher than `P`.

*   If an index has no lower elements (i.e., index 0) or no higher elements (i.e., the last index), the sum for that side is considered to be 0.

**Notes:**
*   Array indexing starts from 0.
*   If no equilibrium index exists, return -1.
*   If multiple equilibrium indexes exist, return the minimum (leftmost) index.

## Constraints

*   `1 <= N <= 10^5`
*   `-10^5 <= A[i] <= 10^5`

## Input Format

*   **First Argument `A`**: An array (or list) of integers.

## Output Format

Return the equilibrium index as an integer. If no such index is found, return -1.

## Example Input and Output

### Input 1

A = [ -7, 1, 5, 2, -4, 3, 0 ]

### Output 1

3

### Explanation 1

At index 3, the sum of lower elements (`A[0] + A[1] + A[2] = -7 + 1 + 5 = -1`) equals the sum of higher elements (`A[4] + A[5] + A[6] = -4 + 3 + 0 = -1`).

### Input 2

A = [ 1, 2, 3 ]

### Output 2

-1

### Explanation 2

No index satisfies the equilibrium condition.