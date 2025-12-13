# Set Matrix Zeros

## Problem Description

You are given a 2D integer matrix `A`. The task is to modify the matrix such that if any element `A[i][j]` is zero, the entire `i`-th row and the entire `j`-th column are set to zero.

## Problem Constraints

*   `1 <= A.size() <= 10^3` (Number of rows)
*   `1 <= A[i].size() <= 10^3` (Number of columns)
*   `0 <= A[i][j] <= 10^3` (Value of elements)

## Input Format

The first argument is a 2D integer matrix `A`.

## Output Format

Return the modified 2D matrix after performing the required operations.

## Example Input

**Input 1:**

[1, 2, 3, 4]
[5, 6, 7, 0]
[9, 2, 0, 4]

## Example Output

**Output 1:**

[1, 2, 0, 0]
[0, 0, 0, 0]
[0, 0, 0, 0]

## Example Explanation

**Explanation 1:**

In the input matrix, elements at `A[1][3]` (using 0-based indexing: Row 1, Column 3) and `A[2][2]` (Row 2, Column 2) are 0.
As a result, Row 1, Row 2, Column 2, and Column 3 are all set to zero in the output matrix.
