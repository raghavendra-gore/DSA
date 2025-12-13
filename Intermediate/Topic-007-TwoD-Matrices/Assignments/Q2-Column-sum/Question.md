# Column-Wise Sums of a Matrix

## Problem Description

You are given a 2D integer matrix `A`. The task is to return a 1D integer array where each element is the sum of all elements within the corresponding column of the original matrix.

## Problem Constraints

*   $1 \le \text{A.size()} \le 10^3$ (Number of rows)
*   $1 \le \text{A[i].size()} \le 10^3$ (Number of columns)
*   $1 \le A[i][j] \le 10^3$ (Value of matrix elements)

The matrix is guaranteed to be rectangular (all rows have the same number of columns).

## Input Format

The first argument is a 2D array of integers (a 2D matrix), `A`.

## Output Format

Return a 1D integer array containing the column-wise sums of the original matrix.

## Example Input

### Input 1:

[1,2,3,4]
[5,6,7,8]
[9,2,3,4]

## Example Output

### Output 1:

{15, 10, 13, 16}

## Example Explanation

### Explanation 1:

The calculation for each column sum is as follows:

*   **Column 1:** $1 + 5 + 9 = 15$
*   **Column 2:** $2 + 6 + 2 = 10$
*   **Column 3:** $3 + 7 + 3 = 13$
*   **Column 4:** $4 + 8 + 4 = 16$