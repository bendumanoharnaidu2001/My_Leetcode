class Solution {
    public int[] searchRange(int[] nums, int target) {
        int result [] = new int[2];
        int lb = lower_bound(nums, nums.length, target);
        if (lb==nums.length || nums[lb]!=target) {
            result[0] = -1;
            result[1] = -1;
            return result;
        }
        result[0] = lb;
        result[1] = upper_bound(nums,nums.length,target)-1;
        return result;
    }
    public int lower_bound(int A[], int n, int x) {
        int left = 0;
        int right = n-1;
        int ans = n;
        while (left<=right) {
            int mid = (left+right)/2;
            if (A[mid]>=x) {
                ans = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return ans;
    }
    public int upper_bound(int A[], int n, int x) {
        int left = 0;
        int right = n-1;
        int ans = n;
        while (left<=right) {
            int mid = (left+right)/2;
            if (A[mid]>x) {
                ans = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return ans;
    }
}