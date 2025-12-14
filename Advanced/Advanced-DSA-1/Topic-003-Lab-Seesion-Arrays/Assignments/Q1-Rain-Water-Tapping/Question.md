# Rain Water Trapped

## Problem Description

Imagine a histogram where the bars' heights are given by an array `A`. Each bar is of uniform width, which is 1 unit. When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the total amount of water that can be trapped in these valleys.

For example, given the array `A = [5, 4, 1, 4, 3, 2, 7]`, the total amount of rain water trapped is 11.

![Rain Water Trapped Visualization](i.imgur.com)
*(Note: Replace the image link with an actual visualization if you have one hosted.)*

## Problem Constraints

*   `1 <= |A| <= 10^5`
*   `0 <= A[i] <= 10^5`

## Input Format

The first and only argument is the Integer Array, `A`.

## Output Format

Return an Integer, denoting the total amount of water that can be trapped in these valleys.

## Example Inputs & Outputs

### Example 1

**Input:**
`A = [0, 1, 0, 2]`

**Output:**
`1`

**Explanation 1:**
1 unit is trapped on top of the 3rd element.

### Example 2

**Input:**
`A = [1, 2]`

**Output:**
`0`

**Explanation 2:**

![Rain Water Trapped](i.imgur.com)

No water is trapped as the bars only increase in height or are monotonic.
