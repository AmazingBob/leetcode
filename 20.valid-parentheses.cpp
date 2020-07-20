/*
 * @lc app=leetcode id=20 lang=cpp
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
public:
    bool isValid(string s) {
        if (s.size() % 2 != 0) {
            return false;
        }
        if (s.empty()) {
            return true;
        }
        stack<char> stk;
        for (int i = 0; i < s.size(); i++) {
            switch (s[i]) {
                case '(':
                    stk.push(')');
                    break;
                case '[':
                    stk.push(']');
                    break;
                case '{':
                    stk.push('}');
                    break;
                default:
                    if (stk.empty() || s[i] != stk.top()) {
                        return false;
                    }
                    stk.pop();
                    break;
            }
        }
        return stk.empty();
    }
};
// @lc code=end
