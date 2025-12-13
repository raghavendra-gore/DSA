# Construct Prefix Sum Array In-place

## Problem Description

You are given an array `A` of `N` integers. Your task is to construct the prefix sum of the array and return it. The problem description implies this can potentially be done in the given array itself (in-place), depending on the implementation language/constraints, although returning a new array is a standard approach. The goal is to return the resultant prefix sum array.

The prefix sum array `P` for an array `A` is defined such that `P[i]` is the sum of all elements in `A` from index 0 to index `i`, inclusive.

## Constraints

*   `1 <= N <= 10^5`
*   `1 <= A[i] <= 10^3`

## Input Format

*   **Only argument `A`**: An array (or list) of integers.

## Output Format

Return an array of integers denoting the prefix sum of the given array `A`.

## Example Input and Output

### Input 1

A = [1, 2, 3, 4, 5]

### Output 1

[1, 3, 6, 10, 15]

### Explanation 1

*   `P[0] = A[0] = 1`
*   `P[1] = A[0] + A[1] = 1 + 2 = 3`
*   `P[2] = A[0] + A[1] + A[2] = 3 + 3 = 6`
*   ...and so on.

### Input 2

A = [4, 3, 2]

### Output 2

[4, 7, 9]

### Explanation 2

*   `P[0] = 4`
*   `P[1] = 4 + 3 = 7`
*   `P[2] = 7 + 2 = 9`