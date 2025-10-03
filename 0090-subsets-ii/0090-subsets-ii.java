class Solution {
    void backtrack(int idx, List<List<Integer>> ans, List<Integer> res, int[] nums) {
        if (idx >= nums.length) {
            List<Integer> copy = new ArrayList<>(res);
            Collections.reverse(copy);
            if (!ans.contains(res) && !ans.contains(copy))
                ans.add(new ArrayList<>(res));
            return;
        }
        res.add(nums[idx]);
        backtrack(idx + 1, ans, res, nums);
        res.remove(res.size() - 1);
        backtrack(idx + 1, ans, res, nums);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(0, ans, new ArrayList<>(), nums);
        Collections.reverse(ans);
        return ans;
    }
}