# Minimum XOR Pair

## Problem Description

Given an integer array `A` of `N` integers, the task is to find the pair of integers in the array which have the minimum XOR value. Report this minimum XOR value.

## Constraints

*   `2 <= length of the array <= 100000`
*   `0 <= A[i] <= 10^9`

## Input Format

The first and only argument of input contains an integer array `A`.

## Output Format

Return a single integer denoting the minimum XOR value found.

## Example Input

### Input 1:

A = [0, 2, 5, 7]

### Input 2:
A = [0, 4, 7, 9]

## Example Output

### Output 1:
2

### Output 2:
3

## Explanation

### Explanation 1:
The XOR pairs are:
*   `0 XOR 2 = 2`
*   `0 XOR 5 = 5`
*   `0 XOR 7 = 7`
*   `2 XOR 5 = 7`
*   `2 XOR 7 = 5`
*   `5 XOR 7 = 2`
    The minimum XOR value is `2`.