# Longest Consecutive 1's with One Swap

## Problem Description

Given a binary string `A` consisting of only '0's and '1's. You are allowed to perform at most one swap between any '0' and any '1' character in the string. The objective is to find and return the length of the longest possible sequence of consecutive '1's that can be achieved after performing this single potential swap.

## Constraints

*   `1 <= length of string A <= 1,000,000`
*   String `A` contains only characters '0' and '1'.

## Input Format

The only argument given is the binary string `A`.

## Output Format

Return an integer representing the length of the longest consecutive '1's sequence achievable.

## Example Input and Output

### Example 1

**Input:**
`A = "111000"`

**Output:**
`3`

**Explanation 1:**
You can swap one '0' with one of the '1's, but the maximum sequence of '1's remains 3.

### Example 2

**Input:**
`A = "111011101"`

**Output:**
`7`

**Explanation 2:**
Swapping the first '0' with the '1' at the end or vice-versa connects the two groups of 3 '1's, resulting in a single consecutive sequence of 7 '1's (`"111111101"` or `"111011111"`).
