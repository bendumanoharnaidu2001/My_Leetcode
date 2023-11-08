class Solution {
    public int min(int bloomDay[]) {    //Find min of array
        int val = Integer.MAX_VALUE;
        for (int i=0; i<bloomDay.length; i++) {
            val = Math.min(val,bloomDay[i]);
        }
        return val;
    }
    public int max(int bloomDay[]) {    //Find max of array
        int val = Integer.MIN_VALUE;
        for (int i=0; i<bloomDay.length; i++) {
            val = Math.max(val,bloomDay[i]);
        }
        return val;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)bloomDay.length<(long)m*(long)k) {
            return -1;
        }
        int left = min(bloomDay);
        int right = max(bloomDay);
        while (left<=right) {
            int mid = (left+right)/2;
            if (check(bloomDay,mid,m,k)) {
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        return left;
    }
    public boolean check(int arr[], int day, int m, int k) {
        int count = 0;
        int total_bouquets = 0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]<=day) {
                count++;
            }
            else {
                total_bouquets += count/k;
                count = 0;
            }
        }
        total_bouquets += count/k;

        if (total_bouquets>=m) {
            return true;
        }
        else {
            return false;
        }
    }
}