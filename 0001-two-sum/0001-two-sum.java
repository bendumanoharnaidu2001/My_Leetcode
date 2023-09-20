class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<n; i++) {
            int value = target - nums[i];
            if (hm.containsKey(value)) {
                ans[0] = hm.get(value);
                ans[1] = i;
                break;
            }
            else {
                hm.put(nums[i],i);
            }
        }
        return ans;
    }
}