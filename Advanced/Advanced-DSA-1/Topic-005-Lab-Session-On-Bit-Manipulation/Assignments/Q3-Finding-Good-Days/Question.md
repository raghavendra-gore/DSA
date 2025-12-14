# Problem: Boomer's Food Stash (Counting Days Boomer Was Well Behaved)

## Problem Description

Alex has a cat named Boomer. He decides to put his cat to the test for eternity.

He starts on day 1 with one stash of food unit (worth $2^0 = 1$ unit). Every next day, the stash doubles in worth. The stash produced on Day $N$ is worth $2^{N-1}$ units.

If Boomer is well behaved during a particular day, only then she receives food worth equal to the stash produced on that day.

Boomer receives a net worth of `A` units of food in total. What is the number of days she received the stash?

## Problem Constraints

*   `1 <= A <= 2^31 - 1` (Standard non-negative integer range for a 32-bit signed integer)

## Input Format

First and only argument is an integer `A`.

## Output Format

Return an integer denoting the number of days Boomer was well behaved.

## Example Input

**Input 1:**
`A = 5`

**Input 2:**
`A = 8`

## Example Explanation

**Explanation 1:**
To eat a total of 5 units of food, Boomer behaved normally on Day 1 and on Day 3.
Day 1 stash = $2^0 = 1$.
Day 2 stash = $2^1 = 2$.
Day 3 stash = $2^2 = 4$.
Total food received = $1 + 4 = 5$.
Number of days behaved = 2.

**Explanation 2:**
To eat a total of 8 units of food, Boomer behaved normally only on Day 4.
Day 4 stash = $2^3 = 8$.
Total food received = 8.
Number of days behaved = 1.