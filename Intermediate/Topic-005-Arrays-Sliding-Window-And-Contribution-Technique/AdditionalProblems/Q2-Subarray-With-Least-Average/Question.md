# Subarray with Least Average

## Problem Description

Given an array `A` of size `N`, find the starting index of the contiguous subarray of size `B` with the least average.

The average of a subarray is its sum divided by its length (`B`). To find the subarray with the least average, we only need to find the subarray with the least *sum* since `B` is a fixed constant across all candidate subarrays.

## Constraints

*   `1 <= B <= N <= 10^5`
*   `-10^5 <= A[i] <= 10^5`

## Input Format

*   First argument contains an array `A` of integers of size `N`.
*   Second argument contains integer `B` (the subarray size).

## Output Format

Return the index of the first element (0-based) of the subarray of size `B` that has the least average/sum.

## Example Input

### Input 1:

A = [3, 7, 90, 20, 10, 50, 40]
B = 3

### Input 2:
A = [3, 7, 5, 20, -10, 0, 12]
B = 2

## Example Output

### Output 1:
3

### Output 2:
4

## Explanation

### Explanation 1:

`A = [3, 7, 90, 20, 10, 50, 40]`
`B = 3`

Subarrays of size 3 and their sums:

*   `[3, 7, 90]` (Indices 0-2): Sum = 100
*   `[7, 90, 20]` (Indices 1-3): Sum = 117
*   `[90, 20, 10]` (Indices 2-4): Sum = 120
*   `[20, 10, 50]` (Indices 3-5): Sum = 80
*   `[10, 50, 40]` (Indices 4-6): Sum = 100

The subarray at indices 3 to 5 (`{20, 10, 50}`) has the least sum (80), thus the least average. The starting index is 3.

### Explanation 2:

`A = [3, 7, 5, 20, -10, 0, 12]`
`B = 2`

The subarray between indices 4 and 5 (`{-10, 0}`) has the minimum average/sum among all subarrays of size 2. The starting index is 4.

