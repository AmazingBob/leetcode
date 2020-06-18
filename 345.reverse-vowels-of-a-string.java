import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
  private static final HashSet<Character> vowels =
      new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

  public String reverseVowels(String s) {
    // Corner case
    if (s == null) return null;
    // Double pointer
    int ptrL = 0, ptrR = s.length() - 1;
    char[] res = new char[s.length()];
    while (ptrL <= ptrR) {
      char charL = s.charAt(ptrL);
      char charR = s.charAt(ptrR);
      if (!vowels.contains(charL)) res[ptrL++] = charL;
      if (!vowels.contains(charR)) res[ptrR--] = charR;
      // Exchange
      if (vowels.contains(charL) && vowels.contains(charR)) {
        res[ptrL++] = charR;
        res[ptrR--] = charL;
      }
    }
    return new String(res);
  }
}
// @lc code=end