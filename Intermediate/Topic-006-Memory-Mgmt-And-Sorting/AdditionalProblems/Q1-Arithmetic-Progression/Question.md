# Check if Array can Form an Arithmetic Progression

## Problem Description

Given an integer array `A` of size `N`. Return `1` if the array can be arranged to form an arithmetic progression, otherwise return `0`.

A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same (constant common difference).

### Constraints

*   `2 <= N <= 10^5`
*   `-10^9 <= A[i] <= 10^9`

## Input Format

The first and only argument is an integer array `A` of size `N`.

## Output Format

Return `1` if the array can be rearranged to form an arithmetic progression, otherwise return `0`.

## Example Inputs & Outputs

### Example 1

**Input:**
`A = [3, 5, 1]`

**Output:**
`1`

**Explanation:**
We can reorder the elements as `[1, 3, 5]` or `[5, 3, 1]` with differences `2` and `-2` respectively, between each consecutive element.

### Example 2

**Input:**
`A = [2, 4, 1]`

**Output:**
`0`

**Explanation:**
There is no way to reorder the elements to obtain an arithmetic progression.
