# Problem: Count Subarrays with Bitwise OR Equal to 1

## Problem Description

You are given a binary array `A` of length `N` where each element is either 0 or 1.

Your task is to count the number of subarrays where the bitwise OR of all the elements in the subarray is 1.

## Problem Constraints

*   `1 <= N <= 10^4`
*   `A[i]` is either `0` or `1`

## Input Format

The first and the only argument is an Integer Array where each element is either 0 or 1.

## Output Format

Return a single Integer representing the number of subarrays where the bitwise OR is 1.

## Example Input

**Input 1:**
`A = [0, 0, 1, 1, 0]`

**Input 2:**
`A = [0, 0, 0]`

## Example Output

**Output 1:**
`11`

**Output 2:**
`0`

## Example Explanation

**Explanation 1:**
The only subarrays with OR = 1 are:
`[0, 0, 1]`, `[0, 0, 1, 1]`, `[1]`, `[1]`, `[1, 1]`, `[1, 0]`, `[1, 1, 0]`, `[0, 0, 1, 1, 0]`, `[0, 1]`, `[0, 1, 1]`, `[0, 1, 1, 0]`.
Total count: 11.

**Explanation 2:**
There is no subarray whose bitwise OR is 1. The OR of any subarray in `[0, 0, 0]` is always 0.
