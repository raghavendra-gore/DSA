# Problem: Count Elements with at Least One Greater Element

## Description

Given an array `A` of `N` integers, the task is to count the number of elements in the array that are *not* the maximum value. Every non-maximum element inherently has at least one other element in the array (the maximum one) that is greater than itself.

## Constraints

*   `1 <= N <= 10^3` (Array size)
*   `1 <= A[i] <= 10^9` (Value of elements)

## Input Format

The first and only argument is an array of integers `A`.

## Output Format

Return the count of elements that have at least one element greater than themselves.

## Examples

### Input 1:

A = [3, 1, 2]

### Output 1:

2

### Explanation 1:

The elements 1 and 2 both have the element 3 which is greater than them. The element 3 does not have any element greater than itself within the array.

### Input 2:

A = [5, 5, 3]

### Output 2:

1

### Explanation 2:

The element 3 has the element 5 which is greater than it. The elements 5 do not have any element strictly greater than themselves within the array.