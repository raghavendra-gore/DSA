# Maximum Contiguous Subarray Sum (Kadane's Algorithm)

This project provides a solution to find the maximum possible sum of any non-empty contiguous subarray within a given integer array $A$.

## Problem Description

Given an array $A$ of length $N$, the goal is to find the subarray that yields the highest sum. A subarray must be contiguous (elements must be adjacent in the original array) and non-empty.

### Constraints

*   `1 <= N <= 10^6` (Length of the array)
*   `-1000 <= A[i] <= 1000` (Value of elements)

### Input Format

The first and only argument is an integer array, `A`.

### Output Format

Return an integer representing the maximum possible sum of the contiguous subarray.

## Example Input and Output

### Input 1:

A = [1, 2, 3, 4, -10]

### Output 1:
10

**Explanation 1:**
The subarray `[1, 2, 3, 4]` has the maximum possible sum of 10. If we included the `-10`, the sum would drop to 0.

### Input 2:
A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

### Output 2:
6

**Explanation 2:**
The subarray `[4, -1, 2, 1]` has the maximum possible sum of 6.