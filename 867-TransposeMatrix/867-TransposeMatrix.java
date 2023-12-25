class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int newmatrix[][] = new int[m][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                newmatrix[j][i] = matrix[i][j];
            }
        }
        return newmatrix;
    }
}
[[1,2,3],[4,5,6],[7,8,9]]
