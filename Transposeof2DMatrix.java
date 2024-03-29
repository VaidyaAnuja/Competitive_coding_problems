Refer problem statement from
https://leetcode.com/problems/transpose-matrix/?envType=daily-question&envId=2023-12-10

class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] outputmatrix = new int[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                outputmatrix[j][i]=matrix[i][j];
            }
        }
        return outputmatrix;
    }
}
