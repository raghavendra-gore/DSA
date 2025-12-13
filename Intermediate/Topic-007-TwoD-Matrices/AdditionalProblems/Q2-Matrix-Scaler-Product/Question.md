# Scalar Multiplication of a Matrix

## Problem Description

You are given a 2D integer matrix, $A$, and a single integer scalar, $B$. You are required to perform scalar multiplication of the matrix $A$ by the integer $B$. This operation involves multiplying every element in the matrix $A$ by the scalar value $B$.

## Problem Constraints

*   `1 <= A.size() (number of rows) <= 1000`
*   `1 <= A[i].size() (number of columns) <= 1000`
*   `1 <= A[i][j] <= 1000`
*   `1 <= B <= 1000`

## Input Format

*   **First argument:** A 2D array of integers `A` representing the matrix.
*   **Second argument:** An integer `B`, the scalar value.

## Output Format

You have to return a new 2D array of integers representing the resulting matrix after performing the scalar multiplication.

## Example Inputs and Outputs

### Example 1

**Input:**

A = [[1, 2, 3],
[4, 5, 6],
[7, 8, 9]]
B = 2

**Output:**
[[2, 4, 6],
[8, 10, 12],
[14, 16, 18]]

**Explanation:**
Each element in the matrix `A` is multiplied by the scalar `2`.

### Example 2

**Input:**
A = [[1]]
B = 5

**Output:**
[[5]]

**Explanation:**
The single element in the matrix `A` is multiplied by the scalar `5`.