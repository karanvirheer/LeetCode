/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{'){
                stack.push('}');
            }
            else if (c == '('){
                stack.push(')');
            }
            else if (c == '['){
                stack.push(']');
            }
            else if (stack.empty() || stack.pop() != c){
                return false;
            }
        }
        return stack.empty();
    }
}

// @lc code=end
