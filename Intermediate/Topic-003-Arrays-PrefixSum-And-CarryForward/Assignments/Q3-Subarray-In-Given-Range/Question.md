# Extract Subarray From Range

## Problem Description

Given an array `A` of length `N`, the task is to extract and return the contiguous subarray starting from index `B` up to and including index `C`.

## Problem Constraints

*   `1 <= N <= 10^5` (The size of the input array is up to 100,000)
*   `1 <= A[i] <= 10^9` (Elements in the array are within a large integer range)
*   `0 <= B <= C < N` (The start and end indices are valid and the start is less than or equal to the end)

## Input Format

*   The first argument `A` is an integer array.
*   The second argument `B` is an integer representing the start index.
*   The third argument `C` is an integer representing the end index.

## Output Format

Return an array containing the extracted subarray.

## Example Input

**Input 1:**

A = [4, 3, 2, 6]
B = 1
C = 3

**Input 2:**

A = [4, 2, 2]
B = 0
C = 1

## Example Output

**Output 1:**
[3, 2, 6]

**Output 2:**
[4, 2]

## Example Explanation

**Explanation 1:**
The subarray of A from index 1 to 3 (inclusive) is `[3, 2, 6]`.

**Explanation 2:**
The subarray of A from index 0 to 1 (inclusive) is `[4, 2]`.