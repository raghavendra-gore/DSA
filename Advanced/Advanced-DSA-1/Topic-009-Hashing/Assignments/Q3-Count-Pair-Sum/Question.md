# Problem Description: Pair Sum Count

You are given an array `A` of `N` integers and an integer `B`. Count the number of pairs `(i, j)` such that `A[i] + A[j] = B` and `i ≠ j`.

Since the answer can be very large, return the remainder after dividing the count with `10^9 + 7`.

**Note:** The pair `(i, j)` is the same as the pair `(j, i)`, and we need to count it only once.

## Problem Constraints

*   `1 <= N <= 10^5`
*   `1 <= A[i] <= 10^9`
*   `1 <= B <= 10^9`

## Input Format

*   The first argument `A` is an array of integers.
*   The second argument `B` is an integer.

## Output Format

*   Return an integer representing the count of valid pairs modulo `10^9 + 7`.

## Example Input

### Input 1:

A = [3, 5, 1, 2]
B = 8

### Input 2:

A = [1, 2, 1, 2]
B = 3

## Example Output

### Output 1:

1

### Output 2:

4

## Example Explanation

### Example 1:

The only pair that sums to 8 is `(3, 5)` (indices 0 and 1, or 1 and 0 depending on 0-based vs 1-based indexing, but treated as one pair).

### Example 2:

The pairs that sum to 3 are:
*   `A[0]` (value 1) and `A[1]` (value 2)
*   `A[0]` (value 1) and `A[3]` (value 2)
*   `A[2]` (value 1) and `A[1]` (value 2)
*   `A[2]` (value 1) and `A[3]` (value 2)
    Total count: 4.