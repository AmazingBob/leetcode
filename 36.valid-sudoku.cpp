/*
 * @lc app=leetcode id=36 lang=cpp
 *
 * [36] Valid Sudoku
 */

// @lc code=start
#include <iostream>
#include <vector>
using namespace std;

static auto row = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

static auto col = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

static auto box = []() {
  std::ios::sync_with_stdio(false);
  std::cin.tie(NULL);
  return 0;
}();

class Solution {
 public:
  bool isValidSudoku(vector<vector<char>>& board) {
    int row[9][9] = {0};
    int col[9][9] = {0};
    int box[9][9] = {0};
    for (size_t row_index = 0; row_index < 9; row_index++) {
      for (size_t col_index = 0; col_index < 9; col_index++) {
        if (board[row_index][col_index] == '.') continue;
        int current_num = board[row_index][col_index] - '0';
        if (row[row_index][current_num - 1]) return false;
        if (col[col_index][current_num - 1]) return false;
        if (box[(row_index / 3) * 3 + col_index / 3][current_num - 1])
          return false;
        row[row_index][current_num - 1]++;
        col[col_index][current_num - 1]++;
        box[(row_index / 3) * 3 + col_index / 3][current_num - 1]++;
      }
    }
    return true;
  }
};
// @lc code=end
