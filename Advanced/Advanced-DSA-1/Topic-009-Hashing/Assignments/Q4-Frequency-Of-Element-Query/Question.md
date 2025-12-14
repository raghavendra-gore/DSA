# Problem Description: Learner Contest Participation Frequency

SCALER organizes a series of contests aimed at helping learners enhance their coding skills. Each learner can participate in multiple contests, and their participation is represented by integers in an array. The goal is to identify how frequently each learner has participated in these contests. This information will help SCALER determine which learners are participating the least, allowing them to provide targeted support and encouragement.

Given an array `A` that represents the participants of various contests, where each integer corresponds to a specific learner, and an array `B` containing the learners for whom you want to check participation frequency, your task is to find the frequency of each learner from array `B` in the array `A` and return a list containing all these frequencies.

## Problem Constraints

*   `1 <= |A| <= 10^5` (Size of array A is between 1 and 100,000)
*   `1 <= |B| <= 10^5` (Size of array B is between 1 and 100,000)
*   `1 <= A[i] <= 10^5` (Learner IDs in A are between 1 and 100,000)
*   `1 <= B[i] <= 10^5` (Learner IDs in B are between 1 and 100,000)

## Input Format

*   First argument `A` is an array of integers representing all participant entries.
*   Second argument `B` is an array of integers denoting the queries (the specific learners whose frequencies need checking).

## Output Format

*   Return an array of integers containing the frequency of each learner in `B` as found in array `A`. The order of frequencies in the output array should match the order of learners in the input array `B`.

## Example Input

### Input 1:

A = [1, 2, 1, 1]
B = [1, 2]

### Input 2:

A = [2, 5, 9, 2, 8]
B = [3, 2]

## Example Output

### Output 1:

[3, 1]

### Output 2:

[0, 2]

## Example Explanation

### For Input 1:

*   The frequency of learner ID `1` in array `A` is 3 (they participated three times).
*   The frequency of learner ID `2` in array `A` is 1 (they participated one time).

### For Input 2:

*   The frequency of learner ID `3` in array `A` is 0 (they did not participate).
*   The frequency of learner ID `2` in array `A` is 2 (they participated two times).