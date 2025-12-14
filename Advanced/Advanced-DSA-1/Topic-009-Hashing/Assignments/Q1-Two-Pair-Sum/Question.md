# Find if a pair with a given sum exists in an array

## Problem Description

Given an Array of integers `B`, and a target sum `A`.

Check if there exists a pair `(i, j)` such that `B[i] + B[j] = A` and `i != j`.

## Problem Constraints

*   `1 <= Length of array B <= 10^5`
*   `0 <= B[i] <= 10^9`
*   `0 <= A <= 10^9`

## Input Format

*   First argument `A` is the Target sum (integer).
*   Second argument `B` is the input array of integers.

## Output Format

*   Return an integer value `1` if there exists such a pair, else return `0`.

## Example Input

### Input 1:

A = 8
B = [3, 5, 1, 2, 1, 2]

### Input 2:

A = 21
B = [9, 10, 7, 10, 9, 1, 5, 1, 5]

## Example Output

### Output 1:

1

### Output 2:

0

## Example Explanation

### Example 1:

It is possible to obtain sum 8 using 3 and 5 (`3 + 5 = 8`).

### Example 2:

There is no such pair that sums to 21.