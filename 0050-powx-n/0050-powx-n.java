class Solution {
    public double myPow(double x, int n) {
        long nn = n;
        double ans = 1;
        if (nn<0) {
            nn = -1*nn;
        }
        while (nn>0) {
            if (nn%2 != 0) {
                ans = ans*x;
                nn--;
            }
            else {
                x = x * x;
                nn = nn/2;
            }
        }
        if (n<0) {
            return (double)1/(double)ans;
        }
        return ans;
    }
}