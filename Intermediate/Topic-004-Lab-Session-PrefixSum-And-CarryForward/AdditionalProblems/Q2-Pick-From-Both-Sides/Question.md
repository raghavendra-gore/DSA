# Maximum Sum of Elements Removed from Ends of Array

## Problem Description

You are given an integer array `A` of size `N`.

You have to perform `B` operations. In one operation, you can remove either the leftmost or the rightmost element of the array `A`.

Find and return the maximum possible sum of the `B` elements that were removed after the `B` operations.

**NOTE:** Suppose `B = 3`, and array `A` contains 10 elements, then you can:

*   Remove 3 elements from front and 0 elements from the back, OR
*   Remove 2 elements from front and 1 element from the back, OR
*   Remove 1 element from front and 2 elements from the back, OR
*   Remove 0 elements from front and 3 elements from the back.

In general, if you pick `X` elements from the front, you must pick `B - X` elements from the back. The number of front elements `X` can range from `0` to `B`.

## Problem Constraints

*   `1 <= N <= 10^5`
*   `1 <= B <= N`
*   `-10^3 <= A[i] <= 10^3`

## Input Format

*   First argument is an integer array `A`.
*   Second argument is an integer `B`.

## Output Format

Return an integer denoting the maximum possible sum of elements you removed.

## Example Input

### Input 1:

A = [5, -2, 3, 1, 2]
B = 3

### Input 2:
A = [2, 3, -1, 4, 2, 1]
B = 4

## Example Output

### Output 1:
8

### Output 2:
9

## Example Explanation

### Explanation 1:
Possible combinations for `B=3`:
*   (Front: 3, Back: 0): Sum = $5 + (-2) + 3 = 6$
*   (Front: 2, Back: 1): Sum = $5 + (-2) + 2 = 5$
*   (Front: 1, Back: 2): Sum = $5 + 1 + 2 = 8$
*   (Front: 0, Back: 3): Sum = $(-2) + 3 + 1 = 2$

Remove element 5 from the front and elements (1, 2) from the back to get the maximum sum $5 + 1 + 2 = 8$.

### Explanation 2:
Remove the first element (2) and the last 3 elements (4, 2, 1). So the sum is $2 + 4 + 2 + 1 = 9$.
