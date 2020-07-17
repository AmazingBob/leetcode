import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    // Corner case
    if (strs == null || strs.length == 0) return new ArrayList<List<String>>();

    HashMap<String, List<String>> map = new HashMap<String, List<String>>();
    for (int i = 0; i < strs.length; i++) {
      char[] strArray = strs[i].toCharArray();
      Arrays.sort(strArray);
      String key = String.valueOf(strArray);
      if (!map.containsKey(key)) map.put(key, new ArrayList<String>());
      map.get(key).add(strs[i]);
    }

    return new ArrayList<List<String>>(map.values());
  }
}
// @lc code=end
