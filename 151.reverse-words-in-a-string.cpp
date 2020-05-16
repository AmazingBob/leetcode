/*
 * @lc app=leetcode id=151 lang=cpp
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
#include <sstream>
#include <stack>
#include <string>
using namespace std;

class Solution {
 public:
  string reverseWords(string s) {
    int j = s.size();
    string result = "";
    for (int i = s.size() - 1; i >= 0; i--) {
      if (s[i] == ' ') {
        j = i;
      } else if (i == 0 || s[i - 1] == ' ') {
        if (result.size() == 0) {
          result = s.substr(i, j - i);
        } else {
          result += " " + s.substr(i, j - i);
        }
      }
    }
    return result;
  }
};
// @lc code=end
