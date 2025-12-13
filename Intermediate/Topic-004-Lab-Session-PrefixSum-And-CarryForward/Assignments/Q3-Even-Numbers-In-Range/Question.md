# Count Even Numbers in a Range (Prefix Sum Approach)

## Problem Description

You are given an array `A` of length `N` and `Q` queries given by the 2D array `B` of size `Q`×2.

Each query consists of two integers `B[i][0]` and `B[i][1]`, representing a 0-based index range `[start, end]` within array `A`.

For every query, your task is to efficiently find the count of even numbers in the range from `A[B[i][0]]` to `A[B[i][1]]` (inclusive).

## Problem Constraints

*   `1 <= N <= 10^5`
*   `1 <= Q <= 10^5`
*   `1 <= A[i] <= 10^9`
*   `0 <= B[i][0] <= B[i][1] < N`

## Input Format

*   First argument `A` is an array of integers.
*   Second argument `B` is a 2D array of integers.

## Output Format

*   Return an array of integers, where each element is the count of even numbers for the corresponding query.

## Example Input

### Input 1:

A = [1, 2, 3, 4, 5]
B = [ [0, 2]
[2, 4]
[1, 4] ]

### Input 2:
A = [2, 1, 8, 3, 9, 6]
B = [ [0, 3]
[3, 5]
[1, 3]
[2, 4] ]

## Example Output

### Output 1:
[1, 1, 2]

### Output 2:
[2, 1, 1, 1]

## Example Explanation

### For Input 1:

*   The subarray for the first query is `[1, 2, 3]` (index 0 to 2) which contains 1 even number (`2`).
*   The subarray for the second query is `[3, 4, 5]` (index 2 to 4) which contains 1 even number (`4`).
*   The subarray for the third query is `[2, 3, 4, 5]` (index 1 to 4) which contains 2 even numbers (`2`, `4`).

### For Input 2:

*   The subarray for the first query is `[2, 1, 8, 3]` (index 0 to 3) which contains 2 even numbers (`2`, `8`).
*   The subarray for the second query is `[3, 9, 6]` (index 3 to 5) which contains 1 even number (`6`).
*   The subarray for the third query is `[1, 8, 3]` (index 1 to 3) which contains 1 even number (`8`).
*   The subarray for the fourth query is `[8, 3, 9]` (index 2 to 4) which contains 1 even number (`8`).
