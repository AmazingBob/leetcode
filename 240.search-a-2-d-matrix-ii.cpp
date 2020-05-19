/*
 * @lc app=leetcode id=240 lang=cpp
 *
 * [240] Search a 2D Matrix II
 */

// @lc code=start
#include <vector>
using namespace std;
class Solution {
 public:
  bool searchMatrix(vector<vector<int>>& matrix, int target) {
    if (!matrix.size() || !matrix[0].size()) return false;
    int curRow = 0, curCol = matrix[0].size() - 1;
    while (curRow < matrix.size() && curCol >= 0) {
      if (matrix[curRow][curCol] == target) return true;
      if (matrix[curRow][curCol] > target)
        --curCol;
      else
        ++curRow;
    }
    return false;
  }
};
// @lc code=end
