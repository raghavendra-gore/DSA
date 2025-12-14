# Set the A-th and B-th Bits in Zero

## Problem Description

You are given two integer positions, `A` and `B`.
Set the `A`-th bit and the `B`-th bit in an initial value of 0, and return the output in the decimal number system.

**Note:**
The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.

## Problem Constraints

*   `0 <= A <= 30`
*   `0 <= B <= 30`

## Input Format

*   First argument `A` is an integer representing a bit position.
*   Second argument `B` is an integer representing another bit position.

## Output Format

Return a single integer (decimal value) representing the number with only the `A`-th and `B`-th bits set.

## Example Input

**Input 1:**

A = 3
B = 5

**Input 2:**

A = 4
B = 4

## Example Output

**Output 1:**

40

**Output 2:**

16

## Example Explanation

**Explanation 1:**
We start with 0 in binary.
Setting the 3rd bit (index 3) gives `1000` (decimal 8).
Setting the 5th bit (index 5) in that number gives `101000` (decimal 40).

**Explanation 2:**
We start with 0 in binary.
Setting the 4th bit (index 4) gives `10000` (decimal 16).
Setting the 4th bit again has no effect. The result is `10000` (decimal 16).

