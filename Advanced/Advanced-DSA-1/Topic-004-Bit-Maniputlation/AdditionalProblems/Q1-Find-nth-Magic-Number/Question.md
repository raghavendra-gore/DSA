# Find the A-th Magic Number

## Problem Description

Given an integer `A`, find and return the `A`-th magic number.

A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.

The first few magic numbers in increasing order are:
*   $1^{st}$: $5^1 = 5$
*   $2^{nd}$: $5^2 = 25$
*   $3^{rd}$: $5^1 + 5^2 = 30$
*   $4^{th}$: $5^3 = 125$
*   $5^{th}$: $5^3 + 5^1 = 130$
*   ...and so on.

## Problem Constraints

*   `1 <= A <= 5000`

## Input Format

The only argument given is an integer `A` (the index of the magic number to find).

## Output Format

Return the `A`-th magic number as an integer.

## Example Input

**Example Input 1:**

A = 3

**Example Input 2:**

A = 10

## Example Output

**Example Output 1:**

30

**Example Output 2:**

650

## Example Explanation

**Explanation 1:**
The magic numbers in increasing order are `[5, 25, 30, 125, 130, ...]`. The 3rd element in this sequence is 30.

**Explanation 2:**
In the sequence, the 10th element will be 650. (Note: 650 is $625 + 25 = 5^4 + 5^2$).
