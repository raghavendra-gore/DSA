# Problem: Minimum Time to Equalize Array Elements

## Description

Given an integer array `A` of size `N`, you are allowed to increase the value of any single element by 1 in one second.

The goal is to find the minimum total time (in seconds) required to make all elements of the array equal.

## Constraints

*   `1 <= N <= 1000000` (Array size)
*   `1 <= A[i] <= 1000` (Value of elements)

## Input Format

The first argument is an integer array `A`.

## Output Format

Return an integer denoting the minimum time required to make all elements equal.

## Example

### Input:

A = [2, 4, 1, 3, 2]

### Output:

8

### Explanation:

To make all elements equal in the minimum amount of time, we must aim for the largest value already present in the array. The maximum element is 4.

The target array would be ``. The time required for each element is the difference from this maximum:

*   (4 - 2) = 2 seconds
*   (4 - 4) = 0 seconds
*   (4 - 1) = 3 seconds
*   (4 - 3) = 1 second
*   (4 - 2) = 2 seconds

Total time = $2 + 0 + 3 + 1 + 2 = 8$ seconds.