# Sum of Minor Diagonal Elements in an NxN Matrix

## Problem Description

You are given an $N \times N$ integer matrix, $A$. You are required to find the sum of all the elements that lie along its minor (anti) diagonal.

The **minor diagonal** of an $N \times N$ matrix $A$ consists of elements $A[i, j]$ such that the relationship between the row index and column index satisfies a specific condition.

*   **Using 1-based indexing:** $i + j = N + 1$
*   **Using 0-based indexing:** $i + j = N - 1$

## Problem Constraints

*   `1 <= N <= 10^3`
*   `-1000 <= A[i][j] <= 1000`

## Input Format

The first and only argument is a 2D integer matrix `A`.

## Output Format

Return an integer denoting the sum of the minor diagonal elements.

## Example Inputs and Outputs

### Example 1

**Input:**

A = [[1, -2, -3],
[-4, 5, -6],
[-7, -8, 9]]

**Output:**
-5

**Explanation:**
The matrix size $N$ is 3. Using 1-based indexing, the minor diagonal elements are $A[1][3]$, $A[2][2]$, and $A[3][1]$.
The sum is $(-3) + 5 + (-7) = -5$.

### Example 2

**Input:**
A = [[3, 2],
[2, 3]]

**Output:**
4

**Explanation:**
The matrix size $N$ is 2. Using 1-based indexing, the minor diagonal elements are $A[1][2]$ and $A[2][1]$.
The sum is $2 + 2 = 4$.