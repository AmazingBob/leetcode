import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

// @lc code=start
class Solution {
  public String frequencySort(String s) {
    Map<Character, Integer> freqMap = new HashMap<>();
    // Initialize
    for (char c : s.toCharArray()) {
      freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
    }
    List<Character>[] freqBucket = new ArrayList[s.length() + 1];
    for (char c : freqMap.keySet()) {
      int f = freqMap.get(c);
      if (freqBucket[f] == null) {
        freqBucket[f] = new ArrayList<>();
      }
      freqBucket[f].add(c);
    }
    StringBuilder str = new StringBuilder();
    for (int i = freqBucket.length - 1; i >= 0; i--) {
      if (freqBucket[i] == null) {
        continue;
      }
      for (char c : freqBucket[i]) {
        for (int j = 0; j < i; j++) {
          str.append(c);
        }
      }
    }
    return str.toString();
  }
}
// @lc code=end
