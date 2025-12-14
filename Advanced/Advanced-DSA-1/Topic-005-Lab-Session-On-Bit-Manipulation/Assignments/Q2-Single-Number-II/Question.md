# Problem: Find the Single Number II (Appears Once, Others Thrice)

## Problem Description

Given an array of integers, every element appears exactly thrice except for one element, which occurs only once.

Find that element that does not appear thrice.

**NOTE:** Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory (constant space complexity)?

## Problem Constraints

*   `2 <= |A| <= 5 * 10^6` (Array size)
*   `0 <= A[i] <= INTMAX` (Integer values are non-negative)

## Input Format

The first and only argument of input contains an integer array `A`.

## Output Format

Return a single integer, the element that appears only once.

## Example Input

**Input 1:**
`A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]`

**Input 2:**
`A = [0, 0, 0, 1]`

## Example Output

**Output 1:**
`4`

**Output 2:**
`1`

## Example Explanation

**Explanation 1:**
The number 4 occurs exactly once in the input array.

**Explanation 2:**
The number 1 occurs exactly once in the input array.