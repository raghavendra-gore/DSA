# Anti-Diagonals of a Matrix

## Problem Description

Given an $N \times N$ square matrix `A`, the task is to return an array of its anti-diagonals. The output should be a 2D integer array where each row represents an anti-diagonal. Vacant spaces in the resulting rows must be filled with `0`.

## Problem Constraints

*   $1 \le N \le 1000$
*   $1 \le A[i][j] \le 1e9$

## Input Format

The only argument is a 2D integer array `A` of size $N \times N$.

## Output Format

Return a 2D integer array of size $(2 \times N - 1) \times N$, representing the anti-diagonals of the input matrix `A` with vacant spaces assigned to `0`.

## Example Input

### Input 1:

1 2 3
4 5 6
7 8 9

### Input 2:
1 2
3 4

## Example Output

### Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0

### Output 2:
1 0
2 3
4 0

## Example Explanation

### For Input 1:

*   The first anti-diagonal is `[1]`. The row in the output is `[1, 0, 0]`.
*   The second anti-diagonal is `[2, 4]`. The row in the output is `[2, 4, 0]`.
*   The third anti-diagonal is `[3, 5, 7]`. The row in the output is `[3, 5, 7]`.
*   The fourth anti-diagonal is `[6, 8]`. The row in the output is `[6, 8, 0]`.
*   The fifth anti-diagonal is `[9]`. The row in the output is `[9, 0, 0]`.

### For Input 2:

*   The first anti-diagonal is `[1]`. The row in the output is `[1, 0]`.
*   The second anti-diagonal is `[2, 3]`. The row in the output is `[2, 3]`.
*   The third anti-diagonal is `[4]`. The row in the output is `[4, 0]`.
