# Colorful Number Checker

This project provides a solution to determine if a given integer is a "Colorful Number".

A Colorful Number is a positive integer where the product of the digits of every possible consecutive sub-sequence of digits is unique.

## Problem Description

Given a number $A$, determine if it is a Colorful Number.

- If $A$ is colorful, return `1`.
- Otherwise, return `0`.

### Definition of a Colorful Number

A number can be broken into different consecutive sequences of digits.
For example, the number 3245 can be broken into sequences like:
`3`, `2`, `4`, `5`, `32`, `24`, `45`, `324`, `245`, and `3245`.

This number *is* a Colorful Number because the product of every consecutive sequence of digits is different:
- 3 -> 3
- 2 -> 2
- 4 -> 4
- 5 -> 5
- 32 -> 6
- 24 -> 8
- 45 -> 20
- 324 -> 24
- 245 -> 40
- 3245 -> 120

### Constraints

*   `1 <= A <= 2 * 10^9`

## Input Format

The first and only argument is an integer `A`.

## Output Format

Return `1` if the integer `A` is Colorful, else return `0`.

## Example Input and Output

### Input 1:

A = 23

### Output 1:
1

**Explanation 1:**
Possible Sub-sequences: `[2, 3, 23]`
- 2 -> 2
- 3 -> 3
- 23 -> 6 (product of digits)
  All products (2, 3, 6) are different. The number is Colorful.

### Input 2:
A = 236

### Output 2:
0

**Explanation 2:**
Possible Sub-sequences: `[2, 3, 6, 23, 36, 236]`
- 2 -> 2
- 3 -> 3
- 6 -> 6
- 23 -> 6 (product of digits)
- 36 -> 18 (product of digits)
- 236 -> 36 (product of digits)
  The number is not Colorful because the product sequence `23` and the sequence `6` both yield the same product (6).
