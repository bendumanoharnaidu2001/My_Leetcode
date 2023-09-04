class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean check[] = new boolean[nums.length];
        permutations(nums, ds, check, ans);
        return ans;
    }
    public void permutations(int[] nums, List<Integer> ds, boolean check[], List<List<Integer>> ans) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i=0; i<nums.length; i++) {
            if (check[i] == false) {
                check[i] = true;
                ds.add(nums[i]);
                permutations(nums, ds, check, ans);
                check[i] = false;
                ds.remove(ds.size()-1);
            }
        }
    }
}