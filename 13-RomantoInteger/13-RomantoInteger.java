class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for (int i=0; i<n; i++) {
            if (i+1<n && s.charAt(i)=='I' && s.charAt(i+1)=='V') {
                ans += 4;
                i++;
            }
            else if (i+1<n && s.charAt(i)=='I' && s.charAt(i+1)=='X') {
                ans += 9;
                i++;
            }
            else if (i+1<n && s.charAt(i)=='X' && s.charAt(i+1)=='L') {
                ans +=40;
                i++;
            }
            else if (i+1<n && s.charAt(i)=='X' && s.charAt(i+1)=='C') {
                ans +=90;
                i++;
            }
            else if (i+1<n && s.charAt(i)=='C' && s.charAt(i+1)=='D') {
                ans +=400;
                i++;
            }
            else if (i+1<n && s.charAt(i)=='C' && s.charAt(i+1)=='M') {
                ans +=900;
                i++;
            }
            else {
                if(s.charAt(i)=='I') {
                    ans += 1;
                }
                if(s.charAt(i)=='V') {
                    ans += 5;
                }
                if(s.charAt(i)=='X') {
                    ans += 10;
                }
                if(s.charAt(i)=='L') {
                    ans += 50;
                }
                if(s.charAt(i)=='C') {
                    ans += 100;
                }
                if(s.charAt(i)=='D') {
                    ans += 500;
                }
                if(s.charAt(i)=='M') {
                    ans += 1000;
                }
            }
        }
        return ans;
    }
}
"III"
