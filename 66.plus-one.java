/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {
  public int[] plusOne(int[] digits) {
    // Check for special case (i.e [9, 9, 9] )
    boolean needMoreDigits = true;
    for (int i = 0; i < digits.length; i++) {
      if (digits[i] != 9) needMoreDigits = false;
    }
    if (needMoreDigits) {
      // Need more digits
      int[] res = new int[digits.length + 1];
      res[0] = 1;
      return res;
    } else {
      // Do not need more digits
      int sum = 0, i = digits.length - 1, carry = (digits[i] + 1) / 10;
      digits[i] = (digits[i] + 1) % 10;
      while (carry > 0 && --i >= 0) {
        sum = digits[i] + carry;
        digits[i] = sum % 10;
        carry = sum / 10;
      }
      return digits;
    }
  }
}
// @lc code=end

// class Test {
//   public static void main(String[] args) {
//     int[] digits = {4, 3, 9, 9};
//     Solution s = new Solution();
//     int[] res = s.plusOne(digits);
//     System.out.print(res);
//     return;
//   }
// }
