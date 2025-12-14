# Print Array Elements using Recursion

## Problem Description

You are given an integer array `A`. The task is to print all elements of the array in sequential order using recursion.

**NOTE:**
*   You are required to not use any loops (`for`, `while`, `do-while`).
*   You can create new helper functions.
*   Do not change the signature of the primary function `PrintArray` (assuming the platform expects a specific signature, usually one argument for the array).
*   Print a new empty line after printing all the output.
*   The elements should be space-separated in the output line.

## Constraints

*   `1 <= |A| <= 100` (Array size is between 1 and 100)
*   `-1000 <= A[i] <= 1000` (Element values range)

## Input Format

One line containing the array `A` (likely provided as a standard input format for the environment).

## Output Format

Print the elements of the array in sequential order, separated by spaces.
Print a new empty line after the sequence of numbers.

### Example Output Format Clarification:
The last element is followed by a space, and then a newline character terminates the entire output sequence.

## Example Input

### Input 1:

A = [6, -2, 5, 3]

### Input 2:
A = [1]

## Example Output

### Output 1:
6 -2 5 3

### Output 2:
1

## Example Explanation

Print the elements in their order.