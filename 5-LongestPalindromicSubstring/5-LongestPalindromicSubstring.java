class Solution {
    public String longestPalindrome(String s) {
        if (s.length()==0) {
            return "";
        }
        char charArray[] = s.toCharArray();

        int start = 0;
        int end = 0;
        for (int i=0; i<charArray.length; i++) {
            int len = Math.max(expand(charArray,i,i) , expand(charArray,i,i+1));
            if (len > end - start + 1) {
                start = i- (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start,end+1);
    }
    public int expand(char[] s, int i, int j) {
        
        while (i>=0 && j<s.length && s[i]==s[j]) {
            i--;
            j++;
        }
        return j-i-1;
    }
}
"babad"
