/*
 * @lc app=leetcode id=27 lang=cpp
 *
 * [27] Remove Element
 */

// @lc code=start
/*
 * @lc app=leetcode id=27 lang=cpp
 *
 * [27] Remove Element
 */
static const auto io_sync_off = []() {
    std::ios::sync_with_stdio(false);
    std::cin.tie(nullptr);
    return nullptr;
}();
class Solution {
   public:
    int removeElement(vector<int>& nums, int val) {
        // if (nums.size() == 0) return 0;
        int len = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != val) {
                nums[len++] = nums[i];
            }
        }
        return len;
    }
};

// @lc code=end
