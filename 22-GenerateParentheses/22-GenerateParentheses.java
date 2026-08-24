// Last updated: 8/24/2026, 10:10:36 AM
import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate("", 0, 0, n, result);
        return result;
    }

    private void generate(String current, int open, int close, int n,
                          List<String> result) {

        // A valid combination is complete
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        // Add '(' if we still have opening brackets available
        if (open < n) {
            generate(current + "(", open + 1, close, n, result);
        }

        // Add ')' only when it won't make the sequence invalid
        if (close < open) {
            generate(current + ")", open, close + 1, n, result);
        }
    }
}
