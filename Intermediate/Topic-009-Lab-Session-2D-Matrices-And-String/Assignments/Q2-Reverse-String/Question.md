# Reverse String Words

## Problem Description

You are given a string `A` of size `N`. The goal is to reverse the order of the words within the string.

### Key Requirements:

*   A word is defined as a sequence of non-space characters.
*   The resulting reversed string must adhere to specific formatting rules:
    *   No leading or trailing spaces.
    *   Multiple spaces between words in the input should be reduced to a single space in the output.

## Constraints

*   `1 <= N <= 3 * 10^5`

## Input Format

The only argument given is the input string `A`.

## Output Format

Return the string `A` after reversing the string word by word, following the formatting rules.

## Example Input and Output

### Example 1

**Input:**
`A = "the sky is blue"`

**Output:**
`"blue is sky the"`

### Example 2

**Input:**
`A = "this is ib"`

**Output:**
`"ib is this"`