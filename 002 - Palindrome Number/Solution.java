/*
LeetCode 9 - Palindrome Number

Given an integer x, return true if x reads the same from left to right and
from right to left. Otherwise, return false.

Example 1:
Input: x = 121
Output: true

Example 2:
Input: x = -121
Output: false

Example 3:
Input: x = 10
Output: false

Constraints:
- -2^31 <= x <= 2^31 - 1
*/

class Solution {
    public boolean isPalindrome(int x) {

        if (x<0) {
            return false;
        }

        int originale = x;
        int invertito = 0;

        while(x>0) {
            int last = x % 10;
            invertito = invertito * 10 + last;
            x = x/10;
        }

        return originale == invertito;
    }
}