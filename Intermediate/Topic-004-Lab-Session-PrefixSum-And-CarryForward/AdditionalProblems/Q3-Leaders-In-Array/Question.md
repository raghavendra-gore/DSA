# Find Leaders in an Array

## Problem Description

Given an integer array `A` containing `N` distinct integers, you have to find all the leaders in array `A`. An element is a leader if it is strictly greater than all the elements to its right side.

**NOTE:** The rightmost element is always a leader.

## Problem Constraints

*   `1 <= N <= 10^5`
*   `1 <= A[i] <= 10^8`

## Input Format

There is a single input argument which is an integer array `A`.

## Output Format

Return an integer array denoting all the leader elements of the array. The order of elements in the output array does not matter (e.g., `[17, 2, 5]` is the same as `[2, 5, 17]`).

## Example Input

### Input 1:

A = [16, 17, 4, 3, 5, 2]

### Input 2:
A = [5, 4]

## Example Output

### Output 1:
[17, 2, 5]
// Or any permutation like [2, 5, 17]

### Output 2:
[5, 4]

## Example Explanation

### Explanation 1:
*   Element 17 is strictly greater than all elements to its right (`[4, 3, 5, 2]`).
*   Element 2 is the rightmost element, always a leader.
*   Element 5 is strictly greater than all elements to its right (`[2]`).
*   Elements 16, 4, and 3 have elements to their right which are greater than or equal to them (e.g., 17 > 16; 5 > 4).
    So we return `[17, 2, 5]`.

### Explanation 2:
*   Element 5 is strictly greater than all elements to its right (`[4]`).
*   Element 4 is the rightmost element, always a leader.
    So we return `[5, 4]`.