/*
 * @lc app=leetcode id=28 lang=cpp
 *
 * [28] Implement strStr()
 */

// @lc code=start
/*
 * @lc app=leetcode id=28 lang=cpp
 *
 * [28] Implement strStr()
 */
class Solution {
   public:
    int strStr(string haystack, string needle) {
        int i, k = 0, len1 = haystack.size(), len2 = needle.size();
        if (len2 == 0 || haystack == needle) return 0;
        vector<int> index(len2, 0);
        for (i = 1; i < len2; i++) {
            while (k > 0 && needle[i] != needle[k]) k = index[k - 1];
            index[i] = (k += needle[i] == needle[k]);
        }
        for (i = 0, k = 0; i < len1; i++) {
            while (k > 0 && haystack[i] != needle[k]) k = index[k - 1];
            k += needle[k] == haystack[i];
            if (k == len2) return i - len2 + 1;
        }
        return -1;
    }
};

// @lc code=end
