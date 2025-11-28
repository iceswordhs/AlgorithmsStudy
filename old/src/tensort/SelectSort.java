package tensort;
/*
    选择排序
    时间复杂度O(n^2)
    空间复杂度O(1)
    不稳定
 */
public class SelectSort {
    public void selectSort(int[] arr){
        int minIndex,temp;
        for(int i=0;i<=arr.length-1;i++){
            minIndex=i;
            for(int j=i;j<= arr.length-1;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}
