# Toggle the B-th Bit (Set or Unset)

## Problem Description

You are given two integers `A` and `B`.
If the `B`-th bit in `A` is set (1), make it unset (0).
If the `B`-th bit in `A` is unset (0), make it set (1).
In short, toggle the state of the `B`-th bit.

Return the updated `A` value.

## Problem Constraints

*   `1 <= A <= 10^9`
*   `0 <= B <= 30` (Ensures B is a valid bit position for standard 32-bit integers)

## Input Format

*   First argument `A` is an integer.
*   Second argument `B` is an integer representing the bit position (0-indexed).

## Output Format

Return an integer representing the updated value of `A`.

## Example Input

**Input 1:**

A = 4
B = 1

**Input 2:**
A = 5
B = 2

## Example Output

**Output 1:**

6
**Output 2:**

1

## Example Explanation

**Explanation 1:**
Given $A = 4$, which is `100` in binary. The 1st bit (0-indexed) is unset (0). We make it set (1).
The new binary representation is `110`, which is 6 in decimal.

**Explanation 2:**
Given $A = 5$, which is `101` in binary. The 2nd bit (0-indexed) is set (1). We make it unset (0).
The new binary representation is `001`, which is 1 in decimal.