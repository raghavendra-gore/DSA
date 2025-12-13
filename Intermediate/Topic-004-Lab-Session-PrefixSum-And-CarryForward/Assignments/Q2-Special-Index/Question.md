# Count Special Indices (Equilibrium of Even/Odd Sums)

## Problem Description

Given an array `A` of size `N`, the task is to find the count of "special" indices. A special index is an index `i` such that if the element `A[i]` is removed from the array, the sum of all elements at the remaining **even-indexed** positions becomes equal to the sum of all elements at the remaining **odd-indexed** positions.

Note that removing an element shifts the indices of all subsequent elements.

## Problem Constraints

*   `1 <= N <= 10^5`
*   `-10^5 <= A[i] <= 10^5`
*   The sum of all elements fits within standard integer types (e.g., up to $10^9$).

## Input Format

*   **First argument `A`**: An array (or list) of integers of size `N`.

## Output Format

Return an integer representing the count of special indices.

## Example Input and Output

### Input 1

A = [2, 1, 6, 4]

### Output 1

1

### Explanation 1

If we remove `A[1]` (which is 1), the remaining array is `{ 2, 6, 4 }`.
The new even-indexed sum is `2 (idx 0) + 4 (idx 2) = 6`.
The new odd-indexed sum is `6 (idx 1) = 6`.
The sums are equal, so index 1 is a special index.

### Input 2

A = [1, 1, 1]

### Output 2

3

### Explanation 2

Removing any element results in an array `{1, 1}` where the even sum (`1`) equals the odd sum (`1`).

