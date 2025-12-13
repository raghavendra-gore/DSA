# Sum of Main Diagonal Elements in an NxN Matrix

## Problem Description

You are given an $N \times N$ integer matrix, $A$. You are required to find the sum of all the elements that lie along its main diagonal.

The **main diagonal** of a matrix $A$ is a collection of elements $A[i, j]$ such that the row index $i$ is equal to the column index $j$.

## Problem Constraints

*   `1 <= N <= 10^3`
*   `-1000 <= A[i][j] <= 1000`

## Input Format

The input is provided on a single line.

1.  The first two integers represent the number of rows (`R`) and columns (`C`).
2.  These are followed by `R * C` integers, corresponding to the elements of the 2D array `A` read in a row-wise manner.

*Note: Since the problem specifies finding the main diagonal of an NxN matrix, it's assumed that R and C will always be equal (R=C=N) for valid inputs.*

## Output Format

Return an integer representing the sum of the main diagonal elements.

## Example Inputs and Outputs

### Example 1

**Input:**

3 3 1 -2 -3 -4 5 -6 -7 -8 9

**Output:**
15

**Explanation:**
The matrix size is 3x3. The main diagonal elements are $A[0][0]$, $A[1][1]$, and $A[2][2]$.
$1 + 5 + 9 = 15$.

### Example 2

**Input:**
2 2 3 2 2 3

**Output:**
6

**Explanation:**
The matrix size is 2x2. The main diagonal elements are $A[0][0]$ and $A[1][1]$.
$3 + 3 = 6$.