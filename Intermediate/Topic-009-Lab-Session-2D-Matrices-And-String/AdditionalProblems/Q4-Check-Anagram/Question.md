# Anagram Checker

This project provides a solution to determine if two given strings are anagrams of each other.

## Problem Description

You are given two lowercase strings, $A$ and $B$, each of length $N$. The task is to determine if they are anagrams.

- Return `1` if they are anagrams.
- Return `0` if they are not.

**Note:** Two strings are considered anagrams if one can be formed by rearranging the letters of the other. Crucially, this implies they must contain the exact same characters with the same frequencies.

### Constraints

*   `1 <= N <= 10^5` (Length of the strings)
*   $A$ and $B$ consist of lowercase English letters only.

### Input Format

Both arguments $A$ and $B$ are strings.

### Output Format

Return `1` if they are anagrams and `0` if not.

## Example Input and Output

### Input 1:

A = "cat"
B = "bat"

### Output 1:
0

**Explanation 1:**
The words cannot be rearranged to form the same word because the character counts are different ('c' vs 'b'). They are not anagrams.

### Input 2:
A = "secure"
B = "rescue"

### Output 2:
1

**Explanation 2:**
The letters in "rescue" can be rearranged to form "secure". They are an anagram.
