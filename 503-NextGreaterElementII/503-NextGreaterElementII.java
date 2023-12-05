class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int m = nums.length;
        int n = m*2;
        Stack<Integer> stk = new Stack<>();
        int temp[] = new int[n];
        for (int i=n-1; i>=0; i--) {
            if (stk.size()==0) {
                temp[i] = -1;
                stk.push(nums[i%m]);
                continue;
            }
            if (nums[i%m]<stk.peek()) {
                temp[i] = stk.peek();
                stk.push(nums[i%m]);
                continue;
            }
            while (stk.size()!=0 && nums[i%m]>=stk.peek()) {
                stk.pop();
            }
            if (stk.size()==0) {
                temp[i] = -1;
            }
            else {
                temp[i] = stk.peek();
            }
            stk.push(nums[i%m]);
        }
        int ans[] = new int[m];
        for (int i=0; i<m; i++) {
            ans[i] = temp[i];
        }
        return ans;
    }
}
[
