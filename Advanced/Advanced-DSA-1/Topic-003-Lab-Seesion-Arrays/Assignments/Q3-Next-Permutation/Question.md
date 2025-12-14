# Next Permutation Implementation

## Problem Description

Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers for a given array `A` of size `N`.

If such an arrangement is not possible, the array must be rearranged as the lowest possible order (sorted in ascending order).

**NOTE:**
*   The replacement must be **in-place**, without allocating extra memory.
*   **DO NOT USE LIBRARY FUNCTIONS FOR NEXT PERMUTATION.**

## Problem Constraints

*   `1 <= N <= 5 * 10^5`
*   `1 <= A[i] <= 10^9`

## Input Format

The first and only argument of input is an array of integers, `A`.

## Output Format

Return an array of integers, representing the next permutation of the given array.

## Example Input

**Input 1:**
Use code with caution.

A = [1, 2, 3]

**Input 2:**
A = [3, 2, 1]

## Example Output

**Output 1:**
[1, 3, 2]

**Output 2:**
[1, 2, 3]

## Example Explanation

**Explanation 1:**
The next permutation of `[1, 2, 3]` will be `[1, 3, 2]`.

**Explanation 2:**
No arrangement is possible such that the numbers are arranged into the numerically next greater permutation of numbers. The array is rearranged in the lowest possible order (ascending order).
