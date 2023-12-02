class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        String ans = new String();
        int i = 0;
        while (i<n) {
            while (i<n && s.charAt(i)==' ') {
                i++;
            }
            if (i>=n) {
                break;
            }
            int j = i+1;
            while (j<n && s.charAt(j)!=' ') {
                j++;
            }
            String sub = s.substring(i,j);
            if (ans.length()==0) {
                ans = sub;
            }
            else {
                ans = sub + " " + ans;
            }
            i = j;
        }
        return ans;
    }
}
"
