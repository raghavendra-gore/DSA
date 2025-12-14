# Matrix Transpose

## Problem Description

Given a 2D integer array `A` (matrix), the task is to return the transpose of `A`.

The transpose of a matrix is obtained by flipping the matrix over its main diagonal. This operation effectively switches the matrix's row and column indices (i.e., the element at `A[i][j]` moves to the position `A[j][i]`).

Note that the input matrix is not necessarily a square matrix (number of rows might differ from the number of columns).

## Constraints

*   `1 <= A.size() <= 1000` (Number of rows)
*   `1 <= A[i].size() <= 1000` (Number of columns)
*   `1 <= A[i][j] <= 1000` (Value of elements)

## Input Format

The first argument is a 2D matrix of integers, `A`.

## Output Format

You have to return the Transpose of this 2D matrix. The output should be a new 2D matrix.

## Example Input and Output

### Example 1

**Input:**

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]

**Output:**
[[1, 4, 7], [2, 5, 8], [3, 6, 9]]

**Explanation 1:**
The rows `[1, 2, 3]`, `[4, 5, 6]`, and `[7, 8, 9]` become the columns of the new matrix.

### Example 2

**Input:**
A = [[1, 2],[1, 2],[1, 2]]

**Output:**
[[1, 1, 1], [2, 2, 2]]

**Explanation 2:**
The original matrix has dimensions 3 rows x 2 columns. The transposed matrix has dimensions 2 rows x 3 columns.
