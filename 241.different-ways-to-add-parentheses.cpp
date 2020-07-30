/*
 * @lc app=leetcode id=241 lang=cpp
 *
 * [241] Different Ways to Add Parentheses
 */

// @lc code=start
#include <functional>
#include <iostream>
#include <string>
#include <unordered_map>
#include <vector>
using namespace std;

namespace operations {
int add(int a, int b) { return a + b; }
int minus(int a, int b) { return a - b; }
int mult(int a, int b) { return a * b; }
}  // namespace operations

class Solution {
 public:
  vector<int> diffWaysToCompute(string input) { return ways(input); }

 private:
  const vector<int>& ways(const string& input) {
    std::ios::sync_with_stdio(false);
    std::cin.tie(0);

    if (m_.count(input)) return m_[input];
    vector<int> ans;
    for (int i = 0; i < input.length(); i++) {
      char op = input[i];
      if (op == '+' || op == '-' || op == '*') {
        const string left = input.substr(0, i);
        const string right = input.substr(i + 1);

        const vector<int>& l = ways(left);
        const vector<int>& r = ways(right);

        std::function<int(int, int)> f;

        switch (op) {
          case '+':
            f = operations::add;
            break;
          case '-':
            f = operations::minus;
            break;
          case '*':
            f = operations::mult;
            break;
        }

        for (int a : l) {
          for (int b : r) {
            ans.push_back(f(a, b));
          }
        }
      }
    }

    if (ans.empty()) {
      ans.push_back(std::stoi(input));
    }
    return m_[input] = ans;
  }
  unordered_map<string, vector<int>> m_;
};
// @lc code=end
