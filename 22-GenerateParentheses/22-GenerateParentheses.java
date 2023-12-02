class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate_parenthesis(ans,0,0,n,"");
        return ans;
    }
    public void generate_parenthesis(List<String> ans, int open, int close, int n, String str) {
        if (str.length()==2*n) {
            ans.add(str);
            return;
        }
        if (open<n) {
            generate_parenthesis(ans,open+1,close,n,str+"(");
        }
        if (close<open) {
            generate_parenthesis(ans,open,close+1,n,str+")");
        }
    }
}
3
