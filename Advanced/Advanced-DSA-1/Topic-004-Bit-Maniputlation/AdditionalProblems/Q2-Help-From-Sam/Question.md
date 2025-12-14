# Problem: Minimum Help to Achieve a Target Score

## Problem Description

Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target score of A for himself.
Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's score. Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.

Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.

## Problem Constraints

0 <= A <= 10^9

## Input Format

The only argument given is an integer A.

## Output Format

Return the minimum number of times help taken from Sam.

## Example Input

Input 1:

A = 5

Input 2:

A = 3

## Example Explanation

**Explanation 1:**

Initial score : 0
1. Takes help from Sam, score : 1
2. Alex solves a question, score : 2
3. Alex solves a question, score : 4
4. Takes help from Sam, score: 5
   Total Sam's help: 2

**Explanation 2:**

Initial score : 0
1. Takes help from Sam, score : 1
2. Alex solves a question, score : 2
3. Takes help from Sam, score: 3
   Total Sam's help: 2