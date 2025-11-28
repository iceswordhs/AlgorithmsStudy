package swordoffer1;

public class solution4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length==0) return false;
        if(matrix[0].length==0) return false;
        int i=0;
        int j=matrix[0].length;
        while(i< matrix.length&&j>=0){
            if(target<matrix[i][j]){
                j--;
            }else if(target>matrix[i][j]){
                i++;
            }else return true;
        }
        return false;
    }
}
