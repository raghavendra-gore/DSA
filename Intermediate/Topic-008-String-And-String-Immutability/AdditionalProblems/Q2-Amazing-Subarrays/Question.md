# Count Amazing Substrings

This repository provides a solution to count the number of "amazing substrings" in a given string `S`, where an amazing substring is defined as one that starts with a vowel. The final count must be returned modulo 10003.

## Problem Description

You are given a string `S`, and you have to find all the amazing substrings of `S`.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

## Input Format

Only argument given is string `S`.

## Output Format

Return a single integer `X mod 10003`, where `X` is the total number of Amazing Substrings in the given string.

## Constraints

*   `1 <= length(S) <= 1e6`
*   `S` can have special characters (though the examples suggest we only care about standard English vowels).

## Example

### Input

ABEC

### Output
6

### Explanation

Amazing substrings of given string are:
1.  `A`
2.  `AB`
3.  `ABE`
4.  `ABEC`
5.  `E`
6.  `EC`

The total number of substrings is 6, and $6 \pmod{10003} = 6$.