# Count Good Subarrays

This repository provides a solution to the "Count Good Subarrays" problem. The problem involves analyzing an array of integers to find subarrays that meet specific criteria based on their length (even/odd) and the sum of their elements relative to a given threshold `B`.

## Problem Description

Given an array of integers `A` and an integer `B`, a subarray is considered "good" if it fulfills either of the following criteria:

1. The length of the subarray is even, AND the sum of all elements in the subarray is less than `B`.
2. The length of the subarray is odd, AND the sum of all elements in the subarray is greater than `B`.

The objective is to count the total number of "good" subarrays within `A`.

## Constraints

*   `1 <= len(A) <= 5 x 10^3`
*   `1 <= A[i] <= 10^3`
*   `1 <= B <= 10^7`

## Input Format

*   `A`: An integer array.
*   `B`: An integer threshold.

## Output Format

*   An integer representing the count of good subarrays in `A`.

## Example Usage

### Example 1

**Input:**

A = [1, 2, 3, 4, 5]
B = 4

**Output:**
6

**Explanation:**
The good subarrays are:
*   **Even length (sum < 4):** `{1, 2}` (sum=3)
*   **Odd length (sum > 4):** `{1, 2, 3}` (sum=6), `{1, 2, 3, 4, 5}` (sum=15), `{2, 3, 4}` (sum=9), `{3, 4, 5}` (sum=12), `{5}` (sum=5)

### Example 2

**Input:**
A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
B = 65

**Output:**
36