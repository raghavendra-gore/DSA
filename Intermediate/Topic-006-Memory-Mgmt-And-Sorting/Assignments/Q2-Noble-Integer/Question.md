# Problem Title: Special Integer (Noble Integer)

## Problem Description

Given an integer array `A`, find if an integer `p` exists in the array such that the number of integers smaller than `p` in the array equals `p`.

If such an integer `p` is present, it is often referred to as a "Noble Integer" or "Special Integer".

## Problem Constraints

*   `1 <= |A| <= 2*10^5` (The array size is between 1 and 200,000)
*   `-10^8 <= A[i] <= 10^8` (Array elements range from -100 million to 100 million)

## Input Format

The first and only argument is an integer array `A`.

## Output Format

Return `1` if any such integer `p` is present, else, return `-1`.

## Example Input

### Input 1:

A = [3, 2, 1, 3]

### Input 2:

A = [1, 1, 3, 3]

## Example Output

### Output 1:

1

### Output 2:

-1

## Example Explanation

### Explanation 1:

For the integer `p = 2`, there are exactly 2 greater elements in the array (the two `3`s). Thus, the condition is met, and we return `1`.

### Explanation 2:

There exists no integer `p` in the array `A` satisfying the required condition (number of elements greater than `p` equals `p`). Thus, we return `-1`.
