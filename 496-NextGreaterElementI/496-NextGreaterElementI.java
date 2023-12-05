class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        int temp[] = new int[n2];
        for (int i=n2-1; i>=0; i--) {
            if (stk.size()==0) {
                temp[i] = -1;
                stk.push(nums2[i]);
                continue;
            }
            if (stk.peek()>nums2[i]) {
                temp[i] = stk.peek();
                stk.push(nums2[i]);
                continue;
            }
            while (stk.size()!=0 && stk.peek()<=nums2[i]) {
                stk.pop();
            }
            if (stk.size()==0) {
                temp[i] = -1;
            }
            else {
                temp[i] = stk.peek();
            }
            stk.push(nums2[i]);
        }
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0; i<n2; i++) {
            hm.put(nums2[i] , temp[i]);
        }
        for (int i=0; i<n1; i++) {
            nums1[i] = hm.get(nums1[i]);
        }
        return nums1;
    }
}
[
