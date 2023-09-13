class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int a[] = new int [2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<n; i++) {
            int val = target - nums[i];
            if (hm.containsKey(val)) {
                a[0] = hm.get(val);
                a[1] = i;
                return a;
            }
            else {
                hm.put(nums[i],i);
            }
        }
        return a;
    }
}