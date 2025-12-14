# Minimum Swaps to Bring Elements Together

This project provides a solution to find the minimum number of swaps required to group all elements less than or equal to a given value `B` into a contiguous window within an array `A`.

## Problem Description

Given an array of integers $A$ and an integer $B$, find and return the minimum number of swaps required to bring all the numbers less than or equal to $B$ together.

**Note:** It is possible to swap any two elements, not necessarily consecutive.

## Problem Constraints

*   `1 <= length of the array <= 100000`
*   `-10^9 <= A[i], B <= 10^9`

## Input Format

*   The first argument given is the integer array $A$.
*   The second argument given is the integer $B$.

## Output Format

Return the minimum number of swaps.

## Example Input

**Input 1:**

A = [1, 12, 10, 3, 14, 10, 5]
B = 8

**Input 2:**
A = [5, 17, 100, 11]
B = 20

## Example Output

**Output 1:**
2

**Output 2:**
1

## Example Explanation

**Explanation 1:**
$A =$ ``
After swapping 12 and 3, $A \Rightarrow $ ``.
After swapping the first occurrence of 10 and 5, $A \Rightarrow $ ``.
Now, all elements less than or equal to 8 are together.

**Explanation 2:**
$A = $ ``
After swapping 100 and 11, $A \Rightarrow $ ``.
Now, all elements less than or equal to 20 are together.