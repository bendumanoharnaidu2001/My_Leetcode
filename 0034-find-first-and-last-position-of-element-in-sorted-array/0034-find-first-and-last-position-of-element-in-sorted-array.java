class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = lower_bound(nums,target);
        int right = upper_bound(nums,target);
        return new int[] {left,right}; 
        
    }
    public int lower_bound(int nums[], int target) {
        int left = 0;
        int right = nums.length-1;
        int val = -1;
        while (left<=right) {
            int mid = (left+right)/2;
            if (nums[mid]==target) {
                val = mid;
                right = mid-1;
            }
            else if (nums[mid]>target) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return val;
    }
    public int upper_bound(int nums[], int target) {
        int left = 0;
        int right = nums.length-1;
        int val = -1;
        while (left<=right) {
            int mid = (left+right)/2;
            if (nums[mid]==target) {
                val = mid;
                left = mid+1;
            }
            else if (nums[mid]<target) {
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }
        return val;
    }
}