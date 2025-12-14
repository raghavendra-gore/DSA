# Problem Description: Fast Power (Exponentiation)

Given two positive integers `A` and `B`. Implement the Fast Power function to compute `A^B`.

**Note:** Please use the approach taught in the class (Exponentiation by Squaring/Binary Exponentiation).

## Problem Constraints

`A^B` would fit in 64-bit type integer (long long in C++/Java, standard `int` in Python 3).

## Input Format

Two integers `A` and `B`.

## Output Format

Single integer denoting the answer to `A^B`.

## Example Input

Input 1:

A = 2 , B = 10

Input 2:

A = 1 , B = 100000000

## Example Output

Output 1:

1024

Output 2:

1

## Example Explanation

Explanation 1:

$2^{10} = 2^5 * 2^5$
$2^5 = 32$, so $32 * 32 = 1024$

Explanation 2:

$1$ raised to any power is $1$.