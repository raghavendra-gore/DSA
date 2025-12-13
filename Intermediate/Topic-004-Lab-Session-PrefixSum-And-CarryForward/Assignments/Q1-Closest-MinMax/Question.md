# Smallest Subarray Containing Minimum and Maximum Elements

## Problem Description

Given an array `A` of `N` integers, the task is to find the size (length) of the smallest possible subarray that contains at least one occurrence of the maximum value of the array AND at least one occurrence of the minimum value of the array.

## Problem Constraints

*   `1 <= |A| <= 2000` (The array size is relatively small, allowing for O(N^2) or efficient O(N) solutions)
*   `-10^9 <= A[i] <= 10^9` (Implicit from problem statement examples, the values themselves don't affect complexity)

## Input Format

*   **First and only argument `A`**: A vector (or list/array) of integers.

## Output Format

Return an integer representing the length of the smallest subarray that contains both the minimum and maximum elements of the array.

## Example Input and Output

### Input 1

A = [1, 3, 2]

### Output 1

2

### Explanation 1

The minimum is `1`, the maximum is `3`. The subarray `[1, 3]` (indices 0 and 1) is the smallest to contain both, with a length of 2.

### Input 2

A = [2, 6, 1, 6, 9]

### Output 2

3

### Explanation 2

The minimum is `1`, the maximum is `9` (or `6`). The last three elements `[6, 9]` form the smallest subarray with both (length 3, considering `6` as max). The maximum value in the array is actually 9, minimum is 1. The smallest subarray containing both is `[1, 6, 9]` at indices 2, 3, 4 (length 3).
