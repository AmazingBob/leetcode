/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
  public String addBinary(String a, String b) {
    int aIdx = a.length() - 1, bIdx = b.length() - 1, carryOver = 0;
    StringBuilder sb = new StringBuilder();
    while(aIdx >= 0 || bIdx >= 0){
        int sum = carryOver;
        if(aIdx >= 0) sum += (a.charAt(aIdx--) - '0');
        if(bIdx >= 0) sum += (b.charAt(bIdx--) - '0');
        sb.append(sum & 1);
        carryOver = sum >> 1;
    }
    if(carryOver == 1) sb.append(carryOver);
    return sb.reverse().toString();
  }
}
// @lc code=end

// class Test {
//   public static void main(String[] args) {
//     String a = "11", b = "1";
//     Solution s = new Solution();
//     String res = s.addBinary(a, b);
//     System.out.print(res);
//     return;
//   }
// }