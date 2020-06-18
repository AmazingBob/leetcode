/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
  public boolean validPalindrome(String s) {
    int ptrL = 0;
    int ptrR = s.length() - 1;
    while(ptrL < ptrR){
      if (s.charAt(ptrL) != s.charAt(ptrR)){
        return isPalindrome(s, ptrL + 1, ptrR) || isPalindrome(s, ptrL, ptrR - 1);
      }
      ++ptrL;
      --ptrR;
    }
    return true;
  }
  private boolean isPalindrome(String s, int start, int end){
    while (start < end){
      if (s.charAt(start++) != s.charAt(end--)) return false;
    }
    return true;
  }
}
// @lc code=end
