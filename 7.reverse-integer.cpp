/*
 * @lc app=leetcode id=7 lang=cpp
 *
 * [7] Reverse Integer
 */

// @lc code=start
#include <iostream>
using namespace std;

class Solution {
 public:
  int reverse(int x) {
    int res = 0, flag = -1;
    if (x == INT_MIN) {
      return 0;
    }
    if(x<0){
      flag=1;
      x=abs(x);
    }
    while (x>0)
    {
      if (res>INT_MAX/10)
      {
        return 0;
      }
      res=res*10+x%10;
      x/=10;
    }
    if (flag==1)
    {
      res=-1*res;
    }
    return res;
  }
};
// @lc code=end
