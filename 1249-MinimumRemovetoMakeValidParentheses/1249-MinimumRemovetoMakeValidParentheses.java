class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        int open = 0;
        String ans = "";
        for (int i=0; i<n; i++) {
            if (s.charAt(i)=='(') {
                open++;
            }
            else if (s.charAt(i)==')') {
                if (open==0) {
                    continue;
                }
                open--;
            }
            ans = ans+s.charAt(i);
        }
        String result = "";
        for (int i=ans.length()-1; i>=0; i--) {
            if (ans.charAt(i)=='(' && open>0) {
                open--;
                continue;
            }
            result = ans.charAt(i) + result;
        }
        return result;
    }
}
"
