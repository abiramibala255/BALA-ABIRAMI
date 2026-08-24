// Last updated: 8/24/2026, 10:10:07 AM
1import java.util.*;
2
3class Solution {
4    public List<String> generateParenthesis(int n) {
5        List<String> result = new ArrayList<>();
6        generate("", 0, 0, n, result);
7        return result;
8    }
9
10    private void generate(String current, int open, int close, int n,
11                          List<String> result) {
12
13        // A valid combination is complete
14        if (current.length() == 2 * n) {
15            result.add(current);
16            return;
17        }
18
19        // Add '(' if we still have opening brackets available
20        if (open < n) {
21            generate(current + "(", open + 1, close, n, result);
22        }
23
24        // Add ')' only when it won't make the sequence invalid
25        if (close < open) {
26            generate(current + ")", open, close + 1, n, result);
27        }
28    }
29}
30