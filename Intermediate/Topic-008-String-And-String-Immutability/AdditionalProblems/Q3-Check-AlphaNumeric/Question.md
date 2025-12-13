# Check if AlphaNumeric (isalpha replacement)

This repository contains solutions for implementing a function that verifies if all characters in a given character array are alphanumeric (a-z, A-Z, 0-9).

## Problem Description

You are given a character array `A`. The goal is to return `1` if all characters within the array are alphanumeric, and `0` otherwise.

Alphanumeric characters include:
*   Lowercase letters (`a` through `z`)
*   Uppercase letters (`A` through `Z`)
*   Digits (`0` through `9`)

## Problem Constraints

*   `1 <= |A| <= 10^5` (Length of the array `A` is between 1 and 100,000)

## Input Format

The only argument provided is a character array `A`.

## Output Format

Return `1` if all characters are alphanumeric, else return `0`.

## Example Input

### Input 1:

A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']

### Input 2:
A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']

## Example Output

### Output 1:
1

### Output 2:
0

## Explanation

### Explanation 1:
All the characters in the array are alphanumeric (letters or digits).

### Explanation 2:
The array contains a non-alphanumeric character (`#`), so the condition fails.
