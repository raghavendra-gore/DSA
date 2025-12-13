# Generate All Subarrays

## Problem Description

You are given an array `A` of `N` integers. The task is to return a 2D array (or list of lists) consisting of all possible contiguous subarrays of the original array `A`.

**Note:** The order of the subarrays in the resulting 2D array does not matter.

## Problem Constraints

*   `1 <= N <= 100` (The size of the input array is between 1 and 100, inclusive)
*   `1 <= A[i] <= 10^5` (Each element in the array is between 1 and 100,000, inclusive)

## Input Format

The first argument is an integer array `A`.

## Output Format

Return a 2D array of integers containing all the subarrays.

## Example Input

**Input 1:**

A = [1, 2, 3]

**Input 2:**
A = [5, 2, 1, 4]

## Example Output

**Output 1:**
[[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]

**Output 2:**
[[1], [1, 4], [2], [2, 1], [2, 1, 4], [4], [5], [5, 2], [5, 2, 1], [5, 2, 1, 4]]

## Example Explanation

**For Input 1:**
All the subarrays of the array are returned. There are a total of 6 subarrays.

**For Input 2:**
All the subarrays of the array are returned. There are a total of 10 subarrays.
