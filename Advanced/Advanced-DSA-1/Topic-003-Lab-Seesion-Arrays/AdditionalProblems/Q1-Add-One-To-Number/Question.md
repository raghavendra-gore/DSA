# Add One to Number Represented by Digits Array

## Problem Description

Given a non-negative number represented as an array of digits, add 1 to the number (increment the number represented by the digits).

The digits are stored such that the most significant digit is at the head of the list/array.

### Clarifications (as per typical interview dialogue):

*   **Q: Can the input have 0's before the most significant digit (e.g., `[0, 1, 2, 3]` is valid)?**
    *   **A: YES**
*   **Q: Can the output have 0's before the most significant digit (e.g., `[0, 1, 2, 4]` is valid)?**
    *   **A: NO.** The output should not have leading zeros, even if the input did. The output `[0, 0, 1, 2, 4]` should be presented as `[1, 2, 4]`.

## Problem Constraints

*   `1 <= size of the array <= 1000000`

## Input Format

The first argument is an array of digits (integers).

## Output Format

Return the array of digits after adding one, without leading zeros.

## Example Input

**Input 1:**

[1, 2, 3]

## Example Output

**Output 1:**
[1, 2, 4]

## Example Explanation

**Explanation 1:**
Given vector is `[1, 2, 3]`, which represents the number 123. The returned vector should be `[1, 2, 4]`, representing 123 + 1 = 124.
