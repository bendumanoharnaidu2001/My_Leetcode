class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftmax = 0;
        int rightmax = 0;
        int ans = 0;
        while (left<=right) {
            if (height[left]<=height[right]) {
                if (height[left]>=leftmax) {
                    leftmax = height[left]; 
                }
                else {
                    ans = ans + (leftmax-height[left]);
                }
                left++;
            }
            else {
[
