# Generate Spiral Matrix (Matrix of A x A)

## Problem Description

Given an integer `A`, the task is to generate a square matrix of size `A * A` filled with elements from `1` to `A²` in a spiral order. The generated matrix should then be returned.

## Problem Constraints

*   `1 <= A <= 1000`

## Input Format

The first and only argument is the integer `A`, which defines the dimension of the square matrix.

## Output Format

Return a 2-D matrix (or nested list/array, depending on the language) which consists of the elements added in spiral order.

## Example Inputs & Outputs

### Example 1

**Input:**
`A = 1`

**Output:**
`[ [1] ]`

**Explanation 1:**
Only the number 1 is to be arranged in a 1x1 matrix.

### Example 2

**Input:**
`A = 2`

**Output:**
Use code with caution.

[ [1, 2],
[4, 3] ]

**Explanation 2:**
The numbers are filled in a clockwise spiral:
1 --> 2
|
|
4 <--- 3

### Example 3

**Input:**
`A = 5`

**Output:**
[ [1, 2, 3, 4, 5],
[16, 17, 18, 19, 6],
[15, 24, 25, 20, 7],
[14, 23, 22, 21, 8],
[13, 12, 11, 10, 9] ]
