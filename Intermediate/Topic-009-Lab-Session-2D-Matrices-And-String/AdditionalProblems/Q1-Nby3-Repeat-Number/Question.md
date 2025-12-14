# Find Majority Element (N/3 Times)

## Problem Description

Given an integer array `A` of size `N`, find the element that appears more than `N/3` times.

If no such element exists, return `-1`.

## Constraints

*   `1 <= N <= 7 * 10^5`
*   `1 <= A[i] <= 10^9`

## Input Format

The only argument is an integer array `A`.

## Output Format

Return an integer representing the majority element (appearing more than $N/3$ times), or `-1` if none exists.

## Example Input and Output

### Example 1

**Input:**
`A = [1, 2, 3, 1, 1]`

**Output:**
`1`

**Explanation 1:**
The array size `N` is 5. We look for an element appearing more than `5/3` (which is 1.66, so at least 2 times). The number 1 occurs 3 times, which satisfies the condition.

### Example 2

**Input:**
`A = [1, 2, 3]`

**Output:**
`-1`

**Explanation 2:**
The array size `N` is 3. We look for an element appearing more than `3/3` (which is 1 time, so at least 2 times). No element appears more than once.

