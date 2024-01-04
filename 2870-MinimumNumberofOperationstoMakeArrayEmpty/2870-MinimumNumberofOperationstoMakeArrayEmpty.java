class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i],1);
            }
        }
        int ans = 0;
        for (int i=0; i<nums.length; i++) {
            int count = hm.get(nums[i]);
            if (count==1) {
                return -1;
            }
            else {
                ans = ans + count/3;
                if (count%3!=0) {
                    ans = ans + 1;
                }
            }
            hm.put(nums[i],0);
        }
        return ans;
    }
}
[
