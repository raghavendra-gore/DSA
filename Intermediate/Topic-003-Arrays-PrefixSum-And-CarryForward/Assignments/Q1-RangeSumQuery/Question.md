# Range Sum Query (Prefix Sum Technique)

## Problem Description

You are given an integer array `A` of length `N` and a 2D integer array `B` with dimensions `M x 2`, where each row `[L, R]` denotes a query for a specific range.

For each query `[L, R]`, you must find the sum of all elements from index `L` to `R` in array `A` (0-indexed).

More formally, calculate:
$$A[L] + A[L + 1] + A[L + 2] + \dots + A[R - 1] + A[R]$$
for each query in `B`.

## Constraints

*   $1 \le N, M \le 10^5$ (Array sizes)
*   $1 \le A[i] \le 10^9$ (Value of elements)
*   $0 \le L \le R < N$ (Query indices)

## Input Format

The first argument is the integer array `A`.
The second argument is the 2D integer array `B`.

## Output Format

Return an integer array of length `M` where the $i$-th element is the answer for the $i$-th query in `B`.

## Example

### Input 1:

A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]

### Output 1:

[10, 5]

### Explanation 1:

*   The sum of all elements of `A[0 ... 3]` = $1 + 2 + 3 + 4 = 10$.
*   The sum of all elements of `A[1 ... 2]` = $2 + 3 = 5$.

### Input 2:

A = [2, 2, 2]
B = [[0, 0], [1, 2]]

### Output 2:

[2, 4]

### Explanation 2:

*   The sum of all elements of `A[0 ... 0]` = $2 = 2$.
*   The sum of all elements of `A[1 ... 2]` = $2 + 2 = 4$.