# Maximum Subarray Sum of Length K

## Problem Description

Given an array `A` of length `N`, the task is to find the maximum subarray sum out of all possible subarrays of a fixed length `B`.

## Problem Constraints

*   `1 <= N <= 10^5`
*   `1 <= A[i] <= 10^6`
*   `1 <= B <= N` (Note: This constraint is inferred as B must be a valid length)

## Input Format

*   The first argument `A` is an array of integers.
*   The second argument `B` is an integer representing the required length of the subarray.

## Output Format

Return a single integer, which is the maximum subarray sum found.

## Example Input

### Input 1:

A = [6, 7, 8, 2]
B = 2

### Input 2:
A = [3, 9, 5, 6, 5, 11]
B = 3

## Example Output

### Output 1:
15

### Output 2:
22

## Example Explanation

### Explanation 1:
The possible subarrays of length 2 are [6, 7], [7, 8], and [8, 2]. Their sums are 13, 15, and 10 respectively. The subarray with the maximum sum is [7, 8] with a sum of 15.

### Explanation 2:
The possible subarrays of length 3 are [3, 9, 5], [9, 5, 6], [5, 6, 5], and [6, 5, 11]. Their sums are 17, 20, 16, and 22 respectively. The subarray with the maximum sum is [6, 5, 11] with a sum of 22.
