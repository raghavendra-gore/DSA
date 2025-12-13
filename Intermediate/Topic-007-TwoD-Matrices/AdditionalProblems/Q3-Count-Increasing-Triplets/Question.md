# Count Triplet Combinations with Increasing Values

## Problem Description

You are given an array $A$ of $N$ elements. You need to find the total number of unique triplets of indices $(i, j, k)$ that satisfy two conditions:

1.  The indices are strictly increasing: $i < j < k$.
2.  The corresponding values in the array are strictly increasing: $A[i] < A[j] < A[k]$.

## Problem Constraints

*   `1 <= N <= 10^3` (The array size is up to 1000 elements)
*   `1 <= A[i] <= 10^9` (Array elements are positive integers up to 1 billion)

## Input Format

The first argument `A` is an array of integers.

## Output Format

Return an integer representing the total count of such valid triplets.

## Example Inputs and Outputs

### Example 1

**Input:**

A = [1, 2, 4, 3]

**Output:**
2

**Explanation:**
The triplets of *values* that satisfy the conditions are:
*   `[1, 2, 4]` (indices 0, 1, 2)
*   `[1, 2, 3]` (indices 0, 1, 3)

### Example 2

**Input:**
A = [2, 1, 2, 3]

**Output:**
1

**Explanation:**
The only triplet of *values* that satisfies the conditions is:
*   `[1, 2, 3]` (indices 1, 2, 3)