# Problem: Reverse Array Within a Given Range

## Description

Given an array `A` of `N` integers, and two integers `B` and `C` defining a specific inclusive range, reverse the elements of the array `A` within the indices `[B, C]`.

## Constraints

*   `1 <= N <= 10^5` (Array size)
*   `1 <= A[i] <= 10^9` (Value of elements)
*   `0 <= B <= C <= N - 1` (Valid range indices)

## Input Format

*   The first argument `A` is an array of integers.
*   The second argument `B` is an integer representing the start index of the range.
*   The third argument `C` is an integer representing the end index of the range.

## Output Format

Return the modified array `A` after reversing the elements within the specified range `[B, C]`.

## Examples

### Input 1:

A = [1, 2, 3, 4]
B = 2
C = 3

### Output 1:

[1, 2, 4, 3]

### Explanation 1:

We reverse the subarray `[3, 4]` (elements at indices 2 and 3).

### Input 2:

A = [2, 5, 6]
B = 0
C = 2

### Output 2:

[6, 5, 2]

### Explanation 2:

We reverse the entire array `[2, 5, 6]`.