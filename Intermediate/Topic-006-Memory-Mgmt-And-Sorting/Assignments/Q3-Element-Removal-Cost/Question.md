# Minimum Cost to Remove All Elements from an Array

## Problem Description

Given an integer array `A` of size `N`. You can remove any element from the array in one operation. The cost of this operation is the sum of all elements in the array present **before** this operation.

Find the minimum cost to remove all elements from the array.

### Constraints

*   `0 <= N <= 1000`
*   `1 <= A[i] <= 1000`

## Input Format

The first and only argument is an integer array `A`.

## Output Format

Return an integer denoting the total cost of removing all elements from the array.

## Example Inputs & Outputs

### Example 1

**Input:**
`A = [2, 1]`

**Output:**
`4`

**Explanation:**
1.  Remove `2` from the array `[2, 1]`. The cost is `(2 + 1) = 3`. The remaining array is `[1]`.
2.  Remove `1` from the array `[1]`. The cost is `(1) = 1`. The remaining array is `[]`.
3.  The total minimum cost is `3 + 1 = 4`.

### Example 2

**Input:**
`A = [5]`

**Output:**
`5`

**Explanation:**
There is only one element in the array. The cost of removing it is the initial sum of the array, which is `5`.
