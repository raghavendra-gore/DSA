# Problem: Rotate Array to the Right

## Description

Given an integer array `A` of size `N` and an integer `B`, rotate the array `A` `B` times towards the right. The resulting modified array should be returned.

*Example: Rotating `[1, 2, 3]` once to the right gives `[3, 1, 2]`.*

## Constraints

*   `1 <= N <= 10^5` (Array size)
*   `1 <= A[i] <= 10^9` (Value of elements)
*   `1 <= B <= 10^9` (Number of rotations)

## Input Format

*   The first argument `A` is an integer array.
*   The second argument `B` is an integer representing the number of right rotations.

## Output Format

Return the array `A` after rotating it `B` times to the right.

## Examples

### Input 1:

A = [1, 2, 3, 4]
B = 2

### Output 1:

[3, 4, 1, 2]

### Explanation 1:

Rotate towards the right 2 times:
`[1, 2, 3, 4]` => `[4, 1, 2, 3]` (1st rotation)
`[4, 1, 2, 3]` => `[3, 4, 1, 2]` (2nd rotation)

### Input 2:

A = [2, 5, 6]
B = 1

### Output 2:

[6, 2, 5]

### Explanation 2:

Rotate towards the right 1 time:
`[2, 5, 6]` => `[6, 2, 5]`