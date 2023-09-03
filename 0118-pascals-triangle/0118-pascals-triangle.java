class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=1; i<=numRows; i++) {
            ans.add(getrow(i));
        }
        return ans;
    }
    public List<Integer> getrow(int n) {
        int val = 1;
        List<Integer> cal = new ArrayList<>();
        cal.add(1);
        for (int i=1; i<n; i++) {
            val = val*(n-i);
            val = val/i;
            cal.add(val);
        }
        return cal;
    }
}