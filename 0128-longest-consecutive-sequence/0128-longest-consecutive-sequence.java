class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        for (int i=0; i<n; i++) {
            hs.add(nums[i]);
        }
        int max = 0;
        for (int i=0; i<n; i++) {
            int count = 0;
            int num = nums[i];
            if (!hs.contains(num-1)) {
                while (hs.contains(num)) {
                    count++;
                    num++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}