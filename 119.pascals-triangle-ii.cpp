/*
 * @lc app=leetcode id=119 lang=cpp
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
/*
 * @lc app=leetcode id=119 lang=cpp
 *
 * [119] Pascal's Triangle II
 */

// @lc code=star
#include <vector>
using namespace std;
class Solution {
 public:
  vector<int> getRow(int rowIndex) {
    vector<int> result = {1};
    if (rowIndex == 0) return result;
    int temp = 0, val = 1;
    for (int i = 0; i < rowIndex; i++) {
      temp = 1;
      for (int j = 0; j < i; j++) {
        val = result[j + 1] + temp;
        temp = result[j + 1];
        result[j + 1] = val;
      }
      result.push_back(1);
    }
    return result;
  }
};

// Test
// int main() {
//   Solution slt;
//   vector<int> result = slt.getRow(0);
//   return 0;
// }
// @lc code=end

// @lc code=end
