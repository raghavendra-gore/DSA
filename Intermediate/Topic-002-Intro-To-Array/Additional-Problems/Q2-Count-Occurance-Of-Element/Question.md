# Problem: Count Occurrences of an Element in an Array

## Description

Given an integer array `A` and a target integer `B`, the task is to find the total number of times the integer `B` appears as an element within the array `A`.

## Constraints

*   `1 <= B, A[i] <= 10^9` (Values of elements and B are positive integers)
*   `1 <= length(A) <= 10^5` (Array size is between 1 and 100,000)

## Input Format

The input consists of two parts:
*   An integer array `A`.
*   A target integer `B`.

## Output Format

Return a single integer representing the count of occurrences of `B` in `A`.

## Examples

### Input 1:

A = [1, 2, 2]
B = 2

### Output 1:

2

### Explanation 1:

The target element 2 appears twice in the array `A`.

### Input 2:

A = [1, 2, 1]
B = 3

### Output 2:

0

### Explanation 2:

The element 3 is not present in the input array `A`.