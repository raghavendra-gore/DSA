# Find the Row with the Maximum Number of 1s in a Binary Sorted Matrix

## Problem Description

Given a binary sorted matrix `A` of size `N x N`. Find the row with the maximum number of 1s.

**NOTE:**
*   If two rows have the maximum number of 1s then return the row which has a lower index.
*   Rows are numbered from top to bottom and columns are numbered from left to right.
*   Assume 0-based indexing.
*   Assume each row to be sorted by values (all 0s come before all 1s).
*   Expected time complexity is O(rows + columns), i.e., O(N) for an N x N matrix.

## Problem Constraints

*   `1 <= N <= 1000`
*   `0 <= A[i][j] <= 1`

## Input Format

The only argument given is the integer matrix `A`.

## Output Format

Return the 0-based index of the row with the maximum number of 1s.

## Example Input

### Input 1:

A = [ [0, 1, 1]
[0, 0, 1]
[0, 1, 1] ]

### Input 2:
A = [ [0, 0, 0, 0]
[0, 0, 0, 1]
[0, 0, 1, 1]
[0, 1, 1, 1] ]

## Example Output

### Output 1:
0

### Output 2:
3

## Example Explanation

### Explanation 1:

*   Row 0 has two 1s.
*   Row 1 has one 1.
*   Row 2 has two 1s.
*   Since Row 0 and Row 2 have the same number of 1s, we return the one with the lower index, which is 0.

### Explanation 2:

*   Row 0 has zero 1s.
*   Row 1 has one 1.
*   Row 2 has two 1s.
*   Row 3 has three 1s.
*   Row 3 has the maximum number of 1s.