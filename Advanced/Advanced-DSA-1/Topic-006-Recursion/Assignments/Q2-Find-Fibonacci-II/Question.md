# Nth Fibonacci Number using Recursion

## Problem Description

The Fibonacci numbers follow a specific integer sequence:

$$0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, \dots$$

In mathematical terms, the sequence $F_n$ of Fibonacci numbers is defined by the recurrence relation:

$$F_n = F_{n-1} + F_{n-2}$$

Given a non-negative integer `A`, find and return the $A^{th}$ Fibonacci number using recursion.

The sequence starts with $F_0 = 0$ and $F_1 = 1$.

## Constraints

*   `0 <= A <= 20`

(The constraints are small enough to allow a simple recursive solution without performance issues related to repeated calculations.)

## Input Format

First and only argument is an integer `A`.

## Output Format

Return an integer denoting the $A^{th}$ term of the Fibonacci sequence.

## Example Input

### Input 1:

A = 2

### Input 2:
A = 9

## Example Output

### Output 1:
1

### Output 2:
34

## Example Explanation

### Explanation 1:

$F_2 = F_1 + F_0 = 1 + 0 = 1$.

### Explanation 2:

$F_9 = F_8 + F_7 = 21 + 13 = 34$.