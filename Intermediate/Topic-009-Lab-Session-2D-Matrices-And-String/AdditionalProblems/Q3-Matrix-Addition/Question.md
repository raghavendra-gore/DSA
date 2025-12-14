# Matrix Addition

This project provides a solution for adding two matrices of the same dimensions.

## Problem Description

You are given two matrices, $A$ and $B$, which are guaranteed to be of the same size (same number of rows and columns). The task is to return a new matrix that represents the sum of $A$ and $B$.

The sum of two matrices is calculated by adding the corresponding elements in each matrix.

### Matrix Addition Example

$$
A = \begin{bmatrix} a_{11} & a_{12} \\ a_{21} & a_{22} \end{bmatrix}, B = \begin{bmatrix} b_{11} & b_{12} \\ b_{21} & b_{22} \end{bmatrix}
$$

$$
A + B = \begin{bmatrix} a_{11}+b_{11} & a_{12}+b_{12} \\ a_{21}+b_{21} & a_{22}+b_{22} \end{bmatrix}
$$

### Constraints

*   `1 <= A.size(), B.size() <= 1000` (Number of rows)
*   `1 <= A[i].size(), B[i].size() <= 1000` (Number of columns)
*   `1 <= A[i][j], B[i][j] <= 1000` (Value of elements)

### Input Format

*   The first argument is the 2D integer array `A`.
*   The second argument is the 2D integer array `B`.

### Output Format

You have to return a 2D vector (or list) of integers representing the resulting sum matrix.

## Example Input and Output

### Input 1:

A = [[1, 2, 3],
[4, 5, 6],
[7, 8, 9]]
B = [[9, 8, 7],
[6, 5, 4],
[3, 2, 1]]

### Output 1:
[[10, 10, 10],
[10, 10, 10],
[10, 10, 10]]

### Input 2:
A = [[1, 2, 3],
[4, 1, 2],
[7, 8, 9]]
B = [[9, 9, 7],
[1, 2, 4],
[4, 6, 3]]

### Output 2:
[[10, 11, 10],
[5, 3, 6],
[11, 14, 12]]
