# Find the Bth Smallest Element

## Problem Description

Given an integer array `A` and an integer `B`, the task is to find the $B^{th}$ smallest element in the array `A`.

**NOTE:** The user should attempt to solve this problem using an algorithm that performs less than or equal to $B$ swaps to find the required element. This constraint suggests an approach that modifies the array in-place, such as a partial selection sort, rather than a full sort.

## Problem Constraints

*   `1 <= |A| <= 100000` (The size of the array is between 1 and 100,000)
*   `1 <= B <= min(|A|, 500)` (`B` is valid, but capped at 500)
*   `1 <= A[i] <= 10^9` (Elements in the array are positive integers)

## Input Format

The function/method accepts the following arguments:

1.  `A`: An integer array.
2.  `B`: An integer representing the required rank (Bth smallest).

## Output Format

Return an integer representing the $B^{th}$ smallest element in the given array `A`.

## Example Input

### Input 1:

A = [2, 1, 4, 3, 2]
B = 3

### Input 2:

A = [1, 2]
B = 2

## Example Output

### Output 1:

2

### Output 2:

2

## Example Explanation

### Explanation 1:

If we sort the array `A = [2, 1, 4, 3, 2]`, we get `[1, 2, 2, 3, 4]`. The 3rd element in the sorted array is `2`.

### Explanation 2:

If we sort the array `A = [1, 2]`, the 2nd element in the sorted array is `2`.

