class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ds = new ArrayList<>();
        getsubsets( 0, nums, ds);
        return ans;
    }
    public void getsubsets(int idx, int nums[], List<Integer> ds) {
        ans.add(new ArrayList(ds));
        for (int i=idx; i<nums.length; i++) {
            if (i!=idx && nums[i]==nums[i-1]) {
                continue;
            }
            ds.add(nums[i]);
            getsubsets(i+1 , nums , ds);
            ds.remove(ds.size()-1);
        }
    }
}
[
