# Maximize GCD by Deleting One Element

## Problem Description

Given an integer array `A` of size `N`. You have to delete one element such that the GCD (Greatest Common Divisor) of the remaining array is maximum.

Find the maximum value of GCD.

## Problem Constraints

*   `2 <= N <= 10^5`
*   `1 <= A[i] <= 10^9`

## Input Format

The first argument is an integer array `A`.

## Output Format

Return an integer denoting the maximum value of GCD.

## Example Input

**Input 1:**

A = [12, 15, 18]

**Input 2:**

A = [5, 15, 30]

## Example Output

**Output 1:**

6

**Output 2:**

15

## Example Explanation

**Explanation 1:**

*   If you delete `12`, the remaining array is `[15, 18]`. `GCD(15, 18)` is `3`.
*   If you delete `15`, the remaining array is `[12, 18]`. `GCD(12, 18)` is `6`.
*   If you delete `18`, the remaining array is `[12, 15]`. `GCD(12, 15)` is `3`.
*   The maximum value of GCD is `6`.

**Explanation 2:**

*   If you delete `5`, the remaining array is `[15, 30]`. `GCD(15, 30)` is `15`.
*   If you delete `15`, the remaining array is `[5, 30]`. `GCD(5, 30)` is `5`.
*   If you delete `30`, the remaining array is `[5, 15]`. `GCD(5, 15)` is `5`.
*   The maximum value of GCD is `15`.