# Problem: Check for a "Good Pair" with a Target Sum

## Description

Given an array `A` of integers and a target integer `B`, determine if there exists a pair of distinct indices `(i, j)` in the array such that the sum of the elements at those indices equals `B` (`A[i] + A[j] == B`).

## Constraints

*   `1 <= A.size() <= 10^4` (Array size)
*   `1 <= A[i] <= 10^9` (Value of elements)
*   `1 <= B <= 10^9` (Target sum)

## Input Format

*   First argument is an integer array `A`.
*   Second argument is an integer `B` (the target sum).

## Output Format

Return an integer:
*   **`1`** if a good pair exists.
*   **`0`** otherwise.

## Examples

### Input 1:

A = [1, 2, 3, 4]
B = 7

### Output 1:

1

### Explanation 1:

The pair of elements `(3, 4)` sums to 7. (Using 0-based indexing, elements at indices 2 and 3 sum to 7).

### Input 2:

A = [1, 2, 4]
B = 4

### Output 2:

0

### Explanation 2:

No pair of distinct elements in the array sums exactly to 4.

### Input 3:

A = [1, 2, 2]
B = 4

### Output 3:

1

### Explanation 3:

The pair of elements `(2, 2)` sums to 4. (Using 0-based indexing, elements at indices 1 and 2 sum to 4).
