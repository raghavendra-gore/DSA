# Print Numbers N to 1 then 1 to N Recursively

## Problem Description

You are given a positive integer `N`. The task is to print the numbers in two sequences consecutively:
1.  From `N` down to 1 (decreasing order).
2.  From 1 up to `N` (increasing order).

**NOTE:**
*   You are required to not use any loops (`for`, `while`, `do-while`).
*   Do not change the signature of the primary function `DecThenInc`.
*   Print a new empty line after printing all the output.
*   The numbers should be space-separated in the output line.

## Constraints

*   `1 <= N <= 100`

## Input Format

The first line contains a single integer `N`.

## Output Format

A single line containing numbers printed from `N` to 1 and then from 1 to `N`, separated by spaces. A newline character should follow the last number.

### Example Output Format Clarification:
The numbers are space-separated. A newline character terminates the entire sequence.

## Example Input

### Input 1:
4

### Input 2:
1

## Example Output

### Output 1:
4 3 2 1 1 2 3 4

### Output 2:
1 1

## Example Explanation

Elements are first printed from `N` down to 1, and then from 1 up to `N`.