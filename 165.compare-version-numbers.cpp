/*
 * @lc app=leetcode id=165 lang=cpp
 *
 * [165] Compare Version Numbers
 */

// @lc code=start
#include <sstream>
#include <string>
#include <vector>
using namespace std;
class Solution {
 public:
  int compareVersion(string version1, string version2) {
    istringstream isstream1(version1), isstream2(version2);
    string temp = "";
    vector<string> ver1, ver2;
    int val1 = 0, val2 = 0;
    while (getline(isstream1, temp, '.')) {
      ver1.push_back(temp);
    }
    while (getline(isstream2, temp, '.')) {
      ver2.push_back(temp);
    }
    int max_length = max(ver1.size(), ver2.size());
    for (int i = 0; i < max_length; i++) {
      if (i < ver1.size()) {
        val1 = stoi(ver1[i]);
      }
      if (i < ver2.size()) {
        val2 = stoi(ver2[i]);
      }
      if (val1 > val2) {
        return 1;
      } else if (val1 < val2) {
        return -1;
      }
      val1 = val2 = 0;
    }
    return 0;
  }
};
// @lc code=end
