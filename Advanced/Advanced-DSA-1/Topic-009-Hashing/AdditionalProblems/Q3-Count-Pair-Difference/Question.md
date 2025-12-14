# Count Difference Pairs

## Problem Description

You are given an array `A` of `N` integers and an integer `B`.
Count the number of pairs `(i, j)` such that `A[i] - A[j] = B` and `i ≠ j`.

Since the answer can be very large, return the remainder after dividing the count with `10^9 + 7`.

## Problem Constraints

*   `1 <= N <= 10^5`
*   `1 <= A[i] <= 10^9`
*   `1 <= B <= 10^9`

## Input Format

First argument `A` is an array of integers and second argument `B` is an integer.

## Output Format

Return an integer representing the count modulo `10^9 + 7`.

## Example Input

### Input 1:

A = [3, 5, 1, 2]
B = 4

### Input 2:

A = [1, 2, 1, 2]
B = 1

## Example Output

### Output 1:

1

### Output 2:

4

## Example Explanation

### Example 1:

The only pair is `(2, 3)` which gives difference as 4 (assuming 1-based indexing for the example, the values are `A[2]=5`, `A[3]=1`, so `5-1=4`).

### Example 2:

The pairs which give difference as 1 are (assuming 1-based indexing):
*   `(2, 1)`: `A[2]-A[1] = 2-1 = 1`
*   `(4, 1)`: `A[4]-A[1] = 2-1 = 1`
*   `(2, 3)`: `A[2]-A[3] = 2-1 = 1`
*   `(4, 3)`: `A[4]-A[3] = 2-1 = 1`
    Total count is 4.