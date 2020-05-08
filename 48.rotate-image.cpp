/*
 * @lc app=leetcode id=48 lang=cpp
 *
 * [48] Rotate Image
 */

// @lc code=start
#include <vector>
using namespace std;
class Solution {
 public:
  void rotate(vector<vector<int>>& matrix) {
    if (matrix.size() == 0) return;
    int n_row = matrix.size();
    int n_col = matrix.size();
    for (size_t i = 0; i < n_row; i++) {
      for (size_t j = i + 1; j < n_col; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
      }
    }
    for (size_t i = 0; i < n_row; i++) {
      for (size_t j = 0; j < n_col / 2; j++) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n_col - j - 1];
        matrix[i][n_col - j - 1] = temp;
      }
    }
  }
};
// @lc code=end
