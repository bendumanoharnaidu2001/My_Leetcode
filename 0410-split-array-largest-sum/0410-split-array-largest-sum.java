class Solution {
    public int max(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i=0; i<nums.length; i++) {
            max = Math.max(max,nums[i]);
        }
        return max;
    }
    public int sum(int nums[]) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
    public int splitArray(int[] nums, int k) {
        int low = max(nums);
        int high = sum(nums);
        while (low<=high) {
            int mid = (low+high)/2;
            if (check(nums,mid)<=k) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
    public int check(int nums[], int max) {
        int count = 1;
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            if (sum<=max) {
                continue;
            }
            else {
                count +=1;
                sum = nums[i];
            }
        }
        return count;
    }
}