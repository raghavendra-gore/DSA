# Search in a Sorted 2D Matrix (Row/Column Sorted)

This project provides a solution to find a target integer `B` within a 2D matrix `A`, where every row and every column is sorted in non-decreasing order. The solution respects the constraints of linear time complexity and specific output formatting.

## Problem Description

Given a matrix of integers $A$ of size $N \times M$ and an integer $B$.

In the given matrix, every row and column is sorted in non-decreasing order. Find and return the position of $B$ in the matrix in the given form:
If $A[i][j] = B$ then return $(i \times 1009 + j)$.

If $B$ is not present, return -1.

## Notes

1.  Rows are numbered from top to bottom and columns are numbered from left to right.
2.  If there are multiple occurrences of $B$ in $A$, return the smallest value of $(i \times 1009 + j)$ such that $A[i][j]=B$.
3.  Expected time complexity is linear, i.e., $O(N+M)$.
4.  Use 1-based indexing for rows and columns.

## Problem Constraints

*   `1 <= N, M <= 1000`
*   `-100000 <= A[i][j] <= 100000`
*   `-100000 <= B <= 100000`

## Input Format

*   The first argument given is the integer matrix $A$.
*   The second argument given is the integer $B$.

## Output Format

Return the position of $B$ using the formula $(i \times 1009 + j)$, and if it is not present in $A$, return -1 instead.

## Example Input

**Input 1:**

A = [[1, 2, 3]
[4, 5, 6]
[7, 8, 9]]
B = 2

**Input 2:**
A = [[1, 2]
[3, 3]]
B = 3

## Example Output

**Output 1:**
1011

**Output 2:**
2019

## Example Explanation

**Explanation 1:**
$A[1][2] = 2$ (using 1-based indexing)
$1 \times 1009 + 2 = 1011$

**Explanation 2:**
$A[2][1] = 3$
$2 \times 1009 + 1 = 2019$
$A[2][2] = 3$
$2 \times 1009 + 2 = 2020$
The minimum value is 2019.