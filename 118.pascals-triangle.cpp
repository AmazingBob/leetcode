/*
 * @lc app=leetcode id=118 lang=cpp
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
#include <vector>
using namespace std;
class Solution {
 public:
  vector<vector<int>> generate(int numRows) {
    vector<vector<int>> result(numRows, vector<int>{1});
    for (int i = 0; i < numRows; i++) {
      for (int j = 1; j <= i; j++) {
        int pre_val = result[i - 1][j - 1];
        int cur_val = j != i ? result[i - 1][j] : 0;
        result[i].push_back(pre_val + cur_val);
      }
    }
    return result;
  }
};
// int main() {
//   Solution slt;
//   vector<vector<int>> result = slt.generate(5);
//   return 1;
// }
// @lc code=end
