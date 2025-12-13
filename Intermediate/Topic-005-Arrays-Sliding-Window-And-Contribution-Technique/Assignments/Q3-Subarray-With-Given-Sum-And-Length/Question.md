# Subarray with given length and sum

## Problem Description

Given an array `A` of length `N`, and two integers `B` and `C`.

The task is to return `1` if there exists a subarray with length `B` having sum `C`, and `0` otherwise.

## Problem Constraints

*   `1 <= N <= 10^5`
*   `1 <= A[i] <= 10^4`
*   `1 <= B <= N`
*   `1 <= C <= 10^9`

## Input Format

*   The first argument `A` is an array of integers.
*   The second argument `B` is an integer representing the required subarray length.
*   The third argument `C` is an integer representing the required subarray sum.

## Output Format

Return `1` if such a subarray exists, and `0` otherwise.

## Example Input

### Input 1:

A = [4, 3, 2, 6, 1]
B = 3
C = 11

### Input 2:
A = [4, 2, 2, 5, 1]
B = 4
C = 6

## Example Output

### Output 1:
1

### Output 2:
0

## Example Explanation

### Explanation 1:
The subarray `[3, 2, 6]` is of length 3 and has a sum of 11.

### Explanation 2:
There are no subarrays with length 4 that sum up to 6.