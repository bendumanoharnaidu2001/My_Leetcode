class Solution {
    public int max(int nums[]) {
        int max = nums[0];
        for (int i=0; i<nums.length; i++) {
            max = Math.max(max,nums[i]);
        }
        return max;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = max(nums);
        while (low<=high) {
            int mid = (low+high)/2;
            int val = check(nums,mid);
            if (val<=threshold) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
    public int check(int nums[], int mid) {
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += Math.ceil((double)nums[i]/(double)mid);
        }
        return sum;
    }
}