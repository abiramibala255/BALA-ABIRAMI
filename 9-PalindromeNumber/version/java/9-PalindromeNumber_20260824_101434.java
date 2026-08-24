// Last updated: 8/24/2026, 10:14:34 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3        // Negative numbers are not palindromes
4        if (x < 0) {
5            return false;
6        }
7
8        int original = x;
9        int reversed = 0;
10
11        while (x > 0) {
12            int digit = x % 10;
13            reversed = reversed * 10 + digit;
14            x /= 10;
15        }
16
17        return original == reversed;
18    }
19}
20