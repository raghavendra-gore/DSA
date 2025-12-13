# Maximum Subarray Sum with a Limit (Kadane's Variant)

## Problem Description

You are given an integer array `C` of size `A`. You need to find a subarray (contiguous elements) such that the sum of these contiguous elements is the maximum possible value, with the constraint that this sum must not exceed a given integer `B`.

## Problem Constraints

*   `1 <= A <= 10^3` (Size of the array)
*   `1 <= B <= 10^9` (Maximum allowed sum limit)
*   `1 <= C[i] <= 10^6` (Value of elements in the array)

## Input Format

The first argument is the integer `A` (size of the array).
The second argument is the integer `B` (the sum limit).
The third argument is the integer array `C`.

## Output Format

Return a single integer which denotes the maximum subarray sum that is less than or equal to `B`. If no such subarray exists (e.g., if all single elements are greater than `B`), return `0`.

## Example Input

### Input 1:

A = 5
B = 12
C = [2, 1, 3, 4, 5]

### Input 2:
A = 3
B = 1
C = [2, 2, 2]

## Example Output

### Output 1:
12

### Output 2:
0

## Example Explanation

### Explanation 1:
We can select `{3, 4, 5}` which sums up to 12, which is the maximum possible sum that does not exceed `B` (12).

### Explanation 2:
All elements in the array `[2, 2, 2]` are greater than `B` (1), which means we cannot select any valid subarray sum. Hence, the answer is `0`.
