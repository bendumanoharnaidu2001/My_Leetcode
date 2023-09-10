class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        sort(nums,0,n-1);
        return nums;
    }
    public void sort(int[] nums, int s, int e) {
        if (s>=e) {
            return;
        }
        int mid = (s+e)/2;
        sort(nums, s, mid);
        sort(nums, mid+1, e);
        merge(nums, s, mid, e);
    }
    public void merge(int[] nums, int s, int m, int e) {
        int left = s;
        int right = m+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left<=m && right<=e) {
            if (nums[left]<=nums[right]) {
                temp.add(nums[left]);
                left++;
            }
            else {
                temp.add(nums[right]);
                right++;
            }
        }
        while (left<=m) {
            temp.add(nums[left]);
            left++;
        }
        while (right<=e) {
            temp.add(nums[right]);
            right++;
        }
        for (int i=s; i<=e; i++) {
            nums[i] = temp.get(i-s);
        }
    }
}