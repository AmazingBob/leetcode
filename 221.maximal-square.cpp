/*
 * @lc app=leetcode id=221 lang=cpp
 *
 * [221] Maximal Square
 */

// @lc code=start
#include <vector>
using namespace std;
class Solution {
 private:
  int maximalSquareDP1(vector<vector<char>>& matrix) {
    if (matrix.empty()) return 0;
    int m = matrix.size(), n = matrix[0].size();
    vector<vector<int>> dp(m + 1, vector<int>(n + 1, 0));
    int maxSquareLen = 0;
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] == '1') {
          dp[i + 1][j + 1] = min(min(dp[i][j + 1], dp[i + 1][j]), dp[i][j]) + 1;
        }
        maxSquareLen = max(maxSquareLen, dp[i + 1][j + 1]);
      }
    }
    return maxSquareLen * maxSquareLen;
  }
  int maximalSquareDP2(vector<vector<char>>& matrix) {
    if (!matrix.size()) return 0;
    const int rows = matrix.size(), columns = matrix[0].size();
    vector<vector<int>> dp(2, vector<int>(columns + 1, 0));
    int longestSide = 0, previousRow = 0, currentRow = 1;
    for (int r = 1; r <= rows; r++) {
      currentRow = r & 1;
      for (int c = 1; c <= columns; c++) {
        if (matrix[r - 1][c - 1] == '0') {
          dp[currentRow][c] = 0;
        } else {
          int side = 1 + min(dp[previousRow][c - 1], min(dp[previousRow][c], dp[currentRow][c - 1]));
          longestSide = max(longestSide, side);
          dp[currentRow][c] = side;
        }
      }
      previousRow = currentRow;
    }
    return longestSide * longestSide;
  }

 public:
  int maximalSquare(vector<vector<char>>& matrix) {}
};
// @lc code=end
