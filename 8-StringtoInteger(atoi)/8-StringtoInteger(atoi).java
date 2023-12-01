        if (i>=n) {
            return 0;
        }
        int num = 0;
        while (i<n && s.charAt(i)>='0' && s.charAt(i)<='9') {
            int x = s.charAt(i)-'0';
            //System.out.println(x);
            if (num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && x>Integer.MAX_VALUE%10)) {
                if (sign==1) {
                    return Integer.MAX_VALUE;
                }
                else {
                    return Integer.MIN_VALUE;
                }
            }
            num = num*10 + x;
"
