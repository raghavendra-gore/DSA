# Sum of Elements at Even Indices within Range Queries

## Problem Description

You are given an integer array `A` of size `N` and a 2D array `B` of size `Q`, where each row `B[i]` contains two integers `B[i][0]` and `B[i][1]`, representing a range `[L, R]`.

For each query in `B`, the task is to calculate the sum of elements in `A` that fall at **EVEN indices** within the specified range `[L, R]`, inclusive. The results for all queries should be returned as an array.

## Constraints

*   `1 <= N <= 10^5`
*   `-10^5 <= A[i] <= 10^5`
*   `1 <= Q <= 10^5`
*   `0 <= B[i][0], B[i][1] < N`
*   `B[i][0] <= B[i][1]`

## Input Format

*   **First Argument `A`**: A list (or array) of integers representing the main array.
*   **Second Argument `B`**: A 2D list (or array) where each sublist `B[i]` contains two integers `L` and `R`, representing the start and end indices of the query range.

## Output Format

Return a list (or array) of integers where each integer is the result of the sum of elements at even indices in the range `[L, R]` for that respective query.

## Example Input and Output

### Input 1

A = [2, 8, 3, 9, 15]
B = [ [1, 4],
[0, 2],
[2, 3] ]

### Output 1

[18, 5, 3]

### Explanation 1

*   **Query 1:** Range `[1, 4]` -> Even indices within range are `2` and `4`. Sum = `A[2]` + `A[4]` = `3` + `15` = `18`.
*   **Query 2:** Range `[0, 2]` -> Even indices within range are `0` and `2`. Sum = `A[0]` + `A[2]` = `2` + `3` = `5`.
*   **Query 3:** Range `[2, 3]` -> Even index within range is `2`. Sum = `A[2]` = `3`.

### Input 2

A = [5, 15, 25, 35, 45]
B = [ [1, 1],
[0, 0] ]

### Output 2

[0, 5]

### Explanation 2

*   **Query 1:** Range `[1, 1]` -> No even indices within the range. Sum = `0`.
*   **Query 2:** Range `[0, 0]` -> Even index within range is `0`. Sum = `A[0]` = `5`.