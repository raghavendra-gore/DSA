# Count "AG" Pairs

## Problem Description

You are given a string `A` consisting of uppercase English letters.

The goal is to find the number of pairs `(i, j)` such that:
*   `A[i]` is equal to the character `'A'`
*   `A[j]` is equal to the character `'G'`
*   The index `i` is strictly less than the index `j` (`i < j`)

In essence, you are counting how many times the subsequence "AG" appears in the string.

## Problem Constraints

*   `1 <= length(A) <= 10^5` (The length of the string is up to 100,000)

## Input Format

The first and only argument is a string `A`.

## Output Format

Return a `long` integer (to handle potentially large counts) denoting the answer.

## Example Input

**Input 1:**

A = "ABCGAG"

**Input 2:**

A = "GAB"

## Example Output

**Output 1:**

3

**Output 2:**

0

## Example Explanation

**Explanation 1:**
The subsequence "AG" appears 3 times in the given string. The corresponding index pairs are:
*   `(0, 3)`: `A[0] = 'A'`, `A[3] = 'G'`
*   `(0, 5)`: `A[0] = 'A'`, `A[5] = 'G'`
*   `(4, 5)`: `A[4] = 'A'`, `A[5] = 'G'`

**Explanation 2:**
There is no subsequence "AG" in the given string where 'A' appears before 'G'.