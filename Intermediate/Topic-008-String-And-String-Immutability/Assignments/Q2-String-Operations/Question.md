# String Transformation Operations

## Problem Description

Akash enjoys manipulating strings and has defined a specific sequence of three operations to apply to any given input string $A$. The operations must be applied in the following strict order:

1.  **Concatenate:** Append the original string $A$ to itself (resulting in $A + A$).
2.  **Delete Uppercase:** Remove all uppercase letters from the concatenated string.
3.  **Replace Vowels:** Replace every remaining vowel ('a', 'e', 'i', 'o', 'u') with the '#' character.

You are given an initial string $A$ of size $N$ consisting of both lowercase and uppercase alphabets. Your task is to return the resultant string after performing these operations sequentially.

**NOTE:** The vowels are strictly defined as: `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`.

## Problem Constraints

*   `1 <= N <= 100000`

## Input Format

The first and only argument is a string `A` of size `N`.

## Output Format

Return the final modified string after applying all operations.

## Example Inputs and Outputs

### Example 1

**Input:**

A="aeiOUz"

**Output:**
"###z###z"

**Explanation:**
1.  **Concatenate:** `"aeiOUz"` becomes `"aeiOUzaeiOUz"`.
2.  **Delete Uppercase:** `"aeiOUzaeiOUz"` becomes `"aeizaeiz"`.
3.  **Replace Vowels:** `"aeizaeiz"` becomes `"###z###z"`.

### Example 2

**Input:**
A="AbcaZeoB"

**Output:**
"bc###bc###"

**Explanation:**
1.  **Concatenate:** `"AbcaZeoB"` becomes `"AbcaZeoBAbcaZeoB"`.
2.  **Delete Uppercase:** `"AbcaZeoBAbcaZeoB"` becomes `"bcaeobcaeo"`.
3.  **Replace Vowels:** `"bcaeobcaeo"` becomes `"bc###bc###"`.