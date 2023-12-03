class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        getsubsets(ans,arr,nums,0);
        return ans;
    }
    public void getsubsets(List<List<Integer>> ans, List<Integer> arr, int[] nums, int idx) {
        if (idx==nums.length) {
            ans.add(new ArrayList<>(arr));
        }
    }
            return;
        arr.add(nums[idx]);
        getsubsets(ans,arr,nums,idx+1);
        arr.remove(arr.size()-1);
        getsubsets(ans,arr,nums,idx+1);
}
[
