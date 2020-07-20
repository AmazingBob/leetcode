/*
 * @lc app=leetcode id=14 lang=cpp
 *
 * [14] Longest Common Prefix
 */

// @lc code=start
/*
 * @lc app=leetcode id=14 lang=cpp
 *
 * [14] Longest Common Prefix
 */
static const auto _____ = []() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    return nullptr;
}();
class Solution
{
public:
    string longestCommonPrefix(vector<string> &strs)
    {
        if (strs.size() < 1)
        {
            return "";
        }
        int tag = 0;
        for (int i = 0; i < strs.size(); ++i)
        {
            if (strs[i].size() < tag)
            {
                tag = i;
            }
        }
        string re;
        for (int i = 0; i < strs[tag].size(); ++i)
        {
            char c = strs[tag][i];
            for (int j = 0; j < strs.size(); ++j)
            {
                if (strs[j][i] == c)
                {
                    continue;
                }
                else
                {
                    return re;
                }
            }
            re.push_back(c);
        }
        return re;
    }
};

// @lc code=end
