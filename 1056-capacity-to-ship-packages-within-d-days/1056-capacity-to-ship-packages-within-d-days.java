class Solution {
    public int max(int weight[]) {
        int max = weight[0];
        for (int i=0; i<weight.length; i++) {
            max = Math.max(max,weight[i]);
        }
        return max;
    }
    public int sum(int weight[]) {
        int sum = 0;
        for (int i=0; i<weight.length; i++) {
            sum += weight[i];
        }
        return sum;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = max(weights);
        int high = sum(weights);
        while (low<=high) {
            int mid = (low+high)/2;
            int total_days = count_days(weights, mid);
            if (total_days<=days) {
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }
        return low;
    }
    public int count_days(int weight[], int capacity) {
        int days = 1;
        int load = 0;
        for (int i=0; i<weight.length; i++) {
            load = load + weight[i];
            if (load<=capacity) {
                continue;
            }
            else {
                days++;
                load = weight[i];
            }
        }
        return days;
    }
}