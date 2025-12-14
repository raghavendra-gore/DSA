# Problem: Unset Rightmost B Bits

## Problem Description

Given an integer A. Unset (set to zero) B bits from the right of A in its binary representation.

For example, if A = 93 and B = 4, the binary representation of A is `1011101`.
If we unset the rightmost 4 bits, we get the binary number `1010000`, which is equal to the decimal value 80.

## Problem Constraints

*   `1 <= A <= 10^18`
*   `1 <= B <= 60`

## Input Format

The first argument is a single integer A.
The second argument is a single integer B.

## Output Format

Return the number with B unset bits from the right.

## Example Input

**Input 1:**
`A = 25`
`B = 3`

**Input 2:**
`A = 37`
`B = 3`

## Example Output

**Output 1:**
`24`

**Output 2:**
`32`

## Example Explanation

**Explanation 1:**
A = 25 is `11001` in binary. Unsetting the rightmost 3 bits gives `11000` (binary) which is 24 (decimal).

**Explanation 2:**
A = 37 is `100101` in binary. Unsetting the rightmost 3 bits gives `100000` (binary) which is 32 (decimal).
