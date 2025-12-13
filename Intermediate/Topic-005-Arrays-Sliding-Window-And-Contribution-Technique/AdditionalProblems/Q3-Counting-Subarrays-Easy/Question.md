# Count Subarrays With Sum Less Than B

## Problem Description

Given an array `A` of `N` non-negative numbers and a non-negative number `B`, you need to find the total number of contiguous subarrays in `A` whose sum is strictly less than `B`.

It can be assumed that there are no integer overflows when calculating sums, given the constraints.

## Constraints

*   `1 <= N <= 5 x 10^3`
*   `1 <= A[i] <= 1000`
*   `1 <= B <= 10^7`

## Input Format

*   First argument is an integer array `A`.
*   Second argument is an integer `B`.

## Output Format

Return an integer denoting the number of subarrays in `A` having a sum less than `B`.

## Example Input

### Input 1:

A = [2, 5, 6]
B = 10

### Input 2:
A = [1, 11, 2, 3, 15]
B = 10

## Example Output

### Output 1:
4

### Output 2:
4

## Explanation

### Explanation 1:

`A = [2, 5, 6]`, `B = 10`

The subarrays with sum less than `B` (10) are:
*   `{2}` (Sum 2)
*   `{5}` (Sum 5)
*   `{6}` (Sum 6)
*   `{2, 5}` (Sum 7)

Total count: 4

### Explanation 2:

`A = [1, 11, 2, 3, 15]`, `B = 10`

The subarrays with sum less than `B` (10) are:
*   `{1}` (Sum 1)
*   `{2}` (Sum 2)
*   `{3}` (Sum 3)
*   `{2, 3}` (Sum 5)

Total count: 4