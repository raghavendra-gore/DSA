# Longest Palindromic Substring

## Problem Description

Given a string $A$ of size $N$, the goal is to find and return the longest palindromic substring within $A$.

A **substring** of string $A$ is a contiguous sequence of characters $A[i...j]$ where $0 \le i \le j < len(A)$.

A **palindrome** is a string that reads the same forwards and backwards (i.e., `reverse(S) == S`).

**Tie-breaking rule:** In case of a conflict (multiple palindromic substrings have the same maximum length), return the substring which occurs first in the original string (i.e., the one with the least starting index `i`).

## Problem Constraints

*   `1 <= N <= 6000` (The string length is up to 6000 characters)

## Input Format

The first and only argument is a string `A`.

## Output Format

Return a string denoting the longest palindromic substring of string `A`.

## Example Inputs and Outputs

### Example 1

**Input:**

A = "aaaabaaa"

**Output:**
"aaabaaa"

**Explanation:**
The longest palindromic substring has a length of 7. The substring is "aaabaaa" (indices 0 to 6).

### Example 2

**Input:**
A = "abba"

**Output:**
"abba"

**Explanation:**
The longest palindromic substring has a length of 4. The substring is "abba".
