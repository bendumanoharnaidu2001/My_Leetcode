class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        int maxlen = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<n; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else {
                hm.put(nums[i],1);
            }
            maxlen = Math.max(maxlen,hm.get(nums[i]));
        }
        for (int i=0; i<maxlen; i++) {
            ans.add(new ArrayList<>());
        }
        for (int i=0; i<n; i++) {
            int count = hm.get(nums[i]);
            while(count>0) {
                ans.get(count-1).add(nums[i]);
                count--;
            }
            hm.put(nums[i],0);
        }
        return ans;
    }
}
[
