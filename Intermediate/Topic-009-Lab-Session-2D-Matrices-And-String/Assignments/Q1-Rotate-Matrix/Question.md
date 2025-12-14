# Matrix Rotation (90 Degrees Clockwise)

## Problem Description

You are given an $n \times n$ 2D matrix `A` representing an image. The task is to rotate the image by 90 degrees in a clockwise direction. This operation must be performed *in-place*, meaning you should modify the input matrix directly without allocating a new 2D array. Using an additional array will result in only a partial score.

## Constraints

*   `1 <= n <= 1000`

## Input Format

The first argument is a 2D matrix `A` of integers.

## Output Format

Return the 2D rotated matrix.

## Example Input and Output

### Example 1

**Input:**

[
[1, 2],
[3, 4]
]

**Output:**
[
[3, 1],
[4, 2]
]

**Explanation 1:**
After rotating the matrix by 90 degrees:
*   1 goes to 2, 2 goes to 4
*   4 goes to 3, 3 goes to 1

### Example 2

**Input:**
[
[1, 2, 3],
[4, 5, 6],
[7, 8, 9]
]

**Output:**
[
[7, 4, 1],
[8, 5, 2],
[9, 6, 3]
]

**Explanation 2:**
After rotating the matrix by 90 degrees:
*   1 goes to 3, 3 goes to 9
*   2 goes to 6, 6 goes to 8
*   9 goes to 7, 7 goes to 1
*   8 goes to 4, 4 goes to 2