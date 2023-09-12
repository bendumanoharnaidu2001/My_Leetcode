class Solution {
    public int uniquePaths(int m, int n) {
        int N = m+n-2;
        int D = n-1;
        double ans = 1;
        for (int i=1; i<=D; i++) {
            ans = ans*(N-D+i)/i;
        }
        return (int)ans;
    }
}