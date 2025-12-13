# Count Occurrences of "bob"

This repository provides solutions to count the number of occurrences of the substring `"bob"` within a given input string `A`.

## Problem Description

Find the number of occurrences of the exact substring `"bob"` in string `A` consisting only of lowercase English alphabets.

## Problem Constraints

*   `1 <= |A| <= 1000` (Length of the input string is between 1 and 1000)

## Input Format

The first and only argument contains the string `A`, consisting of lowercase English alphabets.

## Output Format

Return an integer representing the total count of the substring `"bob"`.

## Example Input

### Input 1:

"abobc"

### Input 2:
"bobob"

## Example Output

### Output 1:
1

### Output 2:
2

## Explanation

### Explanation 1:
The only occurrence is at index 1 ("**bob**c").

### Explanation 2:
`"bobob"`:
*   Occurrence 1 at index 0 ("**bob**ob")
*   Occurrence 2 at index 2 ("bo**bob**")