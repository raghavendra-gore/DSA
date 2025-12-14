# Problem: Modular Exponentiation (pow(A, B) % C)

## Problem Description

Implement `pow(A, B) % C`.

In other words, given three integers `A`, `B`, and `C`, find the value of $A^B \pmod C$.

**Note**: The remainders on division cannot be negative. Ensure the answer you return is non-negative, even if the result of intermediate calculations involves negative numbers (due to a negative input `A`).

## Problem Constraints

*   `-10^9 <= A <= 10^9`
*   `0 <= B <= 10^9`
*   `1 <= C <= 10^9`

## Input Format

Given three integers `A`, `B`, `C` as input arguments.

## Output Format

Return a single integer representing $A^B \pmod C$.

## Example Input

### Input 1:

A = 2
B = 3
C = 3

### Input 2:
A = 3
B = 3
C = 1

## Example Output

### Output 1:
2

### Output 2:
0

## Example Explanation

**Explanation 1:**
$2^3 \pmod 3 = 8 \pmod 3 = 2$

**Explanation 2:**
$3^3 \pmod 1 = 27 \pmod 1 = 0$