package shiyiyue11.Nov_17;

/**
 * @author Hs
 * @Date 2021/11/17 21:59
 */

/**
 * 编写一个高效的算法来搜索m*n矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 *
 * 思路1：二分 遍历每一行，二分寻找，注意细节：跳出条件是low<=high 而不是 low<high
 *       时间复杂度为 O(m*log(n))
 *
 * 思路2：Z字遍历 从右上角或左下角开始遍历 注意，一定要先判断是否小于本行此列！！！
 */
public class leetcode_240 {
    // 思路1
    //public boolean search(int[] matrix,int target,int length){
    //    int low=0,high=length-1;
    //    int mid=(high-low)/2+low;
    //    while(low<=high){
    //        if(matrix[mid]<target){
    //            low=mid+1;
    //            mid=(high-low)/2+low;
    //        }else if(matrix[mid]>target){
    //            high=mid-1;
    //            mid=(high-low)/2+low;
    //        }else return true;
    //    }
    //    return false;
    //}

    // 思路2
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target<matrix[0][0]||target>matrix[matrix.length-1][matrix[0].length-1]) return false;
        int row=0,y,column=matrix[0].length-1;
        y=column;
        while(row<matrix.length&&column>=0){
            if(matrix[row][column]==target) return true;
            if(target<matrix[row][column]){
                column--;
            }else{
                row++;
            }
        }
        return false;
    }
}
