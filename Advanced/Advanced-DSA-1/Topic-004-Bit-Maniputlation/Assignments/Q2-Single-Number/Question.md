# Find the Single Occurring Element in an Array (Single Number)

## Problem Description

Given an array of integers `A`, every element appears twice except for one. Find that integer that occurs only once.

**NOTE:** Your algorithm should have a linear runtime complexity (`O(N)`). Could you implement it without using extra memory (`O(1)` space complexity)?

## Problem Constraints

*   `1 <= |A| <= 2000000` (Size of the array is between 1 and 2 million)
*   `0 <= A[i] <= INTMAX`

## Input Format

The first and only argument of input contains an integer array `A`.

## Output Format

Return a single integer denoting the single element that appears only once.

## Example Input

**Input 1:**

A = [1, 2, 2, 3, 1]
**Input 2:**
A = [1, 2, 2]

## Example Output

**Output 1:**
3
**Output 2:**
1

## Example Explanation

**Explanation 1:**
The element `3` occurs only once in the array `[1, 2, 2, 3, 1]`.

**Explanation 2:**
The element `1` occurs only once in the array `[1, 2, 2]`.