    public String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        int ans = Integer.MAX_VALUE;
        for (int i=0; i<strs.length; i++) {
            int count = 0;
            String temp1 = strs[i];
            for (int j=0; j<temp1.length() && j<temp.length(); j++) {
                if (temp.charAt(j) == temp1.charAt(j)) {
                    count++;
                }
                else {
                    break;
                }
            }
            ans = Math.min(ans,count);
            temp = temp.substring(0,ans);
        }
[
