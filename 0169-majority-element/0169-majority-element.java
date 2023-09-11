class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;
        int freq = 0;
        for (int i=0; i<nums.length; i++) {
            if (freq==0) {
                element = nums[i];
                freq++;
            }
            else if (nums[i] == element) {
                freq++;
            }
            else {
                freq--;
            }
        }
        return element;
    }
}